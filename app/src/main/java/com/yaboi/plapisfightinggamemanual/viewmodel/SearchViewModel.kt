package com.yaboi.plapisfightinggamemanual.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yaboi.plapisfightinggamemanual.data.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class SearchViewModel : ViewModel() {
    private val _searchResults = MutableLiveData<List<SearchResult>>()
    val searchResults: LiveData<List<SearchResult>> = _searchResults

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _currentFilter = MutableStateFlow(SearchFilter.ALL)
    val currentFilter: StateFlow<SearchFilter> = _currentFilter

    fun search(query: String?) {
        if (query.isNullOrBlank()) {
            _searchResults.value = emptyList()
            return
        }

        viewModelScope.launch {
            _isLoading.value = true
            try {
                val results = mutableListOf<SearchResult>()
                val searchTerm = query.lowercase()

                when (currentFilter.value) {
                    SearchFilter.ALL -> {
                        // Search everything
                        searchCharacters(searchTerm, results)
                        searchArchetypes(searchTerm, results)
                        searchMoves(searchTerm, results)
                    }
                    SearchFilter.CHARACTERS -> {
                        searchCharacters(searchTerm, results)
                    }
                    SearchFilter.ARCHETYPES -> {
                        searchArchetypes(searchTerm, results)
                    }
                    SearchFilter.MOVES -> {
                        searchMoves(searchTerm, results)
                    }
                }

                _searchResults.value = results
            } finally {
                _isLoading.value = false
            }
        }
    }

    fun setFilter(filter: SearchFilter) {
        _currentFilter.value = filter
    }

    private fun searchCharacters(searchTerm: String, results: MutableList<SearchResult>) {
        val repositories = listOf(
            MortalKombatRepository,
            SamuraiShodownRepository,
            GuiltyGearStriveRepository,
            CapcomVsSNK2Repository
        )

        repositories.forEach { repository ->
            repository::class.java.getDeclaredField("characterData").apply {
                isAccessible = true
                @Suppress("UNCHECKED_CAST")
                val characters = (get(repository) as Map<String, CharacterDetails>)
                characters.values.filter { character ->
                    character.name.lowercase().contains(searchTerm)
                }.forEach { character ->
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = character.id,
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }
        }
    }

    private fun searchArchetypes(searchTerm: String, results: MutableList<SearchResult>) {
        val repositories = listOf(
            MortalKombatRepository,
            SamuraiShodownRepository,
            GuiltyGearStriveRepository,
            CapcomVsSNK2Repository
        )

        repositories.forEach { repository ->
            repository::class.java.getDeclaredField("characterData").apply {
                isAccessible = true
                @Suppress("UNCHECKED_CAST")
                val characters = (get(repository) as Map<String, CharacterDetails>)
                characters.values.filter { character ->
                    character.playstyle.lowercase().contains(searchTerm)
                }.forEach { character ->
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = character.id,
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }
        }
    }

    private fun searchMoves(searchTerm: String, results: MutableList<SearchResult>) {
        val repositories = listOf(
            MortalKombatRepository,
            SamuraiShodownRepository,
            GuiltyGearStriveRepository,
            CapcomVsSNK2Repository
        )

        repositories.forEach { repository ->
            repository::class.java.getDeclaredField("characterData").apply {
                isAccessible = true
                @Suppress("UNCHECKED_CAST")
                val characters = (get(repository) as Map<String, CharacterDetails>)
                characters.forEach { (characterId, character) ->
                    character.moves.forEach { (moveType, moveList) ->
                        moveList.filter { move ->
                            move.name.lowercase().contains(searchTerm) ||
                            move.input.lowercase().contains(searchTerm) ||
                            move.description.lowercase().contains(searchTerm) ||
                            move.properties.any { it.name.lowercase().contains(searchTerm) }
                        }.forEach { move ->
                            results.add(
                                SearchResult.MoveResult(
                                    characterId = characterId,
                                    characterName = character.name,
                                    move = move
                                )
                            )
                        }
                    }
                }
            }
        }
    }
} 