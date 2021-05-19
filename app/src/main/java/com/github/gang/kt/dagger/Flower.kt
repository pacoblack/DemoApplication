package com.github.gang.kt.dagger

import javax.inject.Singleton

@Singleton
class Flower(private val name: String, private val color: String) {
    override fun toString(): String {
        return "Flower{name='$name', color='$color'}"
    }
}