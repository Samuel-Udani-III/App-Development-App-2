package com.yaboi.plapisfightinggamemanual.data

object MortalKombatRepository {
    fun getCharacterDetails(characterId: String): CharacterDetails? {
        return characterData[characterId]
    }

    private val characterData = mapOf(
        "scorpion" to CharacterDetails(
            id = "scorpion",
            name = "Scorpion",
            playstyle = "Mix-up heavy character with strong neutral and pressure tools. Excels at punishing mistakes with high damage combos.",
            strengths = listOf(
                "Strong mix-up game",
                "Good neutral tools",
                "High damage output",
                "Strong pressure",
                "Good mobility"
            ),
            weaknesses = listOf(
                "Unsafe on many moves",
                "Requires good execution",
                "Can be predictable",
                "Weak to zoning",
                "Poor defensive options"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Front Punch",
                        input = "1",
                        description = "Quick jab",
                        damage = 50,
                        startup = 7,
                        recovery = 12,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "Back Punch",
                        input = "2",
                        description = "Strong punch",
                        damage = 80,
                        startup = 8,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Spear",
                        input = "BF1",
                        description = "Signature chain spear attack",
                        damage = 120,
                        startup = 13,
                        recovery = 28,
                        onBlock = -16,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Krushing Blow", "On punish or counter hit")
                        )
                    ),
                    Move(
                        name = "Hellport",
                        input = "DB3",
                        description = "Teleport behind opponent",
                        damage = 0,
                        startup = 11,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Teleport", "Moves behind opponent"),
                            MoveProperty("Cancel", "Can be canceled")
                        )
                    ),
                    Move(
                        name = "Death Spin",
                        input = "BF2",
                        description = "Spinning kick attack",
                        damage = 130,
                        startup = 15,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Krushing Blow", "On counter hit")
                        )
                    ),
                    Move(
                        name = "Demon Dash",
                        input = "DB4",
                        description = "Forward rushing attack",
                        damage = 100,
                        startup = 16,
                        recovery = 26,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Cancel", "Can be canceled")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Fatal Blow",
                        input = "L2+R2",
                        description = "Cinematic super move",
                        damage = 350,
                        startup = 12,
                        recovery = 45,
                        onBlock = -30,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Armor", "Has armor during startup"),
                            MoveProperty("Fatal Blow", "Only available under 30% health")
                        )
                    )
                )
            )
        ),
        "subzero" to CharacterDetails(
            id = "subzero",
            name = "Sub-Zero",
            playstyle = "Mix-up and pressure character with strong neutral control. Excels at 50/50 mix-ups and corner pressure.",
            strengths = listOf(
                "Strong mix-up game",
                "Good neutral control",
                "Solid damage",
                "Strong corner pressure",
                "Good anti-airs"
            ),
            weaknesses = listOf(
                "Slow startup on some moves",
                "Limited combo routes",
                "Poor mobility",
                "Weak to pressure",
                "Predictable approach options"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Front Punch",
                        input = "1",
                        description = "Quick jab",
                        damage = 50,
                        startup = 7,
                        recovery = 12,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Ice Ball",
                        input = "BF1",
                        description = "Freezing projectile",
                        damage = 100,
                        startup = 14,
                        recovery = 28,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Freeze", "Freezes opponent on hit")
                        )
                    ),
                    Move(
                        name = "Slide",
                        input = "BF3",
                        description = "Low sliding attack",
                        damage = 120,
                        startup = 16,
                        recovery = 26,
                        onBlock = -15,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Krushing Blow", "On counter hit")
                        )
                    ),
                    Move(
                        name = "Axe Kick",
                        input = "DB2",
                        description = "Overhead axe kick",
                        damage = 130,
                        startup = 19,
                        recovery = 28,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked standing"),
                            MoveProperty("Krushing Blow", "After certain conditions")
                        )
                    ),
                    Move(
                        name = "Ice Clone",
                        input = "DB4",
                        description = "Creates ice clone",
                        damage = 0,
                        startup = 14,
                        recovery = 24,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Special", "Creates ice clone"),
                            MoveProperty("Setup", "Good for setups")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Fatal Blow",
                        input = "L2+R2",
                        description = "Cinematic super move",
                        damage = 350,
                        startup = 12,
                        recovery = 45,
                        onBlock = -30,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Armor", "Has armor during startup"),
                            MoveProperty("Fatal Blow", "Only available under 30% health")
                        )
                    )
                )
            )
        )
    )
} 