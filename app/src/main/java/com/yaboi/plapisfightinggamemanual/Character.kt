package com.yaboi.plapisfightinggamemanual

data class Character(
    val id: String,
    val name: String,
    val archetype: String,
    val description: String,
    val imageResourceId: Int,
    val difficulty: String,
    val gameId: String
) 