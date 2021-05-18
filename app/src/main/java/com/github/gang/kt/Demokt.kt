package com.github.gang.kt

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

fun setUpUI(){
    GlobalScope.launch(Main) {
        val dataDeferred  = requestDataAsync()
        doSomethingElse()
        val data = dataDeferred.await()
        processData(data)
    }
    Thread.sleep(1000)
    doSomethingElse2()
}

fun requestDataAsync(): Deferred<String> {
    // 启动一个异步协程去执行耗时任务
    return GlobalScope.async {
        requestData()
    }
}

fun requestData(): String {
    Thread.sleep(2000)
    return "Ui Data"
}

fun doSomethingElse(){
    println("doSomethingElse")
}

fun doSomethingElse2(){
    println("doSomethingElse2")
}

fun processData(data: String) {
    println("updateUI$data")
}