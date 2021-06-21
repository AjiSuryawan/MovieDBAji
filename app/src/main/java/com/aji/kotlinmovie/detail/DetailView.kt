package com.aji.kotlinmovie.detail

import com.aji.kotlinmovie.models.MovieDetail
import com.aji.kotlinmovie.models.Videos

/**
 * Created by root on 11/15/17.
 */
interface DetailView {
    fun showMovieDetails(movies : MovieDetail?)
    fun getVideos(videos: List<Videos>?)
}