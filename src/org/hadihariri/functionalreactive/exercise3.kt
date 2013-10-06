package org.hadihariri.functionalreactive.exercise3

// Exercise 3: Project an array of videos into an array of {id,title} pairs using forEach()

import org.hadihariri.functionalreactive.newReleases
import org.hadihariri.functionalreactive.VideoIdAndTitle

fun main(args: Array<String>) {

    val videoAndTitlePairs = arrayListOf<VideoIdAndTitle>()

    newReleases.forEach {
        videoAndTitlePairs.add(VideoIdAndTitle(it.id, it.title))
    }
}