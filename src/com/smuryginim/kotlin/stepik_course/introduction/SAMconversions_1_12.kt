package com.smuryginim.kotlin.stepik_course.introduction

import java.util.*

fun main(args: Array<String>) {
    println(getList2())
}

fun getList1(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y.compareTo(x) })
    return arrayList
}

fun getList2(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()
}