package com.github.gang.kt.dagger

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject
import com.github.gang.R

class DaggerActivity : AppCompatActivity() {
    @Inject
    lateinit var flower: Flower

    @Inject
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)
        DaggerMainComponent.builder() // 设置 MainModule 对象
                .contextModule(ContextModule(this))
                .build()
                .inject(this)
        Log.e("flower", flower.toString())
    }
}