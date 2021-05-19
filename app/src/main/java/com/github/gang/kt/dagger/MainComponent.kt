package com.github.gang.kt.dagger

import dagger.Component

@Component(modules = [MainModule::class, ContextModule::class])
interface MainComponent {
    fun inject(activity: DaggerActivity?)
}