package com.aji.kotlinmovie.detail

import com.aji.kotlinmovie.api.MovieDbApi
import com.aji.kotlinmovie.di.AppScope
import dagger.Module
import dagger.Provides

/**
 * Created by root on 11/15/17.
 */
@Module
class DetailModule {
    @Provides
    fun provideDetailPresenter(detailInteractor: DetailInteractor): DetailPresenter{
        return DetailPresenterImpl(detailInteractor, null)
    }

    @Provides
    @AppScope
    fun provideDetailInteractor(api : MovieDbApi): DetailInteractor{
        return DetailInteractorImpl(api)
    }
}