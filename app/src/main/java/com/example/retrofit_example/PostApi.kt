package com.example.retrofit_example

import retrofit2.Response
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    suspend fun getTodos(): Response<List<Post>>
}

























