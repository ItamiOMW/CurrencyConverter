package com.example.currencyconverter.presentation

import androidx.lifecycle.ViewModel
import com.example.currencyconverter.domain.usecases.ConvertUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val convertUseCase: ConvertUseCase
) : ViewModel() {
}