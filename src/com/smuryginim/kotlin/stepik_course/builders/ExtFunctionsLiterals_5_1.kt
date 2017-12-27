package com.smuryginim.kotlin.stepik_course.builders

/*
Read about function literals with receiver.

You can declare isEven and isOdd as values, that can be called as extension functions. Complete the declarations below.
 */

fun main(args: Array<String>) {
    println(task())
}

fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { this % 2 != 0 }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}