package com.yaboi.plapisfightinggamemanual

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class GameAdapter(private val games: List<Game>) : RecyclerView.Adapter<GameAdapter.GameViewHolder>() {

    class GameViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val banner: ImageView = view.findViewById(R.id.gameBanner)
        val title: TextView = view.findViewById(R.id.gameTitle)
        val description: TextView = view.findViewById(R.id.gameDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_game, parent, false)
        return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val game = games[position]
        
        holder.title.text = game.title
        holder.description.text = game.description
        
        // Load image using Glide
        val glide = Glide.with(holder.banner.context)
        when {
            game.bannerResourceId != null -> {
                glide.load(game.bannerResourceId)
                    .error(R.drawable.placeholder_game_banner)
                    .fallback(R.drawable.placeholder_game_banner)
            }
            game.bannerUrl != null -> {
                glide.load(game.bannerUrl)
                    .error(R.drawable.placeholder_game_banner)
                    .fallback(R.drawable.placeholder_game_banner)
            }
            else -> {
                glide.load(R.drawable.placeholder_game_banner)
            }
        }.centerCrop()
         .into(holder.banner)

        // Set click listener to navigate to CharacterListActivity
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, CharacterListActivity::class.java).apply {
                putExtra("GAME_ID", game.id)
                putExtra("GAME_TITLE", game.title)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = games.size
} 