package com.smuryginim.kotlin.stepik_course.conventions

data class DateRange(override val start: MyDate, override val endInclusive: MyDate) : ClosedRange<MyDate>, Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> =
            object : Iterator<MyDate> {
                var current : MyDate = start

                override fun hasNext(): Boolean =  current <= endInclusive


                override fun next(): MyDate {
                    val result = current;
                    current = current.nextDay()
                    return result;
                }
            }
}

