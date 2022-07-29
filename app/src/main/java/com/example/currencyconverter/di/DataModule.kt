package com.example.currencyconverter.di

import com.example.currencyconverter.data.repository_impl.ConverterRepositoryImpl
import com.example.currencyconverter.domain.repository.ConverterRepository
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @AppScope
    @Binds
    fun bindRepository(repositoryImpl: ConverterRepositoryImpl): ConverterRepository
}