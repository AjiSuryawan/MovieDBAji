package com.aji.kotlinmovie.movie

import com.aji.kotlinmovie.api.MovieDbApi
import com.aji.kotlinmovie.di.AppScope
import com.aji.kotlinmovie.movie.playing.NowPlayingPresenter
import com.aji.kotlinmovie.movie.playing.NowPlayingPresenterImpl
import com.aji.kotlinmovie.movie.popular.PopularPresenter
import com.aji.kotlinmovie.movie.popular.PopularPresenterImpl
import com.aji.kotlinmovie.movie.upcoming.UpcomingPresenter
import com.aji.kotlinmovie.movie.upcoming.UpcomingPresenterImpl
import dagger.Module
import dagger.Provides

/**
 * Created by root on 11/15/17.
 */
@Module
class MovieModule {
    @Provides
    fun provideMainPresenter(movieInteractor: MovieInteractor): NowPlayingPresenter {
        return NowPlayingPresenterImpl(movieInteractor, null)
    }

    @Provides
    @AppScope
    fun provideMainInteractor(api : MovieDbApi): MovieInteractor {
        return MovieInteractorImpl(api)
    }

    @Provides
    fun provideUpcomingPresenter(movieInteractor: MovieInteractor): UpcomingPresenter {
        return UpcomingPresenterImpl(movieInteractor, null)
    }

    @Provides
    fun providePopularPresenter(movieInteractor: MovieInteractor): PopularPresenter {
        return PopularPresenterImpl(movieInteractor, null)
    }
}