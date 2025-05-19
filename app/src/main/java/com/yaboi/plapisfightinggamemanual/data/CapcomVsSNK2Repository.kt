package com.yaboi.plapisfightinggamemanual.data

object CapcomVsSNK2Repository {
    fun getCharacterDetails(characterId: String): CharacterDetails? {
        return characterData[characterId]
    }

    fun getAllCharacters(): List<CharacterDetails> {
        return characterData.values.toList()
    }

    private val characterData = mapOf(
        "ryu" to CharacterDetails(
            id = "ryu",
            name = "Ryu",
            playstyle = "Ryu is the quintessential shoto character who excels at fundamental fighting game mechanics. His balanced moveset and reliable special moves make him excellent at both offense and defense.",
            strengths = listOf(
                "Strong fundamental tools",
                "Reliable projectile game",
                "Good anti-air options",
                "Solid damage output",
                "Easy to learn"
            ),
            weaknesses = listOf(
                "Somewhat predictable",
                "No unique gimmicks",
                "Can be outmaneuvered",
                "Limited mix-up options"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "LP",
                        description = "Quick jab, good for pressure",
                        damage = 30,
                        startup = 4,
                        recovery = 7,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Medium Punch",
                        input = "MP",
                        description = "Solid mid-range poke",
                        damage = 60,
                        startup = 6,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "HP",
                        description = "Strong punch with good reach",
                        damage = 90,
                        startup = 8,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Solar Plexus Strike",
                        input = "→ + MP",
                        description = "Overhead attack that must be blocked standing",
                        damage = 70,
                        startup = 16,
                        recovery = 20,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Collarbone Breaker",
                        input = "→ + HP",
                        description = "Forward-moving overhead strike",
                        damage = 90,
                        startup = 18,
                        recovery = 22,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Hadoken",
                        input = "↓↘→ + P",
                        description = "Projectile attack. Strength determines speed",
                        damage = 70,
                        startup = 14,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Shoryuken",
                        input = "→↓↘ + P",
                        description = "Rising uppercut with invincibility",
                        damage = 120,
                        startup = 4,
                        recovery = 35,
                        onBlock = -25,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Tatsumaki Senpukyaku",
                        input = "↓↙← + K",
                        description = "Spinning kick that can cross up",
                        damage = 80,
                        startup = 9,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Shinkuu Hadoken",
                        input = "↓↘→↓↘→ + P",
                        description = "Multi-hitting projectile super",
                        damage = 320,
                        startup = 10,
                        recovery = 42,
                        onBlock = -12,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Shinkuu Tatsumaki",
                        input = "↓↙←↓↙← + K",
                        description = "Multi-hitting spinning kick super",
                        damage = 280,
                        startup = 8,
                        recovery = 38,
                        onBlock = -15,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "ken" to CharacterDetails(
            id = "ken",
            name = "Ken Masters",
            playstyle = "Ken is an aggressive shoto character who specializes in close-range pressure and devastating combos. His enhanced Shoryuken and unique target combos make him deadlier at close range than Ryu.",
            strengths = listOf(
                "Strong rushdown potential",
                "Powerful combo game",
                "Good mix-up options",
                "Enhanced Shoryuken",
                "Quick pressure tools"
            ),
            weaknesses = listOf(
                "Weaker projectile game than Ryu",
                "Riskier playstyle",
                "Can be predictable",
                "Less effective at long range"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "LP",
                        description = "Quick jab, good for pressure",
                        damage = 30,
                        startup = 4,
                        recovery = 7,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Medium Punch",
                        input = "MP",
                        description = "Solid mid-range poke",
                        damage = 60,
                        startup = 6,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "HP",
                        description = "Strong punch with good reach",
                        damage = 90,
                        startup = 8,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Thunder Kick",
                        input = "→ + MK",
                        description = "Forward-moving kick, good for pressure",
                        damage = 70,
                        startup = 14,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Forward Step Kick",
                        input = "→ + HK",
                        description = "Overhead attack that must be blocked standing",
                        damage = 90,
                        startup = 20,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Hadoken",
                        input = "↓↘→ + P",
                        description = "Projectile attack. Strength determines speed",
                        damage = 70,
                        startup = 14,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Shoryuken",
                        input = "→↓↘ + P",
                        description = "Rising uppercut with invincibility. More damage than Ryu's version",
                        damage = 140,
                        startup = 4,
                        recovery = 35,
                        onBlock = -25,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Tatsumaki Senpukyaku",
                        input = "↓↙← + K",
                        description = "Spinning kick that can cross up",
                        damage = 80,
                        startup = 9,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Shoryureppa",
                        input = "↓↘→↓↘→ + P",
                        description = "Multi-hitting Shoryuken super",
                        damage = 350,
                        startup = 6,
                        recovery = 45,
                        onBlock = -28,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Shinryuken",
                        input = "↓↙←↓↙← + P",
                        description = "Rising dragon punch super with multiple hits",
                        damage = 320,
                        startup = 8,
                        recovery = 42,
                        onBlock = -30,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "sagat" to CharacterDetails(
            id = "sagat",
            name = "Sagat",
            playstyle = "Sagat is a dominant zoning character who excels at controlling space with his Tiger Shot projectiles and punishing approaches with his Tiger Uppercut. His long limbs and powerful normals make him a threat at any range.",
            strengths = listOf(
                "Excellent projectile game",
                "Strong anti-air options",
                "Long-range normals",
                "High damage output",
                "Good defensive options"
            ),
            weaknesses = listOf(
                "Slower movement speed",
                "Large hurtbox",
                "Weak to pressure",
                "Limited mix-up options"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "LP",
                        description = "Quick jab with good range",
                        damage = 30,
                        startup = 4,
                        recovery = 7,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Medium Punch",
                        input = "MP",
                        description = "Strong mid-range poke",
                        damage = 70,
                        startup = 7,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "HP",
                        description = "Powerful long-range strike",
                        damage = 100,
                        startup = 9,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "High Tiger Shot",
                        input = "→ + HP",
                        description = "Overhead punch with long reach",
                        damage = 90,
                        startup = 16,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Low Tiger Shot",
                        input = "→ + HK",
                        description = "Low sweeping kick with good range",
                        damage = 80,
                        startup = 14,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "High Tiger Shot",
                        input = "↓↘→ + P",
                        description = "High projectile attack. Strength affects speed and recovery",
                        damage = 80,
                        startup = 12,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Low Tiger Shot",
                        input = "↓↘→ + K",
                        description = "Low projectile attack. Strength affects speed and recovery",
                        damage = 70,
                        startup = 12,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Tiger Uppercut",
                        input = "→↓↘ + P",
                        description = "Rising uppercut with invincibility. Great anti-air",
                        damage = 130,
                        startup = 4,
                        recovery = 35,
                        onBlock = -25,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Tiger Knee",
                        input = "↓↙← + K",
                        description = "Jumping knee attack that can cross up",
                        damage = 90,
                        startup = 8,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Tiger Genocide",
                        input = "↓↘→↓↘→ + P",
                        description = "Multiple Tiger Uppercuts with massive damage",
                        damage = 380,
                        startup = 6,
                        recovery = 45,
                        onBlock = -30,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Tiger Raid",
                        input = "↓↙←↓↙← + K",
                        description = "Multiple Tiger Knee attacks with good range",
                        damage = 320,
                        startup = 8,
                        recovery = 42,
                        onBlock = -25,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "kyo" to CharacterDetails(
            id = "kyo",
            name = "Kyo Kusanagi",
            playstyle = "Kyo is an aggressive rushdown character who excels at close-range combat with his flame-enhanced attacks. His versatile moveset allows for creative pressure and mix-up opportunities.",
            strengths = listOf(
                "Strong pressure game",
                "Good mix-up options",
                "Versatile combo routes",
                "Solid frame data",
                "Effective anti-airs"
            ),
            weaknesses = listOf(
                "Limited range",
                "Requires close range",
                "Complex execution",
                "Weak projectile game"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "LP",
                        description = "Quick jab, good for pressure",
                        damage = 30,
                        startup = 4,
                        recovery = 7,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Medium Punch",
                        input = "MP",
                        description = "Solid mid-range poke",
                        damage = 60,
                        startup = 6,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "HP",
                        description = "Strong punch with good reach",
                        damage = 90,
                        startup = 8,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "88 Bash",
                        input = "→ + HP",
                        description = "Forward-moving overhead strike",
                        damage = 80,
                        startup = 16,
                        recovery = 20,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Flame Sweep",
                        input = "→ + HK",
                        description = "Low sweeping kick with flame effect",
                        damage = 70,
                        startup = 14,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Oniyaki",
                        input = "→↓↘ + P",
                        description = "Rising flame uppercut, great anti-air",
                        damage = 120,
                        startup = 5,
                        recovery = 30,
                        onBlock = -15,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "100 Shiki: Oniyaki",
                        input = "↓↙← + P",
                        description = "Advancing flame punch with follow-ups",
                        damage = 80,
                        startup = 8,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Aragami",
                        input = "↓↘→ + P",
                        description = "Quick flame strike with branching options",
                        damage = 70,
                        startup = 7,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "R.E.D. Kick",
                        input = "↓↘→ + K",
                        description = "Flying kick that can cross up",
                        damage = 90,
                        startup = 12,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "182 Shiki",
                        input = "↓↘→↓↘→ + P",
                        description = "Multiple flame-enhanced strikes",
                        damage = 320,
                        startup = 8,
                        recovery = 38,
                        onBlock = -20,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Orochinagi",
                        input = "↓↙←↓↙← + P",
                        description = "Massive flame projectile super",
                        damage = 350,
                        startup = 10,
                        recovery = 42,
                        onBlock = -25,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "iori" to CharacterDetails(
            id = "iori",
            name = "Iori Yagami",
            playstyle = "Iori is a technical character who excels at close-range combat with his brutal claw attacks and command grabs. His unique moveset and purple flames allow for devastating mix-ups and pressure.",
            strengths = listOf(
                "Strong mix-up game",
                "Powerful command grabs",
                "Good pressure tools",
                "High damage output",
                "Effective anti-airs"
            ),
            weaknesses = listOf(
                "Limited range",
                "Complex execution",
                "Weak projectile game",
                "Requires good reads"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "LP",
                        description = "Quick claw swipe",
                        damage = 30,
                        startup = 4,
                        recovery = 7,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Medium Punch",
                        input = "MP",
                        description = "Mid-range claw attack",
                        damage = 60,
                        startup = 6,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "HP",
                        description = "Strong claw strike",
                        damage = 90,
                        startup = 8,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Yami Barai",
                        input = "→ + HP",
                        description = "Forward-moving claw swipe with follow-ups",
                        damage = 80,
                        startup = 14,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Goufu In",
                        input = "→ + HK",
                        description = "Overhead kick with purple flames",
                        damage = 70,
                        startup = 16,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "100 Shiki: Oniyaki",
                        input = "→↓↘ + P",
                        description = "Rising flame uppercut",
                        damage = 120,
                        startup = 5,
                        recovery = 30,
                        onBlock = -15,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Kuzukaze",
                        input = "↓↙← + P",
                        description = "Command grab with follow-up options",
                        damage = 140,
                        startup = 2,
                        recovery = 35,
                        onBlock = -25,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "108 Shiki: Yamibarai",
                        input = "↓↘→ + P",
                        description = "Ground projectile with purple flames",
                        damage = 70,
                        startup = 14,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "127 Shiki: Aoi Hana",
                        input = "↓↘→ + K",
                        description = "Rushing kick series with mix-up potential",
                        damage = 90,
                        startup = 12,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Kin 1211 Shiki: Ya Otome",
                        input = "↓↘→↓↘→ + P",
                        description = "Multiple claw strikes with purple flames",
                        damage = 350,
                        startup = 6,
                        recovery = 42,
                        onBlock = -25,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Ura 108 Shiki: Ya Sakazuki",
                        input = "↓↙←↓↙← + P",
                        description = "Massive purple flame projectile",
                        damage = 320,
                        startup = 10,
                        recovery = 38,
                        onBlock = -20,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "terry" to CharacterDetails(
            id = "terry",
            name = "Terry Bogard",
            playstyle = "Terry is a balanced character who excels at ground-based combat with his powerful punches and unique command moves. His mix of projectiles and rushing attacks makes him effective at any range.",
            strengths = listOf(
                "Strong ground game",
                "Good mix of range and rush-down",
                "Powerful anti-airs",
                "Easy to learn",
                "Solid damage output"
            ),
            weaknesses = listOf(
                "Limited air options",
                "Some moves are unsafe",
                "Can be predictable",
                "Weak to strong zoning"
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
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Medium Punch",
                        input = "MP",
                        description = "Solid mid-range punch",
                        damage = 60,
                        startup = 6,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "HP",
                        description = "Strong punch with good reach",
                        damage = 90,
                        startup = 8,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Back Knuckle",
                        input = "→ + HP",
                        description = "Overhead strike with good range",
                        damage = 80,
                        startup = 16,
                        recovery = 20,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Rising Upper",
                        input = "→ + MP",
                        description = "Rising uppercut, good for combos",
                        damage = 70,
                        startup = 12,
                        recovery = 16,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Power Wave",
                        input = "↓↘→ + P",
                        description = "Ground projectile that travels along the floor",
                        damage = 70,
                        startup = 14,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Rising Tackle",
                        input = "↓↑ + P",
                        description = "Rising spinning uppercut",
                        damage = 120,
                        startup = 5,
                        recovery = 30,
                        onBlock = -15,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Burning Knuckle",
                        input = "↓↙← + P",
                        description = "Charging punch with armor",
                        damage = 100,
                        startup = 20,
                        recovery = 25,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Crack Shoot",
                        input = "↓↘→ + K",
                        description = "Jumping axe kick that can cross up",
                        damage = 90,
                        startup = 12,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Power Geyser",
                        input = "↓↘→↓↘→ + P",
                        description = "Massive ground eruption",
                        damage = 320,
                        startup = 8,
                        recovery = 42,
                        onBlock = -25,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Buster Wolf",
                        input = "↓↙←↓↙← + P",
                        description = "Rushing punch into explosive finish",
                        damage = 350,
                        startup = 6,
                        recovery = 45,
                        onBlock = -30,
                        type = MoveType.SUPER
                    )
                )
            )
        )
    )
} 