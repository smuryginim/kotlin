package com.smuryginim.kotlin.stepik_course.conventions

import java.util.*

/*
Implement a kind of date arithmetic. Support adding years, weeks and days to a date. You could be able to write the code
like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.
At first, add an extension function 'plus()' to MyDate, taking a TimeInterval as an argument.
Use an utility function MyDate.addTimeIntervals().
fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
...
}
Then, try to support adding several time intervals to a date. You may need an extra class.
Read {http://kotlinlang.org/docs/reference/operator-overloading.html}
 */




fun main(args: Array<String>) {

}

fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR*2 + TimeInterval.WEEK*3 + TimeInterval.DAY*5
}