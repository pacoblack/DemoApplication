package com.github.gang.kt.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.gang.R
import kotlinx.android.synthetic.main.activity_async.*
import kotlinx.coroutines.*

class AsyncActivity: AppCompatActivity() {
    private val TAG: String = "AsyncExceptionTestActivity"

    companion object {

        fun launch(context: Context) {
            val intent = Intent(context, AsyncActivity::class.java)
            context.startActivity(intent)
        }
    }

    private val scope = MainScope()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)
        btnTest1.setOnClickListener {
            test()
        }

        btnTestAsync1.setOnClickListener {
            asyncAsRootCoroutine1()
        }

        btnTest2.setOnClickListener {
            //testExpHandler()
            test2()
        }

        btnTest3.setOnClickListener {
            testExpHandler()
        }
        btnTest4.setOnClickListener {
            test4()
        }
        btnTest5.setOnClickListener {
            test5()
        }
    }
    private fun test5() {
        val scope = CoroutineScope(Job())
        scope.launch {
            val childScope = CoroutineScope(Job())
            //childScope的直接子协程
            val deferred: Deferred<String> = childScope.async {
                throw IllegalStateException("an IllegalStateException")
            }
            try {
                deferred.await()
            } catch (e: Exception) {
                //async 中抛出的异常将不会在这里被捕获
                Log.d(TAG, "test4: caught error ${e.message}")
            }
        }
    }

    private fun test4() {
        val scope = CoroutineScope(SupervisorJob())
        scope.launch {
            //supervisorScope 的直接子协程
            supervisorScope {
                val deferred: Deferred<String> = async {
                    throw IllegalStateException("an IllegalStateException")
                }

                try {
                    deferred.await()
                } catch (e: Exception) {
                    // 处理 async 中抛出的异常
                    Log.d(TAG, "test4: caught error ${e.message}")
                }
            }
        }
    }

    private fun testExpHandler() {
        val expHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
            Log.d(TAG, "test1: expHandler caught exception : ${throwable.message}")
        }
        val expHandler1 = CoroutineExceptionHandler { coroutineContext, throwable ->
            Log.d(TAG, "test1: expHandler1 caught exception : ${throwable.message}")
        }
        scope.launch(expHandler) {
            Log.d(TAG, "test1: launch")
            try {
                val response: Deferred<String> = async(expHandler1) {
                    Log.d(TAG, "test1: in async block")
                    throw IllegalStateException("在async中抛出异常")
                }
                response.await()

            } catch (e: Exception) {
                Log.d(TAG, "test1: error ${e.message}")
            }
        }
    }

    private fun test2() {
        val scope = CoroutineScope(Job())
        //注释1处
        //scope.launch {
        scope.async {
            val response: Deferred<String> = async {
                Log.d(TAG, "test2: in async block")
                //注释1处，使用launch的时候会传播这个异常，造成crash
                //注释1处，使用async的时候不会传播这个异常，不会crash
                throw IllegalStateException("在async中抛出异常")
            }
            try {
                response.await()
            } catch (e: Exception) {
                Log.d(TAG, "test2: caught error ${e.message}")
            }
        }
    }

    private fun asyncAsRootCoroutine1() {
        scope.async {
            try {
                Log.d(TAG, "asyncAsRootCoroutine1: in async block")
                throw IllegalStateException("an IllegalStateException")
                //response.await()
            } catch (e: Exception) {
                Log.d(TAG, "asyncAsRootCoroutine1: error ${e.message}")
            }
        }
    }

    private fun test() {
        scope.launch {
            Log.d(TAG, "test: launch${coroutineContext}")
            try {
                val response: Deferred<String> = async {
                    Log.d(TAG, "test: in async block")
                    throw IllegalStateException("an IllegalStateException")
                }
                //response.await()
            } catch (e: Exception) {
                // async 中抛出的异常将不会在这里被捕获
                // 但是异常会被传播和传递到 scope
                Log.d(TAG, "test: error ${e.message}")
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
    }
}