package org.hadihariri.functionalreactive.exercise10

// Exercise 10: Implement mergeAll()

// Kotlin has flatMap

fun main(args: Array<String>) {

    val list = arrayListOf(arrayListOf<Int>(1, 2, 3), arrayListOf<Int>(4, 5, 6))

    println(list.flatMap { it })

}
