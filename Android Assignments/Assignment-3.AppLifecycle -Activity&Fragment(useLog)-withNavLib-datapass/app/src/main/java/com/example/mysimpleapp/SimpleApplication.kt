package com.example.mysimpleapp

import android.app.Application
import timber.log.Timber

class SimpleApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}