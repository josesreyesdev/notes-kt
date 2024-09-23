package jsrdev.firstApp_01

fun main() {
    println("Escribe el nombre de tu película")
    val movieName = readLine()

    println("Ahora escribe la fecha de lanzamiento")
    var releaseDate = readLine()?.toIntOrNull()
    while (releaseDate == null) {
        println("Fecha de lanzamiento inválido, intenta de nuevo")
        releaseDate = readLine()?.toIntOrNull()
    }

    println("Ingresa la nota que le das a la película")
    var note = readLine()?.toDoubleOrNull()
    while (note == null) {
        println("La nota es inválida, intenta de nuevo")
        note = readLine()?.toDoubleOrNull()
    }

    println()
    println("Movie: $movieName")
    println("Lanzamiento: $releaseDate")
    println("Nota: $note")
}