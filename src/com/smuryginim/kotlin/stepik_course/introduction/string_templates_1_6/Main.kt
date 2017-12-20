package com.smuryginim.kotlin.stepik_course.introduction.string_templates_1_6

fun main(args: Array<String>) {

    val regex = Regex(getPattern())
    val matches = regex.matches("13 JUN 1992")
    println(matches)

}

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
fun getPattern() = """\d{2} ${month} \d{4}"""
