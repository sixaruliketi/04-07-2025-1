package com.example.myapplication.retrofit

import com.example.myapplication.models.FirstItem
import retrofit2.Call
import retrofit2.http.GET

interface JSONPlaceHolderAPI {

    @GET("posts")
    fun getPosts() : Call<List<FirstItem>>

}