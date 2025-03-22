package com.example.tdclothing

import android.app.Application
import com.example.data.di.dataModule
import com.example.domain.di.domainModule
import com.example.tdclothing.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TnDApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TnDApp)
            modules(listOf(
                dataModule,
                domainModule,
                presentationModule
            ))
        }
    }
}