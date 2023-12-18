package com.example.projekakhir.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
    const val baseURL = "http://10.234.132.220/projektani/public/api/"
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder().baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService() : ApiService{
        return getRetrofit().create(ApiService::class.java)
    }


}