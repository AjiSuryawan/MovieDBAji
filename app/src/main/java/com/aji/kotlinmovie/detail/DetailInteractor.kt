package com.aji.kotlinmovie.detail

import com.aji.kotlinmovie.api.VideoResponse
import com.aji.kotlinmovie.models.MovieDetail
import rx.Observable

/**
 * Created by root on 11/15/17.
 */
interface DetailInteractor {
    fun getMovieDetails(id: String): Observable<MovieDetail>
    fun getMovieVideos(id: String): Observable<VideoResponse>
}