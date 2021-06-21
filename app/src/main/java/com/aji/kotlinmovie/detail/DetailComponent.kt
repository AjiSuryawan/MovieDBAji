package com.aji.kotlinmovie.detail

import com.aji.kotlinmovie.di.AppScope
import dagger.Subcomponent

/**
 * Created by root on 11/16/17.
 */
@AppScope
@Subcomponent(modules = [(DetailModule::class)])
interface DetailComponent {
    fun inject(target: DetailActivity)
}