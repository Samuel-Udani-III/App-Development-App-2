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
        try {
            // Search in Guilty Gear Strive
            GuiltyGearStriveRepository.getAllCharacters().forEach { character ->
                if (character.name.lowercase().contains(searchTerm)) {
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = "ggst_${character.id}",
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }

            // Search in King of Fighters XV
            KingOfFighters15Repository.getAllCharacters().forEach { character ->
                if (character.name.lowercase().contains(searchTerm)) {
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = "kof15_${character.id}",
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }

            // Search in Samurai Shodown
            SamuraiShodownRepository.getAllCharacters().forEach { character ->
                if (character.name.lowercase().contains(searchTerm)) {
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = "samsho_${character.id}",
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }

            // Search in Capcom vs SNK 2
            CapcomVsSNK2Repository.getAllCharacters().forEach { character ->
                if (character.name.lowercase().contains(searchTerm)) {
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = "cvs2_${character.id}",
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }

            // Search in Tekken 7
            TekkenRepository.getAllCharacters().forEach { character ->
                if (character.name.lowercase().contains(searchTerm)) {
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = "tekken7_${character.id}",
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun searchArchetypes(searchTerm: String, results: MutableList<SearchResult>) {
        try {
            // Search in Guilty Gear Strive
            GuiltyGearStriveRepository.getAllCharacters().forEach { character ->
                if (character.playstyle.lowercase().contains(searchTerm)) {
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = "ggst_${character.id}",
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }

            // Search in King of Fighters XV
            KingOfFighters15Repository.getAllCharacters().forEach { character ->
                if (character.playstyle.lowercase().contains(searchTerm)) {
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = "kof15_${character.id}",
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }

            // Search in Samurai Shodown
            SamuraiShodownRepository.getAllCharacters().forEach { character ->
                if (character.playstyle.lowercase().contains(searchTerm)) {
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = "samsho_${character.id}",
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }

            // Search in Capcom vs SNK 2
            CapcomVsSNK2Repository.getAllCharacters().forEach { character ->
                if (character.playstyle.lowercase().contains(searchTerm)) {
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = "cvs2_${character.id}",
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }

            // Search in Tekken 7
            TekkenRepository.getAllCharacters().forEach { character ->
                if (character.playstyle.lowercase().contains(searchTerm)) {
                    results.add(
                        SearchResult.CharacterResult(
                            characterId = "tekken7_${character.id}",
                            name = character.name,
                            playstyle = character.playstyle
                        )
                    )
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun searchMoves(searchTerm: String, results: MutableList<SearchResult>) {
        try {
            // Search in Guilty Gear Strive
            GuiltyGearStriveRepository.getAllCharacters().forEach { character ->
                character.moves.forEach { (_, moveList) ->
                    moveList.filter { move ->
                        move.name.lowercase().contains(searchTerm) ||
                        move.input.lowercase().contains(searchTerm) ||
                        move.description.lowercase().contains(searchTerm)
                    }.forEach { move ->
                        results.add(
                            SearchResult.MoveResult(
                                characterId = "ggst_${character.id}",
                                characterName = character.name,
                                move = move
                            )
                        )
                    }
                }
            }

            // Search in King of Fighters XV
            KingOfFighters15Repository.getAllCharacters().forEach { character ->
                character.moves.forEach { (_, moveList) ->
                        moveList.filter { move ->
                            move.name.lowercase().contains(searchTerm) ||
                            move.input.lowercase().contains(searchTerm) ||
                        move.description.lowercase().contains(searchTerm)
                        }.forEach { move ->
                            results.add(
                                SearchResult.MoveResult(
                                characterId = "kof15_${character.id}",
                                    characterName = character.name,
                                    move = move
                                )
                            )
                        }
                    }
                }

            // Search in Samurai Shodown
            SamuraiShodownRepository.getAllCharacters().forEach { character ->
                character.moves.forEach { (_, moveList) ->
                    moveList.filter { move ->
                        move.name.lowercase().contains(searchTerm) ||
                        move.input.lowercase().contains(searchTerm) ||
                        move.description.lowercase().contains(searchTerm)
                    }.forEach { move ->
                        results.add(
                            SearchResult.MoveResult(
                                characterId = "samsho_${character.id}",
                                characterName = character.name,
                                move = move
                            )
                        )
                    }
                }
            }

            // Search in Capcom vs SNK 2
            CapcomVsSNK2Repository.getAllCharacters().forEach { character ->
                character.moves.forEach { (_, moveList) ->
                    moveList.filter { move ->
                        move.name.lowercase().contains(searchTerm) ||
                        move.input.lowercase().contains(searchTerm) ||
                        move.description.lowercase().contains(searchTerm)
                    }.forEach { move ->
                        results.add(
                            SearchResult.MoveResult(
                                characterId = "cvs2_${character.id}",
                                characterName = character.name,
                                move = move
                            )
                        )
                    }
                }
            }

            // Search in Tekken 7
            TekkenRepository.getAllCharacters().forEach { character ->
                character.moves.forEach { (_, moveList) ->
                    moveList.filter { move ->
                        move.name.lowercase().contains(searchTerm) ||
                        move.input.lowercase().contains(searchTerm) ||
                        move.description.lowercase().contains(searchTerm)
                    }.forEach { move ->
                        results.add(
                            SearchResult.MoveResult(
                                characterId = "tekken7_${character.id}",
                                characterName = character.name,
                                move = move
                            )
                        )
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
} 