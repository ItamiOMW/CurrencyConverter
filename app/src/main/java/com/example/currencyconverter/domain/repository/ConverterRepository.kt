package com.example.currencyconverter.domain.repository

interface ConverterRepository {

    suspend fun convert(from: String, to: String): Double
}