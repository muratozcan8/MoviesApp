package com.muratozcan.moviesapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muratozcan.moviesapp.data.entity.Movies
import com.muratozcan.moviesapp.data.repo.MoviesRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainpageViewModel : ViewModel(){

    var mrepo = MoviesRepository()
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