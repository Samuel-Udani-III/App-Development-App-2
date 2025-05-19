package com.yaboi.plapisfightinggamemanual.data

object CVS2Repository {
    fun getCharacterDetails(characterId: String): CharacterDetails? {
        return characterData[characterId]
    }

    private val characterData = mapOf(
        "ryu" to CharacterDetails(
            id = "ryu",
            name = "Ryu",
            playstyle = "Ryu is the quintessential shoto character with a balanced moveset focused on fundamentals. His versatile toolkit makes him effective at any range.",
            strengths = listOf(
                "Strong fireball game",
                "Reliable anti-air options",
                "Good damage output",
                "Solid mix-up potential",
                "Versatile in all ranges"
            ),
            weaknesses = listOf(
                "Somewhat predictable",
                "No exceptional strengths",
                "Can be outranged",
                "Limited mix-up options"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Punch",
                        input = "LP",
                        description = "Quick jab",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Close Medium Punch",
                        input = "Close MP",
                        description = "Strong close-range straight punch",
                        damage = 600,
                        startup = 5,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Far Medium Punch",
                        input = "Far MP",
                        description = "Extended straight punch",
                        damage = 500,
                        startup = 6,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Close Heavy Punch",
                        input = "Close HP",
                        description = "Powerful uppercut punch",
                        damage = 800,
                        startup = 7,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Far Heavy Punch",
                        input = "Far HP",
                        description = "Strong overhead punch",
                        damage = 700,
                        startup = 8,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Light Kick",
                        input = "LK",
                        description = "Quick low kick",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Kick",
                        input = "MK",
                        description = "Standard roundhouse kick",
                        damage = 500,
                        startup = 7,
                        recovery = 14,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Kick",
                        input = "HK",
                        description = "Strong roundhouse kick",
                        damage = 700,
                        startup = 9,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Forward Throw",
                        input = "LP + LK (Close)",
                        description = "Forward throwing attack",
                        damage = 800,
                        startup = 3,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Throw", "Must be teched"),
                            MoveProperty("Close Range", "Must be in throw range"),
                            MoveProperty("Forward", "Throws opponent forward")
                        )
                    ),
                    Move(
                        name = "Back Throw",
                        input = "← + LP + LK (Close)",
                        description = "Backward throwing attack",
                        damage = 800,
                        startup = 3,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Throw", "Must be teched"),
                            MoveProperty("Close Range", "Must be in throw range"),
                            MoveProperty("Back", "Throws opponent backward")
                        )
                    ),
                    Move(
                        name = "Close Medium Kick",
                        input = "Close MK",
                        description = "Strong close-range kick",
                        damage = 600,
                        startup = 6,
                        recovery = 14,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Far Medium Kick",
                        input = "Far MK",
                        description = "Extended roundhouse kick",
                        damage = 500,
                        startup = 7,
                        recovery = 14,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Close Heavy Kick",
                        input = "Close HK",
                        description = "Powerful close-range kick",
                        damage = 800,
                        startup = 8,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Far Heavy Kick",
                        input = "Far HK",
                        description = "Strong roundhouse kick",
                        damage = 700,
                        startup = 9,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Light Punch",
                        input = "↓ + LP",
                        description = "Quick low jab",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Medium Punch",
                        input = "↓ + MP",
                        description = "Mid-hitting straight punch",
                        damage = 500,
                        startup = 6,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Heavy Punch",
                        input = "↓ + HP",
                        description = "Strong uppercut punch",
                        damage = 700,
                        startup = 8,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Light Kick",
                        input = "↓ + LK",
                        description = "Quick low kick",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Medium Kick",
                        input = "↓ + MK",
                        description = "Sliding mid kick",
                        damage = 500,
                        startup = 7,
                        recovery = 14,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Heavy Kick",
                        input = "↓ + HK",
                        description = "Sweeping kick",
                        damage = 700,
                        startup = 9,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Knockdown", "Forces knockdown on hit"),
                            MoveProperty("Low", "Must be blocked low")
                        )
                    ),
                    Move(
                        name = "Neutral Jump Light Punch",
                        input = "Jump LP",
                        description = "Quick aerial jab",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Forward Roll",
                        input = "→ + Two Punches (A/P-Groove)",
                        description = "Roll forward to evade attacks",
                        damage = 0,
                        startup = 2,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Invincible", "Has invincibility frames"),
                            MoveProperty("A/P-Groove", "Only in A or P Groove"),
                            MoveProperty("Defensive", "Defensive movement option")
                        )
                    ),
                    Move(
                        name = "Backward Roll",
                        input = "← + Two Punches (A/P-Groove)",
                        description = "Roll backward to evade attacks",
                        damage = 0,
                        startup = 2,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Invincible", "Has invincibility frames"),
                            MoveProperty("A/P-Groove", "Only in A or P Groove"),
                            MoveProperty("Defensive", "Defensive movement option")
                        )
                    ),
                    Move(
                        name = "Alpha Counter",
                        input = "→ + HP/HK while blocking (A-Groove)",
                        description = "Counter attack while blocking",
                        damage = 500,
                        startup = 1,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Counter", "Must be used while blocking"),
                            MoveProperty("A-Groove", "Only in A-Groove"),
                            MoveProperty("Uses Meter", "Costs guard gauge")
                        )
                    ),
                    Move(
                        name = "Air Throw",
                        input = "LP + LK in air (close)",
                        description = "Aerial throwing attack",
                        damage = 800,
                        startup = 3,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Air Move", "Can only be done in air"),
                            MoveProperty("Throw", "Must be teched"),
                            MoveProperty("Close Range", "Must be in throw range")
                        )
                    ),
                    Move(
                        name = "Forward Jump Heavy Punch",
                        input = "Jump HP (forward jump)",
                        description = "Diving punch, good for jump-ins",
                        damage = 700,
                        startup = 8,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Air Move", "Aerial attack"),
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Jump-in", "Good for approaching")
                        )
                    ),
                    Move(
                        name = "Back Jump Heavy Kick",
                        input = "Jump HK (back jump)",
                        description = "Retreating kick, good for air-to-air",
                        damage = 700,
                        startup = 9,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Air Move", "Aerial attack"),
                            MoveProperty("Air-to-Air", "Good vs jump-ins"),
                            MoveProperty("Retreat", "Good for backing away")
                        )
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Solar Plexus Strike",
                        input = "→ + MP",
                        description = "Advancing overhead punch",
                        damage = 600,
                        startup = 15,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Collarbone Breaker",
                        input = "→ + HP",
                        description = "Overhead strike, must be blocked high",
                        damage = 800,
                        startup = 18,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Joudan Sokutou Geri",
                        input = "→ + HK",
                        description = "Overhead axe kick, must be blocked high",
                        damage = 750,
                        startup = 20,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Quick Step",
                        input = "→ → or → (hold)",
                        description = "Run forward, enables special follow-ups",
                        damage = 0,
                        startup = 8,
                        recovery = 12,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Movement", "Forward dash/run"),
                            MoveProperty("Cancel", "Can cancel into special moves"),
                            MoveProperty("Pressure", "Good for closing distance")
                        )
                    ),
                    Move(
                        name = "Thunder Kick",
                        input = "→ + MK",
                        description = "Advancing kick, good for pressure",
                        damage = 600,
                        startup = 15,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Inazuma Kick",
                        input = "→ + MK (during Quick Step)",
                        description = "Quick overhead kick during run",
                        damage = 650,
                        startup = 12,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Quick Step", "Only during run"),
                            MoveProperty("Mix-up", "Good for mix-ups")
                        )
                    ),
                    Move(
                        name = "Forward Step Kick",
                        input = "→ + HK",
                        description = "Overhead kick, must be blocked high",
                        damage = 800,
                        startup = 18,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Crazy Kick",
                        input = "→ + MK (during forward jump)",
                        description = "Forward-moving hop kick",
                        damage = 700,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Movement", "Moves forward"),
                            MoveProperty("Mix-up", "Good for mix-ups")
                        )
                    ),
                    Move(
                        name = "High Parry",
                        input = "→ (just before hit) (N-Groove)",
                        description = "Parry high attacks",
                        damage = 0,
                        startup = 1,
                        recovery = 10,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("N-Groove", "Only in N-Groove"),
                            MoveProperty("Parry", "Negates damage and builds meter"),
                            MoveProperty("High", "Works against high attacks")
                        )
                    ),
                    Move(
                        name = "Low Parry",
                        input = "↓ (just before hit) (N-Groove)",
                        description = "Parry low attacks",
                        damage = 0,
                        startup = 1,
                        recovery = 10,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("N-Groove", "Only in N-Groove"),
                            MoveProperty("Parry", "Negates damage and builds meter"),
                            MoveProperty("Low", "Works against low attacks")
                        )
                    ),
                    Move(
                        name = "Just Defend",
                        input = "← (just before hit) (P-Groove)",
                        description = "Perfect block that builds meter",
                        damage = 0,
                        startup = 1,
                        recovery = 1,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("P-Groove", "Only in P-Groove"),
                            MoveProperty("Defense", "Reduces blockstun"),
                            MoveProperty("Meter", "Builds groove gauge")
                        )
                    ),
                    Move(
                        name = "Run",
                        input = "→ → (hold) (K-Groove)",
                        description = "Quick forward dash that can be maintained",
                        damage = 0,
                        startup = 8,
                        recovery = 12,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("K-Groove", "Only in K-Groove"),
                            MoveProperty("Movement", "Quick approach"),
                            MoveProperty("Cancel", "Can cancel into attacks")
                        )
                    ),
                    Move(
                        name = "Hop",
                        input = "↑ (tap) (K-Groove)",
                        description = "Quick short jump",
                        damage = 0,
                        startup = 4,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("K-Groove", "Only in K-Groove"),
                            MoveProperty("Movement", "Quick air approach"),
                            MoveProperty("Mix-up", "Good for mind games")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Hadoken",
                        input = "↓↘→ + P",
                        description = "Fireball projectile. Strength determines speed and recovery.",
                        damage = 600,
                        startup = 14,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Energy projectile"),
                            MoveProperty("Variable", "Different speeds per button"),
                            MoveProperty("Zoning", "Good for controlling space"),
                            MoveProperty("C-Groove", "Can be canceled into from normals")
                        )
                    ),
                    Move(
                        name = "Shakunetsu Hadoken",
                        input = "↓↘→ + P (hold P)",
                        description = "Red fireball that hits multiple times",
                        damage = 800,
                        startup = 16,
                        recovery = 32,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Knockdown", "Forces knockdown on hit"),
                            MoveProperty("C-Groove", "Can be canceled into from normals")
                        )
                    ),
                    Move(
                        name = "Shoryuken",
                        input = "→↓↘ + P",
                        description = "Rising dragon punch. Excellent anti-air with invincibility.",
                        damage = 800,
                        startup = 4,
                        recovery = 35,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-air", "Strong vs jumping opponents"),
                            MoveProperty("Invincible", "Upper body invincibility"),
                            MoveProperty("High Risk", "Very punishable on block"),
                            MoveProperty("C-Groove", "Can be canceled into from normals")
                        )
                    ),
                    Move(
                        name = "Tatsumaki Senpukyaku",
                        input = "↓↙← + K",
                        description = "Spinning kick. Good for approach and pressure.",
                        damage = 700,
                        startup = 8,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Movement", "Moves forward"),
                            MoveProperty("Cross-up", "Can cross-up on jump"),
                            MoveProperty("C-Groove", "Can be canceled into from normals")
                        )
                    ),
                    Move(
                        name = "Air Tatsumaki Senpukyaku",
                        input = "↓↙← + K (in air)",
                        description = "Aerial spinning kick, good for mix-ups",
                        damage = 650,
                        startup = 8,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Air Move", "Can only be done in air"),
                            MoveProperty("Cross-up", "Excellent cross-up tool"),
                            MoveProperty("Mix-up", "Good for mix-up situations")
                        )
                    ),
                    Move(
                        name = "Air Hadoken",
                        input = "↓↘→ + P (in air)",
                        description = "Aerial fireball projectile",
                        damage = 500,
                        startup = 12,
                        recovery = 24,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Air Move", "Can only be done in air"),
                            MoveProperty("Projectile", "Energy projectile"),
                            MoveProperty("Angle", "Fires at downward angle")
                        )
                    ),
                    Move(
                        name = "EX Hadoken",
                        input = "↓↘→ + Two P buttons (C-Groove)",
                        description = "Enhanced fireball that hits twice",
                        damage = 800,
                        startup = 12,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("EX Move", "Uses meter in C-Groove"),
                            MoveProperty("Multi-hit", "Hits twice"),
                            MoveProperty("Speed", "Faster than normal version")
                        )
                    ),
                    Move(
                        name = "EX Shoryuken",
                        input = "→↓↘ + Two P buttons (C-Groove)",
                        description = "Enhanced dragon punch with more hits",
                        damage = 1000,
                        startup = 3,
                        recovery = 35,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("EX Move", "Uses meter in C-Groove"),
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Full invincibility")
                        )
                    ),
                    Move(
                        name = "EX Tatsumaki Senpukyaku",
                        input = "↓↙← + Two K buttons (C-Groove)",
                        description = "Enhanced hurricane kick with more hits",
                        damage = 900,
                        startup = 7,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("EX Move", "Uses meter in C-Groove"),
                            MoveProperty("Multi-hit", "More hits than normal version"),
                            MoveProperty("Distance", "Travels further")
                        )
                    ),
                    Move(
                        name = "Custom Combo Activation",
                        input = "Two Punches + Two Kicks (C-Groove)",
                        description = "Activate Custom Combo mode",
                        damage = 0,
                        startup = 1,
                        recovery = 1,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("C-Groove", "Only in C-Groove"),
                            MoveProperty("Uses Meter", "Uses entire groove gauge"),
                            MoveProperty("Cancel", "Can cancel any move"),
                            MoveProperty("Time Limited", "Limited duration")
                        )
                    ),
                    Move(
                        name = "Level 3 Custom Combo",
                        input = "Two Punches + Two Kicks (hold) (C-Groove)",
                        description = "Enhanced Custom Combo with more damage",
                        damage = 0,
                        startup = 1,
                        recovery = 1,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("C-Groove", "Only in C-Groove"),
                            MoveProperty("Level 3", "Uses 3 groove stocks"),
                            MoveProperty("Enhanced", "More damage than regular CC"),
                            MoveProperty("Time Limited", "Limited duration")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Shinkuu Hadoken",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 Super. Massive fireball that hits multiple times.",
                        damage = 2000,
                        startup = 8,
                        recovery = 42,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Level 1", "Uses 1 super bar"),
                            MoveProperty("Projectile", "Full screen projectile")
                        )
                    ),
                    Move(
                        name = "Shinkuu Tatsumaki Senpukyaku",
                        input = "↓↙←↓↙← + K",
                        description = "Level 1 Super. Multiple spinning kicks with vacuum effect.",
                        damage = 2200,
                        startup = 6,
                        recovery = 48,
                        onBlock = -14,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Level 1", "Uses 1 super bar"),
                            MoveProperty("Vacuum", "Pulls opponent in")
                        )
                    ),
                    Move(
                        name = "Shin Shoryuken",
                        input = "↓↘→↓↘→ + P (Level 3)",
                        description = "Level 3 Super. Ultimate dragon punch with massive damage.",
                        damage = 4000,
                        startup = 1,
                        recovery = 52,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Level 3", "Uses 3 super bars"),
                            MoveProperty("Invincible", "Full invincibility"),
                            MoveProperty("High Damage", "Extremely high damage")
                        )
                    ),
                    Move(
                        name = "Metsu Shoryuken",
                        input = "↓↘→↓↘→ + P (Level 2)",
                        description = "Level 2 Super. Powerful rising dragon punch with follow-up hits.",
                        damage = 3000,
                        startup = 2,
                        recovery = 48,
                        onBlock = -16,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Level 2", "Uses 2 super bars"),
                            MoveProperty("Invincible", "Full invincibility"),
                            MoveProperty("Counter", "Additional damage on counter hit")
                        )
                    )
                )
            )
        ),
        "ken" to CharacterDetails(
            id = "ken",
            name = "Ken Masters",
            playstyle = "Ken is an aggressive shoto character who excels at rush-down and mix-ups. His modified special moves and unique command normals make him more offensive than Ryu.",
            strengths = listOf(
                "Strong rush-down game",
                "Good mix-up potential",
                "Fast movement speed",
                "Powerful combo ability",
                "Versatile pressure options"
            ),
            weaknesses = listOf(
                "Weaker fireball game than Ryu",
                "More risk-reward oriented",
                "Can be predictable",
                "Less effective at long range"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Punch",
                        input = "LP",
                        description = "Quick jab",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Close Medium Punch",
                        input = "Close MP",
                        description = "Strong close-range straight punch",
                        damage = 600,
                        startup = 5,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Far Medium Punch",
                        input = "Far MP",
                        description = "Extended straight punch",
                        damage = 500,
                        startup = 6,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Close Heavy Punch",
                        input = "Close HP",
                        description = "Powerful uppercut punch",
                        damage = 800,
                        startup = 7,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Far Heavy Punch",
                        input = "Far HP",
                        description = "Strong overhead punch",
                        damage = 700,
                        startup = 8,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Light Kick",
                        input = "LK",
                        description = "Quick low kick",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Kick",
                        input = "MK",
                        description = "Standard roundhouse kick",
                        damage = 500,
                        startup = 7,
                        recovery = 14,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Kick",
                        input = "HK",
                        description = "Strong roundhouse kick",
                        damage = 700,
                        startup = 9,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Forward Throw",
                        input = "LP + LK (Close)",
                        description = "Forward throwing attack",
                        damage = 800,
                        startup = 3,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Throw", "Must be teched"),
                            MoveProperty("Close Range", "Must be in throw range"),
                            MoveProperty("Forward", "Throws opponent forward")
                        )
                    ),
                    Move(
                        name = "Back Throw",
                        input = "← + LP + LK (Close)",
                        description = "Backward throwing attack",
                        damage = 800,
                        startup = 3,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Throw", "Must be teched"),
                            MoveProperty("Close Range", "Must be in throw range"),
                            MoveProperty("Back", "Throws opponent backward")
                        )
                    ),
                    Move(
                        name = "Close Medium Kick",
                        input = "Close MK",
                        description = "Strong close-range kick",
                        damage = 600,
                        startup = 6,
                        recovery = 14,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Far Medium Kick",
                        input = "Far MK",
                        description = "Extended roundhouse kick",
                        damage = 500,
                        startup = 7,
                        recovery = 14,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Close Heavy Kick",
                        input = "Close HK",
                        description = "Powerful close-range kick",
                        damage = 800,
                        startup = 8,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Far Heavy Kick",
                        input = "Far HK",
                        description = "Strong roundhouse kick",
                        damage = 700,
                        startup = 9,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Light Punch",
                        input = "↓ + LP",
                        description = "Quick low jab",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Medium Punch",
                        input = "↓ + MP",
                        description = "Mid-hitting straight punch",
                        damage = 500,
                        startup = 6,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Heavy Punch",
                        input = "↓ + HP",
                        description = "Strong uppercut punch",
                        damage = 700,
                        startup = 8,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Light Kick",
                        input = "↓ + LK",
                        description = "Quick low kick",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Medium Kick",
                        input = "↓ + MK",
                        description = "Sliding mid kick",
                        damage = 500,
                        startup = 7,
                        recovery = 14,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouch Heavy Kick",
                        input = "↓ + HK",
                        description = "Sweeping kick",
                        damage = 700,
                        startup = 9,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Knockdown", "Forces knockdown on hit"),
                            MoveProperty("Low", "Must be blocked low")
                        )
                    ),
                    Move(
                        name = "Neutral Jump Light Punch",
                        input = "Jump LP",
                        description = "Quick aerial jab",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Forward Roll",
                        input = "→ + Two Punches (A/P-Groove)",
                        description = "Roll forward to evade attacks",
                        damage = 0,
                        startup = 2,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Invincible", "Has invincibility frames"),
                            MoveProperty("A/P-Groove", "Only in A or P Groove"),
                            MoveProperty("Defensive", "Defensive movement option")
                        )
                    ),
                    Move(
                        name = "Backward Roll",
                        input = "← + Two Punches (A/P-Groove)",
                        description = "Roll backward to evade attacks",
                        damage = 0,
                        startup = 2,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Invincible", "Has invincibility frames"),
                            MoveProperty("A/P-Groove", "Only in A or P Groove"),
                            MoveProperty("Defensive", "Defensive movement option")
                        )
                    ),
                    Move(
                        name = "Alpha Counter",
                        input = "→ + HP/HK while blocking (A-Groove)",
                        description = "Counter attack while blocking",
                        damage = 500,
                        startup = 1,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Counter", "Must be used while blocking"),
                            MoveProperty("A-Groove", "Only in A-Groove"),
                            MoveProperty("Uses Meter", "Costs guard gauge")
                        )
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Quick Step",
                        input = "→ → or → (hold)",
                        description = "Run forward, enables special follow-ups",
                        damage = 0,
                        startup = 8,
                        recovery = 12,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Movement", "Forward dash/run"),
                            MoveProperty("Cancel", "Can cancel into special moves"),
                            MoveProperty("Pressure", "Good for closing distance")
                        )
                    ),
                    Move(
                        name = "Thunder Kick",
                        input = "→ + MK",
                        description = "Advancing kick, good for pressure",
                        damage = 600,
                        startup = 15,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Inazuma Kick",
                        input = "→ + MK (during Quick Step)",
                        description = "Quick overhead kick during run",
                        damage = 650,
                        startup = 12,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Quick Step", "Only during run"),
                            MoveProperty("Mix-up", "Good for mix-ups")
                        )
                    ),
                    Move(
                        name = "Forward Step Kick",
                        input = "→ + HK",
                        description = "Overhead kick, must be blocked high",
                        damage = 800,
                        startup = 18,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Crazy Kick",
                        input = "→ + MK (during forward jump)",
                        description = "Forward-moving hop kick",
                        damage = 700,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Movement", "Moves forward"),
                            MoveProperty("Mix-up", "Good for mix-ups")
                        )
                    ),
                    Move(
                        name = "High Parry",
                        input = "→ (just before hit) (N-Groove)",
                        description = "Parry high attacks",
                        damage = 0,
                        startup = 1,
                        recovery = 10,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("N-Groove", "Only in N-Groove"),
                            MoveProperty("Parry", "Negates damage and builds meter"),
                            MoveProperty("High", "Works against high attacks")
                        )
                    ),
                    Move(
                        name = "Low Parry",
                        input = "↓ (just before hit) (N-Groove)",
                        description = "Parry low attacks",
                        damage = 0,
                        startup = 1,
                        recovery = 10,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("N-Groove", "Only in N-Groove"),
                            MoveProperty("Parry", "Negates damage and builds meter"),
                            MoveProperty("Low", "Works against low attacks")
                        )
                    ),
                    Move(
                        name = "Just Defend",
                        input = "← (just before hit) (P-Groove)",
                        description = "Perfect block that builds meter",
                        damage = 0,
                        startup = 1,
                        recovery = 1,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("P-Groove", "Only in P-Groove"),
                            MoveProperty("Defense", "Reduces blockstun"),
                            MoveProperty("Meter", "Builds groove gauge")
                        )
                    ),
                    Move(
                        name = "Run",
                        input = "→ → (hold) (K-Groove)",
                        description = "Quick forward dash that can be maintained",
                        damage = 0,
                        startup = 8,
                        recovery = 12,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("K-Groove", "Only in K-Groove"),
                            MoveProperty("Movement", "Quick approach"),
                            MoveProperty("Cancel", "Can cancel into attacks")
                        )
                    ),
                    Move(
                        name = "Hop",
                        input = "↑ (tap) (K-Groove)",
                        description = "Quick short jump",
                        damage = 0,
                        startup = 4,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("K-Groove", "Only in K-Groove"),
                            MoveProperty("Movement", "Quick air approach"),
                            MoveProperty("Mix-up", "Good for mind games")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Hadoken",
                        input = "↓↘→ + P",
                        description = "Fireball projectile. Slower than Ryu's version.",
                        damage = 500,
                        startup = 16,
                        recovery = 30,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Energy projectile"),
                            MoveProperty("Variable", "Different speeds per button"),
                            MoveProperty("Weaker", "Slower than Ryu's version")
                        )
                    ),
                    Move(
                        name = "Shoryuken",
                        input = "→↓↘ + P",
                        description = "Rising dragon punch. More damage than Ryu's version.",
                        damage = 900,
                        startup = 4,
                        recovery = 35,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-air", "Strong vs jumping opponents"),
                            MoveProperty("Invincible", "Upper body invincibility"),
                            MoveProperty("High Damage", "More damage than Ryu's version")
                        )
                    ),
                    Move(
                        name = "Tatsumaki Senpukyaku",
                        input = "↓↙← + K",
                        description = "Spinning kick. Travels further than Ryu's version.",
                        damage = 700,
                        startup = 8,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Movement", "Moves forward further than Ryu"),
                            MoveProperty("Cross-up", "Excellent cross-up tool")
                        )
                    ),
                    Move(
                        name = "Step Kick",
                        input = "→ + MK in run",
                        description = "Quick rushing kick during run",
                        damage = 600,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Rush", "Good rush-down tool"),
                            MoveProperty("Safe", "Relatively safe on block"),
                            MoveProperty("Pressure", "Maintains offensive pressure")
                        )
                    ),
                    Move(
                        name = "Air Tatsumaki Senpukyaku",
                        input = "↓↙← + K (in air)",
                        description = "Aerial spinning kick, travels further than Ryu's version",
                        damage = 650,
                        startup = 8,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Air Move", "Can only be done in air"),
                            MoveProperty("Cross-up", "Excellent cross-up tool"),
                            MoveProperty("Distance", "Travels further than Ryu's version")
                        )
                    ),
                    Move(
                        name = "Shoryuken Follow-up",
                        input = "P after Shoryuken (C-Groove)",
                        description = "Additional hits after Shoryuken in C-Groove",
                        damage = 400,
                        startup = 6,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("C-Groove", "Only in C-Groove"),
                            MoveProperty("Follow-up", "Must land Shoryuken first"),
                            MoveProperty("Juggle", "Can juggle opponent")
                        )
                    ),
                    Move(
                        name = "EX Shoryuken",
                        input = "→↓↘ + Two P buttons (C-Groove)",
                        description = "Enhanced dragon punch with more hits and damage",
                        damage = 1200,
                        startup = 3,
                        recovery = 35,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("EX Move", "Uses meter in C-Groove"),
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Full invincibility")
                        )
                    ),
                    Move(
                        name = "EX Tatsumaki Senpukyaku",
                        input = "↓↙← + Two K buttons (C-Groove)",
                        description = "Enhanced hurricane kick with more hits and distance",
                        damage = 900,
                        startup = 7,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("EX Move", "Uses meter in C-Groove"),
                            MoveProperty("Multi-hit", "More hits than normal version"),
                            MoveProperty("Distance", "Travels even further")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Shoryuu Reppa",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 Super. Multiple rising dragon punches.",
                        damage = 2200,
                        startup = 4,
                        recovery = 42,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Level 1", "Uses 1 super bar"),
                            MoveProperty("Invincible", "Has startup invincibility")
                        )
                    ),
                    Move(
                        name = "Shinryuken",
                        input = "↓↘→↓↘→ + P (Level 3)",
                        description = "Level 3 Super. Rising dragon punch with flame properties.",
                        damage = 4000,
                        startup = 1,
                        recovery = 52,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Level 3", "Uses 3 super bars"),
                            MoveProperty("Invincible", "Full invincibility"),
                            MoveProperty("High Damage", "Extremely high damage")
                        )
                    ),
                    Move(
                        name = "Shoryu Reppa Level 2",
                        input = "↓↘→↓↘→ + P (Level 2)",
                        description = "Level 2 Super. Enhanced version of Shoryu Reppa with more hits.",
                        damage = 3000,
                        startup = 3,
                        recovery = 45,
                        onBlock = -14,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Level 2", "Uses 2 super bars"),
                            MoveProperty("Invincible", "Full invincibility"),
                            MoveProperty("Multi-hit", "More hits than Level 1 version")
                        )
                    )
                )
            )
        ),
        "terry" to CharacterDetails(
            id = "terry",
            name = "Terry Bogard",
            playstyle = "Terry is a rushdown character with powerful ground-based moves and unique command inputs. His mix of power moves and mobility makes him excellent at both neutral and pressure situations.",
            strengths = listOf(
                "Strong ground game",
                "Powerful anti-air options",
                "Good mix-up potential",
                "Excellent okizeme",
                "High damage output"
            ),
            weaknesses = listOf(
                "Limited air options",
                "Some moves are punishable",
                "Requires precise execution",
                "Can be outranged by certain characters"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Punch",
                        input = "LP",
                        description = "Quick jab",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Close Medium Punch",
                        input = "Close MP",
                        description = "Strong close-range straight punch",
                        damage = 600,
                        startup = 5,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Far Medium Punch",
                        input = "Far MP",
                        description = "Extended straight punch",
                        damage = 500,
                        startup = 6,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Forward Throw",
                        input = "LP + LK (Close)",
                        description = "Forward throwing attack",
                        damage = 800,
                        startup = 3,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Throw", "Must be teched"),
                            MoveProperty("Close Range", "Must be in throw range")
                        )
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Rising Upper",
                        input = "→ + HP",
                        description = "Advancing uppercut attack",
                        damage = 700,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Power Wave",
                        input = "↓↘→ + P",
                        description = "Ground projectile that travels along the floor",
                        damage = 600,
                        startup = 13,
                        recovery = 28,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Ground-based projectile"),
                            MoveProperty("Variable", "Different speeds per button")
                        )
                    ),
                    Move(
                        name = "Rising Tackle",
                        input = "↓↑ + P",
                        description = "Rising spinning uppercut attack",
                        damage = 800,
                        startup = 8,
                        recovery = 24,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-air", "Good vs jumping opponents"),
                            MoveProperty("Invincible", "Upper body invincibility")
                        )
                    ),
                    Move(
                        name = "Burning Knuckle",
                        input = "↓↙← + P (charge) → + P",
                        description = "Charging forward punch attack",
                        damage = 700,
                        startup = 16,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Charge", "Must hold ← for 2 seconds"),
                            MoveProperty("Armor", "Has armor during active frames")
                        )
                    ),
                    Move(
                        name = "Crack Shoot",
                        input = "↓↙← + K (charge) → + K",
                        description = "Jumping axe kick",
                        damage = 650,
                        startup = 12,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Charge", "Must hold ← for 2 seconds")
                        )
                    ),
                    Move(
                        name = "Power Dunk",
                        input = "↓↘→↓↘ + P",
                        description = "Jumping forward punch followed by downward strike",
                        damage = 850,
                        startup = 10,
                        recovery = 26,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Two-hit", "Hits twice"),
                            MoveProperty("Mix-up", "Good for mix-up situations")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Power Geyser",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 Super. Powerful ground-based energy attack",
                        damage = 2000,
                        startup = 8,
                        recovery = 42,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Level 1", "Uses 1 super bar"),
                            MoveProperty("Ground Hit", "Hits grounded opponents"),
                            MoveProperty("Multi-hit", "Hits multiple times")
                        )
                    ),
                    Move(
                        name = "Triple Geyser",
                        input = "↓↘→↓↘→ + P (Level 3)",
                        description = "Level 3 Super. Three consecutive Power Geysers",
                        damage = 4000,
                        startup = 8,
                        recovery = 52,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Level 3", "Uses 3 super bars"),
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("High Damage", "Extremely high damage")
                        )
                    ),
                    Move(
                        name = "Buster Wolf",
                        input = "↓↘→↓↘→ + K",
                        description = "Level 1 Super. Rushing punch attack with follow-up hits",
                        damage = 2200,
                        startup = 6,
                        recovery = 45,
                        onBlock = -14,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Level 1", "Uses 1 super bar"),
                            MoveProperty("Rush", "Rushing attack"),
                            MoveProperty("Multi-hit", "Hits multiple times")
                        )
                    )
                )
            )
        )
        // More characters will be added here...
    )
} 