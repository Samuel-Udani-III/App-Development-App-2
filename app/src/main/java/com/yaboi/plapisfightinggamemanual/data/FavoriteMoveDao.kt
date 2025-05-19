package com.yaboi.plapisfightinggamemanual.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FavoriteMoveDao {
    @Query("SELECT * FROM favorite_moves ORDER BY timestamp DESC")
    fun getAllFavorites(): LiveData<List<FavoriteMove>>

    @Query("SELECT * FROM favorite_moves WHERE characterId = :characterId")
    fun getFavoritesForCharacter(characterId: String): LiveData<List<FavoriteMove>>

    @Query("SELECT EXISTS(SELECT 1 FROM favorite_moves WHERE moveId = :moveId LIMIT 1)")
    fun isMoveInFavorites(moveId: String): LiveData<Boolean>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(favoriteMove: FavoriteMove)

    @Delete
    suspend fun deleteFavorite(favoriteMove: FavoriteMove)

    @Query("DELETE FROM favorite_moves WHERE moveId = :moveId")
    suspend fun deleteFavoriteByMoveId(moveId: String)
} 