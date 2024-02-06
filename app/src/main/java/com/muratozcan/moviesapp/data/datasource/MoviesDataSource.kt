package com.muratozcan.moviesapp.data.datasource

import com.muratozcan.moviesapp.data.entity.Movies
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesDataSource {

    suspend fun moviesLoad() : List<Movies> =
        withContext(Dispatchers.IO){
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

            return@withContext moviesList
        }
}