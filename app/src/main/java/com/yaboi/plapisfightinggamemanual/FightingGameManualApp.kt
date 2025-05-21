package com.yaboi.plapisfightinggamemanual

import android.app.Application
import com.yaboi.plapisfightinggamemanual.data.PreferencesManager

class FightingGameManualApp : Application() {
    lateinit var preferencesManager: PreferencesManager
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this
        preferencesManager = PreferencesManager(this)
    }

    companion object {
        private lateinit var instance: FightingGameManualApp

        fun getInstance(): FightingGameManualApp = instance
    }
} 