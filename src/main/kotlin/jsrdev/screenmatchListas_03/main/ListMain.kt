package jsrdev.screenmatchListas_03.main

import jsrdev.screenmatchListas_03.model.Movie
import jsrdev.screenmatchListas_03.model.Series
import jsrdev.screenmatchListas_03.model.Title

fun main() {
    val movie1 = Movie(name = "Mi pobre angelito", releaseDate = 2005, durationInMinutes = 120)
    val movie2 = Movie(name = "101 Dalmatas", releaseDate = 2000, durationInMinutes = 95)

    val series1 = Series(name = "Vikings", releaseDate = 2000, seasons = 1, episodesBySeason = 50, minutesByEpisode = 10)

    val brunosMovie = Movie(name = "El señor de los anillos", releaseDate = 2001)

    movie1.evaluation(9.0)
    movie2.evaluation(9.5)
    brunosMovie.evaluation(9.8)

    val titleList: MutableSet<Title> = mutableSetOf()
    titleList.add(movie1)
    titleList.add(movie2)
    titleList.add(brunosMovie)
    titleList.add(series1)

    //titleList.forEach(::println)

    println()
    for (item in titleList) {
        if (item is Movie)
            println("${item.name}: classification is ${item.getClassification()}")
        else
            println(item.name)
    }

    /* ************* Ordenamiento de la lista ********* */
    println()
    // usando comparaTo  de Comparable<> personalizado en mi Title
    val sortedTitleByNameWithComparable = titleList.sorted()
    println("Sorted titles by name with Comparable: $sortedTitleByNameWithComparable")

    println()
    // usando sortedWith con un comparador personalizado
    val sortedTitlesByReleaseDate = titleList.sortedWith(compareBy { it.releaseDate})
    println("Sorted titles by release date: $sortedTitlesByReleaseDate")

    println()
    // ordenar por mas criterios, si no encuentra el primer elemento name lo compara por el sig releaseDate
    val sortedTitlesByNameAndReleaseDate = titleList.sortedWith(compareBy(Title::name, Title::releaseDate))
    println("Sorted Titles by name and release date: $sortedTitlesByNameAndReleaseDate")

    println()
    // usando el compareTo de Comparator<> personalizado en mi Title
    val sortedTitleByNameWithComparator = titleList.sortedWith(Title())
    println("Sorted titles by name with Comparator: $sortedTitleByNameWithComparator")

    println()
    // Usanod comparator por fecha de lanzamiento
    val sortedWithComparatorByReleaseDate = titleList.sortedWith(Comparator.comparing(Title::releaseDate))
    println("Sorted titles by release date using Comparator: $sortedWithComparatorByReleaseDate")

}