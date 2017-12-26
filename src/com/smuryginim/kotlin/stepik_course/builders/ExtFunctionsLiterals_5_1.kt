package com.smuryginim.kotlin.stepik_course.builders

fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this. }
    val isOdd: Int.() -> Boolean = { TODO() }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}