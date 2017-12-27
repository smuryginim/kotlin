package com.smuryginim.kotlin.stepik_course.builders

/*
Extension function literals are very useful for creating builders, e.g.:

fun buildString(build: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.build()
    return stringBuilder.toString()
}

val s = buildString {
    this.append("Numbers: ")
    for (i in 1..3) {
        // 'this' can be omitted
        append(i)
    }
}

s == "Numbers: 123"
Add and implement the function 'buildMap' with one parameter (of type extension function) creating
a new HashMap, building it and returning it as a result. The usage of this function is shown below.
 */
fun main(args: Array<String>) {
    val usage = usage()
    println(usage)
}

fun <K, V> buildMap(build: HashMap<K, V>.() -> Unit): Map<K, V> {
    val map = HashMap<K, V>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}