package com.aji.kotlinmovie.movie

import com.aji.kotlinmovie.api.MovieResponse
import rx.Observable

/**
 * Created by root on 11/15/17.
 */
interface MovieInteractor {
    fun getNowPlayingMovies(): Observable<MovieResponse>
    fun getUpcomingMovies(): Observable<MovieResponse>
    fun getPopularMovies(): Observable<MovieResponse>
}