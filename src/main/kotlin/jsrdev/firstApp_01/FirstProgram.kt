package jsrdev.firstApp_01

fun main() {
    println("Bienvenido(a) a Screen Match")
    println("pelicula: Matrix")

    val releaseDate = 1999
    var incluideInThePlan = true
    var noteMovie = 8.2

    val media = (8.2 + 6.0 + 9.0) / 3
    println("Media: $media")

    val synopsis = """
        Matrix es una paradoja
        La mejor película del fín del milenio
        Fué lanzada en: $releaseDate
    """.trimIndent()
    println("Synopsis: $synopsis")

    val classification = (media/2).toInt()
    println("Classification: $classification")
}