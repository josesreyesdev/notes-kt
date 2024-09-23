package jsrdev.screenmatchPOO_02.model

open class Title(
    val name: String = "",
    val releaseDate: Int = 0,
    val durationInMinutes: Int = 0
) {
    //private var includedInThePlan: Boolean = false
    private var evaluationSum: Double = 0.0

    private var _evaluationCounter: Int = 0
    val evaluationCounter: Int
        get() = _evaluationCounter

    fun showTitle() {
        println("Title: $name")
        println("Release Date: $releaseDate")
        println("Duration in Minutes: $durationInMinutes")
        //println("Evaluation Sum: $evaluationSum")
        if (!calculateAverage().isNaN()) {
            println("Average/Media: ${calculateAverage()}")
        }
    }

    fun evaluation(note: Double) {
        evaluationSum += note
        _evaluationCounter++
    }

    fun calculateAverage(): Double = evaluationSum / evaluationCounter
}