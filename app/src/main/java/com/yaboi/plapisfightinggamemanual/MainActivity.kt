package com.yaboi.plapisfightinggamemanual

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.yaboi.plapisfightinggamemanual.data.PreferencesManager
import com.yaboi.plapisfightinggamemanual.ui.FavoritesFragment
import com.yaboi.plapisfightinggamemanual.ui.SearchFragment

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var topAppBar: MaterialToolbar
    private lateinit var preferencesManager: PreferencesManager
    private var welcomeDialog: androidx.appcompat.app.AlertDialog? = null
    private var isThemeChanging = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        preferencesManager = FightingGameManualApp.getInstance().preferencesManager
        
        // Apply theme before setting content view
        delegate.localNightMode = if (preferencesManager.isDarkMode) {
            AppCompatDelegate.MODE_NIGHT_YES
        } else {
            AppCompatDelegate.MODE_NIGHT_NO
        }
        
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.gamesRecyclerView)
        bottomNavigation = findViewById(R.id.bottomNavigation)
        topAppBar = findViewById(R.id.topAppBar)

        setSupportActionBar(topAppBar)

        recyclerView.layoutManager = LinearLayoutManager(this)
        setupGames()
        setupBottomNavigation()

        // Handle show favorites intent
        if (intent.getBooleanExtra("SHOW_FAVORITES", false)) {
            showFavoritesFragment()
            bottomNavigation.selectedItemId = R.id.navigation_favorites
        }

        // Handle show search intent
        if (intent.action == "SHOW_SEARCH") {
            showSearchFragment()
            bottomNavigation.selectedItemId = R.id.navigation_search
        }

        // Show welcome dialog if this is a fresh start (not a recreation)
        if (savedInstanceState == null) {
            showWelcomeDialog()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        welcomeDialog?.dismiss()
        welcomeDialog = null
    }

    private fun showWelcomeDialog() {
        val dialogView = layoutInflater.inflate(R.layout.dialog_welcome, null)
        
        // Create dialog with explicit handling
        val dialog = MaterialAlertDialogBuilder(this, com.google.android.material.R.style.ThemeOverlay_Material3_MaterialAlertDialog)
            .setView(dialogView)
            .setCancelable(false)
            .setOnDismissListener { 
                android.util.Log.d("MainActivity", "Dialog dismissed")
                welcomeDialog = null 
            }
            .setOnCancelListener {
                android.util.Log.d("MainActivity", "Dialog cancelled")
            }
            .create()

        // Prevent any automatic dismissal
        dialog.setCanceledOnTouchOutside(false)
        dialog.setOnShowListener {
            android.util.Log.d("MainActivity", "Dialog shown")
            // Ensure dialog can't be dismissed by back button or outside touches
            dialog.setCancelable(false)
            dialog.setCanceledOnTouchOutside(false)
        }

        // Handle the Get Started button click
        dialogView.findViewById<View>(R.id.btnGetStarted).setOnClickListener {
            android.util.Log.d("MainActivity", "Get Started clicked")
            dialog.dismiss()
            welcomeDialog = null
        }

        // Show dialog and store reference
        welcomeDialog = dialog
        android.util.Log.d("MainActivity", "Showing welcome dialog")
        dialog.show()
    }

    override fun onResume() {
        super.onResume()
        // Re-show dialog if needed, but not during theme changes
        if (welcomeDialog?.isShowing != true && !isThemeChanging) {
            android.util.Log.d("MainActivity", "Re-showing welcome dialog in onResume")
            showWelcomeDialog()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.top_app_bar, menu)
        updateThemeIcon(menu.findItem(R.id.action_toggle_theme))
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_toggle_theme -> {
                toggleDarkMode()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun toggleDarkMode() {
        // Dismiss any existing dialog before theme change
        welcomeDialog?.dismiss()
        welcomeDialog = null

        // Change the theme
        preferencesManager.isDarkMode = !preferencesManager.isDarkMode
        
        // Apply the theme change without recreating the activity
        delegate.localNightMode = if (preferencesManager.isDarkMode) {
            AppCompatDelegate.MODE_NIGHT_YES
        } else {
            AppCompatDelegate.MODE_NIGHT_NO
        }
        
        // Update the theme icon
        updateThemeIcon(topAppBar.menu.findItem(R.id.action_toggle_theme))
    }

    private fun updateThemeIcon(menuItem: MenuItem) {
        menuItem.setIcon(
            if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES)
                R.drawable.ic_light_mode
            else
                R.drawable.ic_dark_mode
        )
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        
        // Handle show favorites intent in onNewIntent as well
        if (intent.getBooleanExtra("SHOW_FAVORITES", false)) {
            showFavoritesFragment()
            bottomNavigation.selectedItemId = R.id.navigation_favorites
        }

        // Handle show search intent in onNewIntent as well
        if (intent.action == "SHOW_SEARCH") {
            showSearchFragment()
            bottomNavigation.selectedItemId = R.id.navigation_search
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
                        Game(                "kof15",                "The King of Fighters XV",                "The newest installment in SNK's flagship fighting game series, featuring 3v3 team battles.",                R.drawable.img_kof_fifteen,                R.drawable.banner_kof_fifteen            ),
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
        supportFragmentManager.findFragmentById(R.id.fragmentContainer)?.let {
            supportFragmentManager.beginTransaction()
                .remove(it)
                .commit()
        }
    }

    private fun showFavoritesFragment() {
        recyclerView.visibility = View.GONE
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        if (fragment !is FavoritesFragment) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, FavoritesFragment.newInstance())
                .commit()
        }
    }

    private fun showSearchFragment() {
        recyclerView.visibility = View.GONE
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        if (fragment !is SearchFragment) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SearchFragment.newInstance())
                .commit()
        }
    }

    private val handler = Handler(android.os.Looper.getMainLooper())
} 