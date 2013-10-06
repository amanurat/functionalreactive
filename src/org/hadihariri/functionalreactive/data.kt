package org.hadihariri.functionalreactive

import java.util.ArrayList


data public class Bookmark(val id: Int, val time: Int)
data public class Video(val id: Int, val title: String, val boxart: String, val uri: String, val rating: Double, val bookmark: ArrayList<Bookmark>)
data public class VideoIdAndTitle(val id: Int, val title: String)
data public class GenreAndVideo(val genre: String, val videos: ArrayList<Video>)

val names = arrayListOf<String>("Ben", "Jafar", "Matt", "Priya", "Brian")

val newReleases = arrayListOf<Video>(
        Video(70111470,
                "Die Hard",
                "http://cdn-0.nflximg.com/images/2891/DieHard.jpg",
                "http://api.netflix.com/catalog/titles/movies/70111470",
                4.0,
                arrayListOf<Bookmark>()),
        Video(654356453,
                "Bad Boys",
                "http://cdn-0.nflximg.com/images/2891/BadBoys.jpg",
                "http://api.netflix.com/catalog/titles/movies/654356453",
                5.0,
                arrayListOf<Bookmark>(Bookmark(432534,65876586))),
        Video(65432445,
                "The Chamber",
                "http://cdn-0.nflximg.com/images/2891/TheChamber.jpg",
                "http://api.netflix.com/catalog/titles/movies/65432445",
                4.0,
                arrayListOf<Bookmark>()),
        Video(675465,
                "Fracture",
                "http://cdn-0.nflximg.com/images/2891/Fracture.jpg",
                "http://api.netflix.com/catalog/titles/movies/675465",
                5.0,
                arrayListOf<Bookmark>(Bookmark(432534,65876586))))





val movieLists = arrayListOf<GenreAndVideo>(
        GenreAndVideo(  "New Releases",
                        arrayListOf<Video>(
                                Video(70111470,
                                        "Die Hard",
                                        "http://cdn-0.nflximg.com/images/2891/DieHard.jpg",
                                        "http://api.netflix.com/catalog/titles/movies/70111470",
                                        4.0,
                                        arrayListOf<Bookmark>()),
                                Video(654356453,
                                        "Bad Boys",
                                        "http://cdn-0.nflximg.com/images/2891/BadBoys.jpg",
                                        "http://api.netflix.com/catalog/titles/movies/654356453",
                                        5.0,
                                        arrayListOf<Bookmark>(Bookmark(432534,65876586)))
                        )),
        GenreAndVideo("Dramas",
                        arrayListOf<Video>(
                                Video(65432445,
                                        "The Chamber",
                                        "http://cdn-0.nflximg.com/images/2891/TheChamber.jpg",
                                        "http://api.netflix.com/catalog/titles/movies/65432445",
                                        4.0,
                                        arrayListOf<Bookmark>()),
                                Video(675465,
                                        "Fracture",
                                        "http://cdn-0.nflximg.com/images/2891/Fracture.jpg",
                                        "http://api.netflix.com/catalog/titles/movies/675465",
                                        5.0,
                                        arrayListOf<Bookmark>(Bookmark(432534,65876586))))
                        )
        )
