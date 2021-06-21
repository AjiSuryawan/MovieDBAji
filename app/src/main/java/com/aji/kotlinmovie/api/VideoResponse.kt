package com.aji.kotlinmovie.api

import com.google.gson.annotations.SerializedName
import com.aji.kotlinmovie.models.Videos

/**
 * Created by root on 11/15/17.
 */
data class VideoResponse (
    @SerializedName("results")
    var videos: List<Videos>
)