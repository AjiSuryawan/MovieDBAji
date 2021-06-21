package com.aji.kotlinmovie.di

import com.aji.kotlinmovie.api.ApiModule
import com.aji.kotlinmovie.detail.DetailComponent
import com.aji.kotlinmovie.detail.DetailModule
import com.aji.kotlinmovie.movie.MovieComponent
import com.aji.kotlinmovie.movie.MovieModule
import com.aji.kotlinmovie.network.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by root on 11/15/17.
 */
@Singleton
@Component(modules = [(AppModule::class), (NetworkModule::class), (ApiModule::class)])
interface AppComponent{
    fun plus(movieModule: MovieModule): MovieComponent
    fun plus(detailModule: DetailModule): DetailComponent
}