package com.smuryginim.kotlin.stepik_course.conventions


fun main(args: Array<String>) {
    println(isLeapDay(a1));
}

fun isLeapDay(date: MyDate): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}