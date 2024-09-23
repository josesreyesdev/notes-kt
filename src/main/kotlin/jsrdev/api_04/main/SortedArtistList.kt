package jsrdev.api_04.main

import java.util.Collections

fun main() {
    val artistList = mutableListOf<String>()
    artistList.add("Penelope Cruz")
    artistList.add("Antonio Banderas")
    artistList.add("Ricardo Darin")

    println("Lista de artistas no ordenadas: $artistList")
    Collections.sort(artistList) //artistList.sort()
    println("Lista de artistas ordenada: $artistList")

    artistList.sorted()

}