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
import com.yaboi.plapisfightinggamemanual.R
import com.yaboi.plapisfightinggamemanual.adapters.SearchAdapter
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
    private lateinit var loadingIndicator: CircularProgressIndicator
    private lateinit var searchAdapter: SearchAdapter
    
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
        loadingIndicator = view.findViewById(R.id.loadingIndicator)
        
        setupSearchView()
        setupFilterChips()
        setupRecyclerView()
        observeViewModel()
    }
    
    private fun setupSearchView() {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                viewModel.search(query)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                viewModel.search(newText)
                return true
            }
        })
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
        // This is a simple implementation - you might want to make this more robust
        return when {
            characterId in listOf("scorpion", "sub-zero", "raiden") -> "mk"
            characterId in listOf("haohmaru", "nakoruru", "jubei") -> "ss"
            characterId in listOf("sol", "ky", "may") -> "ggs"
            characterId in listOf("ryu", "ken", "chun-li") -> "cvs2"
            else -> "unknown"
        }
    }
    
    companion object {
        fun newInstance() = SearchFragment()
    }
} 