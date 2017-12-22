package com.smuryginim.kotlin.stepik_course.conventions

import java.util.*

/**
 * @author ivsm0613
 * @date 22.12.2017
 */
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    /*   override fun compareTo(other: MyDate): Int = toDate(this).compareTo(toDate(other))
   */

    override fun compareTo(other: MyDate): Int {
        if(this.year.compareTo(other.year) == 0) {
            if(this.month.compareTo(other.month) == 0) {
                return this.dayOfMonth.compareTo(other.dayOfMonth);
            }
            else {
                return this.month.compareTo(other.month);
            }
        }
        return this.year.compareTo(other.year);
    }

    //with java 8 local date time can be used
    fun toDate(date: MyDate) = Date(date.year, date.month, date.dayOfMonth)

    fun nextDay() : MyDate {
        return this.plus(TimeInterval.DAY)
    }

    operator fun plus(timeInterval : TimeInterval) : MyDate {
        return this.addTimeIntervals(timeInterval, timeInterval.value)
    }

    fun addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
        val c = Calendar.getInstance()
        c.set(year, month, dayOfMonth)
        when (timeInterval) {
            TimeInterval.DAY -> c.add(Calendar.DAY_OF_MONTH, number)
            TimeInterval.WEEK -> c.add(Calendar.WEEK_OF_MONTH, number)
            TimeInterval.YEAR -> c.add(Calendar.YEAR, number)
        }
        return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
    }
}

