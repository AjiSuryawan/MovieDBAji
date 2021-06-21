package com.aji.kotlinmovie.detail

import com.aji.kotlinmovie.api.MovieDbApi
import com.aji.kotlinmovie.api.VideoResponse
import com.aji.kotlinmovie.models.MovieDetail
import rx.Observable

/**
 * Created by root on 11/15/17.
 */
class DetailInteractorImpl(private val movieDbApi: MovieDbApi): DetailInteractor{
    override fun getMovieVideos(id: String): Observable<VideoResponse> {
        return movieDbApi.getMovieVideos(id)
    }

    override fun getMovieDetails(id: String): Observable<MovieDetail> {
        return movieDbApi.getMovieDetails(id, createQueryMap())
    }


    private fun createQueryMap(): Map<String, String>{
        return hashMapOf(
                "language" to "en"
        )
    }
}