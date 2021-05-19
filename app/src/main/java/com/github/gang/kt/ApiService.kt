package com.github.gang.kt

import com.github.gang.kt.model.Article
import com.github.gang.kt.model.NetResponse
import com.github.gang.kt.model.WxArticleResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {


    @GET("wxarticle/chapters/json")
    fun getWxarticle(): Call<WxArticleResponse>

    /**
     * retrofit2.6.0以下格式统一处理
     */
    @GET("article/list/1/json")
    fun getArticleLowLevelFormat1(): Call<NetResponse<Article>>

    @GET("wxarticle/chapters/json")
    fun getWxarticleListLowLevelFormat2(): Call<NetResponse<MutableList<WxArticleResponse.DataBean>>>

    @GET("wxarticle/chapters/json")
    suspend fun getWxarticle2(): WxArticleResponse

    /**
     * retrofit2.6.0以上格式统一处理
     */
    @GET("article/list/1/json")
    suspend fun getArticle(): NetResponse<Article>

    @GET("wxarticle/chapters/json")
    suspend fun getWxarticleList(): NetResponse<MutableList<WxArticleResponse.DataBean>>
}
