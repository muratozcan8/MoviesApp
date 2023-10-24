package com.muratozcan.moviesapp.ui.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muratozcan.moviesapp.data.entity.Movies
import com.muratozcan.moviesapp.databinding.CardDesignBinding

class MoviesAdapter(var mContext: Context, var moviesList: List<Movies>)
    : RecyclerView.Adapter<MoviesAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: CardDesignBinding): RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        TODO("Not yet implemented")
    }
}