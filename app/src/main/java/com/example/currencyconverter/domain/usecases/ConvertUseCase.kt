package com.example.currencyconverter.domain.usecases

import com.example.currencyconverter.domain.repository.ConverterRepository

class ConvertUseCase(private val repository: ConverterRepository) {

    suspend operator fun invoke(from: String, to: String) = repository.convert(from, to)

}