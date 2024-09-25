package jsrdev.desafioApi_04.main

import com.google.gson.reflect.TypeToken
import jsrdev.desafioApi_04.client.FilmClient
import jsrdev.desafioApi_04.files.FileGenerator
import jsrdev.desafioApi_04.files.ReadFileGenerator
import jsrdev.desafioApi_04.files.Serializer
import jsrdev.desafioApi_04.models.Film

fun main() {
    showProgram()
}

private fun showProgram() {
    //val films = mutableMapOf<Int,Film>()
    val filmsSet = mutableSetOf<Film>()

    var number: Int?

    while (true) {
        number = getEntry()
        while (number == null) {
            println("\nInvalid entry, try again")
            number = getEntry()
        }

        if (number < 1 || number > 6) {
            println("\nGOOD BYE!")
            break
        }

        /*if (!films.containsKey(number)) {
            val json = FilmClient().getFilm(number)
            val film = Serializer().deserializeData(json, Film::class.java)

            // add to map
            films[number] = film
        } else println("\nFilm already exist") */

        val json = FilmClient().getFilm(number)
        val film = Serializer().deserializeData(json, Film::class.java)

        if (!filmsSet.contains(film)) {
            // add to Set
            filmsSet.add(film)
        } else println("\nFilm already exist")
    }

    /*
    /* WRITE FILE */
    val fileGenerator = FileGenerator<Map<Int,Film>>()
    // Write to Json file
    fileGenerator.writeToFile(films, "JsonFilmsMap.json", true)
    // Write to Text file
    fileGenerator.writeToFile(films, "TextFilmsMap.txt", false)

    /* READ FILE */
    val readFileGenerator = ReadFileGenerator<Map<Int, Film>>()

    // leer Json
    val filmType = object : TypeToken<Map<Int, Film>>() {}
    val filmFromJson = readFileGenerator.readFromFile("JsonFilmsMap.json", true, filmType)
    println()
    println("Leer desde el json")
    println(filmFromJson)

    // leer de un txt
    val readFile = ReadFileGenerator<String>()
    val filmsFromText = readFile.readFromFile("TextFilmsMap.txt", false)
    println()
    println("leer desde el txt")
    println(filmsFromText) */

    /* WRITE FILE EXAMPLE SET */
    val fileGenerator = FileGenerator<Set<Film>>()
    // Write to Json file
    fileGenerator.writeToFile(filmsSet, "JsonFilmsSet.json", true)
    // Write to Text file
    fileGenerator.writeToFile(filmsSet, "TextFilmsSet.txt", false)

    /* READ FILE */
    val readFileGenerator = ReadFileGenerator<Set<Film>>()

    // leer Json
    val filmType = object : TypeToken<Set<Film>>() {}
    val filmFromJson = readFileGenerator.readFromFile("JsonFilmsSet.json", true, filmType)
    println()
    println("Leer desde el json")
    println(filmFromJson)

    // leer de un txt
    val readFile = ReadFileGenerator<String>()
    val filmsFromText = readFile.readFromFile("TextFilmsSet.txt", false)
    println()
    println("leer desde el txt")
    println(filmsFromText)
}

private fun getEntry(): Int? {
    println()
    val showDetails = """
        Enter a number between 1 and 6 to display the movie details, or enter any other number to exit.
        1.- A New Hope
        2.- The Empire Strikes Back
        3.- Return Of The Jedi
        4.- A New Hope II
        5.- Attack of the Clones
        6.- Revenge Of The Sith
    """.trimIndent()
    println(showDetails)

    return readLine()?.toIntOrNull()
}

