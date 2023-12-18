package com.example.projekakhir.api

import com.example.projekakhir.ResponseBuah
import com.example.projekakhir.ResponseCabai
import com.example.projekakhir.ResponseSayur
import com.example.projekakhir.ResponseUmbi
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("show/1")
    fun getDetail1 () : Call<ResponseSayur>

    @GET("show/4")
    fun getDetail2 () : Call<ResponseCabai>

    @GET("show/3")
    fun getDetail3 () : Call<ResponseBuah>

    @GET("show/2")
    fun getDetail4 () : Call<ResponseUmbi>
}

