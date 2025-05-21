package com.yaboi.plapisfightinggamemanual.data

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatDelegate

class PreferencesManager(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    private val editor = prefs.edit()

    // Dark Mode Preference
    var isDarkMode: Boolean
        get() = prefs.getBoolean(KEY_DARK_MODE, false)
        set(value) {
            editor.putBoolean(KEY_DARK_MODE, value).apply()
            AppCompatDelegate.setDefaultNightMode(
                if (value) AppCompatDelegate.MODE_NIGHT_YES
                else AppCompatDelegate.MODE_NIGHT_NO
            )
        }

    // First Launch Flag
    var isFirstLaunch: Boolean
        get() = prefs.getBoolean(KEY_FIRST_LAUNCH, true)
        set(value) {
            editor.putBoolean(KEY_FIRST_LAUNCH, value).apply()
        }

    // Default Game Selection
    var defaultGame: String
        get() = prefs.getString(KEY_DEFAULT_GAME, "ggst") ?: "ggst"
        set(value) {
            editor.putString(KEY_DEFAULT_GAME, value).apply()
        }

    // Search History (stores last 10 searches)
    fun addSearchQuery(query: String) {
        val searches = getSearchHistory().toMutableList()
        // Remove if exists (to avoid duplicates)
        searches.remove(query)
        // Add to front
        searches.add(0, query)
        // Keep only last 10
        while (searches.size > 10) {
            searches.removeAt(searches.size - 1)
        }
        editor.putString(KEY_SEARCH_HISTORY, searches.joinToString(",")).apply()
    }

    fun getSearchHistory(): List<String> {
        val history = prefs.getString(KEY_SEARCH_HISTORY, "") ?: ""
        return if (history.isEmpty()) emptyList() else history.split(",")
    }

    fun clearSearchHistory() {
        editor.remove(KEY_SEARCH_HISTORY).apply()
    }

    // Clear all preferences
    fun clearAll() {
        editor.clear().apply()
    }

    companion object {
        private const val PREFS_NAME = "fighting_game_manual_prefs"
        private const val KEY_DARK_MODE = "dark_mode"
        private const val KEY_FIRST_LAUNCH = "first_launch"
        private const val KEY_DEFAULT_GAME = "default_game"
        private const val KEY_SEARCH_HISTORY = "search_history"
    }
} 