package com.example.currencyconverter.data.api.model

data class Query(
    val amount: Int,
    val from: String,
    val to: String
)