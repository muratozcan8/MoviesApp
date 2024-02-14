package com.muratozcan.moviesapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muratozcan.moviesapp.data.entity.Movies
import com.muratozcan.moviesapp.data.repo.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainpageViewModel @Inject constructor(var mrepo: MoviesRepository) : ViewModel(){

    var moviesList = MutableLiveData<List<Movies>>()

    init {
        moviesLoad()
    }
    fun moviesLoad() {
        CoroutineScope(Dispatchers.Main).launch {
            moviesList.value = mrepo.moviesLoad()
        }
    }
}