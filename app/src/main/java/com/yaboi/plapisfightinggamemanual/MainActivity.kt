package com.yaboi.plapisfightinggamemanual

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.yaboi.plapisfightinggamemanual.ui.FavoritesFragment
import com.yaboi.plapisfightinggamemanual.ui.SearchFragment

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.gamesRecyclerView)
        bottomNavigation = findViewById(R.id.bottomNavigation)
        titleTextView = findViewById(R.id.titleTextView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        setupGames()
        setupBottomNavigation()

        // Handle show favorites intent
        if (intent.getBooleanExtra("SHOW_FAVORITES", false)) {
            showFavoritesFragment()
            bottomNavigation.selectedItemId = R.id.navigation_favorites
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        
        // Handle show favorites intent in onNewIntent as well
        if (intent.getBooleanExtra("SHOW_FAVORITES", false)) {
            showFavoritesFragment()
            bottomNavigation.selectedItemId = R.id.navigation_favorites
        }
    }

    private fun setupGames() {
        val games = listOf(
            Game(
                "ggst",
                "Guilty Gear Strive",
                "The latest entry in the Guilty Gear series, featuring stunning anime-style graphics and intense fighting mechanics.",
                R.drawable.img_guilty_gear_strive,
                R.drawable.banner_guilty_gear_strive
            ),
            Game(
                "kof15",
                "The King of Fighters XV",
                "The newest installment in SNK's flagship fighting game series, featuring 3v3 team battles.",
                R.drawable.img_kof_fifteen,
                R.drawable.img_kof_fifteen
            ),
            Game(
                "samsho",
                "Samurai Shodown",
                "A weapons-based fighting game focusing on precise strikes and punishing counters.",
                R.drawable.img_samurai_shodown,
                R.drawable.img_samurai_shodown
            ),
            Game(
                "cvs2",
                "Capcom vs SNK 2",
                "A legendary crossover fighting game featuring characters from both Capcom and SNK universes.",
                R.drawable.cvs2,
                R.drawable.cvs2
            ),
            Game(
                "tekken7",
                "Tekken 7",
                "The latest entry in the Tekken series, known for its 3D fighting system and complex mechanics.",
                R.drawable.tekken,
                R.drawable.tekken
            )
        )

        val adapter = GameAdapter(games)
        recyclerView.adapter = adapter
    }

    private fun setupBottomNavigation() {
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_games -> {
                    showGamesView()
                    true
                }
                R.id.navigation_favorites -> {
                    showFavoritesFragment()
                    true
                }
                R.id.navigation_search -> {
                    showSearchFragment()
                    true
                }
                else -> false
            }
        }
    }

    private fun showGamesView() {
        recyclerView.visibility = View.VISIBLE
        titleTextView.visibility = View.VISIBLE
        supportFragmentManager.findFragmentById(R.id.fragmentContainer)?.let {
            supportFragmentManager.beginTransaction()
                .remove(it)
                .commit()
        }
    }

    private fun showFavoritesFragment() {
        recyclerView.visibility = View.GONE
        titleTextView.visibility = View.GONE
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        if (fragment !is FavoritesFragment) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, FavoritesFragment.newInstance())
                .commit()
        }
    }

    private fun showSearchFragment() {
        recyclerView.visibility = View.GONE
        titleTextView.visibility = View.GONE
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        if (fragment !is SearchFragment) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SearchFragment.newInstance())
                .commit()
        }
    }
} 