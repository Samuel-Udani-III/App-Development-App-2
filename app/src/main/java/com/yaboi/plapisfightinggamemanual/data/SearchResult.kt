package com.yaboi.plapisfightinggamemanual.data

sealed class SearchResult {
    data class CharacterResult(
        val characterId: String,
        val name: String,
        val playstyle: String
    ) : SearchResult()

    data class MoveResult(
        val characterId: String,
        val characterName: String,
        val move: Move
    ) : SearchResult()
} 