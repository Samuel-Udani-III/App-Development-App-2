package com.yaboi.plapisfightinggamemanual

data class Game(
    val id: String,
    val title: String,
    val description: String,
    val imageResourceId: Int,
    val bannerResourceId: Int? = null,
    val bannerUrl: String? = null
) 