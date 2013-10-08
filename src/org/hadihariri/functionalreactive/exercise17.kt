package org.hadihariri.functionalreactive.exercise17

// Exercise 17: Retrieve the largest rating.
import org.hadihariri.functionalreactive.ratings


fun main(args: Array<String>) {

    val largestRating = ratings.reduce { (a, b) -> if (a > b) { a } else { b } }

    println(largestRating)

}

