package com.example.currencyconverter.data.repository_impl

import android.app.Application
import com.example.currencyconverter.data.api.ApiFactory
import com.example.currencyconverter.domain.repository.ConverterRepository
import javax.inject.Inject

class ConverterRepositoryImpl @Inject constructor (): ConverterRepository {

    private val apiService = ApiFactory.apiService

    override suspend fun convert(from: String, to: String, amount: String): String {
        return apiService.convert(to = to, from = from, amount = amount).body()?.result.toString()
    }

}