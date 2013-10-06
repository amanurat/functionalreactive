package org.hadihariri.functionalreactive.exercise5

// Exercise 5: Use map() to project an array of videos into an array of {id,title} pairs

import org.hadihariri.functionalreactive.newReleases
import org.hadihariri.functionalreactive.VideoIdAndTitle

fun main(args: Array<String>) {
    val videoAndTitle = newReleases.map {
        VideoIdAndTitle(it.id, it.title)
    }
    println(videoAndTitle)
}