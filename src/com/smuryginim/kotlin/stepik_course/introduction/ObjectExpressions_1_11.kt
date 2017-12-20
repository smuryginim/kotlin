package com.smuryginim.kotlin.stepik_course.introduction

import java.util.*

object Singleton {
    init {
        println("Singleton is created")
    }
}

fun main(args: Array<String>) {
    val singleton = Singleton
    println(singleton)
}

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(o1: Int, o2: Int): Int {
            return o2.compareTo(o1)
        }
    })
    return arrayList
}