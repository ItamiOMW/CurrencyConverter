package com.example.currencyconverter.data.api.model

data class ConvertedCurrencyDto(
    val info: Info,
    val query: Query,
    val result: Double,
    val success: Boolean
)