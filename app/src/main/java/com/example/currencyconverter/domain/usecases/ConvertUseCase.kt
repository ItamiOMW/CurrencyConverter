package com.example.currencyconverter.domain.usecases

import com.example.currencyconverter.domain.repository.ConverterRepository
import javax.inject.Inject

class ConvertUseCase @Inject constructor (private val repository: ConverterRepository) {

    suspend operator fun invoke(from: String, to: String, amount: String) = repository.convert(from, to, amount)

}