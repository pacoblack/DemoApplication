package com.github.gang.kt.dagger

import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @Provides
    fun provideRedRose(): Flower {
        return Flower("玫瑰", "红色")
    }
}