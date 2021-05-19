package com.github.gang.kt

import kotlinx.coroutines.suspendCancellableCoroutine
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

suspend fun okhttp3.Call.awaitResponse(): okhttp3.Response {

    return suspendCancellableCoroutine {
        it.invokeOnCancellation {
            //当协程被取消的时候，取消网络请求
            cancel()
        }

        enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                it.resumeWithException(e)
            }

            override fun onResponse(call: Call, response: Response) {
                //后台线程
                it.resume(response)
            }
        })
    }
}
