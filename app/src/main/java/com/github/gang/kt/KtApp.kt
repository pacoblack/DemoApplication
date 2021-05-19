package com.github.gang.kt

import android.app.Application
import kotlin.properties.Delegates

class KtApp : Application() {
    companion object{
        var instance: KtApp by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this;
    }
}