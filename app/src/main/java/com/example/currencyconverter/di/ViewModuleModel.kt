package com.example.currencyconverter.di

import androidx.lifecycle.ViewModel
import com.example.currencyconverter.presentation.MainViewModel
import dagger.Binds
import dagger.Module

@Module
interface ViewModuleModel {

    @Binds
    fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}