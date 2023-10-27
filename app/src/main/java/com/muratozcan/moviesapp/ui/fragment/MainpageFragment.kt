package com.muratozcan.moviesapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.muratozcan.moviesapp.R
import com.muratozcan.moviesapp.data.entity.Movies
import com.muratozcan.moviesapp.databinding.FragmentMainpageBinding
import com.muratozcan.moviesapp.ui.adapter.MoviesAdapter

class MainpageFragment : Fragment() {
    private lateinit var binding: FragmentMainpageBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainpageBinding.inflate(inflater, container, false)

        binding.toolbarMainpage.title = "Movies"

        binding.movieRv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val moviesList = ArrayList<Movies>();
        val m1 = Movies(1, "Django", "django", 24)
        val m2 = Movies(2, "Interstellar", "interstellar", 32)
        val m3 = Movies(3, "Inception", "inception", 16)
        val m4 = Movies(4, "The Hateful Eight", "thehatefuleight", 28)
        val m5 = Movies(6, "Anadoluda", "anadoluda", 10)
        moviesList.add(m1)
        moviesList.add(m2)
        moviesList.add(m3)
        moviesList.add(m4)
        moviesList.add(m5)

        val moviesAdapter = MoviesAdapter(requireContext(), moviesList)
        binding.movieRv.adapter = moviesAdapter

        return binding.root
    }
}