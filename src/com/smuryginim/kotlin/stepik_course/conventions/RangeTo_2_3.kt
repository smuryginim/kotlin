package com.smuryginim.kotlin.stepik_course.conventions


/*
Implement the function MyDate.rangeTo(). This allows you to create a range of dates using the following syntax:

MyDate(2015, 5, 11)..MyDate(2015, 5, 12)

Note that now the class DateRange implements the standard ClosedRange interface and inherits contains method implementation.
 */

val a1 = MyDate(1988, 12, 12)
val b1 = MyDate(1978, 12, 12)
val c1 = MyDate(1990, 12, 12)


fun main(args: Array<String>) {
    println(a1.rangeTo(c1))
}

operator fun MyDate.rangeTo(other: MyDate) =  DateRange(this, other)
