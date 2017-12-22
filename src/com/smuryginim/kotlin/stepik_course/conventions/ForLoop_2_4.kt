package com.smuryginim.kotlin.stepik_course.conventions

/*
Kotlin for loop iterates through anything that provides an iterator. Make the class DateRange implement Iterable<MyDate>, so that it could be iterated over. You can use the function MyDate.nextDay().

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate>

 */


fun main(args: Array<String>) {
    iterateOverDateRange(b1, a1, ::doStaffForDate)
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}

fun doStaffForDate(date: MyDate) {
    println(date);
}