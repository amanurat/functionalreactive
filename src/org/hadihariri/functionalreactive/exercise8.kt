package org.hadihariri.functionalreactive.exercise8

// Exercise 8: Chain filter and map to collect the ids of videos that have a rating of 5.0

import org.hadihariri.functionalreactive.newReleases
import org.hadihariri.functionalreactive.VideoIdAndTitle

fun main(args: Array<String>) {

    val result = newReleases.filter {
        it.rating == 5.0
    }.map {
        it.id
    }

    println(result)


}
