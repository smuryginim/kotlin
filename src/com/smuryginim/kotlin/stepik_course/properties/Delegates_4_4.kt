package com.smuryginim.kotlin.stepik_course.properties

import com.smuryginim.kotlin.stepik_course.conventions.MyDate
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
You may declare your own delegates. Implement the methods of the class 'EffectiveDate' so it can be delegated to.
Store only the time in milliseconds in 'timeInMillis' property.

Use the extension functions MyDate.toMillis() and Long.toDate().
 */

class D {
    var date: MyDate by EffectiveDate()
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {

    var timeInMillis: Long? = null

    override fun getValue(thisRef: R, property: KProperty<*>): MyDate {
        return timeInMillis!!.toDate()
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) {
        timeInMillis = value.toMillis()
    }
}

fun MyDate.toMillis(): Long {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth, 0, 0, 0)
    c.set(Calendar.MILLISECOND, 0)
    return c.getTimeInMillis()
}

fun Long.toDate(): MyDate {
    val c = Calendar.getInstance()
    c.setTimeInMillis(this)
    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}