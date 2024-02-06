package com.muratozcan.moviesapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.muratozcan.moviesapp.R
import com.muratozcan.moviesapp.databinding.FragmentDetailBinding
import com.muratozcan.moviesapp.databinding.FragmentMainpageBinding

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detail, container, false)

        val bundle: DetailFragmentArgs by navArgs()
        val movie = bundle.movie

        binding.movieObject = movie

        binding.ivMovie.setImageResource(resources.getIdentifier(movie.image, "drawable", requireContext().packageName))

        return binding.root
    }
}