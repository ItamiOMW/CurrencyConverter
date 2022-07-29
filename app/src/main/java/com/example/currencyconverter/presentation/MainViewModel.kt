package com.example.currencyconverter.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyconverter.domain.usecases.ConvertUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val convertUseCase: ConvertUseCase
) : ViewModel() {

    private val _result = MutableLiveData<String>()
    val result: LiveData<String>
        get() = _result

    fun convert(from: String, to: String, amount: String) {
        viewModelScope.launch {
            _result.value = convertUseCase.invoke(from, to, amount)
        }
    }
}