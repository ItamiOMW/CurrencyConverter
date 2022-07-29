package com.example.currencyconverter.di

import android.app.Application
import com.example.currencyconverter.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(modules = [ViewModuleModel::class, DataModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface factory {

        fun create(
            @BindsInstance application: Application
        ): AppComponent
    }
}