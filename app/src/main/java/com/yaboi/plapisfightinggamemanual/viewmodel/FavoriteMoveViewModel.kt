package com.yaboi.plapisfightinggamemanual.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.yaboi.plapisfightinggamemanual.data.AppDatabase
import com.yaboi.plapisfightinggamemanual.data.FavoriteMove
import com.yaboi.plapisfightinggamemanual.data.FavoriteMoveRepository
import kotlinx.coroutines.launch

class FavoriteMoveViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: FavoriteMoveRepository
    val favorites: LiveData<List<FavoriteMove>>
    private val _favoriteStates = MutableLiveData<Map<String, Boolean>>(emptyMap())
    val favoriteStates: LiveData<Map<String, Boolean>> = _favoriteStates

    init {
        val favoriteMoveDao = AppDatabase.getDatabase(application).favoriteMoveDao()
        repository = FavoriteMoveRepository(favoriteMoveDao)
        favorites = repository.allFavorites
        
        // Initialize favorite states from database
        favorites.observeForever { favoriteList ->
            _favoriteStates.value = favoriteList.associate { it.moveId to true }
        }
    }

    fun getFavoritesForCharacter(characterId: String): LiveData<List<FavoriteMove>> {
        return repository.getFavoritesForCharacter(characterId)
    }

    fun isMoveInFavorites(moveId: String): Boolean {
        return _favoriteStates.value?.get(moveId) ?: false
    }

    fun addToFavorites(move: FavoriteMove) {
        viewModelScope.launch {
            repository.insertFavorite(move)
            updateFavoriteState(move.moveId, true)
        }
    }

    fun removeFromFavorites(moveId: String) {
        viewModelScope.launch {
            repository.deleteFavoriteByMoveId(moveId)
            updateFavoriteState(moveId, false)
        }
    }

    fun removeFromFavorites(move: FavoriteMove) {
        viewModelScope.launch {
            repository.deleteFavorite(move)
            updateFavoriteState(move.moveId, false)
        }
    }

    private fun updateFavoriteState(moveId: String, isFavorite: Boolean) {
        val currentStates = _favoriteStates.value.orEmpty().toMutableMap()
        currentStates[moveId] = isFavorite
        _favoriteStates.value = currentStates
    }
} 