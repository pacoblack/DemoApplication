package com.github.gang.kt.dagger

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private var mContext: Context) {
    @Provides
    fun getContext() = mContext
}