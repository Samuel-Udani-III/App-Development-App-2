package com.yaboi.plapisfightinggamemanual.data

object MovelistConverter {
    fun convertToCharacterDetails(characterId: String, movelist: List<MoveCategory>?): CharacterDetails? {
        if (movelist == null) return null

        val moveMap = mutableMapOf<MoveType, List<Move>>()
        
        movelist.forEach { category ->
            val moveType = when (category.name) {
                "Special Moves" -> MoveType.SPECIAL
                "Super Special Moves" -> MoveType.SUPER
                "Unique Moves" -> MoveType.COMMAND_NORMAL
                "Weapon Flipping Techniques" -> MoveType.SPECIAL
                else -> MoveType.NORMAL
            }

            val moves = category.moves.map { moveInfo ->
                Move(
                    name = moveInfo.name,
                    input = moveInfo.input,
                    description = moveInfo.description,
                    // Default values for frame data - can be updated later
                    damage = 0,
                    startup = 0,
                    recovery = 0,
                    onBlock = 0,
                    type = moveType
                )
            }

            moveMap[moveType] = moves
        }

        // Get basic character info from the repository
        val basicInfo = SamuraiShodownRepository.getCharacterDetails(characterId)

        return CharacterDetails(
            id = characterId,
            name = basicInfo?.name ?: characterId.capitalize(),
            playstyle = basicInfo?.playstyle ?: "",
            strengths = basicInfo?.strengths ?: emptyList(),
            weaknesses = basicInfo?.weaknesses ?: emptyList(),
            moves = moveMap
        )
    }

    private fun String.capitalize(): String {
        return replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }
} 