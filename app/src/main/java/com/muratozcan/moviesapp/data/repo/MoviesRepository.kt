package com.muratozcan.moviesapp.data.repo

import com.muratozcan.moviesapp.data.datasource.MoviesDataSource
import com.muratozcan.moviesapp.data.entity.Movies

class MoviesRepository {
    var mds = MoviesDataSource()

    suspend fun moviesLoad() : List<Movies> = mds.moviesLoad()

}