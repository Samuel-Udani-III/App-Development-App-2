package com.yaboi.plapisfightinggamemanual.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_moves")
data class FavoriteMove(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val moveId: String,
    val characterId: String,
    val gameId: String,
    val moveName: String,
    val input: String,
    val damage: String,
    val frameData: String,
    val timestamp: Long = System.currentTimeMillis()
) 