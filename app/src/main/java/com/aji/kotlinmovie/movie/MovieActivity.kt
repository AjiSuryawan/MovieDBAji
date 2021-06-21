package com.aji.kotlinmovie.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aji.kotlinmovie.App
import com.aji.kotlinmovie.R
import com.aji.kotlinmovie.movie.playing.NowPlayingFragment
import com.aji.kotlinmovie.movie.popular.PopularFragment
import com.aji.kotlinmovie.movie.upcoming.UpcomingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setToolbar()
        bottom_navigation.setOnNavigationItemSelectedListener({ item ->
            when (item.itemId) {
                R.id.playing -> {
                   loadPlayingFragment(savedInstanceState)
                }
                R.id.upcoming -> {
                   loadUpcomingFragment(savedInstanceState)
                }
                R.id.popular -> {
                    loadPopularFragment(savedInstanceState)
                }
            }
            true
        })
        bottom_navigation.selectedItemId = R.id.playing

        (this.applicationContext as App).welcoming(this, bottom_navigation, "Welcome!", "Here you can select what's movie you want")

    }

    private fun setToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.app_name)
    }

    private fun loadPlayingFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
//                    .replace(R.id.main_container, NowPlayingFragment(), NowPlayingFragment::class.simpleName)
                    .replace(R.id.main_container, NowPlayingFragment(), NowPlayingFragment().getTag())
                    .commit()
        }
    }

    private fun loadUpcomingFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
//                    .replace(R.id.main_container, UpcomingFragment(), UpcomingFragment::class.simpleName)
                    .replace(R.id.main_container, UpcomingFragment(), UpcomingFragment().getTag())
                    .commit()
        }
    }

    private fun loadPopularFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
//                .replace(R.id.main_container, PopularFragment(), PopularFragment::class.simpleName)
                .replace(R.id.main_container, PopularFragment(), PopularFragment().getTag())
                .commit()
        }
    }
}
