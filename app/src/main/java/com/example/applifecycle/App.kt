package com.example.applifecycle

import android.app.Application
import android.arch.lifecycle.ProcessLifecycleOwner
import javax.inject.Inject

class App : Application() {

    @Inject
    lateinit var appLifecycleObserver: AppLifecycleObserver

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this)

        ProcessLifecycleOwner.get().lifecycle.addObserver(appLifecycleObserver)
    }
}