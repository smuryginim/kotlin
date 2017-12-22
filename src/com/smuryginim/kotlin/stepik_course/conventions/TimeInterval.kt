package com.smuryginim.kotlin.stepik_course.conventions

/**
 * @author ivsm0613
 * @date 22.12.2017
 */
enum class TimeInterval {
    YEAR,
    WEEK,
    DAY;
    var value:Int = 1

    operator fun times(param:Int):TimeInterval {
        value = param
        when(this) {
            YEAR -> return YEAR
            WEEK -> return WEEK
            DAY -> return DAY
        }
    }
}