package org.hadihariri.functionalreactive.exercise12

// Exercise 12: Retrieve id, title, and a 150x200 box art url for every video

import org.hadihariri.functionalreactive.movieListsWithMultipleBoxArts
import org.hadihariri.functionalreactive.BoxArt
import java.util.ArrayList

class IdTitleBoxArt(val id: Int, val title: String, val boxart: String)

fun main(args: Array<String>) {

    val videos = movieListsWithMultipleBoxArts
    println(videos)




}

