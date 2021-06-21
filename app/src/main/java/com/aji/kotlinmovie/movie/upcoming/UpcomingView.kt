package com.aji.kotlinmovie.movie.upcoming

import com.aji.kotlinmovie.models.Movie

/**
 * Created by root on 11/15/17.
 */
interface UpcomingView {
    fun showUpcomingMovies(movies : List<Movie>?)
}