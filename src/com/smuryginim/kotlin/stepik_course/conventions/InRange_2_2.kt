package com.smuryginim.kotlin.stepik_course.conventions

/*
In Kotlin 'in' checks are translated to the corresponding contains calls:
val list = listOf("a", "b")
"a" in list  // list.contains("a")
"a" !in list // !list.contains("a")
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate>
Read about ranges. Add a method fun contains(d: MyDate) to the class DateRange to allow in checks with a range of dates.
Read {http://kotlinlang.org/docs/reference/ranges.html
http://kotlinlang.ru/docs/reference/ranges.html}
 */


fun main(args: Array<String>) {
    val a1 = MyDate(1988, 12, 12)
    val b1 = MyDate(1978, 12, 12)
    val c1 = MyDate(1990, 12, 12)

    println("Is date $a1 in range of $b1 to $c1 = ${checkInRange(a1, b1, c1)}")
}

class DateRange2(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(other: MyDate): Boolean {
        return other in start..endInclusive
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}