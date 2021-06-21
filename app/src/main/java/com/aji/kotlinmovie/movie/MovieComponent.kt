package com.aji.kotlinmovie.movie

import com.aji.kotlinmovie.di.AppScope
import com.aji.kotlinmovie.movie.playing.NowPlayingFragment
import com.aji.kotlinmovie.movie.popular.PopularFragment
import com.aji.kotlinmovie.movie.upcoming.UpcomingFragment
import dagger.Subcomponent

/**
 * Created by root on 11/15/17.
 */
@AppScope
@Subcomponent(modules = [(MovieModule::class)])
interface MovieComponent {
    fun inject(target: NowPlayingFragment)
    fun inject(target: UpcomingFragment)
    fun inject(target: PopularFragment)
}