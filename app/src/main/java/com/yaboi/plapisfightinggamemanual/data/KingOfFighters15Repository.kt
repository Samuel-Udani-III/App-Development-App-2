package com.yaboi.plapisfightinggamemanual.data

object KingOfFighters15Repository {
    fun getCharacterDetails(characterId: String): CharacterDetails? {
        return characterData[characterId]
    }

    private val characterData = mapOf(
        "kyo" to CharacterDetails(
            id = "kyo",
            name = "Kyo Kusanagi",
            playstyle = "Kyo is a well-rounded fighter with strong pressure and combo potential. His signature flame attacks and rekka-style moves make him excellent at both neutral and rush-down situations.",
            strengths = listOf(
                "Strong pressure game",
                "Versatile combo routes",
                "Good mix-up potential",
                "Solid neutral tools",
                "Reliable anti-airs"
            ),
            weaknesses = listOf(
                "Requires good execution",
                "Some moves are unsafe on block",
                "Can be outranged by longer-range characters",
                "Resource management is important"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "A",
                        description = "Quick jab with good frame advantage",
                        damage = 25,
                        startup = 4,
                        recovery = 8,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Quick", "Very fast startup"),
                            MoveProperty("Pressure", "Good for pressure strings"),
                            MoveProperty("Chain", "Can chain into other normals")
                        ),
                        counterHitEffect = "Allows for extended combos"
                    ),
                    Move(
                        name = "Standing Light Kick",
                        input = "B",
                        description = "Fast low attack",
                        damage = 30,
                        startup = 6,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Range", "Good poke range")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "C",
                        description = "Strong mid-range slash with purple flames",
                        damage = 45,
                        startup = 8,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Flame", "Purple flame effect"),
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Combo", "Good combo starter")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    ),
                    Move(
                        name = "Standing Heavy Kick",
                        input = "D",
                        description = "Powerful kick with good range",
                        damage = 50,
                        startup = 10,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Range", "Long reach"),
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Knockdown", "Forces knockdown on hit")
                        ),
                        counterHitEffect = "Causes hard knockdown"
                    ),
                    Move(
                        name = "Crouching Light Punch",
                        input = "2A",
                        description = "Low hitting quick jab",
                        damage = 20,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouching Light Kick",
                        input = "2B",
                        description = "Low sweep, hits low",
                        damage = 25,
                        startup = 6,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouching Heavy Punch",
                        input = "2C",
                        description = "Mid-hitting strong punch",
                        damage = 40,
                        startup = 9,
                        recovery = 18,
                        onBlock = -5,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Crouching Heavy Kick",
                        input = "2D",
                        description = "Low sweep, launches on hit",
                        damage = 45,
                        startup = 12,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Jumping Light Punch",
                        input = "j.A",
                        description = "Quick air-to-air attack",
                        damage = 30,
                        startup = 5,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Jumping Light Kick",
                        input = "j.B",
                        description = "Fast air kick with good range",
                        damage = 35,
                        startup = 6,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Jumping Heavy Punch",
                        input = "j.C",
                        description = "Strong air-to-air attack",
                        damage = 45,
                        startup = 8,
                        recovery = 14,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Jumping Heavy Kick",
                        input = "j.D",
                        description = "Powerful jumping kick, good for crossups",
                        damage = 50,
                        startup = 9,
                        recovery = 16,
                        onBlock = -5,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "88 Shiki",
                        input = "6C",
                        description = "Forward-moving punch with flame effect",
                        damage = 55,
                        startup = 12,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Forward Movement", "Moves Kyo forward"),
                            MoveProperty("Flame Effect", "Adds fire damage")
                        )
                    ),
                    Move(
                        name = "Ge Shiki: Naraku Otoshi",
                        input = "2B in air",
                        description = "Diving kick that can crossup",
                        damage = 45,
                        startup = 12,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Crossup", "Can cross through opponent"),
                            MoveProperty("Overhead", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "100 Shiki: Oniyaki",
                        input = "623 + P",
                        description = "Rising uppercut with flames, great anti-air",
                        damage = 70,
                        startup = 7,
                        recovery = 24,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("Invincible", "Upper body invulnerability"),
                            MoveProperty("EX Version", "Press AC for stronger version")
                        )
                    ),
                    Move(
                        name = "114 Shiki: Aragami",
                        input = "236 + K",
                        description = "Rushing punch that can be followed up",
                        damage = 50,
                        startup = 15,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Rekka", "Can be followed with other moves"),
                            MoveProperty("Forward Movement", "Good approach tool"),
                            MoveProperty("EX Version", "Press BD for stronger version")
                        )
                    ),
                    Move(
                        name = "128 Shiki: Kononami",
                        input = "214 + P",
                        description = "Flame-covered advancing punch",
                        damage = 60,
                        startup = 16,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Guard Break", "Strong against blocking"),
                            MoveProperty("Forward Movement", "Good approach tool"),
                            MoveProperty("EX Version", "Press AC for stronger version")
                        )
                    ),
                    Move(
                        name = "212 Shiki: Kototsuki You",
                        input = "623 + K",
                        description = "Rising kick with follow-up options",
                        damage = 65,
                        startup = 12,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Follow-up", "Can be followed with other moves"),
                            MoveProperty("Anti-Air", "Good vs jumping opponents"),
                            MoveProperty("EX Version", "Press BD for stronger version")
                        )
                    ),
                    Move(
                        name = "75 Shiki: Kai",
                        input = "421 + K",
                        description = "Quick reverse kick, good for mix-ups",
                        damage = 45,
                        startup = 8,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Quick Recovery", "Can act quickly after"),
                            MoveProperty("Mix-up", "Good for pressure"),
                            MoveProperty("EX Version", "Press BD for stronger version")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Ura 108 Shiki: Orochinagi",
                        input = "236236 + P",
                        description = "Signature flame projectile super",
                        damage = 150,
                        startup = 8,
                        recovery = 38,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Super Armor", "Has armor during startup"),
                            MoveProperty("High Damage", "Very strong damage"),
                            MoveProperty("MAX Version", "More damage when MAX activated")
                        )
                    ),
                    Move(
                        name = "182 Shiki",
                        input = "214214 + P",
                        description = "Multi-hitting rushing punch super",
                        damage = 180,
                        startup = 10,
                        recovery = 42,
                        onBlock = -16,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Forward Movement", "Rushes forward"),
                            MoveProperty("MAX Version", "More hits when MAX activated")
                        )
                    ),
                    Move(
                        name = "Mushiki",
                        input = "236236 + AC",
                        description = "Climax super with massive damage",
                        damage = 250,
                        startup = 12,
                        recovery = 48,
                        onBlock = -24,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Climax", "Most powerful super"),
                            MoveProperty("Cinematic", "Triggers special animation"),
                            MoveProperty("Unscaled", "Damage is not scaled")
                        ),
                        guardCrush = true
                    )
                )
            )
        ),
        "iori" to CharacterDetails(
            id = "iori",
            name = "Iori Yagami",
            playstyle = "Iori is an aggressive rushdown character who excels at close-range combat. His command grabs and rekka combinations allow for devastating mix-ups and pressure.",
            strengths = listOf(
                "Strong pressure game",
                "Powerful mix-up options",
                "Good command throws",
                "Excellent corner carry",
                "Strong punish game"
            ),
            weaknesses = listOf(
                "Limited range in neutral",
                "Requires close range",
                "Some moves are risky",
                "Can struggle against zoners"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "A",
                        description = "Quick jab with good frame advantage",
                        damage = 25,
                        startup = 4,
                        recovery = 8,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Quick", "Very fast startup"),
                            MoveProperty("Pressure", "Good for pressure strings"),
                            MoveProperty("Chain", "Can chain into other normals")
                        ),
                        counterHitEffect = "Allows for extended combos"
                    ),
                    Move(
                        name = "Standing Light Kick",
                        input = "B",
                        description = "Fast low attack",
                        damage = 30,
                        startup = 6,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Range", "Good poke range")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "C",
                        description = "Strong mid-range slash with purple flames",
                        damage = 45,
                        startup = 8,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Flame", "Purple flame effect"),
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Combo", "Good combo starter")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    ),
                    Move(
                        name = "Standing Heavy Kick",
                        input = "D",
                        description = "Powerful kick with good range",
                        damage = 50,
                        startup = 10,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Range", "Long reach"),
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Knockdown", "Forces knockdown on hit")
                        ),
                        counterHitEffect = "Causes hard knockdown"
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Yuri Ori",
                        input = "→ + B",
                        description = "Forward-moving low attack",
                        damage = 40,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Forward", "Moves forward during attack"),
                            MoveProperty("Chain", "Can chain into special moves")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Ge Shiki Yuri Ori",
                        input = "↓↘→ + D",
                        description = "Overhead attack",
                        damage = 55,
                        startup = 20,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Forward", "Moves forward during attack"),
                            MoveProperty("Mix-up", "Good for mix-ups")
                        ),
                        counterHitEffect = "Causes hard knockdown"
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "100 Shiki: Oniyaki",
                        input = "↓↑ + P",
                        description = "Rising uppercut with purple flames",
                        damage = 80,
                        startup = 6,
                        recovery = 28,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("Invincible", "Upper body invulnerability"),
                            MoveProperty("EX Version", "Press AC for stronger version with full invincibility"),
                            MoveProperty("Flame", "Purple flame effect")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    ),
                    Move(
                        name = "Yami Barai",
                        input = "↓↘→ + P",
                        description = "Ground projectile with purple flames",
                        damage = 60,
                        startup = 14,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Ground-based projectile"),
                            MoveProperty("EX Version", "Press AC for faster version"),
                            MoveProperty("Flame", "Purple flame effect"),
                            MoveProperty("Zoning", "Good for controlling space")
                        ),
                        counterHitEffect = "Knocks down opponent"
                    ),
                    Move(
                        name = "Kuzukaze",
                        input = "→↓↘ + K",
                        description = "Command grab with follow-up options",
                        damage = 100,
                        startup = 2,
                        recovery = 24,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Command Grab", "Unblockable throw"),
                            MoveProperty("Follow-up", "Can follow with additional attacks"),
                            MoveProperty("EX Version", "Press BD for faster startup"),
                            MoveProperty("Mix-up", "Strong mix-up tool")
                        )
                    ),
                    Move(
                        name = "Aoihana",
                        input = "↓↙← + K",
                        description = "Rekka-style combo starter",
                        damage = 65,
                        startup = 8,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Rekka", "Can be followed with other moves"),
                            MoveProperty("EX Version", "Press BD for additional hits"),
                            MoveProperty("Chain", "Can chain into other specials"),
                            MoveProperty("Pressure", "Good pressure tool")
                        ),
                        counterHitEffect = "Allows for extended rekka combinations"
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Kin 1211 Shiki: Yaotome",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 super, multiple hits with purple flames",
                        damage = 180,
                        startup = 6,
                        recovery = 38,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Startup invincibility"),
                            MoveProperty("MAX Version", "More damage and hits when MAX activated"),
                            MoveProperty("Flame", "Purple flame effect")
                        ),
                        counterHitEffect = "Additional damage and hits"
                    ),
                    Move(
                        name = "Homurabotogi",
                        input = "↓↙←↙↓↘→ + P+K",
                        description = "Level 3 super, devastating combo with purple flames",
                        damage = 280,
                        startup = 5,
                        recovery = 45,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Cinematic", "Triggers special animation"),
                            MoveProperty("Invincible", "Full invincibility on startup"),
                            MoveProperty("Unscaled", "Damage is not scaled"),
                            MoveProperty("Flame", "Purple flame effect")
                        ),
                        guardCrush = true,
                        counterHitEffect = "Additional damage on final hit"
                    )
                )
            )
        ),
        "terry" to CharacterDetails(
            id = "terry",
            name = "Terry Bogard",
            playstyle = "Terry is a balanced fighter who excels at both neutral and rush-down. His classic moves like Power Wave and Burn Knuckle give him strong ground control, while his Rising Tackle provides good anti-air options.",
            strengths = listOf(
                "Strong ground game",
                "Good projectiles",
                "Reliable anti-airs",
                "High damage potential",
                "Easy to learn combos"
            ),
            weaknesses = listOf(
                "Limited air options",
                "Some moves are punishable",
                "Can be outmaneuvered by faster characters",
                "Struggles against strong zoners"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "A",
                        description = "Quick jab, good for pressure",
                        damage = 30,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Quick", "Very fast startup"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Pressure", "Good for pressure strings")
                        ),
                        counterHitEffect = "Allows for extended combos"
                    ),
                    Move(
                        name = "Standing Light Kick",
                        input = "B",
                        description = "Fast low attack",
                        damage = 35,
                        startup = 5,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Range", "Good poke range")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "C",
                        description = "Strong straight punch",
                        damage = 50,
                        startup = 7,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Combo", "Good combo starter"),
                            MoveProperty("Power", "High damage normal")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    ),
                    Move(
                        name = "Standing Heavy Kick",
                        input = "D",
                        description = "Powerful kick",
                        damage = 55,
                        startup = 9,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Range", "Long reach"),
                            MoveProperty("Knockdown", "Forces knockdown on hit")
                        ),
                        counterHitEffect = "Causes hard knockdown"
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Gatling Attack",
                        input = "→ + B",
                        description = "Rushing punch sequence",
                        damage = 45,
                        startup = 14,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Forward", "Moves forward during attack"),
                            MoveProperty("Chain", "Can chain into special moves"),
                            MoveProperty("Pressure", "Strong pressure tool")
                        ),
                        counterHitEffect = "Additional hits and damage"
                    ),
                    Move(
                        name = "Diving Kick",
                        input = "→ + D",
                        description = "Jumping overhead kick",
                        damage = 60,
                        startup = 20,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Mix-up", "Good for mix-ups"),
                            MoveProperty("Jump", "Can be done while jumping")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Power Wave",
                        input = "↓↘→ + P",
                        description = "Ground projectile",
                        damage = 60,
                        startup = 14,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Ground-based projectile"),
                            MoveProperty("EX Version", "Press AC for faster version"),
                            MoveProperty("Zoning", "Good for controlling space"),
                            MoveProperty("Energy", "Energy-based attack")
                        ),
                        counterHitEffect = "Knocks down opponent"
                    ),
                    Move(
                        name = "Burning Knuckle",
                        input = "↓↙← + P",
                        description = "Charging punch attack",
                        damage = 80,
                        startup = 16,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Charge", "Can be charged for more damage"),
                            MoveProperty("EX Version", "Press AC for armor"),
                            MoveProperty("Forward", "Strong approach tool"),
                            MoveProperty("Energy", "Energy-based attack")
                        ),
                        counterHitEffect = "Wall bounce on counter hit"
                    ),
                    Move(
                        name = "Rising Tackle",
                        input = "↓↑ + P",
                        description = "Rising spinning attack",
                        damage = 75,
                        startup = 8,
                        recovery = 28,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("EX Version", "Press AC for invincibility"),
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Rising", "Good juggle tool")
                        ),
                        counterHitEffect = "Additional hits on counter"
                    ),
                    Move(
                        name = "Crack Shoot",
                        input = "↓↘→ + K",
                        description = "Jumping axe kick",
                        damage = 70,
                        startup = 20,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("EX Version", "Press BD for faster startup"),
                            MoveProperty("Cross-up", "Can cross up opponents"),
                            MoveProperty("Mix-up", "Good mix-up tool")
                        ),
                        counterHitEffect = "Causes hard knockdown"
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Power Geyser",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 super, ground eruption",
                        damage = 160,
                        startup = 8,
                        recovery = 32,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Startup invincibility"),
                            MoveProperty("MAX Version", "More damage and hits when MAX activated"),
                            MoveProperty("Energy", "Energy-based attack")
                        ),
                        counterHitEffect = "Additional damage and hits"
                    ),
                    Move(
                        name = "Buster Wolf",
                        input = "↓↙←↙↓↘→ + P+K",
                        description = "Level 3 super, rushing combo attack",
                        damage = 280,
                        startup = 5,
                        recovery = 45,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Cinematic", "Triggers special animation"),
                            MoveProperty("Invincible", "Full invincibility on startup"),
                            MoveProperty("Unscaled", "Damage is not scaled"),
                            MoveProperty("Energy", "Energy-based attack")
                        ),
                        guardCrush = true,
                        counterHitEffect = "Additional damage on final hit"
                    )
                )
            )
        ),
        "mai" to CharacterDetails(
            id = "mai",
            name = "Mai Shiranui",
            playstyle = "Mai is a rushdown character who excels at aerial attacks and mix-ups. Her fan techniques and quick movements make her excellent at applying pressure and creating offensive opportunities.",
            strengths = listOf(
                "Strong aerial game",
                "Good mix-up potential",
                "Fast movement speed",
                "Versatile special moves",
                "Strong corner pressure"
            ),
            weaknesses = listOf(
                "Low health",
                "Risky moves",
                "Can be punished on whiff",
                "Requires good execution"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "A",
                        description = "Quick fan attack",
                        damage = 25,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Quick", "Very fast startup"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Fan", "Uses fan as weapon")
                        ),
                        counterHitEffect = "Allows for extended combos"
                    ),
                    Move(
                        name = "Standing Light Kick",
                        input = "B",
                        description = "Fast low kick",
                        damage = 30,
                        startup = 5,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Range", "Good poke range")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "C",
                        description = "Strong fan swing",
                        damage = 45,
                        startup = 7,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Fan", "Uses fan as weapon"),
                            MoveProperty("Combo", "Good combo starter")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    ),
                    Move(
                        name = "Standing Heavy Kick",
                        input = "D",
                        description = "Powerful high kick",
                        damage = 50,
                        startup = 9,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Range", "Long reach"),
                            MoveProperty("Knockdown", "Forces knockdown on hit")
                        ),
                        counterHitEffect = "Causes hard knockdown"
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Sliding Kick",
                        input = "↘ + B",
                        description = "Low sliding attack",
                        damage = 40,
                        startup = 12,
                        recovery = 16,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Forward", "Moves forward during attack"),
                            MoveProperty("Chain", "Can chain into special moves")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Overhead Fan",
                        input = "→ + C",
                        description = "Overhead fan attack",
                        damage = 55,
                        startup = 18,
                        recovery = 22,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Fan", "Uses fan as weapon"),
                            MoveProperty("Mix-up", "Good for mix-ups")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Kachou Sen",
                        input = "↓↘→ + P",
                        description = "Fan projectile",
                        damage = 60,
                        startup = 14,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Fan-based projectile"),
                            MoveProperty("EX Version", "Press AC for multiple fans"),
                            MoveProperty("Zoning", "Good for controlling space"),
                            MoveProperty("Fan", "Uses fan as weapon")
                        ),
                        counterHitEffect = "Knocks down opponent"
                    ),
                    Move(
                        name = "Ryuu Enbu",
                        input = "↓↙← + K",
                        description = "Rising kick attack",
                        damage = 75,
                        startup = 8,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("EX Version", "Press BD for invincibility"),
                            MoveProperty("Rising", "Good juggle tool"),
                            MoveProperty("Multi-hit", "Hits multiple times")
                        ),
                        counterHitEffect = "Additional hits on counter"
                    ),
                    Move(
                        name = "Musasabi no Mai",
                        input = "↓↘→ + K",
                        description = "Aerial dive attack",
                        damage = 70,
                        startup = 16,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Aerial", "Can be done in air"),
                            MoveProperty("EX Version", "Press BD for faster startup"),
                            MoveProperty("Cross-up", "Can cross up opponents"),
                            MoveProperty("Mix-up", "Good mix-up tool")
                        ),
                        counterHitEffect = "Wall bounce on counter hit"
                    ),
                    Move(
                        name = "Shiranui-Ryuu Kunoichi no Mai",
                        input = "→↓↘ + P",
                        description = "Multi-hit fan attack",
                        damage = 80,
                        startup = 10,
                        recovery = 26,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("EX Version", "Press AC for more hits"),
                            MoveProperty("Fan", "Uses fan as weapon"),
                            MoveProperty("Pressure", "Good pressure tool")
                        ),
                        counterHitEffect = "Additional hits and damage"
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Chou Hissatsu Shinobi-Bachi",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 super, multiple fan strikes",
                        damage = 160,
                        startup = 8,
                        recovery = 32,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Startup invincibility"),
                            MoveProperty("MAX Version", "More hits when MAX activated"),
                            MoveProperty("Fan", "Uses fan as weapon")
                        ),
                        counterHitEffect = "Additional damage and hits"
                    ),
                    Move(
                        name = "Shiranui-Ryuu Ougi: Kunoichi no Mai",
                        input = "↓↙←↙↓↘→ + P+K",
                        description = "Level 3 super, devastating combo",
                        damage = 250,
                        startup = 5,
                        recovery = 45,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Cinematic", "Triggers special animation"),
                            MoveProperty("Invincible", "Full invincibility on startup"),
                            MoveProperty("Unscaled", "Damage is not scaled"),
                            MoveProperty("Fan", "Uses fan as weapon")
                        ),
                        guardCrush = true,
                        counterHitEffect = "Additional damage on final hit"
                    )
                )
            )
        ),
        "k" to CharacterDetails(
            id = "k",
            name = "K'",
            playstyle = "K' is a technical fighter who excels at close to mid-range combat. His unique cancels and counter-hit setups make him deadly in the hands of a skilled player.",
            strengths = listOf(
                "Strong counter-hit game",
                "Unique cancel system",
                "Good mix-up potential",
                "High damage output",
                "Excellent pressure tools"
            ),
            weaknesses = listOf(
                "Complex execution",
                "Requires meter management",
                "Can be outranged",
                "Difficult to master"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "A",
                        description = "Quick jab with good frame advantage",
                        damage = 25,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Quick", "Very fast startup"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Pressure", "Good for pressure strings")
                        ),
                        counterHitEffect = "Allows for extended combos"
                    ),
                    Move(
                        name = "Standing Light Kick",
                        input = "B",
                        description = "Fast low kick",
                        damage = 30,
                        startup = 5,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Range", "Good poke range")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "C",
                        description = "Strong flame-enhanced punch",
                        damage = 45,
                        startup = 7,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Flame", "Enhanced with flames"),
                            MoveProperty("Combo", "Good combo starter")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    ),
                    Move(
                        name = "Standing Heavy Kick",
                        input = "D",
                        description = "Powerful roundhouse kick",
                        damage = 50,
                        startup = 9,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Range", "Long reach"),
                            MoveProperty("Knockdown", "Forces knockdown on hit")
                        ),
                        counterHitEffect = "Causes hard knockdown"
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Second Shell",
                        input = "→ + C",
                        description = "Forward-moving flame punch",
                        damage = 45,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Flame", "Enhanced with flames"),
                            MoveProperty("Forward", "Moves forward during attack"),
                            MoveProperty("Chain", "Can chain into special moves"),
                            MoveProperty("Pressure", "Good pressure tool")
                        ),
                        counterHitEffect = "Grants frame advantage and flame effect"
                    ),
                    Move(
                        name = "Second Shoot",
                        input = "→ + D",
                        description = "Overhead kick attack",
                        damage = 55,
                        startup = 20,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Mix-up", "Good for mix-ups"),
                            MoveProperty("Chain", "Can chain into special moves")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Ein Trigger",
                        input = "↓↘→ + P",
                        description = "Flame projectile",
                        damage = 60,
                        startup = 14,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Flame-based projectile"),
                            MoveProperty("EX Version", "Press AC for larger projectile"),
                            MoveProperty("Flame", "Enhanced with flames"),
                            MoveProperty("Zoning", "Good for controlling space")
                        ),
                        counterHitEffect = "Knocks down opponent with flame effect"
                    ),
                    Move(
                        name = "Blackout",
                        input = "↓↙← + K",
                        description = "Rushing kick attack",
                        damage = 75,
                        startup = 16,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Rush", "Quick rushing attack"),
                            MoveProperty("EX Version", "Press BD for invincibility"),
                            MoveProperty("Mix-up", "Good mix-up tool"),
                            MoveProperty("Chain", "Can chain into other specials")
                        ),
                        counterHitEffect = "Wall bounce for extended combos"
                    ),
                    Move(
                        name = "Heat Drive",
                        input = "↓↑ + P",
                        description = "Rising uppercut with flames",
                        damage = 80,
                        startup = 6,
                        recovery = 28,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("EX Version", "Press AC for full invincibility"),
                            MoveProperty("Flame", "Enhanced with flames"),
                            MoveProperty("Rising", "Good juggle tool")
                        ),
                        counterHitEffect = "Additional flame damage and juggle potential"
                    ),
                    Move(
                        name = "Minute Spike",
                        input = "→↓↘ + K",
                        description = "Diving kick attack",
                        damage = 70,
                        startup = 18,
                        recovery = 22,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Aerial", "Can be done in air"),
                            MoveProperty("EX Version", "Press BD for faster startup"),
                            MoveProperty("Cross-up", "Can cross up opponents"),
                            MoveProperty("Mix-up", "Good mix-up tool")
                        ),
                        counterHitEffect = "Ground bounce for combo extension"
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Heat End",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 super, multiple flame attacks",
                        damage = 160,
                        startup = 8,
                        recovery = 32,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Startup invincibility"),
                            MoveProperty("MAX Version", "More hits when MAX activated"),
                            MoveProperty("Flame", "Enhanced with flames")
                        ),
                        counterHitEffect = "Additional hits and flame damage"
                    ),
                    Move(
                        name = "Chain Drive",
                        input = "↓↙←↙↓↘→ + P+K",
                        description = "Level 3 super, devastating combo with flames",
                        damage = 280,
                        startup = 5,
                        recovery = 45,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Cinematic", "Triggers special animation"),
                            MoveProperty("Invincible", "Full invincibility on startup"),
                            MoveProperty("Unscaled", "Damage is not scaled"),
                            MoveProperty("Flame", "Enhanced with flames")
                        ),
                        guardCrush = true,
                        counterHitEffect = "Additional damage and flame effects on final hit"
                    )
                )
            )
        ),
        "athena" to CharacterDetails(
            id = "athena",
            name = "Athena Asamiya",
            playstyle = "Athena is a balanced fighter who excels at zoning with her psycho powers. Her projectiles and teleports give her strong defensive options while maintaining offensive pressure.",
            strengths = listOf(
                "Strong projectile game",
                "Good mobility with teleports",
                "Solid anti-airs",
                "Versatile mix-up options",
                "Strong defensive tools"
            ),
            weaknesses = listOf(
                "Low health",
                "Some moves are unsafe",
                "Can be rushed down",
                "Requires good spacing"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "A",
                        description = "Quick psycho-enhanced jab",
                        damage = 25,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Quick", "Very fast startup"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Psycho", "Enhanced with psycho power")
                        ),
                        counterHitEffect = "Allows for extended combos"
                    ),
                    Move(
                        name = "Standing Light Kick",
                        input = "B",
                        description = "Fast low kick",
                        damage = 30,
                        startup = 5,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Range", "Good poke range")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "C",
                        description = "Strong psycho punch",
                        damage = 45,
                        startup = 7,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Psycho", "Enhanced with psycho power"),
                            MoveProperty("Combo", "Good combo starter")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    ),
                    Move(
                        name = "Standing Heavy Kick",
                        input = "D",
                        description = "Powerful roundhouse kick",
                        damage = 50,
                        startup = 9,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Range", "Long reach"),
                            MoveProperty("Knockdown", "Forces knockdown on hit")
                        ),
                        counterHitEffect = "Causes hard knockdown"
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Phoenix Arrow",
                        input = "→ + B",
                        description = "Forward-moving kick",
                        damage = 40,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Forward", "Moves forward during attack"),
                            MoveProperty("Chain", "Can chain into special moves"),
                            MoveProperty("Mix-up", "Good for mix-ups")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Psycho Sword",
                        input = "→ + C",
                        description = "Rising psycho attack",
                        damage = 55,
                        startup = 14,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("Psycho", "Enhanced with psycho power"),
                            MoveProperty("Rising", "Good juggle starter")
                        ),
                        counterHitEffect = "Launches for extended juggle combos"
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Psycho Ball",
                        input = "↓↘→ + P",
                        description = "Psycho projectile",
                        damage = 60,
                        startup = 14,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Psycho energy projectile"),
                            MoveProperty("EX Version", "Press AC for larger projectile"),
                            MoveProperty("Psycho", "Enhanced with psycho power"),
                            MoveProperty("Zoning", "Good for controlling space")
                        ),
                        counterHitEffect = "Knocks down opponent with psycho effect"
                    ),
                    Move(
                        name = "Phoenix Arrow",
                        input = "↓↙← + K",
                        description = "Diving kick attack",
                        damage = 70,
                        startup = 16,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Aerial", "Can be done in air"),
                            MoveProperty("EX Version", "Press BD for faster startup"),
                            MoveProperty("Cross-up", "Can cross up opponents"),
                            MoveProperty("Mix-up", "Good mix-up tool")
                        ),
                        counterHitEffect = "Wall bounce for extended combos"
                    ),
                    Move(
                        name = "Psycho Teleport",
                        input = "↓↘→ + K",
                        description = "Teleport movement",
                        damage = 0,
                        startup = 1,
                        recovery = 15,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Movement", "Quick teleport"),
                            MoveProperty("EX Version", "Press BD for faster recovery"),
                            MoveProperty("Psycho", "Psycho power teleport"),
                            MoveProperty("Mix-up", "Strong mix-up tool")
                        ),
                        counterHitEffect = "Not applicable"
                    ),
                    Move(
                        name = "Psycho Reflector",
                        input = "↓↙← + P",
                        description = "Reflects projectiles",
                        damage = 0,
                        startup = 6,
                        recovery = 20,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Reflect", "Reflects opponent's projectiles"),
                            MoveProperty("EX Version", "Press AC for larger reflect window"),
                            MoveProperty("Psycho", "Enhanced with psycho power"),
                            MoveProperty("Defense", "Strong defensive tool")
                        ),
                        counterHitEffect = "Not applicable"
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Crystal Shoot",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 super, multiple psycho projectiles",
                        damage = 160,
                        startup = 8,
                        recovery = 32,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Startup invincibility"),
                            MoveProperty("MAX Version", "More projectiles when MAX activated"),
                            MoveProperty("Psycho", "Enhanced with psycho power")
                        ),
                        counterHitEffect = "Additional hits and psycho damage"
                    ),
                    Move(
                        name = "Shining Crystal Bit",
                        input = "↓↙←↙↓↘→ + P+K",
                        description = "Level 3 super, massive psycho energy attack",
                        damage = 250,
                        startup = 5,
                        recovery = 45,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Cinematic", "Triggers special animation"),
                            MoveProperty("Invincible", "Full invincibility on startup"),
                            MoveProperty("Unscaled", "Damage is not scaled"),
                            MoveProperty("Psycho", "Maximum psycho power")
                        ),
                        guardCrush = true,
                        counterHitEffect = "Additional damage and psycho effects on final hit"
                    )
                )
            )
        ),
        "ralf" to CharacterDetails(
            id = "ralf",
            name = "Ralf Jones",
            playstyle = "Ralf is a powerful rushdown character who excels at close-range combat. His command grabs and devastating punch attacks make him a formidable grappler with strong pressure options.",
            strengths = listOf(
                "Powerful command grabs",
                "Strong pressure game",
                "High damage output",
                "Good mix-up potential",
                "Durable with high health"
            ),
            weaknesses = listOf(
                "Limited range",
                "Can be zoned out",
                "Some moves are slow",
                "Requires close proximity"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "A",
                        description = "Quick jab, good for pressure",
                        damage = 30,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Light Kick",
                        input = "B",
                        description = "Fast low attack",
                        damage = 35,
                        startup = 5,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "C",
                        description = "Strong straight punch",
                        damage = 50,
                        startup = 7,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Standing Heavy Kick",
                        input = "D",
                        description = "Powerful kick",
                        damage = 55,
                        startup = 9,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Gatling Attack",
                        input = "→ + B",
                        description = "Rushing punch sequence",
                        damage = 45,
                        startup = 14,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Diving Kick",
                        input = "→ + D",
                        description = "Jumping overhead kick",
                        damage = 60,
                        startup = 20,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Galactica Phantom",
                        input = "↓↘→ + P",
                        description = "Powerful rushing punch",
                        damage = 120,
                        startup = 16,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Ralf Kick",
                        input = "↓↙← + K",
                        description = "Flying kick attack",
                        damage = 80,
                        startup = 12,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Vulcan Punch",
                        input = "→↓↘ + P",
                        description = "Multiple hitting punch combo",
                        damage = 100,
                        startup = 8,
                        recovery = 22,
                        onBlock = -10,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Argentine Backbreaker",
                        input = "↓↘→ + K",
                        description = "Command grab",
                        damage = 150,
                        startup = 5,
                        recovery = 30,
                        onBlock = 0,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Bareback Vulcan Punch",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 super, enhanced Vulcan Punch",
                        damage = 180,
                        startup = 8,
                        recovery = 34,
                        onBlock = -12,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Galactica Phantom MAX",
                        input = "↓↙←↙↓↘→ + P",
                        description = "Level 3 super, ultimate punch attack",
                        damage = 320,
                        startup = 12,
                        recovery = 40,
                        onBlock = -16,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "king" to CharacterDetails(
            id = "king",
            name = "King",
            playstyle = "King is a zoner who excels at controlling space with her powerful kick attacks and projectiles. Her Muay Thai techniques give her strong defensive options and good counter-hit opportunities.",
            strengths = listOf(
                "Strong zoning game",
                "Good projectiles",
                "Excellent kick-based attacks",
                "Strong counter-hit game",
                "Good defensive options"
            ),
            weaknesses = listOf(
                "Limited close-range options",
                "Some moves are unsafe",
                "Can struggle against rushdown",
                "Requires good spacing"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "A",
                        description = "Quick jab",
                        damage = 25,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Quick", "Very fast startup"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Muay Thai", "Traditional boxing technique")
                        ),
                        counterHitEffect = "Allows for extended combos"
                    ),
                    Move(
                        name = "Standing Light Kick",
                        input = "B",
                        description = "Fast low kick",
                        damage = 30,
                        startup = 5,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Muay Thai", "Traditional leg kick")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "C",
                        description = "Strong straight punch",
                        damage = 45,
                        startup = 7,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Combo", "Good combo starter"),
                            MoveProperty("Muay Thai", "Power straight technique")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    ),
                    Move(
                        name = "Standing Heavy Kick",
                        input = "D",
                        description = "Powerful roundhouse kick",
                        damage = 50,
                        startup = 9,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Range", "Long reach"),
                            MoveProperty("Muay Thai", "Traditional roundhouse")
                        ),
                        counterHitEffect = "Causes hard knockdown"
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Trap Kick",
                        input = "→ + B",
                        description = "Quick advancing kick",
                        damage = 45,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Forward", "Moves forward during attack"),
                            MoveProperty("Chain", "Can chain into special moves"),
                            MoveProperty("Muay Thai", "Traditional advancing technique"),
                            MoveProperty("Pressure", "Good pressure tool")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Sliding",
                        input = "↘ + D",
                        description = "Low sliding attack",
                        damage = 55,
                        startup = 16,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Forward", "Moves forward during attack"),
                            MoveProperty("Mix-up", "Good for mix-ups"),
                            MoveProperty("Range", "Long range low attack")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Venom Strike",
                        input = "↓↘→ + K",
                        description = "Projectile kick attack",
                        damage = 70,
                        startup = 14,
                        recovery = 22,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Energy kick projectile"),
                            MoveProperty("EX Version", "Press BD for faster projectile"),
                            MoveProperty("Muay Thai", "Enhanced kick technique"),
                            MoveProperty("Zoning", "Good for controlling space")
                        ),
                        counterHitEffect = "Knocks down opponent with additional damage"
                    ),
                    Move(
                        name = "Tornado Kick",
                        input = "↓↙← + K",
                        description = "Rising kick attack",
                        damage = 80,
                        startup = 8,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("EX Version", "Press BD for invincibility"),
                            MoveProperty("Muay Thai", "Rising knee strike"),
                            MoveProperty("Rising", "Good juggle tool")
                        ),
                        counterHitEffect = "Additional hits and juggle potential"
                    ),
                    Move(
                        name = "Double Strike",
                        input = "→↓↘ + K",
                        description = "Two-hit kick combo",
                        damage = 90,
                        startup = 12,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("EX Version", "Press BD for more hits"),
                            MoveProperty("Muay Thai", "Combination kick technique"),
                            MoveProperty("Pressure", "Strong pressure tool")
                        ),
                        counterHitEffect = "Additional hits and wall bounce"
                    ),
                    Move(
                        name = "Trap Shot",
                        input = "↓↘→ + P",
                        description = "High projectile attack",
                        damage = 65,
                        startup = 16,
                        recovery = 24,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "High-trajectory projectile"),
                            MoveProperty("EX Version", "Press AC for faster startup"),
                            MoveProperty("Zoning", "Good for controlling space"),
                            MoveProperty("Mix-up", "Can catch opponents jumping")
                        ),
                        counterHitEffect = "Knocks down opponent"
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Silent Flash",
                        input = "↓↘→↓↘→ + K",
                        description = "Level 1 super, multiple kick combo",
                        damage = 160,
                        startup = 8,
                        recovery = 32,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Startup invincibility"),
                            MoveProperty("MAX Version", "More hits when MAX activated"),
                            MoveProperty("Muay Thai", "Ultimate kick combination")
                        ),
                        counterHitEffect = "Additional hits and damage"
                    ),
                    Move(
                        name = "Ultimate Tornado Kick",
                        input = "↓↙←↙↓↘→ + K",
                        description = "Level 3 super, devastating kick barrage",
                        damage = 280,
                        startup = 6,
                        recovery = 40,
                        onBlock = -16,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Cinematic", "Triggers special animation"),
                            MoveProperty("Invincible", "Full invincibility on startup"),
                            MoveProperty("Unscaled", "Damage is not scaled"),
                            MoveProperty("Muay Thai", "Maximum power technique")
                        ),
                        guardCrush = true,
                        counterHitEffect = "Additional damage and extended cinematic"
                    )
                )
            )
        ),
        "shermie" to CharacterDetails(
            id = "shermie",
            name = "Shermie",
            playstyle = "Shermie is a grappler who specializes in command throws and mix-ups. Her lightning-based attacks and acrobatic moves make her a unique threat at close range.",
            strengths = listOf(
                "Strong command grab game",
                "Good mix-up potential",
                "Unique movement options",
                "High damage output",
                "Strong okizeme"
            ),
            weaknesses = listOf(
                "Limited range",
                "Struggles at mid-range",
                "Some moves are risky",
                "Requires close proximity"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Standing Light Punch",
                        input = "A",
                        description = "Quick jab",
                        damage = 25,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Quick", "Very fast startup"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Pressure", "Good for pressure strings")
                        ),
                        counterHitEffect = "Allows for extended combos"
                    ),
                    Move(
                        name = "Standing Light Kick",
                        input = "B",
                        description = "Fast low kick",
                        damage = 30,
                        startup = 5,
                        recovery = 10,
                        onBlock = -3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Hits low"),
                            MoveProperty("Chain", "Can chain into other normals"),
                            MoveProperty("Range", "Good poke range")
                        ),
                        counterHitEffect = "Grants frame advantage for pressure"
                    ),
                    Move(
                        name = "Standing Heavy Punch",
                        input = "C",
                        description = "Strong overhead strike",
                        damage = 45,
                        startup = 7,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Combo", "Good combo starter"),
                            MoveProperty("Lightning", "Lightning-enhanced strike")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    ),
                    Move(
                        name = "Standing Heavy Kick",
                        input = "D",
                        description = "Powerful kick",
                        damage = 50,
                        startup = 9,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Hits mid"),
                            MoveProperty("Range", "Long reach"),
                            MoveProperty("Knockdown", "Forces knockdown on hit")
                        ),
                        counterHitEffect = "Causes hard knockdown"
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Acrobatic Kick",
                        input = "→ + B",
                        description = "Cartwheel kick attack",
                        damage = 45,
                        startup = 14,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Forward", "Moves forward during attack"),
                            MoveProperty("Mix-up", "Good for mix-ups"),
                            MoveProperty("Unique", "Acrobatic movement")
                        ),
                        counterHitEffect = "Launches for juggle combos"
                    ),
                    Move(
                        name = "Diving Attack",
                        input = "→ + D",
                        description = "Overhead diving move",
                        damage = 60,
                        startup = 20,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Cross-up", "Can cross up opponents"),
                            MoveProperty("Mix-up", "Good for mix-ups"),
                            MoveProperty("Aerial", "Can be done in air")
                        ),
                        counterHitEffect = "Ground bounce for combo extension"
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Shermie Spiral",
                        input = "↓↘→ + P",
                        description = "Command grab with follow-ups",
                        damage = 140,
                        startup = 5,
                        recovery = 30,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Command Grab", "Unblockable throw"),
                            MoveProperty("EX Version", "Press AC for more damage"),
                            MoveProperty("Lightning", "Lightning-enhanced throw"),
                            MoveProperty("Follow-up", "Can follow with additional attacks")
                        ),
                        counterHitEffect = "Not applicable"
                    ),
                    Move(
                        name = "Shermie Flash",
                        input = "↓↙← + K",
                        description = "Lightning projectile",
                        damage = 70,
                        startup = 16,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Lightning projectile"),
                            MoveProperty("EX Version", "Press BD for larger projectile"),
                            MoveProperty("Lightning", "Lightning-based attack"),
                            MoveProperty("Zoning", "Good for controlling space")
                        ),
                        counterHitEffect = "Additional lightning damage and stun"
                    ),
                    Move(
                        name = "Shermie Clutch",
                        input = "→↓↘ + P",
                        description = "Quick command grab",
                        damage = 120,
                        startup = 5,
                        recovery = 28,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Command Grab", "Unblockable throw"),
                            MoveProperty("EX Version", "Press AC for invincibility"),
                            MoveProperty("Lightning", "Lightning-enhanced throw"),
                            MoveProperty("Quick", "Fast startup grab")
                        ),
                        counterHitEffect = "Not applicable"
                    ),
                    Move(
                        name = "Axle Spin Kick",
                        input = "↓↘→ + K",
                        description = "Spinning kick attack",
                        damage = 80,
                        startup = 12,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("EX Version", "Press BD for more hits"),
                            MoveProperty("Lightning", "Lightning-enhanced kicks"),
                            MoveProperty("Pressure", "Good pressure tool")
                        ),
                        counterHitEffect = "Additional hits and wall bounce"
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Shermie Carnival",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 super, multiple throws",
                        damage = 180,
                        startup = 5,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Command Grab", "Unblockable throw sequence"),
                            MoveProperty("Invincible", "Startup invincibility"),
                            MoveProperty("MAX Version", "More throws when MAX activated"),
                            MoveProperty("Lightning", "Lightning-enhanced throws")
                        ),
                        counterHitEffect = "Not applicable"
                    ),
                    Move(
                        name = "Inazuma Tempest",
                        input = "↓↙←↙↓↘→ + P",
                        description = "Level 3 super, lightning-based ultimate",
                        damage = 300,
                        startup = 8,
                        recovery = 42,
                        onBlock = -16,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Cinematic", "Triggers special animation"),
                            MoveProperty("Invincible", "Full invincibility on startup"),
                            MoveProperty("Unscaled", "Damage is not scaled"),
                            MoveProperty("Lightning", "Maximum lightning power")
                        ),
                        guardCrush = true,
                        counterHitEffect = "Additional damage and extended lightning effects"
                    )
                )
            )
        ),
        "leona" to CharacterDetails(
            id = "leona",
            name = "Leona Heidern",
            playstyle = "Leona is a technical fighter who uses her military training and Orochi power for devastating combinations. Her V-Slasher techniques and explosive moves make her deadly at any range.",
            strengths = listOf(
                "Strong mix-up game",
                "Good zoning tools",
                "Versatile special moves",
                "Solid damage output",
                "Strong okizeme"
            ),
            weaknesses = listOf(
                "Complex execution",
                "Risky moves",
                "Requires meter management",
                "Can be predictable"
            ),
            moves = mapOf(
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Moon Slasher",
                        input = "↓↘→ + P",
                        description = "Rising anti-air slash with energy",
                        damage = 75,
                        startup = 8,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("EX Version", "Press AC for invincibility"),
                            MoveProperty("Military", "Heidern-style technique"),
                            MoveProperty("Energy", "Enhanced with energy")
                        ),
                        counterHitEffect = "Additional damage and juggle potential"
                    ),
                    Move(
                        name = "V-Slasher",
                        input = "↓↙← + P",
                        description = "Energy projectile in V shape",
                        damage = 70,
                        startup = 14,
                        recovery = 22,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Energy-based projectile"),
                            MoveProperty("EX Version", "Press AC for larger projectile"),
                            MoveProperty("Military", "Signature move"),
                            MoveProperty("Zoning", "Good for controlling space")
                        ),
                        counterHitEffect = "Knocks down opponent with energy effect"
                    ),
                    Move(
                        name = "Grand Saber",
                        input = "→↓↘ + K",
                        description = "Rushing slash attack",
                        damage = 80,
                        startup = 16,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Rush", "Quick rushing attack"),
                            MoveProperty("EX Version", "Press BD for armor"),
                            MoveProperty("Military", "Advanced combat technique"),
                            MoveProperty("Mix-up", "Good mix-up tool")
                        ),
                        counterHitEffect = "Wall bounce for extended combos"
                    ),
                    Move(
                        name = "Strike Arch",
                        input = "↓↘→ + K",
                        description = "Leaping overhead slash",
                        damage = 85,
                        startup = 18,
                        recovery = 26,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("EX Version", "Press BD for faster startup"),
                            MoveProperty("Military", "Advanced aerial technique"),
                            MoveProperty("Mix-up", "Strong mix-up option")
                        ),
                        counterHitEffect = "Ground bounce for combo extension"
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "V-Slasher Storm",
                        input = "↓↘→↓↘→ + P",
                        description = "Level 1 super, multiple V-Slasher projectiles",
                        damage = 160,
                        startup = 8,
                        recovery = 32,
                        onBlock = -12,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Startup invincibility"),
                            MoveProperty("MAX Version", "More projectiles when MAX activated"),
                            MoveProperty("Military", "Enhanced military technique")
                        ),
                        counterHitEffect = "Additional hits and damage"
                    ),
                    Move(
                        name = "Rebel Spark",
                        input = "↓↙←↙↓↘→ + P+K",
                        description = "Level 3 super, devastating Orochi-powered combo",
                        damage = 280,
                        startup = 5,
                        recovery = 45,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Cinematic", "Triggers special animation"),
                            MoveProperty("Invincible", "Full invincibility on startup"),
                            MoveProperty("Unscaled", "Damage is not scaled"),
                            MoveProperty("Orochi", "Unleashes Orochi power")
                        ),
                        guardCrush = true,
                        counterHitEffect = "Additional damage and Orochi effects"
                    )
                )
            )
        )
    )
} 