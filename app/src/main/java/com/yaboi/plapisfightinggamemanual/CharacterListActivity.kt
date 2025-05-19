package com.yaboi.plapisfightinggamemanual

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.yaboi.plapisfightinggamemanual.ui.CharacterDetailActivity

class CharacterListActivity : AppCompatActivity(), CharacterAdapter.OnCharacterClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var gameTitleView: TextView
    private lateinit var adapter: CharacterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_list)

        recyclerView = findViewById(R.id.charactersRecyclerView)
        bottomNavigation = findViewById(R.id.bottomNavigation)
        gameTitleView = findViewById(R.id.gameTitleTextView)

        val gameId = intent.getStringExtra("GAME_ID") ?: "ggst"
        val gameTitle = intent.getStringExtra("GAME_TITLE") ?: "Unknown Game"

        gameTitleView.text = gameTitle
        recyclerView.layoutManager = LinearLayoutManager(this)
        setupCharacters(gameId)
        setupBottomNavigation()
    }

    private fun setupCharacters(gameId: String) {
        val characters = getCharacterList(gameId)

        adapter = CharacterAdapter(characters, this)
        recyclerView.adapter = adapter
    }

    private fun getCharacterList(gameId: String): List<Character> {
        return when (gameId) {
            "ggst" -> listOf(
                Character(
                    "sol",
                    "Sol Badguy",
                    "Rushdown",
                    "The main protagonist of Guilty Gear. A powerful rushdown character with high damage potential.",
                    R.drawable.char_ggst_sol,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "ky",
                    "Ky Kiske",
                    "Balanced",
                    "A well-rounded character with strong fundamentals and good zoning tools.",
                    R.drawable.char_ggst_ky,
                    "Beginner",
                    gameId
                ),
                Character(
                    "may",
                    "May",
                    "Balanced",
                    "A pirate girl who fights with a massive anchor, known for her strong mix-up game and dolphin-based attacks.",
                    R.drawable.char_ggst_may,
                    "Beginner",
                    gameId
                ),
                Character(
                    "zato",
                    "Zato-1",
                    "Technical",
                    "A complex fighter who can control his shadow Eddie to create overwhelming pressure and mix-ups.",
                    R.drawable.char_ggst_zato,
                    "Expert",
                    gameId
                ),
                Character(
                    "millia",
                    "Millia Rage",
                    "Rushdown",
                    "An agile assassin who uses her magical hair to create devastating mix-up opportunities.",
                    R.drawable.char_ggst_millia,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "chipp",
                    "Chipp Zanuff",
                    "Rushdown",
                    "A ninja with incredible speed and mobility, but low health. Excels at overwhelming opponents.",
                    R.drawable.char_ggst_chipp,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "potemkin",
                    "Potemkin",
                    "Grappler",
                    "A massive grappler with super armor moves and devastating command grabs.",
                    R.drawable.char_ggst_potemkin,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "faust",
                    "Faust",
                    "Unorthodox",
                    "An unpredictable doctor who uses random items and long-range pokes to control the fight.",
                    R.drawable.char_ggst_faust,
                    "Expert",
                    gameId
                ),
                Character(
                    "axl",
                    "Axl Low",
                    "Zoner",
                    "A British time traveler who excels at keeping opponents away with his chain weapons.",
                    R.drawable.char_ggst_axl,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "ramlethal",
                    "Ramlethal Valentine",
                    "Balanced",
                    "A powerful fighter who controls two massive swords for devastating corner pressure.",
                    R.drawable.char_ggst_ramlethal,
                    "Intermediate",
                    gameId
                )
            )
            "kof15" -> listOf(
                Character(
                    "kyo",
                    "Kyo Kusanagi",
                    "Balanced",
                    "The face of KOF, wielding crimson flames. A well-rounded fighter with strong pressure and combo potential.",
                    R.drawable.char_kof15_kyo,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "iori",
                    "Iori Yagami",
                    "Rushdown",
                    "Kyo's eternal rival who uses purple flames. Aggressive fighter with powerful mix-ups and rekka combinations.",
                    R.drawable.char_kof15_iori,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "terry",
                    "Terry Bogard",
                    "Balanced",
                    "The Legendary Wolf from Fatal Fury. Uses powerful ground-based attacks and classic moves like Power Wave and Buster Wolf.",
                    R.drawable.char_kof15_terry,
                    "Beginner",
                    gameId
                ),
                Character(
                    "mai",
                    "Mai Shiranui",
                    "Rushdown",
                    "The alluring kunoichi. Specializes in aerial attacks and quick mix-ups with her fan techniques.",
                    R.drawable.char_kof15_mai,
                    "Beginner",
                    gameId
                ),
                Character(
                    "k",
                    "K'",
                    "Technical",
                    "The artificial flame wielder. Technical fighter with unique cancels and powerful counter-hit setups.",
                    R.drawable.char_kof15_k,
                    "Expert",
                    gameId
                ),
                Character(
                    "athena",
                    "Athena Asamiya",
                    "Balanced",
                    "The Psycho Soldier idol. Uses psychic powers for projectiles and has strong anti-air options.",
                    R.drawable.char_kof15_athena,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "ralf",
                    "Ralf Jones",
                    "Rushdown",
                    "The Ikari Warrior powerhouse. Uses devastating grapples and powerful punch attacks.",
                    R.drawable.char_kof15_ralf,
                    "Beginner",
                    gameId
                ),
                Character(
                    "king",
                    "King",
                    "Zoner",
                    "The Muay Thai expert. Excels at keeping opponents at bay with strong kick attacks and projectiles.",
                    R.drawable.char_kof15_king,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "shermie",
                    "Shermie",
                    "Grappler",
                    "The lightning-wielding wrestler. Specializes in command grabs and devastating mix-ups.",
                    R.drawable.char_kof15_shermie,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "leona",
                    "Leona Heidern",
                    "Technical",
                    "The stoic Ikari Warrior. Uses explosive attacks and has unique V-Slasher techniques.",
                    R.drawable.char_kof15_leona,
                    "Expert",
                    gameId
                )
            )
            "samsho" -> listOf(
                Character(
                    "haohmaru",
                    "Haohmaru",
                    "Balanced",
                    "The main protagonist wielding the Fugudoku style. A well-rounded samurai with powerful single strikes.",
                    R.drawable.char_samsho_haomaru,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "nakoruru",
                    "Nakoruru",
                    "Technical",
                    "An Ainu priestess who fights alongside her hawk Mamahaha. Specializes in aerial mobility and quick strikes.",
                    R.drawable.char_samsho_nakoruru,
                    "Expert",
                    gameId
                ),
                Character(
                    "genjuro",
                    "Genjuro Kibagami",
                    "Rushdown",
                    "A ruthless rival to Haohmaru. Uses devastating iaijutsu techniques and powerful mix-ups.",
                    R.drawable.char_samsho_genjuro,
                    "Expert",
                    gameId
                ),
                Character(
                    "charlotte",
                    "Charlotte Christine de Colde",
                    "Balanced",
                    "A noble French fencer. Uses precise thrusts and elegant swordplay to control space.",
                    R.drawable.char_samsho_charlotte,
                    "Beginner",
                    gameId
                ),
                Character(
                    "ukyo",
                    "Ukyo Tachibana",
                    "Technical",
                    "A masterful iaijutsu practitioner. Specializes in quick draws and precise single strikes.",
                    R.drawable.char_samsho_ukyo,
                    "Expert",
                    gameId
                ),
                Character(
                    "galford",
                    "Galford D. Weller",
                    "Rushdown",
                    "An American ninja who fights alongside his dog Poppy. Uses quick attacks and ninja techniques.",
                    R.drawable.char_samsho_galford,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "yoshitora",
                    "Yoshitora Tokugawa",
                    "Technical",
                    "The seventh shogunate heir. Wields seven named swords with unique properties.",
                    R.drawable.char_samsho_yoshitora,
                    "Expert",
                    gameId
                ),
                Character(
                    "hanzo",
                    "Hanzo Hattori",
                    "Balanced",
                    "The legendary ninja. Combines traditional ninja techniques with powerful weapon attacks.",
                    R.drawable.char_samsho_hanzo,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "tam_tam",
                    "Tam Tam",
                    "Zoner",
                    "A Green Hell guardian wielding a giant sword. Excels at long-range combat with extending attacks.",
                    R.drawable.char_samsho_tam_tam,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "jubei",
                    "Jubei Yagyu",
                    "Technical",
                    "A legendary swordsman. Uses his small size and quick strikes to overwhelm opponents.",
                    R.drawable.char_samsho_jubei,
                    "Expert",
                    gameId
                ),
                                Character(                    "earthquake",                    "Earthquake",                    "Grappler",                    "A massive ninja who uses his chain-sickle and size to dominate space. Combines powerful grabs with unique zoning abilities.",                    R.drawable.char_samsho_earthquake,                    "Intermediate",                    gameId                )
            )
            "cvs2" -> listOf(
                Character(
                    "ryu",
                    "Ryu",
                    "Balanced",
                    "The quintessential shoto character who excels at fundamental fighting game mechanics.",
                    R.drawable.char_cvs2_ryu,
                    "Beginner",
                    gameId
                ),
                Character(
                    "ken",
                    "Ken",
                    "Rushdown",
                    "An aggressive shoto character who specializes in close-range pressure and devastating combos.",
                    R.drawable.char_cvs2_ken,
                    "Beginner",
                    gameId
                ),
                Character(
                    "sagat",
                    "Sagat",
                    "Zoner",
                    "The Emperor of Muay Thai who excels at long-range combat with powerful Tiger shots.",
                    R.drawable.char_cvs2_sagat,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "kyo",
                    "Kyo Kusanagi",
                    "Rushdown",
                    "The heir of the Kusanagi clan who uses powerful flame-based attacks.",
                    R.drawable.char_cvs2_kyo,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "iori",
                    "Iori Yagami",
                    "Balanced",
                    "The heir of the Yagami clan who uses brutal claw attacks and purple flames.",
                    R.drawable.char_cvs2_iori,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "terry",
                    "Terry Bogard",
                    "Balanced",
                    "The Legendary Wolf who uses powerful ground-based attacks.",
                    R.drawable.char_cvs2_terry,
                    "Beginner",
                    gameId
                )
            )
            "tekken7" -> listOf(
                Character(
                    "kazuya",
                    "Kazuya Mishima",
                    "Technical",
                    "A powerful fighter utilizing the Mishima Style Fighting Karate. Master of the Electric Wind God Fist.",
                    R.drawable.char_tekken7_kazuya,
                    "Expert",
                    gameId
                ),
                Character(
                    "jin",
                    "Jin Kazama",
                    "Technical",
                    "Combines Mishima Style Karate with traditional Karate. Features a unique stance system and powerful counter hits.",
                    R.drawable.char_tekken7_jin,
                    "Expert",
                    gameId
                ),
                Character(
                    "heihachi",
                    "Heihachi Mishima",
                    "Technical",
                    "The patriarch of the Mishima clan. Aggressive fighter with powerful throws and devastating mix-ups.",
                    R.drawable.char_tekken7_heihachi,
                    "Expert",
                    gameId
                ),
                Character(
                    "paul",
                    "Paul Phoenix",
                    "Balanced",
                    "Hot-blooded fighter known for his devastating Phoenix Smasher. High-damage character with simple but effective moves.",
                    R.drawable.char_tekken7_paul,
                    "Beginner",
                    gameId
                ),
                Character(
                    "law",
                    "Marshall Law",
                    "Rushdown",
                    "The legendary martial artist inspired by Bruce Lee. Features fast attacks and powerful combo potential.",
                    R.drawable.char_tekken7_law,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "king",
                    "King",
                    "Grappler",
                    "The masked wrestler with devastating chain throws. Excels at ground game and throw mix-ups.",
                    R.drawable.char_tekken7_king,
                    "Expert",
                    gameId
                ),
                Character(
                    "bryan",
                    "Bryan Fury",
                    "Balanced",
                    "A cyborg with powerful counter hits and devastating kicks. Excels at keeping pressure with his Taunt.",
                    R.drawable.char_tekken7_bryan,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "hwoarang",
                    "Hwoarang",
                    "Rushdown",
                    "Tae Kwon Do master with complex stance transitions. Specializes in pressure and mix-up heavy gameplay.",
                    R.drawable.char_tekken7_hwoarang,
                    "Expert",
                    gameId
                ),
                Character(
                    "xiaoyu",
                    "Ling Xiaoyu",
                    "Technical",
                    "Agile fighter using Chinese martial arts. Features evasive movements and tricky mix-ups.",
                    R.drawable.char_tekken7_xiaoyu,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "nina",
                    "Nina Williams",
                    "Balanced",
                    "Professional assassin with strong poking game. Features fast attacks and devastating chain throws.",
                    R.drawable.char_tekken7_nina,
                    "Intermediate",
                    gameId
                ),
                Character(
                    "steve",
                    "Steve Fox",
                    "Technical",
                    "Boxing champion with unique movement and stance system. Specializes in high-damage counter hits.",
                    R.drawable.char_tekken7_steve,
                    "Expert",
                    gameId
                ),
                Character(
                    "asuka",
                    "Asuka Kazama",
                    "Balanced",
                    "Defensive specialist with powerful counter moves. Great for punishing opponent's mistakes.",
                    R.drawable.char_tekken7_asuka,
                    "Beginner",
                    gameId
                )
            )
            else -> emptyList()
        }
    }

    private fun setupBottomNavigation() {
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_games -> {
                    finish() // Go back to main activity
                    true
                }
                R.id.navigation_favorites -> {
                    // Always navigate to MainActivity's favorites section for consistency
                    val intent = Intent(this, MainActivity::class.java).apply {
                        putExtra("SHOW_FAVORITES", true)
                        flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                    }
                    startActivity(intent)
                    true
                }
                R.id.navigation_search -> {
                    Toast.makeText(this, "Search - Coming Soon", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }

    override fun onCharacterClick(character: Character) {
        val intent = CharacterDetailActivity.newIntent(
            context = this,
            characterId = character.id,
            gameId = character.gameId
        )
        startActivity(intent)
    }
} 