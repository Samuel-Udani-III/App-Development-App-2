package com.yaboi.plapisfightinggamemanual.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.progressindicator.CircularProgressIndicator
import com.yaboi.plapisfightinggamemanual.FightingGameManualApp
import com.yaboi.plapisfightinggamemanual.R
import com.yaboi.plapisfightinggamemanual.adapters.SearchAdapter
import com.yaboi.plapisfightinggamemanual.adapters.SearchHistoryAdapter
import com.yaboi.plapisfightinggamemanual.data.SearchFilter
import com.yaboi.plapisfightinggamemanual.data.SearchResult
import com.yaboi.plapisfightinggamemanual.ui.CharacterDetailActivity
import com.yaboi.plapisfightinggamemanual.viewmodel.SearchViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class SearchFragment : Fragment() {
    private val viewModel: SearchViewModel by viewModels()
    private lateinit var searchView: SearchView
    private lateinit var filterChipGroup: ChipGroup
    private lateinit var resultsRecyclerView: RecyclerView
    private lateinit var historyRecyclerView: RecyclerView
    private lateinit var loadingIndicator: CircularProgressIndicator
    private lateinit var searchAdapter: SearchAdapter
    private lateinit var historyAdapter: SearchHistoryAdapter
    private val preferencesManager by lazy { FightingGameManualApp.getInstance().preferencesManager }
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        searchView = view.findViewById(R.id.searchView)
        filterChipGroup = view.findViewById(R.id.filterChipGroup)
        resultsRecyclerView = view.findViewById(R.id.searchResultsRecyclerView)
        historyRecyclerView = view.findViewById(R.id.searchHistoryRecyclerView)
        loadingIndicator = view.findViewById(R.id.loadingIndicator)
        
        setupSearchView()
        setupFilterChips()
        setupRecyclerView()
        setupHistoryRecyclerView()
        observeViewModel()
    }
    
    private fun setupSearchView() {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let { 
                    preferencesManager.addSearchQuery(it)
                    viewModel.search(it)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                viewModel.search(newText)
                updateHistoryVisibility(newText)
                return true
            }
        })

        searchView.setOnQueryTextFocusChangeListener { _, hasFocus ->
            updateHistoryVisibility(searchView.query?.toString())
        }
    }

    private fun updateHistoryVisibility(query: String?) {
        val showHistory = searchView.hasFocus() && (query.isNullOrEmpty() || query.length < 2)
        historyRecyclerView.isVisible = showHistory
        resultsRecyclerView.isVisible = !showHistory
        if (showHistory) {
            historyAdapter.submitList(preferencesManager.getSearchHistory())
        }
    }

    private fun setupHistoryRecyclerView() {
        historyAdapter = SearchHistoryAdapter { query ->
            searchView.setQuery(query, true)
        }
        
        historyRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = historyAdapter
        }
    }
    
    private fun setupFilterChips() {
        filterChipGroup.setOnCheckedChangeListener { _, checkedId ->
            val filter = when (checkedId) {
                R.id.chipCharacters -> SearchFilter.CHARACTERS
                R.id.chipArchetypes -> SearchFilter.ARCHETYPES
                R.id.chipMoves -> SearchFilter.MOVES
                else -> SearchFilter.ALL
            }
            viewModel.setFilter(filter)
            // Re-run search with new filter
            viewModel.search(searchView.query?.toString())
        }
    }
    
    private fun setupRecyclerView() {
        searchAdapter = SearchAdapter { searchResult ->
            val intent = when (searchResult) {
                is SearchResult.CharacterResult -> CharacterDetailActivity.newIntent(
                    context = requireContext(),
                    characterId = searchResult.characterId,
                    gameId = determineGameId(searchResult.characterId)
                )
                is SearchResult.MoveResult -> CharacterDetailActivity.newIntent(
                    context = requireContext(),
                    characterId = searchResult.characterId,
                    gameId = determineGameId(searchResult.characterId),
                    moveToHighlight = searchResult.move.id
                )
            }
            startActivity(intent)
        }
        
        resultsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = searchAdapter
        }
    }
    
    private fun observeViewModel() {
        viewModel.searchResults.observe(viewLifecycleOwner) { results ->
            searchAdapter.submitList(results)
            resultsRecyclerView.isVisible = results.isNotEmpty()
        }
        
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.isLoading.collectLatest { isLoading ->
                loadingIndicator.isVisible = isLoading
            }
        }
        
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.currentFilter.collectLatest { filter ->
                // Update chip selection if needed
                val chipId = when (filter) {
                    SearchFilter.CHARACTERS -> R.id.chipCharacters
                    SearchFilter.ARCHETYPES -> R.id.chipArchetypes
                    SearchFilter.MOVES -> R.id.chipMoves
                    SearchFilter.ALL -> View.NO_ID
                }
                if (chipId != View.NO_ID) {
                    filterChipGroup.check(chipId)
                } else {
                    filterChipGroup.clearCheck()
                }
            }
        }
    }
    
    private fun determineGameId(characterId: String): String {
        // Match the game IDs used in MainActivity and CharacterDetailActivity
        return when {
            characterId.startsWith("ggst_") -> "ggst"
            characterId.startsWith("kof15_") -> "kof15"
            characterId.startsWith("samsho_") -> "samsho"
            characterId.startsWith("cvs2_") -> "cvs2"
            characterId.startsWith("tekken7_") -> "tekken7"
            else -> "ggst" // Default to Guilty Gear Strive
        }
    }
    
    companion object {
        fun newInstance() = SearchFragment()
    }
} 