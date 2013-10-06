package org.hadihariri.functionalreactive.exercise9

// Exercise 9: Flatten the movieLists array into an array of video ids

import org.hadihariri.functionalreactive.movieLists

fun main(args: Array<String>) {

    val videoIds = arrayListOf<Int>()

    movieLists.forEach {
        it.videos.forEach {
            videoIds.add(it.id)
        }
    }
    println(videoIds)


}
