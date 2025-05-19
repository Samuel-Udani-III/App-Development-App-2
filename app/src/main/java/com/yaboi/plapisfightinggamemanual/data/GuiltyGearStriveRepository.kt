package com.yaboi.plapisfightinggamemanual.data

object GuiltyGearStriveRepository {
    fun getCharacterDetails(characterId: String): CharacterDetails? {
        return characterData[characterId]
    }

    private val characterData = mapOf(
        "sol" to CharacterDetails(
            id = "sol",
            name = "Sol Badguy",
            playstyle = "Sol is an aggressive rushdown character with high damage potential. He excels at close-range combat and has excellent pressure tools. His moves are generally simple to execute but offer great reward.",
            strengths = listOf(
                "High damage output",
                "Strong pressure tools",
                "Good mix-up potential",
                "Excellent anti-air options",
                "Strong defensive options with backdash and DP"
            ),
            weaknesses = listOf(
                "Limited range on normal attacks",
                "Can be outspaced by zoners",
                "Some moves are unsafe on block",
                "Requires good reads to maximize damage"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "5P",
                        input = "P",
                        description = "Quick poke with scalpel. Good for interrupting and pressure.",
                        damage = 25,
                        startup = 5,
                        recovery = 9,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Gatling", "Can chain into itself and other P moves"),
                            MoveProperty("Range", "Good range for a jab"),
                            MoveProperty("Speed", "Fast startup")
                        ),
                        counterHitEffect = "Allows for stronger pressure routes",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good pressure tool when Fast RC'd"
                        )
                    ),
                    Move(
                        name = "5K",
                        input = "K",
                        description = "Long-range low kick. Great for poking and neutral.",
                        damage = 28,
                        startup = 7,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low Hit", "Hits low, good for mix-ups"),
                            MoveProperty("Range", "Excellent range"),
                            MoveProperty("Gatling", "Can chain into most normals")
                        ),
                        counterHitEffect = "Allows for stronger follow-ups",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good neutral tool with Fast RC"
                        )
                    ),
                    Move(
                        name = "c.S",
                        input = "Close S",
                        description = "Strong close-range scalpel swing. Primary combo starter.",
                        damage = 38,
                        startup = 7,
                        recovery = 13,
                        onBlock = +2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Plus Frames", "Advantageous on block"),
                            MoveProperty("Gatling", "Can chain into most moves"),
                            MoveProperty("Range", "Good range for a close slash")
                        ),
                        counterHitEffect = "Launches for extended combos",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 3,
                            redRcLevel = 3,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Core pressure and combo tool with any RC"
                        )
                    ),
                    Move(
                        name = "f.S",
                        input = "Far S",
                        description = "Long-range poke with good reach",
                        damage = 36,
                        startup = 10,
                        recovery = 16,
                        onBlock = -7,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "5H",
                        input = "H",
                        description = "Heavy slash with great damage and range",
                        damage = 45,
                        startup = 11,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "2P",
                        input = "↓ + P",
                        description = "Low hitting punch, good for pressure",
                        damage = 22,
                        startup = 5,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "2K",
                        input = "↓ + K",
                        description = "Low sweep, good for mix-ups",
                        damage = 24,
                        startup = 6,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "2S",
                        input = "↓ + S",
                        description = "Low hitting slash with good range",
                        damage = 32,
                        startup = 10,
                        recovery = 18,
                        onBlock = -7,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "2H",
                        input = "↓ + H",
                        description = "Strong low attack, launcher",
                        damage = 40,
                        startup = 12,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "j.P",
                        input = "Jump P",
                        description = "Quick air jab",
                        damage = 20,
                        startup = 5,
                        recovery = 9,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "j.K",
                        input = "Jump K",
                        description = "Air kick with good range",
                        damage = 25,
                        startup = 7,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "j.S",
                        input = "Jump S",
                        description = "Air slash, good for pressure",
                        damage = 30,
                        startup = 8,
                        recovery = 14,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "j.H",
                        input = "Jump H",
                        description = "Strong air attack",
                        damage = 35,
                        startup = 10,
                        recovery = 16,
                        onBlock = -6,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "j.D",
                        input = "Jump D",
                        description = "Air dust attack, overhead",
                        damage = 45,
                        startup = 15,
                        recovery = 20,
                        onBlock = -8,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "6P",
                        input = "→ + P",
                        description = "Anti-air attack with upper body invulnerability",
                        damage = 32,
                        startup = 9,
                        recovery = 20,
                        onBlock = -7,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "6S",
                        input = "→ + S",
                        description = "Long-range poke that can be special cancelled",
                        damage = 38,
                        startup = 12,
                        recovery = 22,
                        onBlock = -9,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "6H",
                        input = "→ + H",
                        description = "Forward moving heavy slash",
                        damage = 45,
                        startup = 14,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "2D",
                        input = "↓ + D",
                        description = "Low dust attack, sweep",
                        damage = 40,
                        startup = 12,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "5D",
                        input = "D",
                        description = "Universal overhead",
                        damage = 50,
                        startup = 20,
                        recovery = 26,
                        onBlock = -15,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Gun Flame",
                        input = "236 + S",
                        description = "Projectile attack that travels along the ground. Can be RC'd for mix-ups.",
                        damage = 45,
                        startup = 20,
                        recovery = 24,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Can be used for zoning"),
                            MoveProperty("Ground Fire", "Hits low"),
                            MoveProperty("Charged Version", "Hold S for stronger version")
                        ),
                        guardCrush = false,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 3,
                            redRcLevel = 2,
                            purpleRcLevel = 3,
                            blueRcLevel = 2,
                            rcNotes = "Excellent for mix-ups with Fast RC, strong pressure with Purple RC"
                        )
                    ),
                    Move(
                        name = "Volcanic Viper",
                        input = "623 + S/H",
                        description = "Invincible reversal attack, great anti-air. H version does more damage.",
                        damage = 50,
                        startup = 7,
                        recovery = 29,
                        onBlock = -23,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Invincible", "Frame 1-7 upper body invincibility"),
                            MoveProperty("Two Versions", "S and H versions available"),
                            MoveProperty("Anti-Air", "Strong vs jumping opponents")
                        ),
                        guardCrush = false,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 1,
                            redRcLevel = 3,
                            purpleRcLevel = 1,
                            blueRcLevel = 3,
                            rcNotes = "Essential to RC on block, great combo extender with Red RC"
                        )
                    ),
                    Move(
                        name = "Bandit Revolver",
                        input = "236 + K",
                        description = "Spinning aerial attack, good for pressure",
                        damage = 42,
                        startup = 11,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Wild Throw",
                        input = "623 + D",
                        description = "Command grab that leads to knockdown",
                        damage = 80,
                        startup = 6,
                        recovery = 31,
                        onBlock = 0,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Night Raid Vortex",
                        input = "214 + S",
                        description = "Spinning kick attack with follow-up options. Good for pressure.",
                        damage = 45,
                        startup = 16,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Follow-up", "Can be followed with additional attacks"),
                            MoveProperty("Side Switch", "Can cross-up opponent"),
                            MoveProperty("Momentum", "Maintains forward momentum")
                        ),
                        guardCrush = false,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good for mix-ups with Fast RC, decent combo filler"
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Heavy Mob Cemetery",
                        input = "632146 + H",
                        description = "Level 1 super, multi-hitting attack with good damage and corner carry.",
                        damage = 160,
                        startup = 11,
                        recovery = 30,
                        onBlock = -19,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Wall Break", "Can break wall for extra damage"),
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Corner Carry", "Pushes opponent towards corner")
                        ),
                        guardCrush = true,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 1,
                            redRcLevel = 2,
                            purpleRcLevel = 1,
                            blueRcLevel = 1,
                            rcNotes = "Can RC for corner carry and wall break setups"
                        )
                    ),
                    Move(
                        name = "Tyrant Rave",
                        input = "236236 + H",
                        description = "Level 2 super, powerful finishing move",
                        damage = 200,
                        startup = 13,
                        recovery = 35,
                        onBlock = -24,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "ky" to CharacterDetails(
            id = "ky",
            name = "Ky Kiske",
            playstyle = "Ky is a well-rounded character with strong fundamentals. He excels at mid-range combat with his projectiles and long-reaching normals. His balanced toolkit makes him great for learning the game.",
            strengths = listOf(
                "Excellent mid-range control",
                "Strong projectile game",
                "Good mix-up potential with Dire Eclat",
                "Solid defensive options",
                "Easy to learn fundamentals"
            ),
            weaknesses = listOf(
                "Somewhat limited damage without meter",
                "Can struggle against aggressive pressure",
                "Requires good spacing knowledge",
                "Some moves have significant recovery"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "5P",
                        input = "P",
                        description = "Quick poke with scalpel. Good for interrupting and pressure.",
                        damage = 25,
                        startup = 5,
                        recovery = 9,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Gatling", "Can chain into itself and other P moves"),
                            MoveProperty("Range", "Good range for a jab"),
                            MoveProperty("Speed", "Fast startup")
                        ),
                        counterHitEffect = "Allows for stronger pressure routes",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good pressure tool when Fast RC'd"
                        )
                    ),
                    Move(
                        name = "5K",
                        input = "K",
                        description = "Long-range low kick. Great for poking and neutral.",
                        damage = 28,
                        startup = 7,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low Hit", "Hits low, good for mix-ups"),
                            MoveProperty("Range", "Excellent range"),
                            MoveProperty("Gatling", "Can chain into most normals")
                        ),
                        counterHitEffect = "Allows for stronger follow-ups",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good neutral tool with Fast RC"
                        )
                    ),
                    Move(
                        name = "c.S",
                        input = "Close S",
                        description = "Strong close-range scalpel swing. Primary combo starter.",
                        damage = 38,
                        startup = 7,
                        recovery = 13,
                        onBlock = +2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Plus Frames", "Advantageous on block"),
                            MoveProperty("Gatling", "Can chain into most moves"),
                            MoveProperty("Range", "Good range for a close slash")
                        ),
                        counterHitEffect = "Launches for extended combos",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 3,
                            redRcLevel = 3,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Core pressure and combo tool with any RC"
                        )
                    ),
                    Move(
                        name = "f.S",
                        input = "Far S",
                        description = "Long-range poke with great reach",
                        damage = 32,
                        startup = 9,
                        recovery = 17,
                        onBlock = -7,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "2P",
                        input = "↓ + P",
                        description = "Low hitting punch",
                        damage = 20,
                        startup = 5,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "2K",
                        input = "↓ + K",
                        description = "Low sweep",
                        damage = 24,
                        startup = 6,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "2S",
                        input = "↓ + S",
                        description = "Low hitting slash",
                        damage = 30,
                        startup = 9,
                        recovery = 16,
                        onBlock = -6,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "2H",
                        input = "↓ + H",
                        description = "Low launcher",
                        damage = 38,
                        startup = 11,
                        recovery = 22,
                        onBlock = -9,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "6P",
                        input = "→ + P",
                        description = "Anti-air punch",
                        damage = 30,
                        startup = 9,
                        recovery = 20,
                        onBlock = -7,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "6K",
                        input = "→ + K",
                        description = "Forward moving kick",
                        damage = 35,
                        startup = 15,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.COMMAND_NORMAL
                    ),
                    Move(
                        name = "6H",
                        input = "→ + H",
                        description = "Long range heavy slash",
                        damage = 42,
                        startup = 14,
                        recovery = 24,
                        onBlock = -10,
                        type = MoveType.COMMAND_NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Stun Edge",
                        input = "236 + S",
                        description = "Lightning projectile, cornerstone of Ky's neutral game. Can be charged.",
                        damage = 35,
                        startup = 19,
                        recovery = 23,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Long-range zoning tool"),
                            MoveProperty("Chargeable", "Hold S for stronger version"),
                            MoveProperty("Shock State", "Applies shock state on hit")
                        ),
                        guardCrush = false,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 3,
                            redRcLevel = 2,
                            purpleRcLevel = 3,
                            blueRcLevel = 2,
                            rcNotes = "Excellent approach tool with Fast RC, good pressure with Purple RC"
                        )
                    ),
                    Move(
                        name = "Vapor Thrust",
                        input = "623 + S/H",
                        description = "Anti-air dragon punch with invincibility. H version has more damage and height.",
                        damage = 45,
                        startup = 7,
                        recovery = 29,
                        onBlock = -23,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Invincible", "Upper body invincibility on startup"),
                            MoveProperty("Two Versions", "S and H versions available"),
                            MoveProperty("Shock State", "Applies shock state on hit")
                        ),
                        guardCrush = false,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 1,
                            redRcLevel = 3,
                            purpleRcLevel = 1,
                            blueRcLevel = 3,
                            rcNotes = "Must RC on block, great combo extender with Red RC"
                        )
                    ),
                    Move(
                        name = "Dire Eclat",
                        input = "236 + H",
                        description = "Rushing slash attack with overhead properties. Key mix-up tool.",
                        damage = 40,
                        startup = 15,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked standing"),
                            MoveProperty("Forward Movement", "Advances towards opponent"),
                            MoveProperty("Shock State", "Applies shock state on hit")
                        ),
                        guardCrush = false,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good mix-up tool with Fast RC"
                        )
                    ),
                    Move(
                        name = "Charged Stun Edge",
                        input = "[236] + S",
                        description = "Charged version of Stun Edge",
                        damage = 45,
                        startup = 28,
                        recovery = 25,
                        onBlock = -2,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Foudre Arc",
                        input = "214 + K",
                        description = "Jumping kick attack",
                        damage = 38,
                        startup = 15,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Ride the Lightning",
                        input = "632146 + H",
                        description = "Level 1 super, rushing lightning attack with good corner carry.",
                        damage = 150,
                        startup = 11,
                        recovery = 31,
                        onBlock = -19,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Wall Break", "Can break wall for extra damage"),
                            MoveProperty("Shock State", "Applies shock state on hit"),
                            MoveProperty("Corner Carry", "Strong corner carry potential")
                        ),
                        guardCrush = true,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 1,
                            redRcLevel = 2,
                            purpleRcLevel = 1,
                            blueRcLevel = 1,
                            rcNotes = "Can RC for corner carry and wall break setups"
                        )
                    ),
                    Move(
                        name = "Sacred Edge",
                        input = "236236 + H",
                        description = "Level 2 super, massive lightning projectile with huge damage.",
                        damage = 180,
                        startup = 13,
                        recovery = 35,
                        onBlock = -22,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Full Screen", "Travels full screen distance"),
                            MoveProperty("Shock State", "Applies shock state on hit"),
                            MoveProperty("High Damage", "One of Ky's highest damage moves")
                        ),
                        guardCrush = true,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 1,
                            redRcLevel = 1,
                            purpleRcLevel = 1,
                            blueRcLevel = 1,
                            rcNotes = "Rarely useful to RC due to recovery"
                        )
                    )
                )
            )
        ),
        "may" to CharacterDetails(
            id = "may",
            name = "May",
            playstyle = "May is an aggressive character with strong mix-up potential and high damage output. She excels at controlling space with her dolphins and anchor attacks, while having access to powerful command grabs.",
            strengths = listOf(
                "High damage output",
                "Strong mix-up game",
                "Good projectiles with dolphins",
                "Command grab options",
                "Simple but effective gameplan"
            ),
            weaknesses = listOf(
                "Can be predictable",
                "Struggles against long-range zoners",
                "Limited defensive options",
                "Most moves have significant recovery"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "5P",
                        input = "P",
                        description = "Quick jab",
                        damage = 24,
                        startup = 5,
                        recovery = 9,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "5K",
                        input = "K",
                        description = "Quick kick",
                        damage = 26,
                        startup = 7,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "c.S",
                        input = "Close S",
                        description = "Close-range anchor swing",
                        damage = 38,
                        startup = 7,
                        recovery = 13,
                        onBlock = +2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Mr. Dolphin Horizontal",
                        input = "236 + S",
                        description = "Horizontal dolphin attack",
                        damage = 45,
                        startup = 14,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Projectile", "Moves forward quickly"),
                            MoveProperty("Plus Frames", "Can be plus on block"),
                            MoveProperty("Pressure", "Good pressure tool")
                        )
                    ),
                    Move(
                        name = "Mr. Dolphin Vertical",
                        input = "623 + S",
                        description = "Vertical dolphin attack",
                        damage = 50,
                        startup = 11,
                        recovery = 24,
                        onBlock = -12,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Beach Time",
                        input = "214 + K",
                        description = "Command grab",
                        damage = 70,
                        startup = 6,
                        recovery = 31,
                        onBlock = 0,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Great Yamada Attack",
                        input = "632146 + H",
                        description = "Level 1 super, multiple dolphin attacks",
                        damage = 130,
                        startup = 11,
                        recovery = 30,
                        onBlock = -19,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "The Wonderful and Dynamic Goshogawara",
                        input = "236236 + H",
                        description = "Level 2 super, massive anchor attack",
                        damage = 170,
                        startup = 13,
                        recovery = 35,
                        onBlock = -24,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "chipp" to CharacterDetails(
            id = "chipp",
            name = "Chipp Zanuff",
            playstyle = "Chipp is the fastest character in the game with incredible mobility and mix-up potential. He excels at overwhelming opponents with his speed and tricky cross-ups, but has very low health as a trade-off.",
            strengths = listOf(
                "Fastest character in the game",
                "Excellent mix-up potential",
                "Strong pressure tools",
                "Great mobility options",
                "Quick normals with good frame advantage"
            ),
            weaknesses = listOf(
                "Lowest health in the game",
                "Takes increased damage",
                "Requires precise execution",
                "Risky gameplay style"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "5P",
                        input = "P",
                        description = "Quick poke with scalpel. Good for interrupting and pressure.",
                        damage = 25,
                        startup = 5,
                        recovery = 9,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Gatling", "Can chain into itself and other P moves"),
                            MoveProperty("Range", "Good range for a jab"),
                            MoveProperty("Speed", "Fast startup")
                        ),
                        counterHitEffect = "Allows for stronger pressure routes",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good pressure tool when Fast RC'd"
                        )
                    ),
                    Move(
                        name = "5K",
                        input = "K",
                        description = "Long-range low kick. Great for poking and neutral.",
                        damage = 28,
                        startup = 7,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low Hit", "Hits low, good for mix-ups"),
                            MoveProperty("Range", "Excellent range"),
                            MoveProperty("Gatling", "Can chain into most normals")
                        ),
                        counterHitEffect = "Allows for stronger follow-ups",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good neutral tool with Fast RC"
                        )
                    ),
                    Move(
                        name = "c.S",
                        input = "Close S",
                        description = "Strong close-range scalpel swing. Primary combo starter.",
                        damage = 38,
                        startup = 7,
                        recovery = 13,
                        onBlock = +2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Plus Frames", "Advantageous on block"),
                            MoveProperty("Gatling", "Can chain into most moves"),
                            MoveProperty("Range", "Good range for a close slash")
                        ),
                        counterHitEffect = "Launches for extended combos",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 3,
                            redRcLevel = 3,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Core pressure and combo tool with any RC"
                        )
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "6P",
                        input = "→ + P",
                        description = "Anti-air with upper body invulnerability. Essential defensive tool.",
                        damage = 28,
                        startup = 8,
                        recovery = 19,
                        onBlock = -7,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Upper Invuln", "Upper body invulnerability"),
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("Fast Recovery", "Quick recovery on whiff")
                        ),
                        counterHitEffect = "Launches for juggle combos",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 3,
                            purpleRcLevel = 1,
                            blueRcLevel = 2,
                            rcNotes = "Good combo starter with Red RC on counter hit"
                        )
                    ),
                    Move(
                        name = "2H",
                        input = "↓ + H",
                        description = "Low hitting sweep, launches on counter hit. Great combo tool.",
                        damage = 40,
                        startup = 11,
                        recovery = 22,
                        onBlock = -13,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Low Hit", "Hits low"),
                            MoveProperty("Launch", "Launches on counter hit"),
                            MoveProperty("Range", "Good horizontal range")
                        ),
                        counterHitEffect = "Launches for big damage combos",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 1,
                            redRcLevel = 3,
                            purpleRcLevel = 1,
                            blueRcLevel = 2,
                            rcNotes = "Excellent combo starter with Red RC on counter hit"
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Alpha Blade",
                        input = "236 + S",
                        description = "Fast horizontal dash attack",
                        damage = 40,
                        startup = 12,
                        recovery = 16,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Cross-up", "Can cross-up opponent"),
                            MoveProperty("Fast", "Very quick startup"),
                            MoveProperty("Mix-up", "Good for mix-ups")
                        )
                    ),
                    Move(
                        name = "Beta Blade",
                        input = "214 + S",
                        description = "Diagonal kick attack",
                        damage = 45,
                        startup = 14,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Gamma Blade",
                        input = "623 + S",
                        description = "Rising sword attack",
                        damage = 50,
                        startup = 11,
                        recovery = 24,
                        onBlock = -12,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Resshou",
                        input = "236 + K",
                        description = "Command dash",
                        damage = 0,
                        startup = 16,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Zansei Rouga",
                        input = "632146 + H",
                        description = "Level 1 super, multi-hit rushing attack",
                        damage = 130,
                        startup = 11,
                        recovery = 30,
                        onBlock = -19,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Senshuu",
                        input = "236236 + H",
                        description = "Level 2 super, powerful ninja technique",
                        damage = 170,
                        startup = 13,
                        recovery = 35,
                        onBlock = -24,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "millia" to CharacterDetails(
            id = "millia",
            name = "Millia Rage",
            playstyle = "Millia is a mix-up heavy character who excels at setting up devastating okizeme situations. She uses her hair-based attacks and aerial mobility to create powerful offensive pressure.",
            strengths = listOf(
                "Strong okizeme game",
                "Excellent mix-up potential",
                "Great air mobility",
                "Fast normal attacks",
                "Strong corner pressure"
            ),
            weaknesses = listOf(
                "Low health",
                "Weak defensive options",
                "Requires strong execution",
                "Struggles against zoners"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "5P",
                        input = "P",
                        description = "Quick poke with scalpel. Good for interrupting and pressure.",
                        damage = 25,
                        startup = 5,
                        recovery = 9,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Gatling", "Can chain into itself and other P moves"),
                            MoveProperty("Range", "Good range for a jab"),
                            MoveProperty("Speed", "Fast startup")
                        ),
                        counterHitEffect = "Allows for stronger pressure routes",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good pressure tool when Fast RC'd"
                        )
                    ),
                    Move(
                        name = "5K",
                        input = "K",
                        description = "Long-range low kick. Great for poking and neutral.",
                        damage = 28,
                        startup = 7,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low Hit", "Hits low, good for mix-ups"),
                            MoveProperty("Range", "Excellent range"),
                            MoveProperty("Gatling", "Can chain into most normals")
                        ),
                        counterHitEffect = "Allows for stronger follow-ups",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good neutral tool with Fast RC"
                        )
                    ),
                    Move(
                        name = "c.S",
                        input = "Close S",
                        description = "Strong close-range scalpel swing. Primary combo starter.",
                        damage = 38,
                        startup = 7,
                        recovery = 13,
                        onBlock = +2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Plus Frames", "Advantageous on block"),
                            MoveProperty("Gatling", "Can chain into most moves"),
                            MoveProperty("Range", "Good range for a close slash")
                        ),
                        counterHitEffect = "Launches for extended combos",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 3,
                            redRcLevel = 3,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Core pressure and combo tool with any RC"
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Tandem Top",
                        input = "236 + S",
                        description = "Hair projectile that sets up mix-ups. Core oki tool.",
                        damage = 35,
                        startup = 15,
                        recovery = 20,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Oki", "Excellent okizeme tool"),
                            MoveProperty("Mix-up", "Sets up high/low mix-ups"),
                            MoveProperty("Projectile", "Can be used for pressure")
                        ),
                        guardCrush = false,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 3,
                            redRcLevel = 2,
                            purpleRcLevel = 3,
                            blueRcLevel = 2,
                            rcNotes = "Excellent mix-up tool with Fast RC, strong pressure with Purple RC"
                        )
                    ),
                    Move(
                        name = "Bad Moon",
                        input = "214 + S",
                        description = "Overhead attack with follow-ups. Key mix-up tool.",
                        damage = 40,
                        startup = 20,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Overhead", "Must be blocked high"),
                            MoveProperty("Follow-up", "Can be followed with other moves"),
                            MoveProperty("Air OK", "Can be done in air")
                        ),
                        guardCrush = false,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good mix-up tool with Fast RC"
                        )
                    ),
                    Move(
                        name = "Iron Savior",
                        input = "623 + S",
                        description = "Rising hair attack, excellent anti-air and combo tool.",
                        damage = 45,
                        startup = 9,
                        recovery = 25,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("Invincible", "Upper body invulnerability"),
                            MoveProperty("Juggle", "Good for juggle combos")
                        ),
                        guardCrush = false,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 1,
                            redRcLevel = 3,
                            purpleRcLevel = 1,
                            blueRcLevel = 2,
                            rcNotes = "Great combo extender with Red RC"
                        )
                    ),
                    Move(
                        name = "Lust Shaker",
                        input = "236 + P",
                        description = "Multi-hitting rush attack. Great for pressure and chip damage.",
                        damage = 50,
                        startup = 11,
                        recovery = 18,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Chip", "Good chip damage"),
                            MoveProperty("Cancel", "Can cancel early")
                        ),
                        guardCrush = false,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good pressure tool with any RC"
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Winger",
                        input = "632146 + H",
                        description = "Level 1 super, multi-hitting hair attack with good corner carry.",
                        damage = 140,
                        startup = 11,
                        recovery = 30,
                        onBlock = -19,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Multi-hit", "Hits multiple times"),
                            MoveProperty("Corner Carry", "Strong corner carry"),
                            MoveProperty("Wall Break", "Can break wall for extra damage")
                        ),
                        guardCrush = true,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 1,
                            redRcLevel = 2,
                            purpleRcLevel = 1,
                            blueRcLevel = 1,
                            rcNotes = "Can RC for corner carry and wall break setups"
                        )
                    ),
                    Move(
                        name = "Iron Maiden",
                        input = "236236 + H",
                        description = "Level 2 super, creates a deadly hair cage with huge damage.",
                        damage = 170,
                        startup = 13,
                        recovery = 35,
                        onBlock = -24,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("High Damage", "One of Millia's highest damage moves"),
                            MoveProperty("Wall Break", "Guaranteed wall break on hit"),
                            MoveProperty("Oki", "Great okizeme after hit")
                        ),
                        guardCrush = true,
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 1,
                            redRcLevel = 1,
                            purpleRcLevel = 1,
                            blueRcLevel = 1,
                            rcNotes = "Rarely useful to RC due to recovery and damage"
                        )
                    )
                )
            )
        ),
        "zato" to CharacterDetails(
            id = "zato",
            name = "Zato-1",
            playstyle = "Zato-1 is a technical character who fights alongside his shadow Eddie. He excels at overwhelming opponents with simultaneous attacks from both himself and Eddie, creating complex mix-up situations.",
            strengths = listOf(
                "Strong pressure with Eddie",
                "Complex mix-up game",
                "Can attack from multiple angles",
                "Excellent corner control",
                "High damage potential"
            ),
            weaknesses = listOf(
                "Very execution heavy",
                "Requires Eddie resource management",
                "Weak without Eddie",
                "Complex inputs required"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "5P",
                        input = "P",
                        description = "Quick jab with good range. Essential for defense and pressure.",
                        damage = 30,
                        startup = 5,
                        recovery = 10,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Gatling", "Can chain into itself and other P moves"),
                            MoveProperty("Range", "Good range for a jab"),
                            MoveProperty("High Damage", "Strong damage for a jab")
                        ),
                        counterHitEffect = "Allows for stronger pressure routes",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Good pressure tool when Fast RC'd"
                        )
                    ),
                    Move(
                        name = "5K",
                        input = "K",
                        description = "Strong kick with good range. Great for neutral control.",
                        damage = 35,
                        startup = 8,
                        recovery = 14,
                        onBlock = -4,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Range", "Long reach"),
                            MoveProperty("Gatling", "Can chain into most normals"),
                            MoveProperty("High Damage", "Strong damage for a normal")
                        ),
                        counterHitEffect = "Allows for stronger follow-ups",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 2,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Decent pressure tool with Fast RC"
                        )
                    ),
                    Move(
                        name = "c.S",
                        input = "Close S",
                        description = "Powerful close-range punch. Primary combo starter with huge damage.",
                        damage = 45,
                        startup = 7,
                        recovery = 15,
                        onBlock = +2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Plus Frames", "Advantageous on block"),
                            MoveProperty("High Damage", "Very high damage for a normal"),
                            MoveProperty("Gatling", "Can chain into most moves")
                        ),
                        counterHitEffect = "Launches for devastating combos",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 3,
                            redRcLevel = 3,
                            purpleRcLevel = 2,
                            blueRcLevel = 2,
                            rcNotes = "Core pressure and combo tool with any RC"
                        )
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "6P",
                        input = "→ + P",
                        description = "Anti-air with upper body invulnerability. Essential defensive tool.",
                        damage = 35,
                        startup = 9,
                        recovery = 20,
                        onBlock = -7,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Upper Invuln", "Upper body invulnerability"),
                            MoveProperty("Anti-Air", "Strong vs jumping opponents"),
                            MoveProperty("High Damage", "Good damage for an anti-air")
                        ),
                        counterHitEffect = "Launches for juggle combos",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 2,
                            redRcLevel = 3,
                            purpleRcLevel = 1,
                            blueRcLevel = 2,
                            rcNotes = "Good combo starter with Red RC on counter hit"
                        )
                    ),
                    Move(
                        name = "Heat Knuckle",
                        input = "6H",
                        description = "Armored forward-moving punch. Great for approaching through attacks.",
                        damage = 50,
                        startup = 28,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Armor", "Has armor during startup"),
                            MoveProperty("Forward Move", "Moves forward during attack"),
                            MoveProperty("High Damage", "Very high damage")
                        ),
                        counterHitEffect = "Wallsplats opponent",
                        rcProperties = RomanCancelProperties(
                            fastRcLevel = 1,
                            redRcLevel = 2,
                            purpleRcLevel = 1,
                            blueRcLevel = 2,
                            rcNotes = "Can RC to make safe or continue pressure"
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Potemkin Buster",
                        input = "632146 + P",
                        description = "Signature command grab with huge damage. Core of Potemkin's gameplan.",
                        damage = 170,
                        startup = 5,
                        recovery = 31,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Command Grab", "Unblockable throw"),
                            MoveProperty("High Damage", "Highest damage command grab"),
                            MoveProperty("Oki", "Great okizeme after hit")
                        )
                    ),
                    Move(
                        name = "Hammer Fall",
                        input = "[4]6 + S",
                        description = "Charging forward attack with armor",
                        damage = 45,
                        startup = 29,
                        recovery = 20,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Armor", "Has armor during charge"),
                            MoveProperty("Break", "Can break through attacks"),
                            MoveProperty("Chargeable", "Can be charged for more damage")
                        )
                    ),
                    Move(
                        name = "Heat Knuckle",
                        input = "623 + H",
                        description = "Anti-air command grab",
                        damage = 120,
                        startup = 11,
                        recovery = 31,
                        onBlock = -23,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Slide Head",
                        input = "236 + K",
                        description = "Low-hitting slide attack",
                        damage = 40,
                        startup = 20,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Mega Fist",
                        input = "236 + P",
                        description = "Forward-moving punch attack",
                        damage = 45,
                        startup = 16,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Giganter Kai",
                        input = "632146 + H",
                        description = "Level 1 super, creates a barrier that absorbs projectiles",
                        damage = 0,
                        startup = 11,
                        recovery = 30,
                        onBlock = 0,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Heavy Mob Cemetery",
                        input = "236236 + H",
                        description = "Level 2 super, devastating command grab",
                        damage = 200,
                        startup = 13,
                        recovery = 35,
                        onBlock = -24,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "axl" to CharacterDetails(
            id = "axl",
            name = "Axl Low",
            playstyle = "Axl is a zoner who excels at keeping opponents away with his chain weapons. He has the longest range in the game and strong defensive options, but struggles up close.",
            strengths = listOf(
                "Best range in the game",
                "Strong zoning tools",
                "Good anti-air options",
                "Can control neutral well",
                "Time manipulation abilities"
            ),
            weaknesses = listOf(
                "Weak close-range options",
                "Limited defensive options",
                "Struggles against rushdown",
                "Poor wake-up options"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "5P",
                        input = "P",
                        description = "Quick jab",
                        damage = 24,
                        startup = 5,
                        recovery = 9,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "5K",
                        input = "K",
                        description = "Long-range kick",
                        damage = 28,
                        startup = 8,
                        recovery = 14,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "c.S",
                        input = "Close S",
                        description = "Close-range chain attack",
                        damage = 36,
                        startup = 7,
                        recovery = 13,
                        onBlock = +2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Rensen",
                        input = "236 + S",
                        description = "Chain attack that can be followed up",
                        damage = 40,
                        startup = 14,
                        recovery = 18,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Range", "Excellent range"),
                            MoveProperty("Follow-up", "Can be followed up"),
                            MoveProperty("Pressure", "Good pressure tool")
                        )
                    ),
                    Move(
                        name = "Winter Mantis",
                        input = "214 + S",
                        description = "Low hitting chain attack",
                        damage = 35,
                        startup = 16,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Rainwater",
                        input = "623 + H",
                        description = "Anti-air chain attack",
                        damage = 45,
                        startup = 11,
                        recovery = 24,
                        onBlock = -12,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "One Vision",
                        input = "214 + H",
                        description = "Time stop ability",
                        damage = 0,
                        startup = 28,
                        recovery = 30,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Time Stop", "Stops time briefly"),
                            MoveProperty("Setup", "Great for setups"),
                            MoveProperty("Unique", "Unique mechanic")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Sickle Storm",
                        input = "632146 + H",
                        description = "Level 1 super, multiple chain attacks",
                        damage = 130,
                        startup = 11,
                        recovery = 30,
                        onBlock = -19,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Axis Time Stop",
                        input = "236236 + H",
                        description = "Level 2 super, stops time for massive damage",
                        damage = 170,
                        startup = 13,
                        recovery = 35,
                        onBlock = -24,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "ramlethal" to CharacterDetails(
            id = "ramlethal",
            name = "Ramlethal Valentine",
            playstyle = "Ramlethal is a powerful fighter who controls two massive swords for devastating corner pressure. She excels at controlling space and setting up powerful mix-up situations.",
            strengths = listOf(
                "Strong corner pressure",
                "Excellent range with swords",
                "Good mix-up potential",
                "High damage output",
                "Strong neutral game"
            ),
            weaknesses = listOf(
                "Complex sword management",
                "Vulnerable without swords",
                "Some moves have long recovery",
                "Can be rushed down when swordless"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "5P",
                        input = "P",
                        description = "Quick close-range punch",
                        damage = 25,
                        startup = 5,
                        recovery = 9,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "5K",
                        input = "K",
                        description = "Fast low kick",
                        damage = 28,
                        startup = 7,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "c.S",
                        input = "Close S",
                        description = "Strong close-range sword swing",
                        damage = 40,
                        startup = 7,
                        recovery = 13,
                        onBlock = +2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Bajoneto",
                        input = "236 + S",
                        description = "Sword throw attack",
                        damage = 45,
                        startup = 15,
                        recovery = 20,
                        onBlock = -4,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Dauro",
                        input = "623 + S",
                        description = "Rising sword attack",
                        damage = 50,
                        startup = 11,
                        recovery = 25,
                        onBlock = -12,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Mortobato",
                        input = "214 + H",
                        description = "Powerful sword slam",
                        damage = 60,
                        startup = 20,
                        recovery = 28,
                        onBlock = -15,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Sildo Detruo",
                        input = "214 + K",
                        description = "Sword recall attack",
                        damage = 40,
                        startup = 18,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Erarlumo",
                        input = "236 + K",
                        description = "Servant attack",
                        damage = 35,
                        startup = 16,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Calvados",
                        input = "632146 + H",
                        description = "Level 1 super, massive sword attack",
                        damage = 150,
                        startup = 11,
                        recovery = 30,
                        onBlock = -19,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Exploding Servant",
                        input = "236236 + H",
                        description = "Level 2 super, explosive servant attack",
                        damage = 180,
                        startup = 13,
                        recovery = 35,
                        onBlock = -24,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "potemkin" to CharacterDetails(
            id = "potemkin",
            name = "Potemkin",
            playstyle = "Potemkin is a powerful grappler who excels at dealing massive damage through command grabs. While slow, his armor moves and defensive options help him get in close.",
            strengths = listOf(
                "Highest damage in the game",
                "Strong command grab game",
                "Armored moves",
                "Good defensive options",
                "Excellent anti-air tools"
            ),
            weaknesses = listOf(
                "Very slow movement",
                "Large hurtbox",
                "Struggles against zoning",
                "Limited approach options"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "5P",
                        input = "P",
                        description = "Quick close-range jab",
                        damage = 26,
                        startup = 5,
                        recovery = 9,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "5K",
                        input = "K",
                        description = "Strong kick with good range",
                        damage = 30,
                        startup = 7,
                        recovery = 12,
                        onBlock = -3,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "c.S",
                        input = "Close S",
                        description = "Powerful close-range punch",
                        damage = 42,
                        startup = 7,
                        recovery = 13,
                        onBlock = +2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "f.S",
                        input = "Far S",
                        description = "Long-range punch",
                        damage = 38,
                        startup = 10,
                        recovery = 16,
                        onBlock = -7,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Potemkin Buster",
                        input = "632146 + P",
                        description = "Signature command grab with huge damage",
                        damage = 170,
                        startup = 5,
                        recovery = 31,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Command Grab", "Unblockable throw"),
                            MoveProperty("High Damage", "Highest damage command grab"),
                            MoveProperty("Oki", "Great okizeme after hit")
                        )
                    ),
                    Move(
                        name = "Hammer Fall",
                        input = "[4]6 + S",
                        description = "Charging forward attack with armor",
                        damage = 45,
                        startup = 29,
                        recovery = 20,
                        onBlock = -4,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Armor", "Has armor during charge"),
                            MoveProperty("Break", "Can break through attacks"),
                            MoveProperty("Chargeable", "Can be charged for more damage")
                        )
                    ),
                    Move(
                        name = "Heat Knuckle",
                        input = "623 + H",
                        description = "Anti-air command grab",
                        damage = 120,
                        startup = 11,
                        recovery = 31,
                        onBlock = -23,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Slide Head",
                        input = "236 + K",
                        description = "Low-hitting slide attack",
                        damage = 40,
                        startup = 20,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Mega Fist",
                        input = "236 + P",
                        description = "Forward-moving punch attack",
                        damage = 45,
                        startup = 16,
                        recovery = 20,
                        onBlock = -6,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Giganter Kai",
                        input = "632146 + H",
                        description = "Level 1 super, creates a barrier that absorbs projectiles",
                        damage = 0,
                        startup = 11,
                        recovery = 30,
                        onBlock = 0,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Heavy Mob Cemetery",
                        input = "236236 + H",
                        description = "Level 2 super, devastating command grab",
                        damage = 200,
                        startup = 13,
                        recovery = 35,
                        onBlock = -24,
                        type = MoveType.SUPER
                    )
                )
            )
        ),
        "faust" to CharacterDetails(
            id = "faust",
            name = "Faust",
            playstyle = "Faust is an unorthodox character who uses random items and long-range pokes to control the fight. His unique mix of zoning and mix-ups makes him unpredictable.",
            strengths = listOf(
                "Excellent range with scalpel",
                "Unique item throws",
                "Strong mix-up potential",
                "Good anti-air options",
                "Unpredictable gameplay"
            ),
            weaknesses = listOf(
                "Relies on RNG",
                "Some moves have long recovery",
                "Can be rushed down",
                "Complex item management"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "5P",
                        input = "P",
                        description = "Quick jab with scalpel",
                        damage = 24,
                        startup = 5,
                        recovery = 9,
                        onBlock = -2,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "5K",
                        input = "K",
                        description = "Long-range low kick",
                        damage = 28,
                        startup = 8,
                        recovery = 14,
                        onBlock = -4,
                        type = MoveType.NORMAL
                    ),
                    Move(
                        name = "c.S",
                        input = "Close S",
                        description = "Close-range scalpel swing",
                        damage = 36,
                        startup = 7,
                        recovery = 13,
                        onBlock = +2,
                        type = MoveType.NORMAL
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "What Could This Be?",
                        input = "236 + S",
                        description = "Throws random item",
                        damage = 0,
                        startup = 14,
                        recovery = 18,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Random", "Throws random items"),
                            MoveProperty("Mix-up", "Creates mix-up opportunities"),
                            MoveProperty("Zoning", "Good for controlling space")
                        )
                    ),
                    Move(
                        name = "Mix Mix Mix",
                        input = "214 + S",
                        description = "Teleport move",
                        damage = 0,
                        startup = 16,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Teleport", "Can teleport to different locations"),
                            MoveProperty("Mix-up", "Good for mix-ups"),
                            MoveProperty("Movement", "Unique movement option")
                        )
                    ),
                    Move(
                        name = "Thrust",
                        input = "623 + S",
                        description = "Rising scalpel attack",
                        damage = 45,
                        startup = 11,
                        recovery = 24,
                        onBlock = -12,
                        type = MoveType.SPECIAL
                    ),
                    Move(
                        name = "Snip Snip Snip",
                        input = "236 + K",
                        description = "Low hitting scalpel attack",
                        damage = 40,
                        startup = 18,
                        recovery = 22,
                        onBlock = -8,
                        type = MoveType.SPECIAL
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "W-W-What Could This Be?",
                        input = "632146 + H",
                        description = "Level 1 super, throws multiple items",
                        damage = 130,
                        startup = 11,
                        recovery = 30,
                        onBlock = -19,
                        type = MoveType.SUPER
                    ),
                    Move(
                        name = "Bone-crushing Excitement",
                        input = "236236 + H",
                        description = "Level 2 super, massive scalpel attack",
                        damage = 170,
                        startup = 13,
                        recovery = 35,
                        onBlock = -24,
                        type = MoveType.SUPER
                    )
                )
            )
        )
    )
} 