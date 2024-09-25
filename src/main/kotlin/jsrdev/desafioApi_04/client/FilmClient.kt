package jsrdev.desafioApi_04.client

import jsrdev.desafioApi_04.Constant.BASE_URL
import jsrdev.desafioApi_04.service.ApiService
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class FilmClient : ApiService {

    override fun getFilm(numberFilm: Int): String {
        val uri = "$BASE_URL$numberFilm/"

        /* REQUEST */
        val client = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(uri))
            .build()

        /* RESPONSE */
        try {
            val response = client
                .send(request, HttpResponse.BodyHandlers.ofString())

            val json = response.body()
            println("Response => $json")

            return json

        } catch (e: Exception) {
            throw RuntimeException("Not found this film ${e.message}")
        }
    }
}