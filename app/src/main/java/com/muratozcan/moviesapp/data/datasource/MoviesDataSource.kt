package com.muratozcan.moviesapp.data.datasource

import com.muratozcan.moviesapp.data.entity.Movies
import com.muratozcan.moviesapp.retrofit.MoviesDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesDataSource(var mdao: MoviesDao) {

    suspend fun moviesLoad() : List<Movies> =
        withContext(Dispatchers.IO){
            return@withContext mdao.moviesLoad().filmler
        }
}