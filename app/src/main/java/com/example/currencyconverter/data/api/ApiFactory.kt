package com.example.currencyconverter.data.api

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiFactory {

    private val retrofit by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(ApiService.BASE_URL)
            .build()
    }

    val apiService = retrofit.create(ApiService::class.java)
}