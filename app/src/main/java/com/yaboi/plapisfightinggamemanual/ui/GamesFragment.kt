package com.yaboi.plapisfightinggamemanual.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yaboi.plapisfightinggamemanual.CharacterListActivity
import com.yaboi.plapisfightinggamemanual.Game
import com.yaboi.plapisfightinggamemanual.GameAdapter
import com.yaboi.plapisfightinggamemanual.R

class GamesFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_games, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.gamesRecyclerView)
        setupGames()
    }

    private fun setupGames() {
        val games = listOf(
            Game(
                "ggst",
                "Guilty Gear -Strive-",
                "The latest entry in the Guilty Gear series, featuring stunning anime-style graphics and intense gameplay.",
                R.drawable.img_guilty_gear_strive,
                R.drawable.img_guilty_gear_strive
            ),
            Game(
                "kof15",
                "The King of Fighters XV",
                "The newest installment in SNK's flagship fighting game series.",
                R.drawable.img_kof_fifteen,
                R.drawable.img_kof_fifteen
            ),
            Game(
                "samsho",
                "Samurai Shodown",
                "SNK's weapon-based fighting game focusing on precise strikes and punishing counters.",
                R.drawable.img_samurai_shodown,
                R.drawable.img_samurai_shodown
            ),
            Game(
                "cvs2",
                "Capcom vs. SNK 2",
                "The ultimate crossover between Capcom and SNK's legendary fighters.",
                R.drawable.cvs2,
                R.drawable.cvs2
            ),
            Game(
                "tekken7",
                "Tekken 7",
                "The latest entry in the legendary 3D fighting game series.",
                R.drawable.tekken,
                R.drawable.tekken
            )
        )

        val adapter = GameAdapter(games)
        recyclerView.apply {
            layoutManager = GridLayoutManager(requireContext(), 2)
            this.adapter = adapter
        }
    }
} 