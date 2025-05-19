package com.yaboi.plapisfightinggamemanual.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yaboi.plapisfightinggamemanual.R
import com.yaboi.plapisfightinggamemanual.data.FavoriteMove
import com.yaboi.plapisfightinggamemanual.viewmodel.FavoriteMoveViewModel

class FavoritesFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var emptyView: TextView
    private lateinit var adapter: FavoriteMoveAdapter
    private lateinit var viewModel: FavoriteMoveViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.favoritesRecyclerView)
        emptyView = view.findViewById(R.id.emptyFavoritesText)
        viewModel = ViewModelProvider(requireActivity())[FavoriteMoveViewModel::class.java]

        setupRecyclerView()
        observeFavorites()
    }

    private fun setupRecyclerView() {
        adapter = FavoriteMoveAdapter { favoriteMove ->
            viewModel.removeFromFavorites(favoriteMove)
        }
        recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = this@FavoritesFragment.adapter
        }
    }

    private fun observeFavorites() {
        viewModel.favorites.observe(viewLifecycleOwner) { favorites ->
            adapter.submitList(favorites)
            updateEmptyState(favorites.isEmpty())
        }
    }

    private fun updateEmptyState(isEmpty: Boolean) {
        emptyView.visibility = if (isEmpty) View.VISIBLE else View.GONE
        recyclerView.visibility = if (isEmpty) View.GONE else View.VISIBLE
    }

    companion object {
        fun newInstance() = FavoritesFragment()
    }
}

class FavoriteMoveAdapter(
    private val onRemoveClick: (FavoriteMove) -> Unit
) : RecyclerView.Adapter<FavoriteMoveAdapter.FavoriteMoveViewHolder>() {
    private var moves = listOf<FavoriteMove>()

    fun submitList(newMoves: List<FavoriteMove>) {
        moves = newMoves
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteMoveViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_favorite_move, parent, false)
        return FavoriteMoveViewHolder(view, onRemoveClick)
    }

    override fun onBindViewHolder(holder: FavoriteMoveViewHolder, position: Int) {
        holder.bind(moves[position])
    }

    override fun getItemCount() = moves.size

    class FavoriteMoveViewHolder(
        itemView: View,
        private val onRemoveClick: (FavoriteMove) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        private val nameText: TextView = itemView.findViewById(R.id.favoriteMoveName)
        private val inputText: TextView = itemView.findViewById(R.id.favoriteMoveInput)
        private val characterText: TextView = itemView.findViewById(R.id.favoriteCharacterName)
        private val frameDataText: TextView = itemView.findViewById(R.id.favoriteFrameData)
        private val removeButton: View = itemView.findViewById(R.id.removeFavoriteButton)

        fun bind(move: FavoriteMove) {
            nameText.text = move.moveName
            inputText.text = move.input
            characterText.text = move.characterId
            frameDataText.text = move.frameData
            removeButton.setOnClickListener { onRemoveClick(move) }
        }
    }
} 