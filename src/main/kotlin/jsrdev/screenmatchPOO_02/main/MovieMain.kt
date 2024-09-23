package jsrdev.screenmatchPOO_02.main

import jsrdev.screenmatchPOO_02.model.*
import jsrdev.screenmatchPOO_02.calculations.CalculationTime
import jsrdev.screenmatchPOO_02.calculations.RecommendationFilter
import jsrdev.screenmatchPOO_02.model.Episode

fun main() {

    /* Movies */
    val movie1 = Movie(
        name = "El Señor de los Anillos",
        releaseDate = 2005,
        durationInMinutes = 120
    )
    movie1.evaluation(10.0)
    movie1.evaluation(10.0)
    movie1.showTitle()
    println("Evaluation counter: ${movie1.evaluationCounter}")

    println()
    val movie2 = Movie(
        name = "101 Dalmatas",
        releaseDate = 2000,
        durationInMinutes = 95
    )


    /* Series */
    println()
    val series1 = Series(
        name = "Vikings",
        releaseDate = 2000,
        seasons = 1,
        episodesBySeason = 50,
        minutesByEpisode = 10
    )
    series1.evaluation(9.0)
    series1.evaluation(10.0)
    series1.evaluation(9.6)
    series1.evaluation(9.0)
    series1.showTitle()
    println("Evaluation counter: ${series1.evaluationCounter}")
    println("Duration in Minutes: ${series1.durationInMinutes}")
    println("Seasons: ${series1.seasons}")

    /* Calculos o RN */
    println()
    val calcTime = CalculationTime()
    calcTime.include(movie1)
    calcTime.include(series1)
    calcTime.include(movie2)
    println("Total time to watch your titles is of: ${calcTime.totalTime} minutes")

    /* recommendation filter of movie1*/
    println()
    println("Classification to ${movie1.name}")
    RecommendationFilter().filter(classification = movie1)

    /* Episodes */
    val episodeOfViking = Episode(num = 1, name = "Underworld", series = series1, totalViews = 999)

    /* Recommendation filter of series1*/
    println()
    println("Classification of ${series1.name} of episode name is ${episodeOfViking.name}")
    RecommendationFilter().filter(classification = episodeOfViking)
}