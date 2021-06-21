package com.aji.kotlinmovie.models

import io.realm.RealmObject

open class MovieRealm(
    var id: String?= null,
    var title: String?= null,
    var posterPath: String?= null
) : RealmObject(){}