package com.hua.basicapp.app

import android.app.Application
import com.hua.basicapp.dependencyinjection.app.AppComponent
import com.hua.basicapp.dependencyinjection.app.AppModule
import com.hua.basicapp.dependencyinjection.app.DaggerAppComponent
import timber.log.Timber

class BasicApp: Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()

        Timber.plant(Timber.DebugTree())
    }
}