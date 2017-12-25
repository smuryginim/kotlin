package com.smuryginim.kotlin.stepik_course.collections

/*
    val numbers = listOf(1, 3, -4, 2, -11)
    val (positive, negative) = numbers.partition { it > 0 }
    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
 */

val city = City("Moscow")

val product1 = Product("Macbook pro", 1000.0)
val product2 = Product("Lenovo thinkpad", 900.0)
val product3 = Product("Sony", 800.0)
val product4 = Product("Toshiba", 500.0)
val product5 = Product("Chromebook", 100.0)

val orderDelivered1 = Order(listOf(product1, product2), true)
val orderDelivered2 = Order(listOf(product3, product4), true)
val orderUndelivered3 = Order(listOf(product3, product5), false)
val orderUndelivered4 = Order(listOf(product5, product2), false)

val customer1 = Customer("Ivan", city,  listOf(orderDelivered1, orderUndelivered3, orderUndelivered4))
val customer2 = Customer("Denis", city,  listOf(orderDelivered1, orderDelivered2, orderUndelivered4))
val customer3 = Customer("Ana", city,  listOf(orderUndelivered3, orderUndelivered4, orderUndelivered4))
var shop1 = Shop("Tech", listOf(customer1, customer2, customer3))


fun main(args: Array<String>) {
    val customersWithMoreUndeliveredOrdersThanDelivered = shop1.getCustomersWithMoreUndeliveredOrdersThanDelivered()
    println(customersWithMoreUndeliveredOrdersThanDelivered)
}

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter {
    val (delivered, undelivered) = it.orders.partition { it.isDelivered }
    undelivered.size > delivered.size
}.toSet()
