package com.example.newsapp.services

import com.example.newsapp.models.NewsResponse
import com.example.newsapp.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("top-headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode: String = "eg",
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY,
    ) : Response<NewsResponse>

    @GET("everything")
    suspend fun searchForNews(
        @Query("q") searchQuery: String,
        @Query("page") page: Int = 1,
        @Query("pageSize") pageSize: Int = 20,
        @Query("apiKey") apiKey: String = API_KEY,
    ) : Response<NewsResponse>
}