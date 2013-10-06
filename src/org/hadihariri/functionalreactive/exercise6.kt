package org.hadihariri.functionalreactive.exercise6

// Exercise 6: Use forEach() to collect only those videos with a rating of 5.0

import org.hadihariri.functionalreactive.newReleases
import org.hadihariri.functionalreactive.VideoIdAndTitle

fun main(args: Array<String>) {

    val videoAndTitlePairs = arrayListOf<VideoIdAndTitle>()

    newReleases.forEach {
        if (it.rating == 5.0)
        videoAndTitlePairs.add(VideoIdAndTitle(it.id, it.title))
    }
    println(videoAndTitlePairs)

}