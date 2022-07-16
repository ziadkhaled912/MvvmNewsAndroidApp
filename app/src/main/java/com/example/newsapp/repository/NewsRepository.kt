package com.example.newsapp.repository

import com.example.newsapp.db.ArticleDatabase
import com.example.newsapp.services.RetrofitInstance

class NewsRepository(
    val db: ArticleDatabase
) {

    private val api = RetrofitInstance.api

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        api.searchForNews(searchQuery, pageNumber)
}