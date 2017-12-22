package com.smuryginim.kotlin.stepik_course.conventions

import java.util.*

/**
Read about operator overloading to learn how different conventions for operations like ==, <, + work in Kotlin.
Add the function compareTo to the class MyDate to make it comparable.
After that the code below date1 < date2 will start to compile.
In Kotlin when you override a member, the modifier override is mandatory.
Reed {http://kotlinlang.org/docs/reference/operator-overloading.html}
 */


fun main(args: Array<String>) {
    println(compare(MyDate(1990, 7, 27), MyDate(1993, 7, 29)))
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2

