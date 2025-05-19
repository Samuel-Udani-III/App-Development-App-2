package com.yaboi.plapisfightinggamemanual.data

import androidx.lifecycle.LiveData

class FavoriteMoveRepository(private val favoriteMoveDao: FavoriteMoveDao) {
    val allFavorites: LiveData<List<FavoriteMove>> = favoriteMoveDao.getAllFavorites()

    fun getFavoritesForCharacter(characterId: String): LiveData<List<FavoriteMove>> {
        return favoriteMoveDao.getFavoritesForCharacter(characterId)
    }

    fun isMoveInFavorites(moveId: String): LiveData<Boolean> {
        return favoriteMoveDao.isMoveInFavorites(moveId)
    }

    suspend fun insertFavorite(favoriteMove: FavoriteMove) {
        favoriteMoveDao.insertFavorite(favoriteMove)
    }

    suspend fun deleteFavorite(favoriteMove: FavoriteMove) {
        favoriteMoveDao.deleteFavorite(favoriteMove)
    }

    suspend fun deleteFavoriteByMoveId(moveId: String) {
        favoriteMoveDao.deleteFavoriteByMoveId(moveId)
    }
} 