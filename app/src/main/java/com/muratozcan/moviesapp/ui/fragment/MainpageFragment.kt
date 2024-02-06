package com.muratozcan.moviesapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.muratozcan.moviesapp.R
import com.muratozcan.moviesapp.data.entity.Movies
import com.muratozcan.moviesapp.databinding.FragmentMainpageBinding
import com.muratozcan.moviesapp.ui.adapter.MoviesAdapter
import com.muratozcan.moviesapp.ui.viewmodel.MainpageViewModel

class MainpageFragment : Fragment() {
    private lateinit var binding: FragmentMainpageBinding
    private lateinit var viewModel: MainpageViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_mainpage, container, false)

        binding.mainpageToolbarTitle = "Movies"

        viewModel.moviesList.observe(viewLifecycleOwner){
            val moviesAdapter = MoviesAdapter(requireContext(), it)
            binding.moviesAdapter = moviesAdapter

        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:MainpageViewModel by viewModels()
        viewModel = tempViewModel
    }
}