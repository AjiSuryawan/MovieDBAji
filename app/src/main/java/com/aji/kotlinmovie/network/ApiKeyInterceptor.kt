package com.aji.kotlinmovie.network

//import com.nrohmen.kotlinmovie.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by root on 11/15/17.
 */
internal class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val originalUrl = originalRequest.url
        val url = originalUrl.newBuilder()
                .addQueryParameter("api_key", "6ac7a042ac3b7599a689eb943fa0b6d0")
                .build()
        val requestBuilder = originalRequest.newBuilder().url(url)
        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}