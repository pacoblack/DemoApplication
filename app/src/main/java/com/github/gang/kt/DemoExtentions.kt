package com.github.gang.kt

class B{
    fun bar() = "B.bar()"
}

open class C{
    fun foo(): String {
        println("成员函数")
        return "member"
    }

    fun baz() = "C.baz()"

//    fun B.foo() {
//        println("B.foo()");
//        bar()   // 调用 D.bar
//        baz()   // 调用 C.baz
//    }

    fun caller(b: B) {
        b.foo()   // 调用扩展函数
    }
    // 情况二
    fun B.foo() {
        toString()         // 调用 B.toString()
        this@C.toString()  // 调用 C.toString()
    }
}

class D: C()

fun C.foo() = "c"   // 扩展函数 foo

fun D.foo() = "d"   // 扩展函数 foo

fun printFoo(c: C) {
    println(c.foo())  // 类型是 C 类
}

fun Any?.toString(): String {
    if (this == null) return "null"
    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
    // 解析为 Any 类的成员函数
    return toString()
}

open class E {
    open fun foo() {
        println("E.foo")
    }
}

class F : E() {
    override fun foo() {
        println("F.foo")
    }
}

open class G {
    open fun E.foo() {
        println("E.foo in G")
    }

    open fun F.foo() {
        println("F.foo in G")
    }

    fun caller(e: E) {
        e.foo()   // 调用扩展函数
    }
}

class G1 : G() {
    override fun E.foo() {
        println("E.foo in G1")
    }

    override fun F.foo() {
        println("F.foo in G1")
    }
}

fun main(arg:Array<String>){
    //1. 调用的函数与{定义的类有关}，与具体类无关
    //2. 若扩展函数和成员函数一致，则使用该函数时，会优先使用{成员函数}
    //扩展函数没有"继承性"
    printFoo(D()) //$: c

    //3. 可以对NULL添加扩展函数
    var t = null
    println(t.toString())

    //4. 如果在一个类C中声明B的方法扩展，他们的方法名字是相同的话
    //C为分发者，B为接收者，则优先级是： 子类函数 > 成员函数 > 扩展函数B > 分发者函数C
    println(C().caller(B()))

    G().caller(E())   // 输出 "E.foo in G"
    G1().caller(E())  // 输出 "E.foo in G1"
    G().caller(F())  // 输出 "E.foo in G"
}