package com.example.currencyconverter

import android.app.Application
import com.example.currencyconverter.di.DaggerAppComponent

class CurrencyApplication: Application() {

    val component by lazy {
        DaggerAppComponent.factory().create(this)
    }
}