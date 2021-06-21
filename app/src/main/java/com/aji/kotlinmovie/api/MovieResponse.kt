package com.aji.kotlinmovie.api

import com.google.gson.annotations.SerializedName
import com.aji.kotlinmovie.models.Movie

/**
 * Created by root on 11/15/17.
 */
data class MovieResponse (
    @SerializedName("results")
    var movies: List<Movie>
)