package org.hadihariri.functionalreactive.exercise12

// Exercise 12: Retrieve id, title, and a 150x200 box art url for every video

import org.hadihariri.functionalreactive.movieListsWithMultipleBoxArts
import org.hadihariri.functionalreactive.BoxArt
import java.util.ArrayList

data class IdTitleBoxArt(val id: Int, val title: String, val boxart: String)

fun main(args: Array<String>) {

    val result = movieListsWithMultipleBoxArts.flatMap {
        it.videos.flatMap {
            val id = it.id
            val title = it.title
            it.boxart.filter {
                it.width == 150 && it.height == 200
            }.map { IdTitleBoxArt (id, title, it.url)}
        }
    }
    println(result)




}


