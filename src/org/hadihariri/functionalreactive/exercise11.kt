package org.hadihariri.functionalreactive.exercise11

// Exercise 11: Use map() and mergeAll() [Use Kotlin equivalent] to project and flatten the movieLists into an array of video ids

import org.hadihariri.functionalreactive.movieLists

fun main(args: Array<String>) {

    val videoIds = movieLists.flatMap {it.videos}.map {it.id}

    println(videoIds)


}

