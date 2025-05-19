package com.yaboi.plapisfightinggamemanual.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import com.yaboi.plapisfightinggamemanual.R
import com.yaboi.plapisfightinggamemanual.data.CharacterDetails
import com.yaboi.plapisfightinggamemanual.data.FavoriteMove
import com.yaboi.plapisfightinggamemanual.data.Move
import com.yaboi.plapisfightinggamemanual.data.MoveType
import com.yaboi.plapisfightinggamemanual.viewmodel.FavoriteMoveViewModel

class CharacterMovelistFragment : Fragment() {
    private var characterDetails: CharacterDetails? = null
    private lateinit var moveListAdapter: MoveListAdapter
    private lateinit var tabLayout: TabLayout
    private lateinit var recyclerView: RecyclerView
    private lateinit var prevButton: MaterialButton
    private lateinit var nextButton: MaterialButton
    private var currentMoveTypeIndex = 0
    private lateinit var viewModel: FavoriteMoveViewModel
    private var gameId: String = ""
    private var moveToHighlight: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            characterDetails = it.getParcelable(ARG_CHARACTER_DETAILS)
            gameId = it.getString(ARG_GAME_ID, "")
            moveToHighlight = it.getString(ARG_MOVE_TO_HIGHLIGHT)
        }
        viewModel = ViewModelProvider(requireActivity())[FavoriteMoveViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_character_movelist, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (characterDetails == null) {
            Toast.makeText(context, "Error: Character details not found", Toast.LENGTH_SHORT).show()
            return
        }

        tabLayout = view.findViewById(R.id.moveTypeTabLayout)
        recyclerView = view.findViewById(R.id.moveListRecyclerView)
        prevButton = view.findViewById(R.id.prevButton)
        nextButton = view.findViewById(R.id.nextButton)

        setupRecyclerView()
        setupTabs()
        setupNavigationButtons()
        observeFavorites()
        
        // If we have a move to highlight, find its type and show that type's moves
        if (moveToHighlight != null) {
            val moveType = findMoveTypeForMove(moveToHighlight!!)
            if (moveType != null) {
                currentMoveTypeIndex = MoveType.values().indexOf(moveType)
                showMovesByType(moveType)
            } else {
                showMovesByType(MoveType.values()[currentMoveTypeIndex])
            }
        } else {
            showMovesByType(MoveType.values()[currentMoveTypeIndex])
        }
        
        updateNavigationButtons()
    }

    private fun findMoveTypeForMove(moveId: String): MoveType? {
        characterDetails?.moves?.forEach { (type, moves) ->
            if (moves.any { it.id == moveId }) {
                return type
            }
        }
        return null
    }

    private fun setupRecyclerView() {
        moveListAdapter = MoveListAdapter { move ->
            val isFavorite = viewModel.isMoveInFavorites(move.id)
            if (isFavorite) {
                viewModel.removeFromFavorites(move.id)
            } else {
                val favoriteMove = FavoriteMove(
                    moveId = move.id,
                    characterId = characterDetails?.id ?: "",
                    gameId = gameId,
                    moveName = move.name,
                    input = move.input,
                    damage = move.damage.toString(),
                    frameData = "Startup: ${move.startup}f, Recovery: ${move.recovery}f, On Block: ${move.onBlock}"
                )
                viewModel.addToFavorites(favoriteMove)
            }
        }
        recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = moveListAdapter
        }
    }

    private fun setupTabs() {
        val moveTypes = characterDetails?.moves?.keys?.toList() ?: MoveType.values().toList()
        moveTypes.forEach { moveType ->
            tabLayout.addTab(tabLayout.newTab().setText(moveType.name))
        }

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    currentMoveTypeIndex = it.position
                    val moveType = moveTypes[currentMoveTypeIndex]
                    showMovesByType(moveType)
                    updateNavigationButtons()
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    private fun setupNavigationButtons() {
        prevButton.setOnClickListener {
            if (currentMoveTypeIndex > 0) {
                currentMoveTypeIndex--
                tabLayout.getTabAt(currentMoveTypeIndex)?.select()
            }
        }

        nextButton.setOnClickListener {
            if (currentMoveTypeIndex < tabLayout.tabCount - 1) {
                currentMoveTypeIndex++
                tabLayout.getTabAt(currentMoveTypeIndex)?.select()
            }
        }
    }

    private fun updateNavigationButtons() {
        prevButton.isEnabled = currentMoveTypeIndex > 0
        nextButton.isEnabled = currentMoveTypeIndex < tabLayout.tabCount - 1
    }

    private fun observeFavorites() {
        viewModel.favorites.observe(viewLifecycleOwner) { favorites ->
            val favoriteIds = favorites.map { it.moveId }.toSet()
            characterDetails?.moves?.values?.flatten()?.forEach { move ->
                moveListAdapter.updateFavoriteState(move.id, move.id in favoriteIds)
            }
        }

        viewModel.favoriteStates.observe(viewLifecycleOwner) { favoriteStates ->
            characterDetails?.moves?.values?.flatten()?.forEach { move ->
                moveListAdapter.updateFavoriteState(move.id, favoriteStates[move.id] ?: false)
            }
        }
    }

    private fun showMovesByType(moveType: MoveType) {
        val moves = characterDetails?.moves?.get(moveType) ?: emptyList()
        moveListAdapter.submitList(moves)
    }

    companion object {
        private const val ARG_CHARACTER_DETAILS = "character_details"
        private const val ARG_GAME_ID = "game_id"
        private const val ARG_MOVE_TO_HIGHLIGHT = "move_to_highlight"

        fun newInstance(characterDetails: CharacterDetails, gameId: String, moveToHighlight: String? = null) =
            CharacterMovelistFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_CHARACTER_DETAILS, characterDetails)
                    putString(ARG_GAME_ID, gameId)
                    moveToHighlight?.let { putString(ARG_MOVE_TO_HIGHLIGHT, it) }
                }
            }
    }
}

class MoveListAdapter(
    private val onFavoriteClick: (Move) -> Unit
) : RecyclerView.Adapter<MoveListAdapter.MoveViewHolder>() {
    private var moves: List<Move> = emptyList()
    private val favoriteStates = mutableMapOf<String, Boolean>()

    fun submitList(newMoves: List<Move>) {
        moves = newMoves
        notifyDataSetChanged()
    }

    fun updateFavoriteState(moveId: String, isFavorite: Boolean) {
        favoriteStates[moveId] = isFavorite
        val position = moves.indexOfFirst { it.id == moveId }
        if (position != -1) {
            notifyItemChanged(position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoveViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_move, parent, false)
        return MoveViewHolder(view, onFavoriteClick)
    }

    override fun onBindViewHolder(holder: MoveViewHolder, position: Int) {
        val move = moves[position]
        holder.bind(move, favoriteStates[move.id] ?: false)
    }

    override fun getItemCount() = moves.size

    class MoveViewHolder(
        itemView: View,
        private val onFavoriteClick: (Move) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        private val nameText: TextView = itemView.findViewById(R.id.moveNameText)
        private val inputText: TextView = itemView.findViewById(R.id.moveInputText)
        private val descriptionText: TextView = itemView.findViewById(R.id.moveDescriptionText)
        private val damageText: TextView = itemView.findViewById(R.id.moveDamageText)
        private val startupText: TextView = itemView.findViewById(R.id.moveStartupText)
        private val recoveryText: TextView = itemView.findViewById(R.id.moveRecoveryText)
        private val onBlockText: TextView = itemView.findViewById(R.id.moveOnBlockText)
        private val propertiesText: TextView = itemView.findViewById(R.id.movePropertiesText)
        private val favoriteButton: MaterialButton = itemView.findViewById(R.id.favoriteButton)

        fun bind(move: Move, isFavorite: Boolean) {
            nameText.text = move.name
            inputText.text = move.input
            descriptionText.text = move.description
            damageText.text = "Damage: ${move.damage}"
            startupText.text = "Startup: ${move.startup}f"
            recoveryText.text = "Recovery: ${move.recovery}f"
            onBlockText.text = "On Block: ${move.onBlock}"
            propertiesText.text = move.properties.joinToString(", ") { it.name }

            favoriteButton.setIconResource(
                if (isFavorite) R.drawable.ic_favorite
                else R.drawable.ic_favorite_border
            )

            favoriteButton.setOnClickListener {
                onFavoriteClick(move)
            }
        }
    }
} 