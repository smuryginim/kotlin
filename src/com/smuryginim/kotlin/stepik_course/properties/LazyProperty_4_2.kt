package com.smuryginim.kotlin.stepik_course.properties

/*
Add a custom getter to make the 'lazy' val really lazy. It should be initialized by the invocation of 'initializer()' at the moment of the first access.
You can add as many additional properties as you need.
Do not use delegated properties!
 */

class LazyProperty(val initializer: () -> Int) {
    var _lazy: Int? = null
    val lazy: Int
        get() {
            if (_lazy == null) {
                _lazy = initializer()
            }
            return _lazy!!
        }
}