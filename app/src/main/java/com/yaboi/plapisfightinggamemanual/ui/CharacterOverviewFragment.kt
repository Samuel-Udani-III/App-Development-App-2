package com.yaboi.plapisfightinggamemanual.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.yaboi.plapisfightinggamemanual.R
import com.yaboi.plapisfightinggamemanual.data.CharacterDetails

class CharacterOverviewFragment : Fragment() {
    private var characterDetails: CharacterDetails? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            characterDetails = it.getParcelable(ARG_CHARACTER_DETAILS)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_character_overview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        characterDetails?.let { details ->
            view.findViewById<TextView>(R.id.playstyleText).text = details.playstyle

            val strengthsText = details.strengths.joinToString("\n") { "• $it" }
            view.findViewById<TextView>(R.id.strengthsText).text = strengthsText

            val weaknessesText = details.weaknesses.joinToString("\n") { "• $it" }
            view.findViewById<TextView>(R.id.weaknessesText).text = weaknessesText
        }
    }

    companion object {
        private const val ARG_CHARACTER_DETAILS = "character_details"

        fun newInstance(characterDetails: CharacterDetails) =
            CharacterOverviewFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_CHARACTER_DETAILS, characterDetails)
                }
            }
    }
} 