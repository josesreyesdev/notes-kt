package jsrdev.api_04.main

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import jsrdev.api_04.exceptions.ErrorConvertDurationException
import jsrdev.api_04.model.Title
import jsrdev.api_04.model.TitleDto
import jsrdev.api_04.util.Config.API_KEY
import jsrdev.api_04.util.Config.BASE_URL
import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.FileWriter
import java.net.URI
import java.net.URLEncoder
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.net.http.HttpResponse.BodyHandlers
import java.nio.charset.StandardCharsets

fun main() {
    val gson: Gson = GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .setPrettyPrinting()
        .create()

    val titles = mutableSetOf<Title>()

    while (true) {
        // Solicitar y validar el nombre de la película
        val movieName = getValidatedMovieName()

        if (movieName.equals("exit", ignoreCase = true)) {
            break
        }

        // Preparar la URL codificada para la solicitud
        val movieUrl = buildMovieUrl(movieName)

        try {
            // Realizar la solicitud HTTP
            val json = fetchMovieData(movieUrl)
            println(json)

            // Deserealize Json string to Kotlin object
            val titleDto: TitleDto = deserializeJSON(gson, json)

            // Serielize kotlin object to Json string
            //val jsonString = serializeObject(titleDto)

            // convert TitleDto to Title class
            val title = Title(titleDto)

            // Mostrar la respuesta de la API
            displayResponse(title)

            // Escribir en un archivo
            //fileWriterToString(title)

            // Leer un archivo
            //fileReader()

            titles.add(title)
        } catch (e: Exception) {
            when (e) {
                is ErrorConvertDurationException, is NumberFormatException,
                is IllegalArgumentException, is NullPointerException,
                is RuntimeException -> {
                    println("Exception: ${e.message}")
                }

                else -> throw e // Relanzamos si no es ninguna de las excepciones específicas
            }
        }

        // Write a json file
        println(titles)
        fileWriterToJson(gson, titles)
    }
}

private fun getValidatedMovieName(): String {

    var movieName = requestMovieName()
    while (movieName.isNullOrBlank()) {
        println("\nThe entered movie name is not valid. Please try again.")
        movieName = requestMovieName()
    }

    return movieName.trim().lowercase()
}

private fun requestMovieName(): String? {
    println("\nEnter the movie name, or \"Exit\" to stop")
    return readLine()
}

private fun buildMovieUrl(movieName: String): String {
    val encodedMovie = URLEncoder.encode(movieName, StandardCharsets.UTF_8)
    val movie = encodedMovie.replace("+", "%20")
    return "${BASE_URL}apikey=$API_KEY&t=$movie"
}

private fun fetchMovieData(url: String): String {
    val client: HttpClient = HttpClient.newBuilder().build()

    val request: HttpRequest = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .build()

    val response: HttpResponse<String> = client.send(request, BodyHandlers.ofString())

    println("\nStatus response: ${response.statusCode()}")
    return response.body()
}

private fun deserializeJSON(gson: Gson, json: String): TitleDto = gson
    .fromJson(json, TitleDto::class.java)

//private fun serializeObject(objectType: TitleDto): String = Gson().toJson(objectType)

private fun displayResponse(objectType: Title) = println("Response: $objectType")

private fun fileWriterToString(title: Title) {
    val myTitles = mutableListOf(title)
    repeat(3) {
        myTitles.add(title)
    }
    val writer = FileWriter("Titles.txt")
    writer.write(myTitles.toString())

    // Al crear archivos tenemos que cerrar conexion
    writer.close()
}

private fun fileWriterToJson(gson: Gson, titles: Set<Title>) {

    val writer = FileWriter("Titles.json")
    writer.write(gson.toJson(titles))

    writer.close()
}

private fun fileReader() {
    try {
        // crear un archivo
        val file = File("C:\\Users\\Jose\\Desktop\\Projects\\MyFile.txt")

        // leer el archivo
        val reader = FileReader(file)

        // leer los datos del archivo
        var data = reader.read()
        while (data != -1) {
            print("${data.toChar()}")
            data = reader.read()
        }

        reader.close()
    } catch (e: FileNotFoundException) {
        println("File not found")
    }

    /* Investigar sobre leer y escribir
    *
    * ufferedReader y BufferedWriter
    * FileInputStream y FileOutputStream
    * ObjectInputStream y ObjectOutputStream
    * */
}