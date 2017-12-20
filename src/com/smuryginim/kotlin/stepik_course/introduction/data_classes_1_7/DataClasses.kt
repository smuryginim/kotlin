package com.smuryginim.kotlin.stepik_course.introduction.data_classes_1_7

data class Person(val name : String, val age: Int) {
    lateinit var notInitialized : String
    val lazyValue: String by lazy { println("lazy is called"); "lazyValue" }
}


fun main(args: Array<String>){
    val peoples = getPeople()
    println(peoples);
    val newPerson = copyWithName(peoples.get(0), "Ivan")
    newPerson.notInitialized = "Init";

    val newPersonSame = copyWithName(peoples.get(0), "Alice")
    if (newPersonSame.equals(peoples.get(0))){
        println(newPerson)
    }

    //lazy initialisator is called only once
    println(newPerson.lazyValue)
    println(newPerson.lazyValue)
}


fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun copyWithName(toCopy: Person, name: String): Person = toCopy.copy(name = name)