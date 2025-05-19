package com.yaboi.plapisfightinggamemanual.data

object TekkenRepository {
    fun getCharacterDetails(characterId: String): CharacterDetails? {
        return characterData[characterId]
    }

    private val characterData = mapOf(
        "kazuya" to CharacterDetails(
            id = "kazuya",
            name = "Kazuya Mishima",
            playstyle = "Kazuya is a powerful Mishima-style character who excels at 50/50 mixups and devastating punishes. His execution-heavy Electric Wind God Fist is central to his gameplan.",
            strengths = listOf(
                "Extremely strong punishment game",
                "Powerful 50/50 mixups",
                "High damage output",
                "Strong wavedash pressure",
                "Great comeback potential with Rage"
            ),
            weaknesses = listOf(
                "Difficult execution requirements",
                "Limited approach options",
                "Weak to sidestep left",
                "Poor tracking moves",
                "Struggles against strong keepout"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Left jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "2",
                        input = "2",
                        description = "Right punch",
                        damage = 90,
                        startup = 12,
                        recovery = 20,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "3",
                        input = "3",
                        description = "Left kick",
                        damage = 170,
                        startup = 14,
                        recovery = 23,
                        onBlock = -7,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "4",
                        input = "4",
                        description = "Right kick",
                        damage = 160,
                        startup = 12,
                        recovery = 23,
                        onBlock = -9,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "d+1",
                        input = "d+1",
                        description = "Low jab",
                        damage = 50,
                        startup = 10,
                        recovery = 19,
                        onBlock = -5,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low")
                        )
                    ),
                    Move(
                        name = "d/f+1",
                        input = "d/f+1",
                        description = "Mid punch",
                        damage = 100,
                        startup = 13,
                        recovery = 26,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Twin Pistons",
                        input = "d/f+1,2",
                        description = "Mid punch followed by uppercut",
                        damage = 200,
                        startup = 13,
                        recovery = 30,
                        onBlock = -12,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Mid, Mid", "Both hits must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Gates of Hell",
                        input = "b+1+2",
                        description = "Powerful mid punch",
                        damage = 250,
                        startup = 20,
                        recovery = 30,
                        onBlock = -14,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Zen Stance",
                        input = "f+3",
                        description = "Forward moving stance transition",
                        damage = 0,
                        startup = 12,
                        recovery = 18,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Movement", "Moves forward during transition")
                        )
                    ),
                    Move(
                        name = "Flicker Stance",
                        input = "b+2",
                        description = "Transitions to boxing Flicker stance",
                        damage = 0,
                        startup = 14,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Stance", "Boxing stance transition"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Ducking Stance",
                        input = "d/b+2",
                        description = "Transitions to ducking boxing stance",
                        damage = 0,
                        startup = 12,
                        recovery = 18,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Stance", "Boxing stance transition"),
                            MoveProperty("Evasive", "Evades high attacks")
                        )
                    ),
                    Move(
                        name = "Peekaboo Stance",
                        input = "f,f+2",
                        description = "Transitions to aggressive Peekaboo stance",
                        damage = 0,
                        startup = 15,
                        recovery = 22,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Stance", "Boxing stance transition"),
                            MoveProperty("Movement", "Moves forward during transition"),
                            MoveProperty("Pressure", "Good for offensive pressure")
                        )
                    ),
                    Move(
                        name = "Albatross Stance",
                        input = "b+3+4",
                        description = "Transitions to evasive Albatross stance",
                        damage = 0,
                        startup = 16,
                        recovery = 24,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Stance", "Boxing stance transition"),
                            MoveProperty("Evasive", "Evades mid attacks"),
                            MoveProperty("Movement", "Can sidestep during transition")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Wind God Fist",
                        input = "f,n,d,d/f+2",
                        description = "Rising uppercut",
                        damage = 200,
                        startup = 14,
                        recovery = 35,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Electric Wind God Fist",
                        input = "f,n,d,d/f:2",
                        description = "Electric rising uppercut",
                        damage = 230,
                        startup = 11,
                        recovery = 35,
                        onBlock = -5,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit"),
                            MoveProperty("Just Frame", "Requires precise timing")
                        )
                    ),
                    Move(
                        name = "Dragon Uppercut",
                        input = "d/f+2",
                        description = "Mid uppercut",
                        damage = 180,
                        startup = 15,
                        recovery = 32,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit"),
                            MoveProperty("Counter Hit", "Guarantees bigger launch on CH")
                        )
                    ),
                    Move(
                        name = "Triple Right Hands",
                        input = "1,2,2",
                        description = "Three-hit punch string",
                        damage = 240,
                        startup = 10,
                        recovery = 32,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit"),
                            MoveProperty("Delay", "Can delay second and third hits")
                        )
                    ),
                    Move(
                        name = "Mid-Low Combo",
                        input = "d/f+1,4",
                        description = "Mid punch into low kick",
                        damage = 180,
                        startup = 13,
                        recovery = 29,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid, Low", "Second hit must be blocked low"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Four-Hit Combo",
                        input = "1,2,4,3",
                        description = "Four-hit string combination",
                        damage = 310,
                        startup = 10,
                        recovery = 37,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "All hits must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit"),
                            MoveProperty("Delay", "Can delay hits for mix-ups")
                        )
                    ),
                    Move(
                        name = "Crouch Dash Mid",
                        input = "f,n,d,d/f+3",
                        description = "Mid kick from crouch dash",
                        damage = 170,
                        startup = 16,
                        recovery = 29,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Crouch Dash", "Must be done from CD")
                        )
                    ),
                    Move(
                        name = "Crouch Dash Low",
                        input = "f,n,d,d/f+4",
                        description = "Low sweep from crouch dash",
                        damage = 200,
                        startup = 19,
                        recovery = 37,
                        onBlock = -26,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Crouch Dash", "Must be done from CD"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Side-Step Right Punch",
                        input = "SS+2",
                        description = "Right punch after side-step",
                        damage = 170,
                        startup = 14,
                        recovery = 26,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Side-Step", "Must be done after side-step")
                        )
                    ),
                    Move(
                        name = "Side-Step Kick",
                        input = "SS+3",
                        description = "Left kick after side-step",
                        damage = 160,
                        startup = 15,
                        recovery = 27,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Side-Step", "Must be done after side-step")
                        )
                    ),
                    Move(
                        name = "Running Punch",
                        input = "WR+2",
                        description = "Strong running punch",
                        damage = 200,
                        startup = 14,
                        recovery = 28,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Running", "Must be done while running"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Running Kick",
                        input = "WR+3",
                        description = "Running mid kick",
                        damage = 180,
                        startup = 16,
                        recovery = 29,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Running", "Must be done while running")
                        )
                    ),
                    Move(
                        name = "While Standing 3",
                        input = "WS+3",
                        description = "Mid kick from crouch",
                        damage = 160,
                        startup = 14,
                        recovery = 26,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("While Standing", "Must be done from crouch")
                        )
                    ),
                    Move(
                        name = "While Standing 4",
                        input = "WS+4",
                        description = "High kick from crouch",
                        damage = 180,
                        startup = 11,
                        recovery = 23,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("While Standing", "Must be done from crouch")
                        )
                    ),
                    Move(
                        name = "Back-turned 1",
                        input = "BT 1",
                        description = "Quick back-turned punch",
                        damage = 150,
                        startup = 8,
                        recovery = 19,
                        onBlock = -2,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Back-turned", "Must be done while back-turned")
                        )
                    ),
                    Move(
                        name = "Back-turned 2",
                        input = "BT 2",
                        description = "Back-turned elbow",
                        damage = 170,
                        startup = 15,
                        recovery = 28,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Back-turned", "Must be done while back-turned")
                        )
                    ),
                    Move(
                        name = "Spinning Demon to Hellsweep",
                        input = "b+4, f,n,d,d/f+4",
                        description = "Mid kick into low sweep",
                        damage = 320,
                        startup = 15,
                        recovery = 37,
                        onBlock = -26,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid, Low", "Second hit must be blocked low"),
                            MoveProperty("Counter Hit", "First hit guarantees second hit on CH"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Hellsweep",
                        input = "f,n,d,d/f+4",
                        description = "Low spinning kick",
                        damage = 400,
                        startup = 16,
                        recovery = 37,
                        onBlock = -26,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Flash Punch Combo",
                        input = "1,1,2",
                        description = "Triple punch string",
                        damage = 210,
                        startup = 10,
                        recovery = 30,
                        onBlock = -17,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Spinning Demon",
                        input = "b+4",
                        description = "Spinning mid kick",
                        damage = 170,
                        startup = 15,
                        recovery = 29,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Wave Dash",
                        input = "f,n,d,d/f,f",
                        description = "Quick forward dash with follow-ups",
                        damage = 0,
                        startup = 0,
                        recovery = 0,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Movement", "Special movement option"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "While Standing 1",
                        input = "WS+1",
                        description = "Quick mid punch from crouch",
                        damage = 120,
                        startup = 13,
                        recovery = 26,
                        onBlock = -3,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("While Standing", "Must be done from crouch")
                        )
                    ),
                    Move(
                        name = "While Standing 2",
                        input = "WS+2",
                        description = "Twin Pistons uppercut from crouch",
                        damage = 210,
                        startup = 15,
                        recovery = 37,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit"),
                            MoveProperty("While Standing", "Must be done from crouch")
                        )
                    ),
                    Move(
                        name = "Demon God Fist",
                        input = "f+4",
                        description = "Quick mid punch",
                        damage = 170,
                        startup = 15,
                        recovery = 27,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Knockdown", "Causes knockdown on counter hit")
                        )
                    ),
                    Move(
                        name = "Full Crouch Low Punch",
                        input = "FC+d+1",
                        description = "Quick low punch from crouch",
                        damage = 100,
                        startup = 10,
                        recovery = 19,
                        onBlock = -5,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Full Crouch", "Must be done from full crouch")
                        )
                    ),
                    Move(
                        name = "Full Crouch Mid Punch",
                        input = "FC+d/f+2",
                        description = "Mid punch from crouch",
                        damage = 150,
                        startup = 15,
                        recovery = 26,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Full Crouch", "Must be done from full crouch")
                        )
                    ),
                    Move(
                        name = "Wall Punish",
                        input = "WS+1+2",
                        description = "Strong wall punish",
                        damage = 200,
                        startup = 13,
                        recovery = 28,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Only", "Most effective at wall")
                        )
                    ),
                    Move(
                        name = "Ground Hit",
                        input = "d+4",
                        description = "Low kick to grounded opponent",
                        damage = 120,
                        startup = 16,
                        recovery = 24,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Ground Hit", "Hits grounded opponents")
                        )
                    ),
                    Move(
                        name = "Tech Catch",
                        input = "d/f+1+2",
                        description = "Mid punch that catches tech rolls",
                        damage = 180,
                        startup = 17,
                        recovery = 29,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Tech Catch", "Catches tech rolls")
                        )
                    ),
                    Move(
                        name = "Dragon Uppercut",
                        input = "u/f+4,4,4",
                        description = "Triple kick string",
                        damage = 270,
                        startup = 15,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Oni Front Kick",
                        input = "f+3",
                        description = "Strong mid kick",
                        damage = 170,
                        startup = 14,
                        recovery = 27,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Knockback", "Creates space on block")
                        )
                    ),
                    Move(
                        name = "Tsunami Kick",
                        input = "f+4",
                        description = "Advancing mid kick",
                        damage = 200,
                        startup = 16,
                        recovery = 29,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Stonehead",
                        input = "1+3",
                        description = "Basic forward throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1"),
                            MoveProperty("Wall Splat", "Causes wall splat on hit")
                        )
                    ),
                    Move(
                        name = "Hell Lancer",
                        input = "2+4",
                        description = "Basic forward throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 2"),
                            MoveProperty("Wall Splat", "Causes wall splat on hit")
                        )
                    ),
                    Move(
                        name = "Heaven's Door",
                        input = "f,f+1+2",
                        description = "Running throw",
                        damage = 450,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1+2"),
                            MoveProperty("Wall Splat", "Causes wall splat on hit"),
                            MoveProperty("Command Throw", "Must be done while running")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Drive",
                        input = "d/f+1+2 (in Rage)",
                        description = "Powerful mid punch that can be followed up",
                        damage = 550,
                        startup = 13,
                        recovery = 41,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "jin" to CharacterDetails(
            id = "jin",
            name = "Jin Kazama",
            playstyle = "Jin combines Mishima-style karate with traditional karate, giving him a versatile moveset. He excels at poking and keepout while maintaining strong offensive options.",
            strengths = listOf(
                "Strong pokes and keepout",
                "Versatile moveset",
                "Good counter-hit tools",
                "Solid punishment options",
                "Strong parry system"
            ),
            weaknesses = listOf(
                "Execution heavy",
                "Stance transitions can be risky",
                "Many moves are unsafe",
                "Complex gameplan required",
                "Weak to aggressive pressure"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Left jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "2",
                        input = "2",
                        description = "Right punch",
                        damage = 90,
                        startup = 12,
                        recovery = 20,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "3",
                        input = "3",
                        description = "Left kick",
                        damage = 170,
                        startup = 14,
                        recovery = 23,
                        onBlock = -7,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "4",
                        input = "4",
                        description = "Right kick",
                        damage = 160,
                        startup = 12,
                        recovery = 23,
                        onBlock = -9,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.COMMAND_NORMAL to listOf(
                    Move(
                        name = "Mental Alertness Stance",
                        input = "b+1",
                        description = "Enters special stance with unique follow-ups",
                        damage = 0,
                        startup = 15,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Zen Stance",
                        input = "f+3",
                        description = "Forward moving stance transition",
                        damage = 0,
                        startup = 12,
                        recovery = 18,
                        onBlock = 0,
                        type = MoveType.COMMAND_NORMAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Movement", "Moves forward during transition")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Electric Wind Hook Fist",
                        input = "f,n,d,d/f:2",
                        description = "Electric rising uppercut",
                        damage = 230,
                        startup = 11,
                        recovery = 35,
                        onBlock = -5,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit"),
                            MoveProperty("Just Frame", "Requires precise timing")
                        )
                    ),
                    Move(
                        name = "Zen Cannon",
                        input = "f+4",
                        description = "Powerful forward kick",
                        damage = 210,
                        startup = 18,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Can Cans",
                        input = "3,3",
                        description = "Double high kicks",
                        damage = 340,
                        startup = 14,
                        recovery = 37,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High, High", "Both hits must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Triple Strike",
                        input = "1,2,3",
                        description = "Three-hit string combination",
                        damage = 210,
                        startup = 10,
                        recovery = 31,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "All hits must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Right-Left Combo",
                        input = "2,4",
                        description = "Right punch into left kick",
                        damage = 180,
                        startup = 12,
                        recovery = 29,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Both hits must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Mid-Low String",
                        input = "d/f+1,4",
                        description = "Mid punch into low kick",
                        damage = 170,
                        startup = 13,
                        recovery = 28,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid, Low", "Second hit must be blocked low"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Mental Alertness 1",
                        input = "MEN 1",
                        description = "Quick punch from Mental Alertness",
                        damage = 150,
                        startup = 12,
                        recovery = 24,
                        onBlock = -7,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Mental Alertness")
                        )
                    ),
                    Move(
                        name = "Mental Alertness 2",
                        input = "MEN 2",
                        description = "Mid punch from Mental Alertness",
                        damage = 180,
                        startup = 15,
                        recovery = 29,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Mental Alertness")
                        )
                    ),
                    Move(
                        name = "Mental Alertness 3",
                        input = "MEN 3",
                        description = "Low sweep from Mental Alertness",
                        damage = 160,
                        startup = 17,
                        recovery = 32,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Stance", "Must be done from Mental Alertness"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Zen 1",
                        input = "ZEN 1",
                        description = "Quick punch from Zen",
                        damage = 140,
                        startup = 11,
                        recovery = 23,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Zen")
                        )
                    ),
                    Move(
                        name = "Zen 2",
                        input = "ZEN 2",
                        description = "Mid punch from Zen",
                        damage = 170,
                        startup = 14,
                        recovery = 28,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Zen")
                        )
                    ),
                    Move(
                        name = "Zen 3",
                        input = "ZEN 3",
                        description = "Low kick from Zen",
                        damage = 150,
                        startup = 16,
                        recovery = 31,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Stance", "Must be done from Zen")
                        )
                    ),
                    Move(
                        name = "Side-Step Punch",
                        input = "SS+2",
                        description = "Right punch after side-step",
                        damage = 160,
                        startup = 14,
                        recovery = 26,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Side-Step", "Must be done after side-step")
                        )
                    ),
                    Move(
                        name = "Side-Step Kick",
                        input = "SS+4",
                        description = "Right kick after side-step",
                        damage = 150,
                        startup = 15,
                        recovery = 27,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Side-Step", "Must be done after side-step")
                        )
                    ),
                    Move(
                        name = "Running Punch",
                        input = "WR+2",
                        description = "Strong running punch",
                        damage = 190,
                        startup = 14,
                        recovery = 28,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Running", "Must be done while running")
                        )
                    ),
                    Move(
                        name = "Running Kick",
                        input = "WR+3",
                        description = "Running mid kick",
                        damage = 170,
                        startup = 16,
                        recovery = 29,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Running", "Must be done while running")
                        )
                    ),
                    Move(
                        name = "While Standing 1",
                        input = "WS+1",
                        description = "Quick punch from crouch",
                        damage = 140,
                        startup = 13,
                        recovery = 25,
                        onBlock = -3,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("While Standing", "Must be done from crouch")
                        )
                    ),
                    Move(
                        name = "While Standing 3",
                        input = "WS+3",
                        description = "Mid kick from crouch",
                        damage = 160,
                        startup = 14,
                        recovery = 26,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("While Standing", "Must be done from crouch")
                        )
                    ),
                    Move(
                        name = "While Standing 4",
                        input = "WS+4",
                        description = "High kick from crouch",
                        damage = 170,
                        startup = 11,
                        recovery = 23,
                        onBlock = -6,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("While Standing", "Must be done from crouch")
                        )
                    ),
                    Move(
                        name = "Back-turned Double Strike",
                        input = "BT 1+2",
                        description = "Double punch while back-turned",
                        damage = 180,
                        startup = 10,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Back-turned", "Must be done while back-turned")
                        )
                    ),
                    Move(
                        name = "Back-turned Kick Combo",
                        input = "BT 3+4",
                        description = "Double kick while back-turned",
                        damage = 200,
                        startup = 16,
                        recovery = 31,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Back-turned", "Must be done while back-turned"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Low Sweep",
                        input = "d+3+4",
                        description = "Low sweeping kick",
                        damage = 170,
                        startup = 20,
                        recovery = 37,
                        onBlock = -26,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Kick Cancel",
                        input = "f+4~3",
                        description = "Cancellable kick string",
                        damage = 180,
                        startup = 15,
                        recovery = 29,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Cancel", "Can be canceled into other moves"),
                            MoveProperty("Stance", "Can transition to Zen stance")
                        )
                    ),
                    Move(
                        name = "Parry",
                        input = "b+1+3",
                        description = "Parries high and mid attacks",
                        damage = 0,
                        startup = 2,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Parry", "Parries high and mid attacks"),
                            MoveProperty("Counter", "Allows for follow-up attacks")
                        )
                    ),
                    Move(
                        name = "While Standing 2",
                        input = "WS+2",
                        description = "Rising uppercut from crouch",
                        damage = 200,
                        startup = 15,
                        recovery = 37,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit"),
                            MoveProperty("While Standing", "Must be done from crouch")
                        )
                    ),
                    Move(
                        name = "Laser Scraper",
                        input = "f+4",
                        description = "Mid kick that can transition to Zen stance",
                        damage = 170,
                        startup = 16,
                        recovery = 29,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Stance", "Can transition to Zen stance"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    ),
                    Move(
                        name = "Demon's Paw",
                        input = "b+2",
                        description = "Powerful mid punch",
                        damage = 200,
                        startup = 17,
                        recovery = 32,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Full Crouch Mid Punch",
                        input = "FC+d/f+1",
                        description = "Mid punch from crouch",
                        damage = 140,
                        startup = 13,
                        recovery = 24,
                        onBlock = -7,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Full Crouch", "Must be done from full crouch")
                        )
                    ),
                    Move(
                        name = "Full Crouch Low Kick",
                        input = "FC+d+4",
                        description = "Low kick from crouch",
                        damage = 130,
                        startup = 12,
                        recovery = 23,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Full Crouch", "Must be done from full crouch")
                        )
                    ),
                    Move(
                        name = "Wall Punish",
                        input = "WS+2",
                        description = "Strong wall punish",
                        damage = 190,
                        startup = 14,
                        recovery = 28,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Only", "Most effective at wall")
                        )
                    ),
                    Move(
                        name = "Ground Hit",
                        input = "d+4",
                        description = "Low kick to grounded opponent",
                        damage = 110,
                        startup = 16,
                        recovery = 24,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Ground Hit", "Hits grounded opponents")
                        )
                    ),
                    Move(
                        name = "Forward Kick to Zen",
                        input = "f+4~f",
                        description = "Mid kick that transitions to Zen",
                        damage = 160,
                        startup = 15,
                        recovery = 27,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Stance", "Can transition to Zen stance"),
                            MoveProperty("Cancel", "Can be canceled")
                        )
                    ),
                    Move(
                        name = "Mental Alertness Cancel",
                        input = "b+1~b",
                        description = "Transitions to Mental Alertness stance",
                        damage = 0,
                        startup = 15,
                        recovery = 24,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Transitions to Mental Alertness"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Median Line Destruction",
                        input = "f+4",
                        description = "Strong advancing mid kick",
                        damage = 210,
                        startup = 17,
                        recovery = 30,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Mental Alertness 4",
                        input = "MEN 4",
                        description = "Mid kick from Mental Alertness",
                        damage = 200,
                        startup = 16,
                        recovery = 29,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Mental Alertness"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Savage Sword",
                        input = "3~4",
                        description = "Leaping overhead kick",
                        damage = 270,
                        startup = 29,
                        recovery = 37,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Power Crush", "Has armor during attack")
                        )
                    ),
                    Move(
                        name = "Shun Ren Dan",
                        input = "2,1,4",
                        description = "Three-hit string with low finisher",
                        damage = 230,
                        startup = 12,
                        recovery = 31,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High, High, Low", "Last hit must be blocked low"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Flicker Jab",
                        input = "FLK 1",
                        description = "Quick jab from Flicker stance",
                        damage = 140,
                        startup = 10,
                        recovery = 20,
                        onBlock = -1,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Flicker"),
                            MoveProperty("Chain", "Can be chained into other Flicker moves")
                        )
                    ),
                    Move(
                        name = "Flicker Dempsey Roll",
                        input = "FLK f+1,2,1",
                        description = "Three-hit weaving punch combination",
                        damage = 250,
                        startup = 12,
                        recovery = 31,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Flicker"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Flicker Sway",
                        input = "FLK b+1+2",
                        description = "Evasive weaving motion with follow-ups",
                        damage = 0,
                        startup = 16,
                        recovery = 24,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Must be done from Flicker"),
                            MoveProperty("Evasive", "Evades high and some mid attacks"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Ducking Upper",
                        input = "DCK 2",
                        description = "Rising uppercut from ducking stance",
                        damage = 210,
                        startup = 14,
                        recovery = 28,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Ducking"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Ducking Weave",
                        input = "DCK 1+2",
                        description = "Evasive ducking motion",
                        damage = 0,
                        startup = 12,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Must be done from Ducking"),
                            MoveProperty("Evasive", "Evades high attacks"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Ducking Body Blow",
                        input = "DCK 1",
                        description = "Quick body punch from ducking",
                        damage = 170,
                        startup = 13,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Ducking"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    ),
                    Move(
                        name = "Peekaboo Rush",
                        input = "PKB 1,2,1",
                        description = "Three-hit rushing punch combination",
                        damage = 230,
                        startup = 10,
                        recovery = 29,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Peekaboo"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Peekaboo Weave",
                        input = "PKB b+1+2",
                        description = "Evasive weaving motion with follow-ups",
                        damage = 0,
                        startup = 14,
                        recovery = 22,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Must be done from Peekaboo"),
                            MoveProperty("Evasive", "Evades high and some mid attacks"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Peekaboo Hook",
                        input = "PKB 2",
                        description = "Powerful hook punch",
                        damage = 250,
                        startup = 17,
                        recovery = 30,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Peekaboo"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Albatross Spin",
                        input = "ALB 3+4",
                        description = "Spinning evasive move",
                        damage = 0,
                        startup = 15,
                        recovery = 24,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Must be done from Albatross"),
                            MoveProperty("Evasive", "Evades most attacks"),
                            MoveProperty("Movement", "Can transition to other stances")
                        )
                    ),
                    Move(
                        name = "Albatross Hook",
                        input = "ALB 2",
                        description = "Powerful spinning hook punch",
                        damage = 240,
                        startup = 18,
                        recovery = 32,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Albatross"),
                            MoveProperty("Counter Hit", "Launches on counter hit")
                        )
                    ),
                    Move(
                        name = "Albatross Sweep",
                        input = "ALB d+3",
                        description = "Low spinning sweep",
                        damage = 180,
                        startup = 20,
                        recovery = 35,
                        onBlock = -23,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Stance", "Must be done from Albatross"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Arm Break",
                        input = "1+3",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1")
                        )
                    ),
                    Move(
                        name = "Over the Shoulder",
                        input = "2+4",
                        description = "Basic forward throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 2")
                        )
                    ),
                    Move(
                        name = "Mental Alertness Throw",
                        input = "b+1+3 (from Mental Alertness)",
                        description = "Stance throw",
                        damage = 450,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1"),
                            MoveProperty("Stance", "Must be done from Mental Alertness"),
                            MoveProperty("Wall Splat", "Causes wall splat on hit")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Drive",
                        input = "d/f+1+2 (in Rage)",
                        description = "Powerful mid punch sequence",
                        damage = 550,
                        startup = 13,
                        recovery = 41,
                        onBlock = -15,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "heihachi" to CharacterDetails(
            id = "heihachi",
            name = "Heihachi Mishima",
            playstyle = "Heihachi is an aggressive Mishima fighter who excels at powerful strikes and mix-ups. His powerful lows and mids make him a threatening offensive character.",
            strengths = listOf(
                "Strong mix-up game",
                "Powerful offensive pressure",
                "Good tracking moves",
                "High damage output",
                "Excellent oki options"
            ),
            weaknesses = listOf(
                "No good rage drive",
                "Poor recovery on some key moves",
                "Execution heavy",
                "Limited approach options",
                "Weak to sidestep right"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Left punch",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "2",
                        input = "2",
                        description = "Right punch",
                        damage = 90,
                        startup = 12,
                        recovery = 20,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "3",
                        input = "3",
                        description = "Left kick",
                        damage = 170,
                        startup = 14,
                        recovery = 23,
                        onBlock = -7,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "4",
                        input = "4",
                        description = "Right kick",
                        damage = 180,
                        startup = 15,
                        recovery = 24,
                        onBlock = -8,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Electric Wind God Fist",
                        input = "f,n,d,d/f+2 (just frame)",
                        description = "Powerful launching uppercut with electric properties",
                        damage = 230,
                        startup = 11,
                        recovery = 28,
                        onBlock = -5,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit"),
                            MoveProperty("Just Frame", "Requires precise timing")
                        )
                    ),
                    Move(
                        name = "Demon Uppercut",
                        input = "d/f+2",
                        description = "Strong mid uppercut",
                        damage = 180,
                        startup = 15,
                        recovery = 32,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Hell Axle",
                        input = "f,f+4",
                        description = "Advancing mid kick",
                        damage = 210,
                        startup = 19,
                        recovery = 30,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Homing", "Tracks sidesteps")
                        )
                    ),
                    Move(
                        name = "Demon's Breath",
                        input = "f+2,3",
                        description = "Two-hit string with mid finisher",
                        damage = 250,
                        startup = 12,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High, Mid", "Second hit must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Stone Head",
                        input = "f,f+2",
                        description = "Advancing headbutt",
                        damage = 220,
                        startup = 15,
                        recovery = 29,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Power Crush", "Has armor during attack")
                        )
                    ),
                    Move(
                        name = "Demon Scissors",
                        input = "d/b+4",
                        description = "Low sweep kick",
                        damage = 170,
                        startup = 17,
                        recovery = 37,
                        onBlock = -23,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Twin Pistons",
                        input = "WS+1,2",
                        description = "Two-hit rising punch combo",
                        damage = 250,
                        startup = 13,
                        recovery = 30,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid, Mid", "Both hits must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Otoshi",
                        input = "f,f+1+2",
                        description = "Powerful mid punch",
                        damage = 250,
                        startup = 20,
                        recovery = 32,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Demon's Boar",
                        input = "f,f+3",
                        description = "Advancing mid kick",
                        damage = 210,
                        startup = 18,
                        recovery = 29,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Raijin Stance",
                        input = "f+3+4",
                        description = "Special stance transition",
                        damage = 0,
                        startup = 15,
                        recovery = 24,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Broken Toy",
                        input = "d/f+1,2",
                        description = "Two-hit string",
                        damage = 230,
                        startup = 13,
                        recovery = 30,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid, Mid", "Both hits must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Lightning Hammer",
                        input = "f,N,d,d/f+1",
                        description = "Quick mid punch",
                        damage = 200,
                        startup = 15,
                        recovery = 28,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Broken Toy",
                        input = "1+3",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1")
                        )
                    ),
                    Move(
                        name = "Ultimate Tackle",
                        input = "f,f+1+2",
                        description = "Running tackle with follow-ups",
                        damage = 450,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1+2"),
                            MoveProperty("Command Throw", "Must be done while running")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "paul" to CharacterDetails(
            id = "paul",
            name = "Paul Phoenix",
            playstyle = "A powerful striker with simple but effective moves. Known for his devastating Deathfist and high damage potential.",
            strengths = listOf(
                "Very high damage output",
                "Simple but effective moves",
                "Strong counter-hit game",
                "Good punishment options",
                "Excellent comeback potential"
            ),
            weaknesses = listOf(
                "Limited approach options",
                "Many moves are unsafe",
                "Weak to sidestep left",
                "Poor tracking moves",
                "Can be predictable"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Left jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "2",
                        input = "2",
                        description = "Right punch",
                        damage = 90,
                        startup = 12,
                        recovery = 20,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Deathfist",
                        input = "f,f+2",
                        description = "Powerful forward-moving punch",
                        damage = 450,
                        startup = 15,
                        recovery = 35,
                        onBlock = -17,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Power", "Extremely high damage")
                        )
                    ),
                    Move(
                        name = "Demolition Man",
                        input = "d+4,2,1,2",
                        description = "Low kick into punch string",
                        damage = 330,
                        startup = 15,
                        recovery = 37,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "First hit must be blocked low"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Phoenix Smasher",
                        input = "b+1,2",
                        description = "Two-hit punch string",
                        damage = 250,
                        startup = 14,
                        recovery = 30,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid, Mid", "Both hits must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Burning Fist",
                        input = "qcf+2",
                        description = "Quick advancing punch",
                        damage = 200,
                        startup = 15,
                        recovery = 28,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Power Crush", "Has armor during attack")
                        )
                    ),
                    Move(
                        name = "Hammer of the Gods",
                        input = "d/f+1+2",
                        description = "Powerful double fist strike",
                        damage = 280,
                        startup = 20,
                        recovery = 32,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Clean Hit",
                        input = "b+1+2",
                        description = "Counter-hit setup punch",
                        damage = 170,
                        startup = 17,
                        recovery = 29,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    ),
                    Move(
                        name = "Falling Leaf",
                        input = "d/b+4",
                        description = "Low sweep kick",
                        damage = 180,
                        startup = 20,
                        recovery = 35,
                        onBlock = -23,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Blonde Bomb",
                        input = "d/b+3",
                        description = "Low sweep",
                        damage = 170,
                        startup = 20,
                        recovery = 37,
                        onBlock = -26,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Silent Entry",
                        input = "f+3",
                        description = "Enters Silent Entry stance",
                        damage = 0,
                        startup = 0,
                        recovery = 0,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Evil Mist",
                        input = "d/f+1",
                        description = "Fast mid punch",
                        damage = 170,
                        startup = 13,
                        recovery = 26,
                        onBlock = -3,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    ),
                    Move(
                        name = "Spider Knee",
                        input = "d/f+2",
                        description = "Rising knee strike",
                        damage = 200,
                        startup = 15,
                        recovery = 29,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Poison Mist",
                        input = "qcf+1",
                        description = "Quick advancing punch",
                        damage = 180,
                        startup = 14,
                        recovery = 27,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Bad Habit",
                        input = "d/f+3,2",
                        description = "Mid kick into punch",
                        damage = 230,
                        startup = 16,
                        recovery = 29,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid, High", "Second hit must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Blonde Bomb",
                        input = "d/b+3",
                        description = "Low sweep",
                        damage = 170,
                        startup = 20,
                        recovery = 37,
                        onBlock = -26,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Geyser Cannon",
                        input = "qcb+2",
                        description = "Powerful mid punch",
                        damage = 250,
                        startup = 19,
                        recovery = 32,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    ),
                    Move(
                        name = "Death From Above",
                        input = "u/f+3+4",
                        description = "Jumping double kick",
                        damage = 270,
                        startup = 29,
                        recovery = 37,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Shoulder Throw",
                        input = "1+3",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1")
                        )
                    ),
                    Move(
                        name = "Death Valley Bomb",
                        input = "2+4",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 2")
                        )
                    ),
                    Move(
                        name = "Grapevine Twist",
                        input = "qcb+1+2",
                        description = "Command throw",
                        damage = 450,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1+2"),
                            MoveProperty("Command Throw", "Special input required")
                        )
                    ),
                    Move(
                        name = "Bad Habit",
                        input = "f,f+1+4",
                        description = "Running throw",
                        damage = 450,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1+2"),
                            MoveProperty("Running Throw", "Must be done while running")
                        )
                    ),
                    Move(
                        name = "Arm Break",
                        input = "1+3",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "law" to CharacterDetails(
            id = "law",
            name = "Marshall Law",
            playstyle = "Fast striker with strong combo potential and mix-up game. Excels at punishing mistakes and maintaining pressure.",
            strengths = listOf(
                "Strong combo damage",
                "Fast attacks",
                "Good mix-up options",
                "Strong punishment",
                "Excellent wall carry"
            ),
            weaknesses = listOf(
                "Execution heavy",
                "Many moves unsafe",
                "Poor tracking",
                "Limited approach options",
                "Weak to sidestep"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Dragon Sign",
                        input = "b+2,3,4",
                        description = "Three-hit string with mid finisher",
                        damage = 270,
                        startup = 15,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Dragon Tail",
                        input = "d/b+4",
                        description = "Low sweep kick",
                        damage = 170,
                        startup = 19,
                        recovery = 37,
                        onBlock = -26,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Junkyard Kick",
                        input = "b+2,3,4",
                        description = "Three-hit string with low finisher",
                        damage = 250,
                        startup = 15,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid, Mid, Low", "Last hit must be blocked low"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Dragon Fist",
                        input = "d/f+2",
                        description = "Rising uppercut",
                        damage = 200,
                        startup = 15,
                        recovery = 29,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Somersault Kick",
                        input = "3+4",
                        description = "Flipping overhead kick",
                        damage = 230,
                        startup = 27,
                        recovery = 37,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Power Crush", "Has armor during attack")
                        )
                    ),
                    Move(
                        name = "Dragon Slide",
                        input = "d,d/f+4",
                        description = "Sliding low kick",
                        damage = 180,
                        startup = 26,
                        recovery = 37,
                        onBlock = -23,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Dragon Cannon",
                        input = "b+1",
                        description = "Fast counter-hit setup",
                        damage = 170,
                        startup = 13,
                        recovery = 26,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Dragon Throw",
                        input = "1+3",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "king" to CharacterDetails(
            id = "king",
            name = "King",
            playstyle = "Professional wrestler with powerful throws and solid mix-up game. Excels at grappling and ground control.",
            strengths = listOf(
                "Strong throw game",
                "Good mix-up options",
                "High damage output",
                "Strong okizeme",
                "Good counter-hit tools"
            ),
            weaknesses = listOf(
                "Complex throw chains",
                "Limited approach options",
                "Some moves unsafe",
                "Weak to sidestep",
                "Requires good execution"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Jaguar Step",
                        input = "f,f+1",
                        description = "Advancing mid punch",
                        damage = 170,
                        startup = 15,
                        recovery = 29,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "Alley Kicks",
                        input = "d/f+4,4,4,4",
                        description = "Multi-hitting kick string",
                        damage = 280,
                        startup = 16,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Shining Wizard",
                        input = "f,f,f+1+2",
                        description = "Running knee strike",
                        damage = 250,
                        startup = 20,
                        recovery = 32,
                        onBlock = -14,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Power Crush", "Has armor during attack")
                        )
                    ),
                    Move(
                        name = "Capital Punishment",
                        input = "b+1,2",
                        description = "Two-hit punch string",
                        damage = 230,
                        startup = 14,
                        recovery = 28,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid, Mid", "Both hits must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Jaguar Hook",
                        input = "d/f+2",
                        description = "Rising uppercut",
                        damage = 200,
                        startup = 15,
                        recovery = 29,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Giant Swing",
                        input = "f,hcf+1",
                        description = "Command throw",
                        damage = 450,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1"),
                            MoveProperty("Command Throw", "Special input required")
                        )
                    ),
                    Move(
                        name = "Muscle Buster",
                        input = "d/f+2+4",
                        description = "Command throw",
                        damage = 450,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1+2"),
                            MoveProperty("Command Throw", "Special input required")
                        )
                    ),
                    Move(
                        name = "Rolling Death Cradle",
                        input = "2+4,1,2,1,2,1",
                        description = "Chain throw sequence",
                        damage = 550,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 2"),
                            MoveProperty("Chain Throw", "Multi-part throw sequence")
                        )
                    ),
                    Move(
                        name = "Tijuana Twister",
                        input = "1+3,2,1,3+4",
                        description = "Chain throw sequence",
                        damage = 500,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1"),
                            MoveProperty("Chain Throw", "Multi-part throw sequence")
                        )
                    ),
                    Move(
                        name = "Tombstone Piledriver",
                        input = "f,f,f+1+2",
                        description = "Running throw",
                        damage = 450,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1+2"),
                            MoveProperty("Running Throw", "Must be done while running")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "bryan" to CharacterDetails(
            id = "bryan",
            name = "Bryan Fury",
            playstyle = "Counter-hit specialist with powerful strikes and mix-ups. Excels at maintaining pressure and punishing mistakes.",
            strengths = listOf(
                "Strong counter-hit game",
                "High damage output",
                "Good keepout tools",
                "Powerful mix-ups",
                "Strong taunt game"
            ),
            weaknesses = listOf(
                "Difficult execution",
                "Limited approach options",
                "Many moves unsafe",
                "Poor tracking",
                "Weak to sidestep left"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Mach Breaker",
                        input = "f+4,1",
                        description = "Mid kick into punch",
                        damage = 250,
                        startup = 17,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Snake Edge",
                        input = "d/f+3",
                        description = "Low sweep",
                        damage = 170,
                        startup = 27,
                        recovery = 37,
                        onBlock = -26,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Orbital Heel",
                        input = "u/f+4",
                        description = "Jumping overhead kick",
                        damage = 240,
                        startup = 25,
                        recovery = 37,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    ),
                    Move(
                        name = "Fisherman's Slam",
                        input = "b+1",
                        description = "Counter-hit launcher",
                        damage = 170,
                        startup = 15,
                        recovery = 29,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Counter Hit", "Launches on counter hit")
                        )
                    ),
                    Move(
                        name = "Jet Upper",
                        input = "f,b+2",
                        description = "Powerful uppercut",
                        damage = 240,
                        startup = 14,
                        recovery = 35,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Taunt",
                        input = "1+3+4",
                        description = "Taunting stance with follow-ups",
                        damage = 0,
                        startup = 0,
                        recovery = 0,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Special", "Sets up guaranteed follow-ups"),
                            MoveProperty("Stance", "Special stance transition")
                        )
                    ),
                    Move(
                        name = "Hatchet Kick",
                        input = "d/b+3",
                        description = "Low kick",
                        damage = 170,
                        startup = 20,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    ),
                    Move(
                        name = "Northern Cross",
                        input = "f,f+2",
                        description = "Advancing punch",
                        damage = 200,
                        startup = 18,
                        recovery = 30,
                        onBlock = -10,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Wall Bounce", "Causes wall bounce on hit")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Knee Bash",
                        input = "1+3",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "hwoarang" to CharacterDetails(
            id = "hwoarang",
            name = "Hwoarang",
            playstyle = "Aggressive Taekwondo practitioner with complex stance transitions. Excels at pressure and mix-ups through his various stances.",
            strengths = listOf(
                "Strong pressure game",
                "Complex mix-up options",
                "Good combo damage",
                "Multiple stance transitions",
                "Strong kicks"
            ),
            weaknesses = listOf(
                "Stance transitions can be risky",
                "Complex execution",
                "Many moves unsafe",
                "Weak to sidestep",
                "Poor tracking"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Backlash",
                        input = "b+3",
                        description = "Powerful spinning kick",
                        damage = 280,
                        startup = 27,
                        recovery = 37,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Power Crush", "Has armor during attack")
                        )
                    ),
                    Move(
                        name = "Hunting Hawk",
                        input = "u/f+3,4,3",
                        description = "Triple kick string",
                        damage = 270,
                        startup = 15,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Sky Rocket",
                        input = "d/f+2",
                        description = "Rising launcher",
                        damage = 200,
                        startup = 15,
                        recovery = 29,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Left Flamingo",
                        input = "3~f",
                        description = "Transitions to Left Flamingo stance",
                        damage = 0,
                        startup = 0,
                        recovery = 0,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Right Flamingo",
                        input = "4~f",
                        description = "Transitions to Right Flamingo stance",
                        damage = 0,
                        startup = 0,
                        recovery = 0,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Plasma Blade",
                        input = "RFF d/f+4",
                        description = "Right Flamingo low kick",
                        damage = 180,
                        startup = 20,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Stance", "Must be done from Right Flamingo")
                        )
                    ),
                    Move(
                        name = "Tsunami Kick",
                        input = "LFF b+4",
                        description = "Left Flamingo high kick",
                        damage = 240,
                        startup = 17,
                        recovery = 31,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Stance", "Must be done from Left Flamingo")
                        )
                    ),
                    Move(
                        name = "Spinning Trip Kick",
                        input = "d/b+4",
                        description = "Low sweep kick",
                        damage = 170,
                        startup = 19,
                        recovery = 37,
                        onBlock = -26,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Power Stance",
                        input = "3+4",
                        description = "Enters Power stance",
                        damage = 0,
                        startup = 0,
                        recovery = 0,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Power", "Enhances certain moves")
                        )
                    ),
                    Move(
                        name = "Flicker Stance",
                        input = "3+4",
                        description = "Enters Flicker stance",
                        damage = 0,
                        startup = 15,
                        recovery = 24,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition")
                        )
                    ),
                    Move(
                        name = "Mistrust",
                        input = "d/f+2,1",
                        description = "Mid punch combo",
                        damage = 250,
                        startup = 15,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Art of Phoenix",
                        input = "d+1+2",
                        description = "Enters AOP stance",
                        damage = 0,
                        startup = 0,
                        recovery = 0,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Throw",
                        input = "1+3",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "asuka" to CharacterDetails(
            id = "asuka",
            name = "Asuka Kazama",
            playstyle = "Defensive specialist with strong counter-attacks and punishes. Excels at turning the opponent's offense against them.",
            strengths = listOf(
                "Strong defensive tools",
                "Good counter-attacks",
                "Strong punishment",
                "Solid mix-up game",
                "Easy execution"
            ),
            weaknesses = listOf(
                "Poor approach options",
                "Weak to sidestep",
                "Limited combo potential",
                "Risky moves",
                "Poor tracking"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Reversal",
                        input = "b+1+3 or b+2+4",
                        description = "Parries attacks",
                        damage = 450,
                        startup = 2,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Parry", "Reverses opponent's attacks")
                        )
                    ),
                    Move(
                        name = "Can Opener",
                        input = "f+2",
                        description = "Mid punch",
                        damage = 170,
                        startup = 17,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on counter hit")
                        )
                    ),
                    Move(
                        name = "Tooth Fairy",
                        input = "d/f+2",
                        description = "Rising uppercut",
                        damage = 200,
                        startup = 15,
                        recovery = 29,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Spinning Sweep",
                        input = "d/b+4",
                        description = "Low sweep kick",
                        damage = 170,
                        startup = 19,
                        recovery = 37,
                        onBlock = -26,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "White Heron Dance",
                        input = "b+3",
                        description = "Mid kick with follow-ups",
                        damage = 180,
                        startup = 16,
                        recovery = 29,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Cancel", "Can be canceled into other moves")
                        )
                    ),
                    Move(
                        name = "Leg Cutter",
                        input = "d+3+4",
                        description = "Low double kick",
                        damage = 160,
                        startup = 20,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Throw",
                        input = "1+3",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "xiaoyu" to CharacterDetails(
            id = "xiaoyu",
            name = "Ling Xiaoyu",
            playstyle = "Evasive character with strong mix-up potential through her stances. Excels at dodging attacks and punishing whiffs.",
            strengths = listOf(
                "Strong evasive moves",
                "Good mix-up game",
                "Fast attacks",
                "Multiple stance transitions",
                "Strong okizeme"
            ),
            weaknesses = listOf(
                "Low damage output",
                "Requires good execution",
                "Risky playstyle",
                "Poor range",
                "Weak to tracking moves"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Phoenix Stance",
                        input = "d+1+2",
                        description = "Enters Phoenix stance",
                        damage = 0,
                        startup = 15,
                        recovery = 24,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Evasive", "Evades high and mid attacks")
                        )
                    ),
                    Move(
                        name = "Rain Dance",
                        input = "b+3+4",
                        description = "Enters Rain Dance stance",
                        damage = 0,
                        startup = 16,
                        recovery = 25,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Back-turned", "Turns back to opponent")
                        )
                    ),
                    Move(
                        name = "Mistrust",
                        input = "d/f+2,1",
                        description = "Mid punch combo",
                        damage = 250,
                        startup = 15,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Fortune Cookie",
                        input = "d/f+1",
                        description = "Fast mid punch",
                        damage = 170,
                        startup = 13,
                        recovery = 26,
                        onBlock = -3,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    ),
                    Move(
                        name = "Art of Phoenix",
                        input = "d+1+2",
                        description = "Enters AOP stance",
                        damage = 0,
                        startup = 0,
                        recovery = 0,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Special stance transition"),
                            MoveProperty("Evasive", "Evades high and some mid attacks")
                        )
                    ),
                    Move(
                        name = "Storming Flower",
                        input = "f+3,1,4",
                        description = "Three-hit string",
                        damage = 270,
                        startup = 14,
                        recovery = 31,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Cloud Kick",
                        input = "u/f+3",
                        description = "Jumping kick",
                        damage = 200,
                        startup = 15,
                        recovery = 28,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Jump", "Jumps over low attacks")
                        )
                    ),
                    Move(
                        name = "Hypnotist",
                        input = "d/f+2+3",
                        description = "Mid launcher",
                        damage = 200,
                        startup = 18,
                        recovery = 32,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Throw",
                        input = "1+3",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "nina" to CharacterDetails(
            id = "nina",
            name = "Nina Williams",
            playstyle = "Nina is a versatile assassin who excels at pressure and mix-ups. Her fast pokes, strong throw game, and devastating chain throws make her a threatening offensive character.",
            strengths = listOf(
                "Strong poking game",
                "Powerful throw mix-ups",
                "Fast attacks",
                "Good pressure tools",
                "Excellent chain throws"
            ),
            weaknesses = listOf(
                "Execution heavy chain throws",
                "Some unsafe moves",
                "Limited approach options",
                "Requires good movement",
                "Complex combo routes"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Left jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "2",
                        input = "2",
                        description = "Right punch",
                        damage = 80,
                        startup = 12,
                        recovery = 20,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Bad Habit",
                        input = "d/f+1,2",
                        description = "Two-hit punch string",
                        damage = 180,
                        startup = 13,
                        recovery = 28,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid, High", "Second hit must be blocked standing"),
                            MoveProperty("Natural Combo", "True combo on hit")
                        )
                    ),
                    Move(
                        name = "Blonde Bomb",
                        input = "d/f+2",
                        description = "Powerful uppercut",
                        damage = 170,
                        startup = 15,
                        recovery = 29,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Can Opener",
                        input = "b+4",
                        description = "Spinning high kick",
                        damage = 200,
                        startup = 17,
                        recovery = 32,
                        onBlock = -8,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    ),
                    Move(
                        name = "Silent Entry",
                        input = "f,f+3",
                        description = "Advancing low kick",
                        damage = 170,
                        startup = 18,
                        recovery = 31,
                        onBlock = -13,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Low", "Must be blocked low"),
                            MoveProperty("Knockdown", "Causes knockdown on hit")
                        )
                    ),
                    Move(
                        name = "Spider Knee",
                        input = "d/f+4",
                        description = "Rising knee strike",
                        damage = 180,
                        startup = 15,
                        recovery = 28,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    )
                ),
                MoveType.THROW to listOf(
                    Move(
                        name = "Arm Break",
                        input = "1+3",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1")
                        )
                    ),
                    Move(
                        name = "Death Valley Bomb",
                        input = "2+4",
                        description = "Basic throw",
                        damage = 350,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 2")
                        )
                    ),
                    Move(
                        name = "Grapevine Twist",
                        input = "qcb+1+2",
                        description = "Command throw",
                        damage = 450,
                        startup = 12,
                        recovery = 35,
                        onBlock = 0,
                        type = MoveType.THROW,
                        properties = listOf(
                            MoveProperty("Throw", "Can be broken with 1+2"),
                            MoveProperty("Command Throw", "Special input required")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        ),
        "steve" to CharacterDetails(
            id = "steve",
            name = "Steve Fox",
            playstyle = "Steve is a pure boxer who excels at pressure and counter-hits. His unique stance system and weaving movements make him a technical fighter with strong offensive capabilities.",
            strengths = listOf(
                "Strong counter-hit game",
                "Excellent pressure",
                "Unique evasive moves",
                "Fast attacks",
                "Complex stance system"
            ),
            weaknesses = listOf(
                "No kicks or throws",
                "Limited range",
                "Complex execution",
                "Stance transitions can be risky",
                "Weak to sidestep right"
            ),
            moves = mapOf(
                MoveType.NORMAL to listOf(
                    Move(
                        name = "1",
                        input = "1",
                        description = "Left jab",
                        damage = 70,
                        startup = 10,
                        recovery = 19,
                        onBlock = -1,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    ),
                    Move(
                        name = "2",
                        input = "2",
                        description = "Right straight",
                        damage = 80,
                        startup = 12,
                        recovery = 20,
                        onBlock = -2,
                        type = MoveType.NORMAL,
                        properties = listOf(
                            MoveProperty("High", "Must be blocked standing")
                        )
                    )
                ),
                MoveType.SPECIAL to listOf(
                    Move(
                        name = "Sonic Fang",
                        input = "d/f+2",
                        description = "Powerful uppercut",
                        damage = 170,
                        startup = 15,
                        recovery = 29,
                        onBlock = -12,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Launch", "Launches on hit")
                        )
                    ),
                    Move(
                        name = "Flicker Stance",
                        input = "3+4",
                        description = "Enter flicker stance",
                        damage = 0,
                        startup = 6,
                        recovery = 18,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Transitions to Flicker stance"),
                            MoveProperty("Evasive", "Evades high attacks")
                        )
                    ),
                    Move(
                        name = "Ducking Left",
                        input = "d/b+1",
                        description = "Ducking left punch",
                        damage = 140,
                        startup = 14,
                        recovery = 25,
                        onBlock = -9,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Counter Hit", "Guarantees follow-up on CH")
                        )
                    ),
                    Move(
                        name = "Peekaboo",
                        input = "b+1",
                        description = "Enter peekaboo stance",
                        damage = 0,
                        startup = 8,
                        recovery = 20,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Transitions to Peekaboo stance"),
                            MoveProperty("Evasive", "Evades high attacks")
                        )
                    ),
                    Move(
                        name = "Albatross Turn",
                        input = "f+3+4",
                        description = "Enter albatross stance",
                        damage = 0,
                        startup = 10,
                        recovery = 22,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Stance", "Transitions to Albatross stance"),
                            MoveProperty("Evasive", "Evades mid attacks")
                        )
                    ),
                    Move(
                        name = "Weave",
                        input = "b+3+4",
                        description = "Evasive weaving motion",
                        damage = 0,
                        startup = 16,
                        recovery = 24,
                        onBlock = 0,
                        type = MoveType.SPECIAL,
                        properties = listOf(
                            MoveProperty("Evasive", "Evades high and some mid attacks"),
                            MoveProperty("Movement", "Can transition to other stances")
                        )
                    )
                ),
                MoveType.SUPER to listOf(
                    Move(
                        name = "Rage Art",
                        input = "1+2 (in Rage)",
                        description = "Powerful cinematic attack",
                        damage = 550,
                        startup = 13,
                        recovery = 46,
                        onBlock = -23,
                        type = MoveType.SUPER,
                        properties = listOf(
                            MoveProperty("Mid", "Must be blocked standing"),
                            MoveProperty("Rage Only", "Only usable in Rage"),
                            MoveProperty("Armor", "Has armor during startup")
                        )
                    )
                )
            )
        )
    )
} 