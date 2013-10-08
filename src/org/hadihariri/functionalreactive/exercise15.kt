package org.hadihariri.functionalreactive.exercise15

// Exercise 15: Use forEach to find the largest box art

import org.hadihariri.functionalreactive.boxarts
import org.hadihariri.functionalreactive.BoxArt


fun main(args: Array<String>) {

    var maxSize = -1
    var largestBoxArt : BoxArt? = null

    boxarts.forEach {
        val currentSize = it.width * it.height
        if (currentSize > maxSize) {
            largestBoxArt = it
            maxSize = currentSize
        }
    }
    println(largestBoxArt)
}