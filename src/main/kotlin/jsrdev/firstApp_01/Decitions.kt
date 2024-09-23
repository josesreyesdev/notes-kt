package jsrdev.firstApp_01

fun main() {
    val releaseDate = 1999
    val incluideInThePlan = false
    var noteMovie = 8.2
    val plan = "plus"

    /*if (releaseDate >= 2022) {
        println("Movie más populares")
    } else {
        println("Movie retro que vale la pena ver")
    } */

    if (incluideInThePlan && plan.equals("plus", ignoreCase = true)) {
        println("Disfrute de la movie")
    } else {
        println("Pelicula no disponible para el plan actual")
    }

}