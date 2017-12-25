package com.smuryginim.kotlin.stepik_course.collections

/*

Accumulates value starting with initial value and applying operation from left to right to current accumulator value and each element.

    listOf(1, 2, 3, 4).fold(1, {
    partProduct, element ->
    element * partProduct
}) == 24
 */

// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allOrderedProducts = customers.flatMap { it.orders.flatMap { it.products }}.toSet()//getAllOrderedProducts()
    return customers.fold(allOrderedProducts, {
        orderByAll, customer ->
        orderByAll.intersect(customer.orders.flatMap { it.products }.toSet())
    })

}