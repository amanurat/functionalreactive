package org.hadihariri.learnrx

import java.util.ArrayList


data public class Bookmark(val id: Int, val time: Int)
data public class Release(val id: Int, val title: String, val boxart: String, val uri: String, val rating: ArrayList<Double>, val bookmark: ArrayList<Bookmark>)

val names = arrayListOf<String>("Ben", "Jafar", "Matt", "Priya", "Brian")

val newReleases = arrayListOf<Release>(
        Release(70111470,
                "Die Hard",
                "http://cdn-0.nflximg.com/images/2891/DieHard.jpg",
                "http://api.netflix.com/catalog/titles/movies/70111470",
                arrayListOf<Double>(4.0),
                arrayListOf<Bookmark>()))