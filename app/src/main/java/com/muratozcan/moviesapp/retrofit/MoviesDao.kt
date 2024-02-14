package com.muratozcan.moviesapp.retrofit

import com.muratozcan.moviesapp.data.entity.MoviesResponse
import retrofit2.http.GET

interface MoviesDao {
    //http://kasimadalan.pe.hu/filmler_yeni/tum_filmler.php
    //http://kasimadalan.pe.hu/ -> base url
    //filmler_yeni/tum_filmler.php -> webservice url

    @GET("filmler_yeni/tum_filmler.php")
    suspend fun moviesLoad() : MoviesResponse

}