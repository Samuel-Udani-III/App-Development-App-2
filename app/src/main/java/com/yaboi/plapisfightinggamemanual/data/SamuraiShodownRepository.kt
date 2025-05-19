package com.yaboi.plapisfightinggamemanual.data

object SamuraiShodownRepository {
    fun getCharacterDetails(characterId: String): CharacterDetails? {
        return characterData[characterId]
    }

    fun getAllCharacters(): List<CharacterDetails> {
        return characterData.values.toList()
    }

    private val characterData = mapOf(
        "haohmaru" to CharacterDetails(
            id = "haohmaru",
            name = "Haohmaru",
            playstyle = "Haohmaru is a balanced samurai who excels at mid-range combat with his long-reaching sword attacks. His wind-based techniques and powerful counters make him effective at both offense and defense.",
            strengths = listOf(
                "Strong mid-range game",
                "Powerful single-hit damage",
                "Good anti-air options",
                "Effective counter moves",
                "Versatile wind projectiles"
            ),
            weaknesses = listOf(
                "Limited close-range options",
                "Some moves have long recovery",
                "Can be rushed down",
                "Requires good spacing"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Slash",
                        input = "A",
                        description = "Quick horizontal sword slash",
                        damage = 400,
                        startup = 6,
                        recovery = 12,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Slash",
                        input = "B",
                        description = "Mid-range horizontal slash",
                        damage = 600,
                        startup = 8,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Slash",
                        input = "C",
                        description = "Strong overhead slash",
                        damage = 800,
                        startup = 12,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Kick",
                        input = "D",
                        description = "Quick kick, good for pressure",
                        damage = 300,
                        startup = 5,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Rushing Slash",
                        input = "→ + B",
                        description = "Forward-moving slash attack",
                        damage = 700,
                        startup = 14,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Overhead Strike",
                        input = "→ + C",
                        description = "Unblockable high attack",
                        damage = 900,
                        startup = 25,
                        recovery = 30,
                        onBlock = -12,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Senpuu Retsu Zan",
                        input = "↓↘→ + A/B/C",
                        description = "Wind projectile attack",
                        damage = 800,
                        startup = 12,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Kogetsu Zan",
                        input = "↓↙← + A/B/C",
                        description = "Rising anti-air slash",
                        damage = 900,
                        startup = 8,
                        recovery = 26,
                        onBlock = -12,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Resshin Zan",
                        input = "→↓↘ + A/B/C",
                        description = "Dashing sword thrust",
                        damage = 750,
                        startup = 16,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Hinoha Zan",
                        input = "↓↘→ + D",
                        description = "Flaming sword attack",
                        damage = 1000,
                        startup = 20,
                        recovery = 28,
                        onBlock = -10,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Ougi: Kogetsu Zan",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Powerful rising blade attack that hits multiple times. Excellent anti-air super.",
                        damage = 2000,
                        startup = 8,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Has startup invincibility"),
                            MoveProperty("Anti-air", "Great against jumping opponents")
                        )
                    ),
                    Move(
                        name = "Ougi: Senpuu Retsu Zan",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Massive tornado projectile that covers most of the screen.",
                        damage = 2500,
                        startup = 12,
                        recovery = 40,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Full Screen", "Covers most of the screen"),
                            MoveProperty("Guard Break", "Can break guard on block"),
                            MoveProperty("High Damage", "One of Haohmaru's strongest moves")
                        )
                    )
                )
            )
        ),
        "nakoruru" to CharacterDetails(
            id = "nakoruru",
            name = "Nakoruru",
            playstyle = "Nakoruru is an agile fighter who uses quick attacks and her companion hawk Mamahaha for unique mix-ups. Her mobility and air options make her excellent at controlling space and applying pressure.",
            strengths = listOf(
                "Great mobility",
                "Strong air game",
                "Good mix-up potential",
                "Fast attacks",
                "Unique assist options with Mamahaha"
            ),
            weaknesses = listOf(
                "Low health",
                "Weak against heavy pressure",
                "Limited ground options",
                "Requires technical execution"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Slash",
                        input = "A",
                        description = "Quick kodachi slash",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -1,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Slash",
                        input = "B",
                        description = "Mid-range kodachi cut",
                        damage = 450,
                        startup = 6,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Slash",
                        input = "C",
                        description = "Strong overhead slash",
                        damage = 600,
                        startup = 9,
                        recovery = 16,
                        onBlock = -5,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Kick",
                        input = "D",
                        description = "Quick low kick",
                        damage = 200,
                        startup = 5,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Nature's Edge",
                        input = "→ + B",
                        description = "Forward-moving slash with good range",
                        damage = 500,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Wind Step",
                        input = "→ + C",
                        description = "Overhead jumping slash",
                        damage = 600,
                        startup = 16,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Kamui Rimuse",
                        input = "↓↘→ + A/B/C",
                        description = "Sends Mamahaha to attack. Button strength determines attack pattern",
                        damage = 500,
                        startup = 12,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Bird projectile attack"),
                            MoveProperty("Variable", "Different patterns based on button"),
                            MoveProperty("Assist", "Can attack while Mamahaha is out")
                        )
                    ),
                    Move(
                        name = "Annu Mutsube",
                        input = "↓↙← + A/B/C",
                        description = "Rising anti-air attack with kodachi",
                        damage = 600,
                        startup = 8,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-air", "Strong vs jumping opponents"),
                            MoveProperty("Invincible", "Upper body invulnerability"),
                            MoveProperty("Follow-up", "Can follow with other moves")
                        )
                    ),
                    Move(
                        name = "Lelam Shikite",
                        input = "→↓↘ + A/B/C",
                        description = "Quick dashing slash attack",
                        damage = 450,
                        startup = 10,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Rush", "Quick forward movement"),
                            MoveProperty("Mix-up", "Can mix-up with other moves"),
                            MoveProperty("Safe", "Relatively safe on block")
                        )
                    ),
                    Move(
                        name = "Mamahaha Call",
                        input = "↓↘→ + D",
                        description = "Calls Mamahaha for various follow-ups",
                        damage = 0,
                        startup = 15,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Summon", "Calls Mamahaha"),
                            MoveProperty("Setup", "Sets up mix-up opportunities"),
                            MoveProperty("Variable", "Multiple follow-up options")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Elerushi Kamui Rimuse",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple Mamahaha attacks covering the screen",
                        damage = 1800,
                        startup = 8,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Screen Coverage", "Attacks cover multiple angles"),
                            MoveProperty("Mix-up", "Can mix-up after super")
                        )
                    ),
                    Move(
                        name = "Kamui Shikite",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate combination attack with Mamahaha",
                        damage = 2200,
                        startup = 6,
                        recovery = 40,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("High Damage", "Very high damage super"),
                            MoveProperty("Invincible", "Has startup invincibility"),
                            MoveProperty("Combo", "Good combo ender")
                        )
                    )
                )
            )
        ),
        "genjuro" to CharacterDetails(
            id = "genjuro",
            name = "Genjuro Kibagami",
            playstyle = "Genjuro is an aggressive fighter who excels at close-range combat. His powerful iaijutsu techniques and mix-up potential make him a deadly opponent at close range.",
            strengths = listOf(
                "Strong pressure game",
                "Powerful mix-ups",
                "Fast attacks",
                "Good counter options",
                "High damage output"
            ),
            weaknesses = listOf(
                "Limited range",
                "Requires close proximity",
                "Some moves are unsafe",
                "Can be zoned out"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Slash",
                        input = "A",
                        description = "Quick draw slash",
                        damage = 180,
                        startup = 5,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Slash",
                        input = "B",
                        description = "Mid-range horizontal cut",
                        damage = 350,
                        startup = 8,
                        recovery = 14,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Slash",
                        input = "C",
                        description = "Powerful overhead strike",
                        damage = 500,
                        startup = 12,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Kick",
                        input = "D",
                        description = "Quick low kick",
                        damage = 140,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Advancing Slash",
                        input = "→ + B",
                        description = "Forward-moving cut",
                        damage = 400,
                        startup = 14,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Overhead Strike",
                        input = "→ + C",
                        description = "Unblockable high attack",
                        damage = 600,
                        startup = 24,
                        recovery = 20,
                        onBlock = -10,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Sanren Satsu",
                        input = "↓↘→ + A/B/C",
                        description = "Triple slash attack. Different buttons change timing and range.",
                        damage = 650,
                        startup = 10,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits three times"),
                            MoveProperty("Variable", "Different timings per button"),
                            MoveProperty("Mix-up", "Good for pressure")
                        )
                    ),
                    Move(
                        name = "Hyakki Zan",
                        input = "↓↙← + A/B/C",
                        description = "Rising blade attack with follow-ups",
                        damage = 700,
                        startup = 8,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-air", "Strong vs jumping opponents"),
                            MoveProperty("Follow-up", "Can chain into other moves"),
                            MoveProperty("Invincible", "Upper body invulnerability")
                        )
                    ),
                    Move(
                        name = "Jakura Zan",
                        input = "→↓↘ + A/B/C",
                        description = "Quick forward-moving slash",
                        damage = 600,
                        startup = 12,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Rush", "Quick forward movement"),
                            MoveProperty("Safe", "Relatively safe on block"),
                            MoveProperty("Pressure", "Good for maintaining pressure")
                        )
                    ),
                    Move(
                        name = "Shiranui Style",
                        input = "↓↘→ + D",
                        description = "Counter stance that can punish attacks",
                        damage = 800,
                        startup = 5,
                        recovery = 30,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Counter", "Can counter opponent's attacks"),
                            MoveProperty("High Damage", "Strong punish damage"),
                            MoveProperty("Risky", "Unsafe if not used to counter")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Shin Sanren Satsu",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Enhanced version of Sanren Satsu with more hits and damage",
                        damage = 2000,
                        startup = 8,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Invincible", "Has startup invincibility"),
                            MoveProperty("Mix-up", "Can mix-up after super")
                        )
                    ),
                    Move(
                        name = "Yasha Gaeshi",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate counter attack with massive damage",
                        damage = 2500,
                        startup = 6,
                        recovery = 40,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Counter", "Most powerful when used as counter"),
                            MoveProperty("High Damage", "Extremely high damage"),
                            MoveProperty("Invincible", "Full invincibility on startup")
                        )
                    )
                )
            )
        ),
        "ukyo" to CharacterDetails(
            id = "ukyo",
            name = "Ukyo Tachibana",
            playstyle = "Ukyo is a precision-based fighter who excels at controlling space with his long-range iaijutsu techniques. His quick draws and counter abilities make him deadly at any range, but he requires careful timing.",
            strengths = listOf(
                "Excellent range control",
                "Strong counter game",
                "Fast iaijutsu attacks",
                "High damage potential",
                "Good anti-air options"
            ),
            weaknesses = listOf(
                "Complex execution",
                "Health management required",
                "Weak to aggressive pressure",
                "Requires precise spacing"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Slash",
                        input = "A",
                        description = "Quick horizontal draw",
                        damage = 450,
                        startup = 6,
                        recovery = 12,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Slash",
                        input = "B",
                        description = "Mid-range draw slash",
                        damage = 650,
                        startup = 8,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Slash",
                        input = "C",
                        description = "Long-range precision cut",
                        damage = 850,
                        startup = 12,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Kick",
                        input = "D",
                        description = "Quick low sweep",
                        damage = 300,
                        startup = 5,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Tsubame Gaeshi",
                        input = "→ + B",
                        description = "Overhead swallow slice",
                        damage = 750,
                        startup = 16,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Sake Splash",
                        input = "→ + D",
                        description = "Throws sake to stun opponent",
                        damage = 100,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Tsubame Gaeshi",
                        input = "↓↘→ + A/B/C",
                        description = "Rising anti-air slash",
                        damage = 850,
                        startup = 8,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Yanagi Barai",
                        input = "↓↙← + A/B/C",
                        description = "Low sweeping blade wave",
                        damage = 700,
                        startup = 14,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Zanzou Ken",
                        input = "→↓↘ + A/B/C",
                        description = "Quick forward-moving slash",
                        damage = 600,
                        startup = 10,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Tsubame Return",
                        input = "↓↘→ + D",
                        description = "Backward leap slash",
                        damage = 750,
                        startup = 16,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Shin Tsubame Gaeshi",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Enhanced version of Tsubame Gaeshi with multiple hits",
                        damage = 2000,
                        startup = 6,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Anti-air", "Excellent anti-air super"),
                            MoveProperty("Invincible", "Has startup invincibility")
                        )
                    ),
                    Move(
                        name = "Hiken: Sasameyuki",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate iaijutsu technique with cherry blossoms",
                        damage = 2400,
                        startup = 8,
                        recovery = 40,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("High Damage", "One of Ukyo's strongest moves"),
                            MoveProperty("Full Screen", "Hits full screen"),
                            MoveProperty("Guard Break", "Can break guard on block")
                        )
                    )
                )
            )
        ),
        "galford" to CharacterDetails(
            id = "galford",
            name = "Galford D. Weller",
            playstyle = "Galford is an aggressive ninja who uses his speed and his loyal dog Poppy to create devastating mix-ups. His lightning techniques and mobility make him excellent at both rush-down and zoning.",
            strengths = listOf(
                "Great mobility",
                "Strong mix-up game",
                "Good projectiles",
                "Unique assist with Poppy",
                "Versatile offensive options"
            ),
            weaknesses = listOf(
                "Average health",
                "Some moves are unsafe",
                "Complex execution required",
                "Requires good resource management"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Slash",
                        input = "A",
                        description = "Quick ninja sword slash",
                        damage = 350,
                        startup = 5,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Slash",
                        input = "B",
                        description = "Mid-range ninja blade",
                        damage = 550,
                        startup = 7,
                        recovery = 14,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Slash",
                        input = "C",
                        description = "Strong overhead slash",
                        damage = 750,
                        startup = 10,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Kick",
                        input = "D",
                        description = "Quick ninja kick",
                        damage = 250,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Poppy Call",
                        input = "→ + B",
                        description = "Calls Poppy for assist",
                        damage = 0,
                        startup = 16,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Lightning Strike",
                        input = "→ + C",
                        description = "Overhead lightning-infused slash",
                        damage = 700,
                        startup = 18,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Plasma Blade",
                        input = "↓↘→ + A/B/C",
                        description = "Lightning projectile attack. Different buttons change speed and angle.",
                        damage = 500,
                        startup = 12,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Lightning projectile"),
                            MoveProperty("Variable", "Different patterns per button"),
                            MoveProperty("Pressure", "Good for zoning")
                        )
                    ),
                    Move(
                        name = "Lightning Slash",
                        input = "↓↙← + A/B/C",
                        description = "Rising lightning-infused slash",
                        damage = 600,
                        startup = 8,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-air", "Strong vs jumping opponents"),
                            MoveProperty("Invincible", "Upper body invulnerability"),
                            MoveProperty("Lightning", "Electrifies on hit")
                        )
                    ),
                    Move(
                        name = "Rush Dog",
                        input = "→↓↘ + A/B/C",
                        description = "Sends Poppy to attack opponent",
                        damage = 450,
                        startup = 15,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Assist", "Uses Poppy for attack"),
                            MoveProperty("Mix-up", "Good for pressure"),
                            MoveProperty("Safe", "Relatively safe on block")
                        )
                    ),
                    Move(
                        name = "Poppy Call",
                        input = "↓↘→ + D",
                        description = "Calls Poppy for various follow-ups",
                        damage = 0,
                        startup = 15,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Summon", "Calls Poppy"),
                            MoveProperty("Setup", "Sets up mix-up opportunities"),
                            MoveProperty("Variable", "Multiple follow-up options")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Thunder Storm",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple lightning strikes covering the screen",
                        damage = 1800,
                        startup = 8,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Screen Coverage", "Attacks cover multiple angles"),
                            MoveProperty("Lightning", "Electrifies on hit")
                        )
                    ),
                    Move(
                        name = "Justice Storm",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate combination attack with Poppy",
                        damage = 2200,
                        startup = 6,
                        recovery = 40,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("High Damage", "Very high damage super"),
                            MoveProperty("Invincible", "Has startup invincibility"),
                            MoveProperty("Team Attack", "Combines with Poppy")
                        )
                    )
                )
            )
        ),
        "charlotte" to CharacterDetails(
            id = "charlotte",
            name = "Charlotte Christine de Colde",
            playstyle = "Charlotte is a technical fencer who excels at controlling space with her precise rapier strikes. Her elegant style combines quick pokes, defensive maneuvers, and powerful thrusting attacks.",
            strengths = listOf(
                "Excellent range control",
                "Strong poke game",
                "Good defensive options",
                "Fast recovery on many moves",
                "Solid anti-air capabilities"
            ),
            weaknesses = listOf(
                "Limited combo potential",
                "Weak against heavy pressure",
                "Some moves have strict timing",
                "Can struggle at close range"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Thrust",
                        input = "A",
                        description = "Quick rapier poke",
                        damage = 300,
                        startup = 5,
                        recovery = 8,
                        onBlock = -1,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Thrust",
                        input = "B",
                        description = "Extended rapier thrust",
                        damage = 500,
                        startup = 8,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Thrust",
                        input = "C",
                        description = "Powerful lunging thrust",
                        damage = 700,
                        startup = 12,
                        recovery = 16,
                        onBlock = -5,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Kick",
                        input = "D",
                        description = "Quick noble kick",
                        damage = 250,
                        startup = 6,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Noble Advance",
                        input = "→ + B",
                        description = "Forward-stepping thrust",
                        damage = 600,
                        startup = 14,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Royal Slash",
                        input = "→ + C",
                        description = "Overhead slashing attack",
                        damage = 800,
                        startup = 20,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Crystal Shot",
                        input = "↓↘→ + A/B/C",
                        description = "Energy projectile from rapier. Different buttons change speed and angle.",
                        damage = 450,
                        startup = 14,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Energy projectile"),
                            MoveProperty("Variable", "Different patterns per button"),
                            MoveProperty("Zoning", "Good for keeping distance")
                        )
                    ),
                    Move(
                        name = "Noble Strike",
                        input = "↓↙← + A/B/C",
                        description = "Rising thrust attack, excellent anti-air",
                        damage = 550,
                        startup = 8,
                        recovery = 22,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-air", "Strong vs jumping opponents"),
                            MoveProperty("Invincible", "Upper body invulnerability"),
                            MoveProperty("Priority", "High priority move")
                        )
                    ),
                    Move(
                        name = "Splash Fount",
                        input = "→↓↘ + A/B/C",
                        description = "Multi-hitting thrust attack",
                        damage = 600,
                        startup = 12,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Safe", "Relatively safe on block"),
                            MoveProperty("Pressure", "Good for pressure")
                        )
                    ),
                    Move(
                        name = "Royal Guard",
                        input = "↓↘→ + D",
                        description = "Defensive stance that can counter attacks",
                        damage = 700,
                        startup = 5,
                        recovery = 25,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Counter", "Can counter opponent's attacks"),
                            MoveProperty("Defense", "Strong defensive option"),
                            MoveProperty("Punish", "Good punish damage")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rose Splash",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple thrusting attacks with rose petals",
                        damage = 1800,
                        startup = 8,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Range", "Excellent range"),
                            MoveProperty("Priority", "High priority super")
                        )
                    ),
                    Move(
                        name = "Noble Revolution",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate rapier technique with massive damage",
                        damage = 2200,
                        startup = 6,
                        recovery = 40,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("High Damage", "Very high damage super"),
                            MoveProperty("Invincible", "Has startup invincibility"),
                            MoveProperty("Guard Break", "Can break guard on block")
                        )
                    )
                )
            )
        ),
        "hanzo" to CharacterDetails(
            id = "hanzo",
            name = "Hanzo Hattori",
            playstyle = "Hanzo is a balanced ninja who combines quick strikes with devastating ninjutsu techniques. His versatile moveset allows him to control space and apply pressure effectively.",
            strengths = listOf(
                "Well-rounded moveset",
                "Strong mix-up game",
                "Good projectiles",
                "Excellent mobility",
                "Solid pressure options"
            ),
            weaknesses = listOf(
                "Jack of all trades, master of none",
                "Average damage output",
                "Requires good execution",
                "Some risky moves"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Slash",
                        input = "A",
                        description = "Quick ninja sword slash",
                        damage = 350,
                        startup = 5,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Slash",
                        input = "B",
                        description = "Mid-range blade strike",
                        damage = 550,
                        startup = 8,
                        recovery = 14,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Slash",
                        input = "C",
                        description = "Strong overhead cut",
                        damage = 750,
                        startup = 12,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Kick",
                        input = "D",
                        description = "Swift ninja kick",
                        damage = 300,
                        startup = 4,
                        recovery = 8,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Shadow Step",
                        input = "→ + B",
                        description = "Forward-moving slash",
                        damage = 600,
                        startup = 14,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Ninja Strike",
                        input = "→ + C",
                        description = "Overhead jumping slash",
                        damage = 700,
                        startup = 18,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Mozu Shuriken",
                        input = "↓↘→ + A/B/C",
                        description = "Throwing star projectile",
                        damage = 500,
                        startup = 12,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Shinobi Brai",
                        input = "↓↙← + A/B/C",
                        description = "Rising blade attack",
                        damage = 650,
                        startup = 8,
                        recovery = 22,
                        onBlock = -10,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Ninja Dash",
                        input = "→↓↘ + A/B/C",
                        description = "Quick forward dash attack",
                        damage = 600,
                        startup = 10,
                        recovery = 16,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Shadow Clone",
                        input = "↓↘→ + D",
                        description = "Teleport attack",
                        damage = 550,
                        startup = 15,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Ninja Storm",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple shadow clone attacks",
                        damage = 1900,
                        startup = 8,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Shinobi Execution",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate ninjutsu combination",
                        damage = 2900,
                        startup = 6,
                        recovery = 42,
                        onBlock = -18,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "tam_tam" to CharacterDetails(
            id = "tam_tam",
            name = "Tam Tam",
            playstyle = "Tam Tam is a powerful warrior who uses his massive sword and fire magic to control space. His long reach and projectiles make him excellent at keeping opponents at bay.",
            strengths = listOf(
                "Long range attacks",
                "Strong projectile game",
                "Good damage output",
                "Solid anti-air options",
                "Powerful punish game"
            ),
            weaknesses = listOf(
                "Slow movement speed",
                "Large hurtbox",
                "Vulnerable to rushdown",
                "Some moves have long recovery"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Slash",
                        input = "A",
                        description = "Quick sword slash",
                        damage = 400,
                        startup = 6,
                        recovery = 12,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Slash",
                        input = "B",
                        description = "Mid-range sword swing",
                        damage = 600,
                        startup = 8,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Slash",
                        input = "C",
                        description = "Strong overhead slash",
                        damage = 800,
                        startup = 12,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Kick",
                        input = "D",
                        description = "Quick tribal kick",
                        damage = 300,
                        startup = 5,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Tribal Edge",
                        input = "→ + B",
                        description = "Forward-moving sword swing",
                        damage = 650,
                        startup = 14,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Jungle Slash",
                        input = "→ + C",
                        description = "Overhead jumping attack",
                        damage = 750,
                        startup = 18,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Fire Ball",
                        input = "↓↘→ + A/B/C",
                        description = "Shoots fire projectile. Different buttons change speed and pattern.",
                        damage = 500,
                        startup = 14,
                        recovery = 22,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Fire projectile"),
                            MoveProperty("Variable", "Different patterns per button"),
                            MoveProperty("Zoning", "Good for keeping distance")
                        )
                    ),
                    Move(
                        name = "Jungle Leap",
                        input = "↓↙← + A/B/C",
                        description = "Rising sword attack with good range",
                        damage = 650,
                        startup = 8,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-air", "Strong vs jumping opponents"),
                            MoveProperty("Range", "Extended reach"),
                            MoveProperty("Priority", "High priority move")
                        )
                    ),
                    Move(
                        name = "Tribal Rush",
                        input = "→↓↘ + A/B/C",
                        description = "Rushing attack with extending sword",
                        damage = 600,
                        startup = 12,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Rush", "Quick forward movement"),
                            MoveProperty("Range", "Extended reach"),
                            MoveProperty("Safe", "Relatively safe on block")
                        )
                    ),
                    Move(
                        name = "Fire Dance",
                        input = "↓↘→ + D",
                        description = "Ritual dance that enhances next special move",
                        damage = 0,
                        startup = 15,
                        recovery = 25,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Buff", "Powers up next special"),
                            MoveProperty("Setup", "Good for mix-ups"),
                            MoveProperty("Recovery", "Long recovery time")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Inferno Dance",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple fire projectiles covering the screen",
                        damage = 1800,
                        startup = 8,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Screen Coverage", "Covers multiple angles"),
                            MoveProperty("Fire", "Sets opponent on fire")
                        )
                    ),
                    Move(
                        name = "Tribal Rage",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate combination of sword and fire attacks",
                        damage = 2200,
                        startup = 6,
                        recovery = 40,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("High Damage", "Very high damage super"),
                            MoveProperty("Invincible", "Has startup invincibility"),
                            MoveProperty("Mix-up", "Can mix-up after super")
                        )
                    )
                )
            )
        ),
        "earthquake" to CharacterDetails(
            id = "earthquake",
            name = "Earthquake",
            playstyle = "Earthquake is a massive ninja who uses his size and chain-sickle to dominate space. His long-range attacks and command grabs make him a threatening grappler with unique zoning capabilities.",
            strengths = listOf(
                "Excellent range",
                "Strong command throws",
                "Good space control",
                "High damage output",
                "Surprisingly agile for his size"
            ),
            weaknesses = listOf(
                "Large target",
                "Slow movement",
                "Some moves are unsafe",
                "Can be zoned out"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "Light Slash",
                        input = "A",
                        description = "Quick chain-sickle swing",
                        damage = 400,
                        startup = 7,
                        recovery = 12,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Medium Slash",
                        input = "B",
                        description = "Mid-range chain attack",
                        damage = 600,
                        startup = 9,
                        recovery = 15,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Heavy Slash",
                        input = "C",
                        description = "Strong overhead chain swing",
                        damage = 800,
                        startup = 13,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "Kick",
                        input = "D",
                        description = "Quick belly bump",
                        damage = 350,
                        startup = 6,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Chain Extension",
                        input = "→ + B",
                        description = "Extended chain attack with long range",
                        damage = 650,
                        startup = 15,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "Belly Drop",
                        input = "→ + C",
                        description = "Jumping body attack",
                        damage = 750,
                        startup = 20,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Chain Toss",
                        input = "↓↘→ + A/B/C",
                        description = "Throws chain-sickle as projectile. Different buttons change angle.",
                        damage = 500,
                        startup = 14,
                        recovery = 22,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Chain projectile"),
                            MoveProperty("Variable", "Different angles per button"),
                            MoveProperty("Range", "Excellent range")
                        )
                    ),
                    Move(
                        name = "Rising Chain",
                        input = "↓↙← + A/B/C",
                        description = "Rising chain attack with good anti-air properties",
                        damage = 650,
                        startup = 8,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-air", "Strong vs jumping opponents"),
                            MoveProperty("Range", "Extended vertical reach"),
                            MoveProperty("Priority", "High priority move")
                        )
                    ),
                    Move(
                        name = "Belly Flop",
                        input = "→↓↘ + A/B/C",
                        description = "Jumping body slam attack",
                        damage = 700,
                        startup = 16,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Guard Break", "Can break guard"),
                            MoveProperty("Impact", "Ground bounce on hit")
                        )
                    ),
                    Move(
                        name = "Chain Grab",
                        input = "↓↘→ + D",
                        description = "Command grab with chain",
                        damage = 800,
                        startup = 5,
                        recovery = 30,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Command Grab", "Unblockable throw"),
                            MoveProperty("Range", "Good grab range"),
                            MoveProperty("Setup", "Good okizeme after throw")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Earthquake Slam",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple chain attacks followed by massive body slam",
                        damage = 1800,
                        startup = 8,
                        recovery = 35,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Guard Break", "Can break guard"),
                            MoveProperty("Range", "Full screen range")
                        )
                    ),
                    Move(
                        name = "Giant's Rage",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate combination of chain attacks and body slams",
                        damage = 2200,
                        startup = 6,
                        recovery = 40,
                        onBlock = -18,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("High Damage", "Very high damage super"),
                            MoveProperty("Invincible", "Has startup invincibility"),
                            MoveProperty("Mix-up", "Can mix-up after super")
                        )
                    )
                )
            )
        )
    )
} 