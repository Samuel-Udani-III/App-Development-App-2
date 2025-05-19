package com.yaboi.plapisfightinggamemanual.data

object StreetFighterRepository {
    fun getCharacterDetails(characterId: String): CharacterDetails? {
        return characterData[characterId]
    }

    private val characterData = mapOf(
        "ryu" to CharacterDetails(
            id = "ryu",
            name = "Ryu",
            playstyle = "Fundamental shoto character with strong zoning and balanced offense. Focuses on fireballs, anti-airs, and punishes.",
            strengths = listOf(
                "Strong fireball game",
                "Excellent anti-air options",
                "Good punishment tools",
                "Solid damage output",
                "Easy to learn"
            ),
            weaknesses = listOf(
                "Somewhat predictable",
                "Limited mix-up options",
                "Can be outsped by rushdown",
                "Basic gameplan",
                "Requires strong fundamentals"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "LP",
                        description = "Quick jab",
                        damage = 30,
                        startup = 4,
                        recovery = 7,
                        onBlock = 2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "Standing Medium Punch",
                        input = "MP",
                        description = "Mid-range straight punch",
                        damage = 60,
                        startup = 6,
                        recovery = 13,
                        onBlock = 3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "HP",
                        description = "Strong forward punch",
                        damage = 90,
                        startup = 8,
                        recovery = 18,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Hadoken",
                        input = "QCF+P",
                        description = "Fireball projectile",
                        damage = 60,
                        startup = 14,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Travels across screen"),
                            MoveProperty("Drive Rush Cancel", "Can be canceled with Drive Rush")
                        )
                    ),
                    Move(
                        name = "Shoryuken",
                        input = "DP+P",
                        description = "Rising uppercut",
                        damage = 120,
                        startup = 5,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Invincible", "Upper body invincibility"),
                            MoveProperty("Anti-air", "Strong vs jumping attacks")
                        )
                    ),
                    Move(
                        name = "Tatsumaki Senpukyaku",
                        input = "QCB+K",
                        description = "Spinning kick",
                        damage = 90,
                        startup = 7,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Cross-up", "Can hit from behind"),
                            MoveProperty("Drive Rush Cancel", "Can be canceled with Drive Rush")
                        )
                    ),
                    Move(
                        name = "Denjin Charge",
                        input = "QCF+PP",
                        description = "Electric charge stance",
                        damage = 0,
                        startup = 15,
                        recovery = 25,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Charge", "Powers up special moves"),
                            MoveProperty("Cancel", "Can be canceled")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Shin Hashogeki",
                        input = "QCF,QCF+P",
                        description = "Level 1 Super",
                        damage = 1500,
                        startup = 8,
                        recovery = 38,
                        onBlock = -10,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Super", "Uses 1 super bar"),
                            MoveProperty("Projectile", "Travels across screen")
                        )
                    ),
                    Move(
                        name = "Shin Shoryuken",
                        input = "QCF,QCF+P",
                        description = "Level 3 Super",
                        damage = 3500,
                        startup = 5,
                        recovery = 45,
                        onBlock = -25,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Super", "Uses 3 super bars"),
                            MoveProperty("Invincible", "Full invincibility")
                        )
                    )
                )
            )
        ),
        "ken" to CharacterDetails(
            id = "ken",
            name = "Ken",
            playstyle = "Aggressive shoto character focused on rush-down and pressure. Excels at close-range combat with quick strikes and mix-ups.",
            strengths = listOf(
                "Strong rush-down",
                "Good mix-up options",
                "Quick normals",
                "High damage potential",
                "Strong pressure game"
            ),
            weaknesses = listOf(
                "Weaker zoning than Ryu",
                "Risky playstyle",
                "Poor defensive options",
                "Can be predictable",
                "Requires momentum"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "LP",
                        description = "Quick jab",
                        damage = 30,
                        startup = 4,
                        recovery = 7,
                        onBlock = 2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Hadoken",
                        input = "QCF+P",
                        description = "Fireball projectile",
                        damage = 60,
                        startup = 14,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Travels across screen"),
                            MoveProperty("Drive Rush Cancel", "Can be canceled with Drive Rush")
                        )
                    ),
                    Move(
                        name = "Shoryuken",
                        input = "DP+P",
                        description = "Rising uppercut",
                        damage = 120,
                        startup = 4,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Invincible", "Upper body invincibility"),
                            MoveProperty("Anti-air", "Strong vs jumping attacks")
                        )
                    ),
                    Move(
                        name = "Tatsumaki Senpukyaku",
                        input = "QCB+K",
                        description = "Spinning kick",
                        damage = 90,
                        startup = 6,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Cross-up", "Can hit from behind"),
                            MoveProperty("Drive Rush Cancel", "Can be canceled with Drive Rush")
                        )
                    ),
                    Move(
                        name = "Dragonlash Kick",
                        input = "QCF+K",
                        description = "Forward advancing kick",
                        damage = 80,
                        startup = 16,
                        recovery = 24,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked standing"),
                            MoveProperty("Drive Rush Cancel", "Can be canceled with Drive Rush")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Dragonlash Flame",
                        input = "QCF,QCF+K",
                        description = "Level 1 Super",
                        damage = 1500,
                        startup = 8,
                        recovery = 38,
                        onBlock = -10,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Super", "Uses 1 super bar"),
                            MoveProperty("Drive Rush Cancel", "Can be canceled with Drive Rush")
                        )
                    ),
                    Move(
                        name = "Shippu Jinraikyaku",
                        input = "QCF,QCF+K",
                        description = "Level 3 Super",
                        damage = 3500,
                        startup = 5,
                        recovery = 45,
                        onBlock = -25,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Super", "Uses 3 super bars"),
                            MoveProperty("Invincible", "Full invincibility")
                        )
                    )
                )
            )
        )
    )
} 