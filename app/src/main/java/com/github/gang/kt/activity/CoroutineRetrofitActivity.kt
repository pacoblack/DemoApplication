package com.github.gang.kt.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.gang.R
import com.github.gang.kt.ApiService
import com.github.gang.kt.model.Article
import com.github.gang.kt.model.NetResponse
import com.github.gang.kt.model.WxArticleResponse
import com.github.gang.kt.tool.HttpLoggingInterceptor
import kotlinx.android.synthetic.main.activity_kt_coroutine_retrofit_net.*
import kotlinx.coroutines.*
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

class CoroutineRetrofitActivity : AppCompatActivity(), CoroutineScope by MainScope() {
    private val TAG: String? = "CoroutineRetrofitNetAct"

    companion object {
        @JvmStatic
        fun launch(context: Context) {
            val intent = Intent(context, CoroutineRetrofitActivity::class.java)
            context.startActivity(intent)
        }
    }

    private val httpLoggingInterceptor = HttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
    private val apiService = Retrofit.Builder()
            .baseUrl("https://www.wanandroid.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build())
            .build().create(ApiService::class.java)

    private lateinit var scope: CoroutineScope

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        scope = MainScope() + CoroutineExceptionHandler { _, throwable ->
            Log.d(TAG, "coroutine: error ${throwable.message}")
        }

        setContentView(R.layout.activity_kt_coroutine_retrofit_net)
        btnNormalRequest.setOnClickListener {
            tvResult.text = null
            normalRequest()
        }

        btnCoroutineRequest.setOnClickListener {
            tvResult.text = null
            coroutineRequest()
            //coroutineRequest1()

        }
        btnCoroutineRequest1.setOnClickListener {
            tvResult.text = null
            coroutineRequest2_6()
        }
        btnCoroutineRequest2.setOnClickListener {
            coroutineRequest2()
        }

        btnHandleResponseFormat1.setOnClickListener {
            handlerResponseFormat1()
        }
        btnHandleResponseFormat2.setOnClickListener {
            handlerResponseFormat2()
        }
        btnHandleLowLevelResponseFormat1.setOnClickListener {
            handlerLowLevelResponseFormat1()
        }
        btnHandleLowLevelResponseFormat2.setOnClickListener {
            handlerLowLevelResponseFormat2()
        }
    }

    private fun handlerLowLevelResponseFormat2() {
        launch(exceptionHandler) {
            val response: Response<NetResponse<MutableList<WxArticleResponse.DataBean>>> =
                    apiService.getWxarticleListLowLevelFormat2().awaitResponse()
            if (response.isSuccessful) {
                val sb = StringBuilder("Retrofit2.6以下响应格式统一处理2：\n")
                response.body()?.data?.forEach {
                    sb.append(it.name).append("\n")
                    Log.d(TAG, "handlerLowLevelResponseFormat2: ${it.name}")
                }
                tvResult.text = sb.toString()
            } else {
                Log.d(TAG, "handlerLowLevelResponseFormat2: failed ${response.errorBody().toString()}")
            }
        }
    }

    private fun handlerLowLevelResponseFormat1() {
        launch(exceptionHandler) {
            //需要借助Retrofit.Call类的扩展方法
            val response: Response<NetResponse<Article>> =
                    apiService.getArticleLowLevelFormat1().awaitResponse()
            if (response.isSuccessful) {
                val sb = StringBuilder("Retrofit2.6以下响应格式统一处理1：\n")
                response.body()?.data?.datas?.forEach { sb.append(it.title).append("\n") }
                tvResult.text = sb.toString()
            } else {
                Log.d(TAG, "handlerLowLevelResponseFormat1: failed ${response.errorBody().toString()}")
            }
        }
    }

    private fun handlerResponseFormat2() {
        launch(exceptionHandler) {
            val response = apiService.getWxarticleList()
            if (response.success()) {
                val articleList: MutableList<WxArticleResponse.DataBean>? = apiService.getWxarticleList().data
                val sb = StringBuilder("handlerResponseFormat2：\n")
                articleList?.forEach {
                    sb.append(it.name)
                    sb.append("\n")
                    Log.d(TAG, "handlerResponseFormat2: ${it.name}")
                }
                tvResult.text = sb.toString()
            } else {
                Log.d(TAG, "handlerResponseFormat2: failed ${response.errorMsg}")

            }
        }
    }

    private fun handlerResponseFormat1() {
        launch(exceptionHandler) {
            val response = apiService.getArticle()
            if (response.success()) {
                val article: Article? = apiService.getArticle().data
                val sb = StringBuilder("handlerResponseFormat1：\n")
                article?.datas?.forEach {
                    sb.append(it.title).append("\n")
                    Log.d(TAG, "handlerResponseFormat1: ${it.title}")
                }
                tvResult.text = sb.toString()
            } else {
                Log.d(TAG, "handlerResponseFormat1: failed ${response.errorMsg}")
            }
        }
    }

    private val exceptionHandler: CoroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        Log.d(TAG, "coroutine: error ${throwable.message}")
    }

    private fun coroutineRequest2() {
        launch(exceptionHandler) {
            val response = apiService.getWxarticle2()
            val sb = StringBuilder("Retrofit2.6配合协程请求：\n")
            response.data.forEach { sb.append(it.name).append("\n") }
            tvResult.text = sb.toString()
        }
    }

    private fun coroutineRequest2_6() {
        launch(exceptionHandler) {
            val response = apiService.getWxarticle2()
            val sb = StringBuilder("Retrofit2.6配合协程请求：\n")
            response.data.forEach { sb.append(it.name).append("\n") }
            tvResult.text = sb.toString()
        }
    }

    private fun coroutineRequest() {
        launch {
            //需要借助Retrofit.Call类的扩展方法
            val response: Response<WxArticleResponse> = apiService.getWxarticle().awaitResponse()
            val sb = StringBuilder("Retrofit配合协程请求：\n")
            response.body()?.data?.forEach {
                sb.append(it.name).append("\n")
            }
            tvResult.text = sb.toString()
        }
    }

    private fun normalRequest() {
        apiService.getWxarticle().enqueue(object : retrofit2.Callback<WxArticleResponse> {
            override fun onFailure(call: Call<WxArticleResponse>, t: Throwable) {
                Log.d(TAG, "onFailure: ${t.message}")
            }

            override fun onResponse(call: Call<WxArticleResponse>, response: Response<WxArticleResponse>) {
                if (response.isSuccessful) {
                    val wxArticleResponse = response.body()
                    val sb = StringBuilder("Retrofit正常请求：\n")
                    wxArticleResponse?.data?.forEach {
                        sb.append(it.name)
                        sb.append("\n")
                    }
                    tvResult.text = sb.toString()
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