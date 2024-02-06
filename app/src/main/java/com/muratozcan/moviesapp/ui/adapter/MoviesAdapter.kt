package com.muratozcan.moviesapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout
import com.muratozcan.moviesapp.R
import com.muratozcan.moviesapp.data.entity.Movies
import com.muratozcan.moviesapp.databinding.CardDesignBinding
import com.muratozcan.moviesapp.ui.fragment.MainpageFragmentDirections

class MoviesAdapter(var mContext: Context, var moviesList: List<Movies>)
    : RecyclerView.Adapter<MoviesAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: CardDesignBinding): RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding: CardDesignBinding =DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.card_design, parent, false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val movie = moviesList[position]
        val d = holder.design

        d.imageViewMovie.setImageResource(mContext.resources.getIdentifier(movie.image, "drawable", mContext.packageName))

        d.movieObject = movie

        d.cardViewMovie.setOnClickListener {
            val pass = MainpageFragmentDirections.detailPass(movie = movie)
            Navigation.findNavController(it).navigate(pass)
        }

        d.buttonBasket.setOnClickListener {
            Snackbar.make(it, "${movie.name} was added to basket", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }


}