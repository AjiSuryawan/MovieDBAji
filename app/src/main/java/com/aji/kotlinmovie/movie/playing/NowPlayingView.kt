package com.aji.kotlinmovie.movie.playing

import com.aji.kotlinmovie.models.Movie

/**
 * Created by root on 11/15/17.
 */
interface NowPlayingView {
    fun showNowPlayingMovies(movies : List<Movie>?)
}