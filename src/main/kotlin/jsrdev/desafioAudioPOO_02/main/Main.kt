package jsrdev.desafioAudioPOO_02.main

import jsrdev.desafioAudioPOO_02.model.Favorite
import jsrdev.desafioAudioPOO_02.model.Podcast
import jsrdev.desafioAudioPOO_02.model.Song

fun main() {
    val song1 = Song(
        title = "Forever",
        singer = "Kiss",
        duration = null,
        album = null,
        genre = null,
    )

    val podcast1 = Podcast(
        title = "Cafe.Tech",
        duration = null,
        host = "Gabriela Aguiar",
        description = null
    )

    /* added likes and reproductions */
    for (i in 1..1000) {
        //song1.like()

        repeat(2) {
            podcast1.like()
        }
        repeat(4) {
            podcast1.play()
        }
        repeat(5) {
            song1.like()
            song1.play()
        }

    }

    println("La canción: ${song1.title} tiene ${song1.totalPlays} reproducciones")
    println("Y ${song1.likes} likes")
    Favorite().addFavorite(audio = song1)

    println()
    println("El podcast: ${podcast1.title} tiene ${podcast1.totalPlays} reproducciones")
    println("Y ${podcast1.likes} likes")
    Favorite().addFavorite(audio = podcast1)

}