package com.smuryginim.kotlin.stepik_course.introduction

fun main(args: Array<String>) {
    val r = 1.r()
    println(r)
}

fun Int.r(): RationalNumber = RationalNumber(this, 0);
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)

data class RationalNumber(val numerator: Int, val denominator: Int)