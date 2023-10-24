package com.muratozcan.moviesapp.data.entity

import java.io.Serializable

data class Movies(var id: Int,
                  var name: String,
                  var image: String,
                  var price: Int) : Serializable {
}