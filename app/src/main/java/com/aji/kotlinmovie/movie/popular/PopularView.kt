package com.aji.kotlinmovie.movie.popular

import com.aji.kotlinmovie.models.Movie

/**
 * Created by root on 11/15/17.
 */
interface PopularView {
    fun showPopularMovies(movies : List<Movie>?)
}