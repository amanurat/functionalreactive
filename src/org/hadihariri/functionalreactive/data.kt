package org.hadihariri.functionalreactive

import java.util.ArrayList


data public class Bookmark(val id: Int, val time: Int)
data public class BoxArt(val width: Int, val height: Int, val url: String)
data public class Video(val id: Int, val title: String, val boxart: String, val uri: String, val rating: Double, val bookmark: ArrayList<Bookmark>)
data public class VideoMultipleBoxArts(val id: Int, val title: String, val boxart: ArrayList<BoxArt>, val uri: String, val rating: Double, val bookmark: ArrayList<Bookmark>)
data public class VideoIdAndTitle(val id: Int, val title: String)
data public class GenreAndVideo(val genre: String, val videos: ArrayList<Video>)
data public class GenreAndVideoBoxArt(val genre: String, val videos: ArrayList<VideoMultipleBoxArts>)

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

val movieListsWithMultipleBoxArts = arrayListOf<GenreAndVideoBoxArt>(
        GenreAndVideoBoxArt(  "New Releases",
                        arrayListOf<VideoMultipleBoxArts>(
                                VideoMultipleBoxArts(70111470,
                                        "Die Hard",
                                        arrayListOf<BoxArt>(BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"),BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/DieHard200.jpg")),
                                        "http://api.netflix.com/catalog/titles/movies/70111470",
                                        4.0,
                                        arrayListOf<Bookmark>()),
                                VideoMultipleBoxArts(654356453,
                                        "Bad Boys",
                                        arrayListOf<BoxArt>(BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/BadBoys200.jpg"),BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/BadBoys150.jpg")),
                                        "http://api.netflix.com/catalog/titles/movies/654356453",
                                        5.0,
                                        arrayListOf<Bookmark>(Bookmark(432534,65876586)))
                        )),
        GenreAndVideoBoxArt("Dramas",
                        arrayListOf<VideoMultipleBoxArts>(
                                VideoMultipleBoxArts(65432445,
                                        "The Chamber",
                                        arrayListOf<BoxArt>(BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg"),BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/TheChamber200.jpg")),
                                        "http://api.netflix.com/catalog/titles/movies/65432445",
                                        4.0,
                                        arrayListOf<Bookmark>()),
                                VideoMultipleBoxArts(675465,
                                        "Fracture",
                                        arrayListOf<BoxArt>(BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/Fracture150.jpg"),BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/Fracture200.jpg"),BoxArt(300, 200, "http://cdn-0.nflximg.com/images/2891/Fracture300.jpg")),
                                        "http://api.netflix.com/catalog/titles/movies/675465",
                                        5.0,
                                        arrayListOf<Bookmark>(Bookmark(432534,65876586))))
                        )
        )

val boxarts = arrayListOf<BoxArt>(
        BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/Fracture200.jpg"),
        BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/Fracture150.jpg"),
        BoxArt(300, 200, "http://cdn-0.nflximg.com/images/2891/Fracture30.jpg"),
        BoxArt(425, 150, "http://cdn-0.nflximg.com/images/2891/Fracture450.jpg"))


val ratings = arrayListOf(2, 5, 1, 4, 3)