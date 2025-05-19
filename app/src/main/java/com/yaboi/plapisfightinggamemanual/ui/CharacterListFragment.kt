package com.yaboi.plapisfightinggamemanual.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yaboi.plapisfightinggamemanual.Game
import com.yaboi.plapisfightinggamemanual.GameAdapter
import com.yaboi.plapisfightinggamemanual.R

class CharacterListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_character_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.gamesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val games = listOf(
            Game(
                "ggst",
                "Guilty Gear Strive",
                "The latest entry in the Guilty Gear series, featuring stunning anime-style graphics and intense fighting mechanics.",
                R.drawable.game_banner_placeholder,
                R.drawable.game_banner_placeholder
            ),
            Game(
                "kof15",
                "The King of Fighters XV",
                "The newest installment in SNK's flagship fighting game series, featuring 3v3 team battles.",
                R.drawable.game_banner_placeholder,
                R.drawable.game_banner_placeholder
            ),
            Game(
                "samsho",
                "Samurai Shodown",
                "A weapons-based fighting game focusing on precise strikes and punishing counters.",
                R.drawable.game_banner_placeholder,
                R.drawable.game_banner_placeholder
            ),
            Game(
                "cvs2",
                "Capcom vs SNK 2",
                "A legendary crossover fighting game featuring characters from both Capcom and SNK universes.",
                R.drawable.game_banner_placeholder,
                R.drawable.game_banner_placeholder
            ),
            Game(
                "tekken7",
                "Tekken 7",
                "The latest entry in the Tekken series, known for its 3D fighting system and complex mechanics.",
                R.drawable.game_banner_placeholder,
                R.drawable.game_banner_placeholder
            )
        )

        val adapter = GameAdapter(games)
        recyclerView.adapter = adapter
    }
} 