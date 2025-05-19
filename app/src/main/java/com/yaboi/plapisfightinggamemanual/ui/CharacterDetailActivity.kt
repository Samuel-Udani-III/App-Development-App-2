package com.yaboi.plapisfightinggamemanual.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.yaboi.plapisfightinggamemanual.R
import com.yaboi.plapisfightinggamemanual.data.*

class CharacterDetailActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private var characterDetails: CharacterDetails? = null
    private var gameId: String = "ggst"  // Default to ggst

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_detail)

        val characterId = intent.getStringExtra(EXTRA_CHARACTER_ID)
        gameId = intent.getStringExtra(EXTRA_GAME_ID) ?: "ggst"
        val moveToHighlight = intent.getStringExtra(EXTRA_MOVE_TO_HIGHLIGHT)

        if (characterId == null) {
            finish()
            return
        }

        characterDetails = try {
            when (gameId) {
                "ggst" -> GuiltyGearStriveRepository.getCharacterDetails(characterId)
                "kof15" -> KingOfFighters15Repository.getCharacterDetails(characterId)
                "samsho" -> SamuraiShodownRepository.getCharacterDetails(characterId)
                "cvs2" -> CapcomVsSNK2Repository.getCharacterDetails(characterId)
                "tekken7" -> TekkenRepository.getCharacterDetails(characterId)
                else -> null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }

        if (characterDetails == null) {
            Toast.makeText(this, "Error loading character details", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        setupViews()
        setupViewPager()
        setupTabLayout()

        // If we have a move to highlight, switch to the moves tab
        if (moveToHighlight != null) {
            viewPager.currentItem = 1 // Switch to moves tab
        }
    }

    private fun setupViews() {
        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
    }

    private fun setupViewPager() {
        val pagerAdapter = object : FragmentStateAdapter(this) {
            override fun getItemCount() = 2

            override fun createFragment(position: Int): Fragment {
                val details = characterDetails ?: return Fragment()
                val moveToHighlight = intent.getStringExtra(EXTRA_MOVE_TO_HIGHLIGHT)
                return when (position) {
                    0 -> CharacterOverviewFragment.newInstance(details)
                    1 -> CharacterMovelistFragment.newInstance(details, gameId, moveToHighlight)
                    else -> Fragment()
                }
            }
        }

        viewPager.adapter = pagerAdapter
    }

    private fun setupTabLayout() {
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Overview"
                1 -> "Moves"
                else -> ""
            }
        }.attach()
    }

    companion object {
        private const val EXTRA_CHARACTER_ID = "character_id"
        private const val EXTRA_GAME_ID = "game_id"
        private const val EXTRA_MOVE_TO_HIGHLIGHT = "move_to_highlight"

        fun newIntent(context: Context, characterId: String, gameId: String, moveToHighlight: String? = null): Intent {
            return Intent(context, CharacterDetailActivity::class.java).apply {
                putExtra(EXTRA_CHARACTER_ID, characterId)
                putExtra(EXTRA_GAME_ID, gameId)
                moveToHighlight?.let { putExtra(EXTRA_MOVE_TO_HIGHLIGHT, it) }
            }
        }
    }
} 