package com.muratozcan.moviesapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.muratozcan.moviesapp.R
import com.muratozcan.moviesapp.databinding.FragmentDetailBinding
import com.muratozcan.moviesapp.databinding.FragmentMainpageBinding

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        val bundle: DetailFragmentArgs by navArgs()
        val movie = bundle.movie

        binding.toolbarDetail.title = movie.name

        binding.ivMovie.setImageResource(resources.getIdentifier(movie.image, "drawable", requireContext().packageName))

        binding.tvPrice.text = "${movie.price} ₺"

        return binding.root
    }
}