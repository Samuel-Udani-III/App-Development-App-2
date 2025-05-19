package com.yaboi.plapisfightinggamemanual

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharacterAdapter(
    private val characters: List<Character>,
    private val listener: OnCharacterClickListener
) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    interface OnCharacterClickListener {
        fun onCharacterClick(character: Character)
    }

    class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameText: TextView = itemView.findViewById(R.id.characterName)
        val archetypeText: TextView = itemView.findViewById(R.id.characterArchetype)
        val characterImage: ImageView = itemView.findViewById(R.id.characterImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_character, parent, false)
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        holder.nameText.text = character.name
        holder.archetypeText.text = character.archetype
        holder.characterImage.setImageResource(character.imageResourceId)

        holder.itemView.setOnClickListener {
            listener.onCharacterClick(character)
        }
    }

    override fun getItemCount() = characters.size
} 