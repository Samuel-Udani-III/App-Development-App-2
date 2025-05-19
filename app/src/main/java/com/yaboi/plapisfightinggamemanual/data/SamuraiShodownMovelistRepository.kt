package com.yaboi.plapisfightinggamemanual.data

object SamuraiShodownMovelistRepository {
    fun getCharacterMovelist(characterId: String): List<MoveCategory>? {
        return characterMovelists[characterId]
    }

    private val characterMovelists = mapOf(
        "haohmaru" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Kogetsu Zan",
                        input = "↓↙← + A/B/C",
                        description = "Rising anti-air slash. A version is fastest, C version has most range."
                    ),
                    MoveInfo(
                        name = "Senpuu Retsu Zan",
                        input = "↓↘→ + A/B/C",
                        description = "Wind projectile. B version travels at mid height, C version is slowest but strongest."
                    ),
                    MoveInfo(
                        name = "Resshin Zan",
                        input = "→↓↘ + A/B/C",
                        description = "Dashing sword thrust. C version has armor break properties."
                    ),
                    MoveInfo(
                        name = "Nagi Yaiba",
                        input = "↓↙← + D",
                        description = "Low sweeping blade wave that travels along ground."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Tenha Seiou Zan",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Massive wind projectile that hits multiple times."
                    ),
                    MoveInfo(
                        name = "Ougi Tenha Fuujin Zan",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate wind and sword combination attack. Can be canceled from special moves."
                    )
                )
            ),
            MoveCategory(
                name = "Weapon Flipping Techniques",
                moves = listOf(
                    MoveInfo(
                        name = "Blade Catch",
                        input = "← + C (during opponent's weapon attack)",
                        description = "Disarms opponent if timed correctly against their weapon attack."
                    )
                )
            )
        ),
        "nakoruru" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Kamui Mutsube",
                        input = "↓↘→ + A/B/C",
                        description = "Aerial diving attack. Different buttons change attack angle."
                    ),
                    MoveInfo(
                        name = "Annu Mutsube",
                        input = "↓↙← + A/B/C",
                        description = "Rising anti-air attack with Mamahaha. C version has best invincibility."
                    ),
                    MoveInfo(
                        name = "Mamahaha Call",
                        input = "→↓↘ + A/B/C",
                        description = "Summons Mamahaha for assist attack. Button strength determines attack pattern."
                    ),
                    MoveInfo(
                        name = "Lelam Shikite",
                        input = "↓↘→ + D",
                        description = "Counter stance that can punish both high and low attacks."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Rera Mutsube",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple aerial slashes with Mamahaha assistance."
                    ),
                    MoveInfo(
                        name = "Ainu Mutsube",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate nature-powered combination attack. Can be canceled from specials."
                    )
                )
            ),
            MoveCategory(
                name = "Unique Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Nature's Harmony",
                        input = "→ + B (in air)",
                        description = "Air-to-ground diving attack that can cross-up."
                    ),
                    MoveInfo(
                        name = "Mamahaha Ride",
                        input = "↑ + D",
                        description = "Rides Mamahaha briefly for air mobility."
                    )
                )
            )
        ),
        "charlotte" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Crystal Rose",
                        input = "↓↘→ + A/B/C",
                        description = "Projectile thrust attack. C version has best range and damage."
                    ),
                    MoveInfo(
                        name = "Splash Fount",
                        input = "↓↙← + A/B/C",
                        description = "Rising anti-air thrust. A version is fastest."
                    ),
                    MoveInfo(
                        name = "Noble Strategy",
                        input = "→↓↘ + A/B/C",
                        description = "Counter stance that can parry high attacks."
                    ),
                    MoveInfo(
                        name = "Renverse",
                        input = "↓↘→ + D",
                        description = "Evasive thrust attack with follow-up options."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Meteor Thrust",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple thrusting attacks that track the opponent."
                    ),
                    MoveInfo(
                        name = "Rose Finale",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate rapier combination with multiple hits and good range."
                    )
                )
            ),
            MoveCategory(
                name = "Unique Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Noble Advance",
                        input = "→ + B",
                        description = "Forward-stepping thrust that can be canceled."
                    ),
                    MoveInfo(
                        name = "Royal Defense",
                        input = "← + C",
                        description = "Defensive stance that reduces damage from next hit."
                    )
                )
            )
        ),
        "genjuro" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Jakura Rensatsu",
                        input = "↓↘→ + A/B/C",
                        description = "Multiple hitting slash combo. C version has most hits."
                    ),
                    MoveInfo(
                        name = "Hyuga Tsubamegaeshi",
                        input = "↓↙← + A/B/C",
                        description = "Anti-air rising slash. B version best for combos."
                    ),
                    MoveInfo(
                        name = "Shiden Issen",
                        input = "→↓↘ + A/B/C",
                        description = "Fast rushing slash. A version is safest on block."
                    ),
                    MoveInfo(
                        name = "Nukite Sashi",
                        input = "↓↘→ + D",
                        description = "Quick thrust attack that can be followed up."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Ougi: Yasha Kari",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple hitting demon slash with good range."
                    ),
                    MoveInfo(
                        name = "Ougi: Meikyo Shisui",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate iaijutsu technique with counter properties."
                    )
                )
            ),
            MoveCategory(
                name = "Unique Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Demon Slice",
                        input = "→ + C",
                        description = "Overhead slash that must be blocked standing."
                    ),
                    MoveInfo(
                        name = "Shadow Step",
                        input = "↓ + D",
                        description = "Quick low attack that can chain into specials."
                    )
                )
            )
        ),
        "hanzo" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Mozu Shuriken",
                        input = "↓↘→ + A/B/C",
                        description = "Throws multiple shuriken. Button strength determines pattern."
                    ),
                    MoveInfo(
                        name = "Shinobi Brai",
                        input = "↓↙← + A/B/C",
                        description = "Rising blade attack. Good anti-air option."
                    ),
                    MoveInfo(
                        name = "Ninja Dash",
                        input = "→↓↘ + A/B/C",
                        description = "Quick forward dash with follow-up options."
                    ),
                    MoveInfo(
                        name = "Shadow Clone",
                        input = "↓↘→ + D",
                        description = "Creates clone for mix-up potential."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Ninja Storm",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple shadow clone attacks from different angles."
                    ),
                    MoveInfo(
                        name = "Shinobi Execution",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate ninjutsu combination with teleports."
                    )
                )
            ),
            MoveCategory(
                name = "Unique Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Kunai Throw",
                        input = "→ + A (in air)",
                        description = "Throws kunai while jumping."
                    ),
                    MoveInfo(
                        name = "Smoke Bomb",
                        input = "↓ + D",
                        description = "Creates smoke screen for mix-ups."
                    )
                )
            )
        ),
        "tam_tam" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Fire Wave",
                        input = "↓↘→ + A/B/C",
                        description = "Launches fire projectile. C version has multiple hits."
                    ),
                    MoveInfo(
                        name = "Tribal Rise",
                        input = "↓↙← + A/B/C",
                        description = "Rising anti-air attack with good priority."
                    ),
                    MoveInfo(
                        name = "Mask Charge",
                        input = "→↓↘ + A/B/C",
                        description = "Rushing attack with armor properties."
                    ),
                    MoveInfo(
                        name = "Fire Dance",
                        input = "↓↘→ + D",
                        description = "Spinning flame attack with invincibility."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Inferno Wave",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple fire projectiles that cover screen."
                    ),
                    MoveInfo(
                        name = "Tribal Judgment",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate combination of fire and mask attacks."
                    )
                )
            ),
            MoveCategory(
                name = "Unique Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Mask Crush",
                        input = "→ + C",
                        description = "Unblockable mask attack with long startup."
                    ),
                    MoveInfo(
                        name = "Ground Pound",
                        input = "↓ + C",
                        description = "Creates flame pillar from ground."
                    )
                )
            )
        ),
        "earthquake" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Chain Grab",
                        input = "↓↘→ + A/B/C",
                        description = "Long-range command grab. C version has best range."
                    ),
                    MoveInfo(
                        name = "Rising Mountain",
                        input = "↓↙← + A/B/C",
                        description = "Anti-air chain attack with follow-ups."
                    ),
                    MoveInfo(
                        name = "Tremor Step",
                        input = "→↓↘ + A/B/C",
                        description = "Ground-shaking rush attack."
                    ),
                    MoveInfo(
                        name = "Poison Cloud",
                        input = "↓↘→ + D",
                        description = "Creates toxic gas cloud for pressure."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Earthquake Slam",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple chain and body attacks with armor."
                    ),
                    MoveInfo(
                        name = "Giant's Wrath",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate combination of grabs and slams."
                    )
                )
            ),
            MoveCategory(
                name = "Unique Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Belly Flop",
                        input = "→ + C",
                        description = "Unblockable body press with huge damage."
                    ),
                    MoveInfo(
                        name = "Rolling Thunder",
                        input = "→ + B",
                        description = "Forward rolling attack that can go under projectiles."
                    )
                )
            )
        ),
        "ukyo" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Tsubame Gaeshi",
                        input = "↓↘→ + A/B/C",
                        description = "Rising anti-air slash. A version is fastest."
                    ),
                    MoveInfo(
                        name = "Yanagi Barai",
                        input = "↓↙← + A/B/C",
                        description = "Low sweeping blade wave. C version goes fullscreen."
                    ),
                    MoveInfo(
                        name = "Zanzou Ken",
                        input = "→↓↘ + A/B/C",
                        description = "Quick forward-moving slash with follow-ups."
                    ),
                    MoveInfo(
                        name = "Tsubame Return",
                        input = "↓↘→ + D",
                        description = "Backward leap slash for spacing."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Hiken: Tsubame Rokuren",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple swallow slashes with good range."
                    ),
                    MoveInfo(
                        name = "Hiken: Sasameyuki",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate iaijutsu technique with cherry blossoms."
                    )
                )
            ),
            MoveCategory(
                name = "Unique Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Sake Splash",
                        input = "→ + D",
                        description = "Throws sake to stun opponent briefly."
                    ),
                    MoveInfo(
                        name = "Tsubame Counter",
                        input = "← + C",
                        description = "Counter stance against high attacks."
                    )
                )
            )
        ),
        "galford" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Plasma Blade",
                        input = "↓↘→ + A/B/C",
                        description = "Lightning projectile. C version has multiple hits."
                    ),
                    MoveInfo(
                        name = "Lightning Flip",
                        input = "↓↙← + A/B/C",
                        description = "Rising somersault slash with invincibility."
                    ),
                    MoveInfo(
                        name = "Poppy Attack",
                        input = "→↓↘ + A/B/C",
                        description = "Sends Poppy to attack. Button changes pattern."
                    ),
                    MoveInfo(
                        name = "Thunder Dive",
                        input = "↓↘→ + D",
                        description = "Diving kick with lightning properties."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Lightning Storm",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple lightning strikes with Poppy assist."
                    ),
                    MoveInfo(
                        name = "Thunder God's Rage",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate lightning combination with teleports."
                    )
                )
            ),
            MoveCategory(
                name = "Unique Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Poppy Call",
                        input = "→ + D",
                        description = "Calls Poppy for a quick attack."
                    ),
                    MoveInfo(
                        name = "Lightning Flash",
                        input = "← + C",
                        description = "Quick advancing slash with electricity."
                    )
                )
            )
        ),
        "yoshitora" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "First Blade: Suzume",
                        input = "↓↘→ + A",
                        description = "Quick draw with the first sword. Good for pressure."
                    ),
                    MoveInfo(
                        name = "Second Blade: Tsubame",
                        input = "↓↘→ + B",
                        description = "Mid-range slash with the second sword. Strong anti-air."
                    ),
                    MoveInfo(
                        name = "Third Blade: Karasu",
                        input = "↓↘→ + C",
                        description = "Heavy overhead strike. Must be blocked high."
                    ),
                    MoveInfo(
                        name = "Fourth Blade: Washi",
                        input = "↓↙← + A/B/C",
                        description = "Rising blade attack. Different buttons change angle."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Seven Swords Dance",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Unleashes all seven swords in a devastating combo."
                    ),
                    MoveInfo(
                        name = "Shogunate's Judgment",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate combination using all named swords."
                    )
                )
            ),
            MoveCategory(
                name = "Unique Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Fifth Blade: Taka",
                        input = "→ + B",
                        description = "Quick advancing slash that can be canceled."
                    ),
                    MoveInfo(
                        name = "Sixth Blade: Hayabusa",
                        input = "← + C",
                        description = "Counter stance that leads to powerful punish."
                    )
                )
            )
        ),
        "jubei" to listOf(
            MoveCategory(
                name = "Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Yagyu-ryu: Swallow Cut",
                        input = "↓↘→ + A/B/C",
                        description = "Quick advancing slash. Different buttons change distance."
                    ),
                    MoveInfo(
                        name = "Yagyu-ryu: Rising Moon",
                        input = "↓↙← + A/B/C",
                        description = "Anti-air slash with good invincibility."
                    ),
                    MoveInfo(
                        name = "Yagyu-ryu: Shadow Step",
                        input = "→↓↘ + A/B/C",
                        description = "Quick movement followed by slash. Good for mix-ups."
                    ),
                    MoveInfo(
                        name = "Yagyu-ryu: Low Strike",
                        input = "↓↘→ + D",
                        description = "Low sweeping attack that must be blocked low."
                    )
                )
            ),
            MoveCategory(
                name = "Super Special Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Yagyu Secret: Moonlight Dance",
                        input = "↓↘→↓↘→ + A/B/C",
                        description = "Multiple quick slashes from different angles."
                    ),
                    MoveInfo(
                        name = "Yagyu Ultimate: Shadow Blade",
                        input = "↓↙←↙↓↘→ + A/B/C",
                        description = "Ultimate technique combining speed and power."
                    )
                )
            ),
            MoveCategory(
                name = "Unique Moves",
                moves = listOf(
                    MoveInfo(
                        name = "Quick Draw",
                        input = "→ + B",
                        description = "Fast horizontal slash with good range."
                    ),
                    MoveInfo(
                        name = "Counter Stance",
                        input = "← + C",
                        description = "Defensive stance that can punish attacks."
                    )
                )
            )
        )
    )
}

data class MoveCategory(
    val name: String,
    val moves: List<MoveInfo>
)

data class MoveInfo(
    val name: String,
    val input: String,
    val description: String
) 