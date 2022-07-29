package com.example.currencyconverter.data.api

import com.example.currencyconverter.data.api.model.ConvertedCurrencyDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("convert")
    suspend fun convert(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = API_KEY,
        @Query(QUERY_PARAM_TO) to: String,
        @Query(QUERY_PARAM_FROM) from: String,
        @Query(QUERY_PARAM_AMOUNT) amount: String,
    ): Response<ConvertedCurrencyDto>


    companion object {

        private const val QUERY_PARAM_API_KEY = "apikey"
        private const val QUERY_PARAM_TO = "to"
        private const val QUERY_PARAM_FROM = "from"
        private const val QUERY_PARAM_AMOUNT = "amount"


        const val API_KEY = "26WpWvuH87uF8jFoe35Qgun9d4IB0heX"
        const val BASE_URL = "https://api.apilayer.com/currency_data/"
    }
}