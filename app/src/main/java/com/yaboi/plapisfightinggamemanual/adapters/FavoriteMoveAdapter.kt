package com.yaboi.plapisfightinggamemanual.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.yaboi.plapisfightinggamemanual.R
import com.yaboi.plapisfightinggamemanual.data.FavoriteMove

class FavoriteMoveAdapter(
    private val onItemClick: (FavoriteMove) -> Unit,
    private val onRemoveFavorite: (FavoriteMove) -> Unit
) : ListAdapter<FavoriteMove, FavoriteMoveAdapter.FavoriteMoveViewHolder>(FavoriteMoveDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteMoveViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_favorite_move, parent, false)
        return FavoriteMoveViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoriteMoveViewHolder, position: Int) {
        val move = getItem(position)
        holder.bind(move)
    }

    inner class FavoriteMoveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val moveNameText: TextView = itemView.findViewById(R.id.favoriteMoveName)
        private val inputText: TextView = itemView.findViewById(R.id.favoriteMoveInput)
        private val characterText: TextView = itemView.findViewById(R.id.favoriteCharacterName)
        private val frameDataText: TextView = itemView.findViewById(R.id.favoriteFrameData)
        private val removeFavoriteButton: MaterialButton = itemView.findViewById(R.id.removeFavoriteButton)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onItemClick(getItem(position))
                }
            }

            removeFavoriteButton.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onRemoveFavorite(getItem(position))
                }
            }
        }

        fun bind(move: FavoriteMove) {
            moveNameText.text = move.moveName
            inputText.text = move.input
            characterText.text = move.characterId
            frameDataText.text = move.frameData
        }
    }
}

class FavoriteMoveDiffCallback : DiffUtil.ItemCallback<FavoriteMove>() {
    override fun areItemsTheSame(oldItem: FavoriteMove, newItem: FavoriteMove): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: FavoriteMove, newItem: FavoriteMove): Boolean {
        return oldItem == newItem
    }
} 