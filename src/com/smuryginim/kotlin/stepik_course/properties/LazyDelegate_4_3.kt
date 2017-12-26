package com.smuryginim.kotlin.stepik_course.properties

/**
    Read about delegated properties and make the property lazy by using delegates.
 */


class LazyPropertyDel(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}
