package com.aji.kotlinmovie.movie.popular

import android.util.Log
import com.aji.kotlinmovie.api.MovieResponse
import com.aji.kotlinmovie.movie.MovieInteractor
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


/**
 * Created by root on 11/15/17.
 */
class PopularPresenterImpl(private val interactor: MovieInteractor, private var view: PopularView?): PopularPresenter {

    override fun setView(PopularView: PopularView) {
        view = PopularView
        getPopularMovies()
    }

    private fun getPopularMovies(){
        interactor.getPopularMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { popularMoviesResponse -> onGetPopularMoviesSuccess(popularMoviesResponse)},
                        { e -> onGetPopularMoviesFailure(e) }
                )
    }

    private fun onGetPopularMoviesFailure(e: Throwable?) {
        Log.e(e?.message, e?.stackTrace.toString())
    }

    private fun onGetPopularMoviesSuccess(moviesResponse: MovieResponse?) {
        view?.showPopularMovies(moviesResponse?.movies)
    }
}