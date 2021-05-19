package com.github.gang.kt.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.gang.R
import com.github.gang.kt.JsonUtilKt
import com.github.gang.kt.awaitResponse
import com.github.gang.kt.model.WxArticleResponse
import kotlinx.android.synthetic.main.activity_kt_coroutine_net.*
import kotlinx.coroutines.*
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import java.util.concurrent.TimeUnit

class CoroutineOkHttpActivity : AppCompatActivity(), CoroutineScope by MainScope() {
    private val TAG: String? = "CoroutineOkHttpNetActiv"

    companion object {

        @JvmStatic
        fun launch(context: Context) {
            val intent = Intent(context, CoroutineOkHttpActivity::class.java)
            context.startActivity(intent)
        }
    }

    private lateinit var client: OkHttpClient
    private lateinit var builder: OkHttpClient.Builder
    private lateinit var scope: CoroutineScope

    private val exceptionHandler: CoroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        Log.d(TAG, "coroutine: error ${throwable.message}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kt_coroutine_net)
        builder = OkHttpClient.Builder()
                //.addInterceptor(new LoggingInterceptor())
                //.addNetworkInterceptor(new LoggingInterceptor())
                //.addInterceptor(interceptor)
                .readTimeout(5000, TimeUnit.MILLISECONDS)
                .writeTimeout(10000, TimeUnit.MILLISECONDS)

        client = builder
                .build()


        btnNormalRequest.setOnClickListener {
            tvResult.text = null
            normalRequest()
        }

        btnCoroutineRequest.setOnClickListener {
            tvResult.text = null
            coroutineRequest()
        }
        btnCoroutineRequest1.setOnClickListener {
            tvResult.text = null
            coroutineRequest1()
        }
        btnCoroutineRequest2.setOnClickListener {
            tvResult.text = null
            coroutineRequest2()
        }
        btnCoroutineRequest3.setOnClickListener {
            tvResult.text = null
            coroutineRequest3()
        }

        btnCatchException.setOnClickListener {
            tvResult.text = null
            requestCanCatchException()
        }

        btnCanNotCatchException.setOnClickListener {
            tvResult.text = null
            requestCanNotCatchException()
        }
        btnCancelCoroutine.setOnClickListener {
            tvResult.text = null
            cancelCoroutine()
        }

    }

    private fun cancelCoroutine() {
        val request1 = Request.Builder()
                .url("https://wanandroid.com/wxarticle/chapters/json")
                .build()

        val job = launch {
            try {
                val startTime = System.currentTimeMillis()
                //注释1处，发起两次请求
                val response1 = client.newCall(request1).awaitResponse()
                val string1 = getString(response1)
                tvResult.text = "协程请求 onResponse: $string1"
            } catch (e: Exception) {
                Log.d(TAG, "cancelCoroutine: error ${e.message}")
            }
        }

        launch {
            delay(200)
            //取消协程
            job.cancel()
        }

    }
    private fun requestCanNotCatchException() {
        val request1 = Request.Builder()
                .url("https://api.github.com/users/humanheima/events/public")
                .header("User-Agent", "OkHttp Example")
                .build()
        launch {
            Log.e(TAG, "coroutineRequest: scope =  ${this}")
            supervisorScope {
                Log.e(TAG, "coroutineRequest: scope = ${this}")
                val response: Deferred<Response> = async {
                    throw IllegalAccessException("exc")
                    client.newCall(request1).awaitResponse()
                }
                try {
                    val string = getString(response.await())
                    tvResult.text = "协程请求 onResponse: $string"
                } catch (e: Exception) {
                    Log.d(TAG, "coroutine: error ${e.message}")
                }
            }
        }
    }

    private fun requestCanCatchException() {
        val request1 = Request.Builder()
                .url("https://api.github.com/users/humanheima/events/public")
                .build()
        launch(exceptionHandler) {
            Log.d(TAG, "coroutineRequest: ${Thread.currentThread().name}")
            val response: Deferred<Response> = async {
                throw IllegalAccessException("exc")
                client.newCall(request1).awaitResponse()
            }
            val string = getString(response.await())
            tvResult.text = "协程请求 onResponse: $string"
        }
    }

    private fun coroutineRequest3() {
        val request1 = Request.Builder()
                .url("https://wanandroid.com/wxarticle/chapters/json")
                .build()
        val request2 = Request.Builder()
                .url("https://wanandroid.com/wxarticle/chapters/json")
                .build()

        launch(exceptionHandler) {
            val startTime = System.currentTimeMillis()
            //两次网络请求没有依赖关系，可以并发请求
            val deferred1 = async { client.newCall(request1).awaitResponse() }
            val deferred2 = async { client.newCall(request2).awaitResponse() }
            val response1 = deferred1.await()
            val response2 = deferred2.await()
            Log.d(TAG, "coroutineRequest: 并发网络请求消耗时间：${System.currentTimeMillis() - startTime}")
            val string1 = getString(response1)
            val string2 = getString(response2)
            tvResult.text = "协程请求 onResponse: ${string1 + string2}"
        }
    }

    private fun coroutineRequest2() {
        val request1 = Request.Builder()
                .url("https://wanandroid.com/wxarticle/chapters/json")
                .build()
        val request2 = Request.Builder()
                .url("https://wanandroid.com/wxarticle/chapters/json")
                .build()
        launch(exceptionHandler) {
            val startTime = System.currentTimeMillis()
            //注释1处，发起两次请求
            val response1 = client.newCall(request1).awaitResponse()
            val response2 = client.newCall(request2).awaitResponse()

            Log.d(TAG, "coroutineRequest: 顺序网络请求消耗时间：${System.currentTimeMillis() - startTime}")
            val string2 = getString(response2)
            val string1 = getString(response1)
            //合并两次请求的结果更新UI
            tvResult.text = "协程请求 onResponse: ${string1 + string2}"
        }
    }

    private fun coroutineRequest1() {
        val request1 = Request.Builder()
                .url("https://wanandroid.com/wxarticle/chapters/json")
                .build()

        launch(exceptionHandler) {
            //val startTime = System.currentTimeMillis()
            //第一个网络请求
            val response1 = client.newCall(request1).awaitResponse()
            val string1 = getString(response1)
            val wxArticleResponse = JsonUtilKt.instance.toObject(string1, WxArticleResponse::class.java)

            //第二个网络请求依赖于第一个网络请求结果
            val firstWxId = wxArticleResponse?.data?.get(0)?.id ?: return@launch
            val request2 = Request.Builder()
                    .url("https://wanandroid.com/wxarticle/list/${firstWxId}/1/json")
                    .build()
            val response2 = client.newCall(request2).awaitResponse()

            //Log.d(TAG, "coroutineRequest: 网络请求消耗时间：${System.currentTimeMillis() - startTime}")
            val string2 = getString(response2)

            tvResult.text = "协程请求 onResponse: ${string2}"

        }
    }

    private suspend fun getString(response: Response): String {
        return withContext(Dispatchers.IO) {
            response.body()?.string() ?: "empty string"
        }
    }

    private fun coroutineRequest() {
        //请求公众号列表
        val request1 = Request.Builder()
                .url("https://wanandroid.com/wxarticle/chapters/json")
                .build()

        //使用exceptionHandler
        launch(exceptionHandler) {
            //注释2处
            val response = client.newCall(request1).awaitResponse()
            //注释3处
            val string = getString(response)
            //合并两次请求的结果更新UI
            tvResult.text = "协程请求 onResponse: $string"
        }
    }

    private fun normalRequest() {
        val request = Request.Builder()
                .url("https://wanandroid.com/wxarticle/chapters/json")
                .build()

        client.newCall(request).enqueue(object : okhttp3.Callback {

            override fun onFailure(call: okhttp3.Call, e: IOException) {
                Log.d(TAG, "onFailure: ${e.message}")
            }

            override fun onResponse(call: okhttp3.Call, response: okhttp3.Response) {
                val string = response.body()?.string()
                Log.d(TAG, "正常请求 onResponse: $string")
                runOnUiThread {
                    tvResult.text = "正常请求 onResponse: $string"
                }
            }
        })
    }

    override fun onDestroy() {
        //取消所有的任务
        this.cancel()
        super.onDestroy()
    }
}