package com.yaboi.plapisfightinggamemanual.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.yaboi.plapisfightinggamemanual.R
import com.yaboi.plapisfightinggamemanual.data.SearchResult

class SearchAdapter(
    private val onItemClick: (SearchResult) -> Unit
) : ListAdapter<SearchResult, SearchAdapter.SearchViewHolder>(SearchDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_search_result, parent, false)
        return SearchViewHolder(view, onItemClick)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class SearchViewHolder(
        itemView: View,
        private val onItemClick: (SearchResult) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        private val subtitleTextView: TextView = itemView.findViewById(R.id.subtitleTextView)
        private val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)

        fun bind(result: SearchResult) {
            itemView.setOnClickListener { onItemClick(result) }

            when (result) {
                is SearchResult.CharacterResult -> {
                    titleTextView.text = result.name
                    subtitleTextView.text = "Character"
                    descriptionTextView.text = result.playstyle
                }
                is SearchResult.MoveResult -> {
                    titleTextView.text = result.move.name
                    subtitleTextView.text = "${result.characterName} - ${result.move.type}"
                    descriptionTextView.text = result.move.description
                }
            }
        }
    }

    private class SearchDiffCallback : DiffUtil.ItemCallback<SearchResult>() {
        override fun areItemsTheSame(oldItem: SearchResult, newItem: SearchResult): Boolean {
            return when {
                oldItem is SearchResult.CharacterResult && newItem is SearchResult.CharacterResult ->
                    oldItem.characterId == newItem.characterId
                oldItem is SearchResult.MoveResult && newItem is SearchResult.MoveResult ->
                    oldItem.characterId == newItem.characterId && oldItem.move.id == newItem.move.id
                else -> false
            }
        }

        override fun areContentsTheSame(oldItem: SearchResult, newItem: SearchResult): Boolean {
            return oldItem == newItem
        }
    }
} 