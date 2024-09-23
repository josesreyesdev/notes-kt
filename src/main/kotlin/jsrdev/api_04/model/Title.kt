package jsrdev.api_04.model

open class Title(
    val name: String = "",
    val releaseDate: Int = 0,
    var durationInMinutes: Int = 0
) : Comparable<Title>, Comparator<Title> {

    constructor(titleDto: TitleDto) : this(
        name = titleDto.title,
        releaseDate = (titleDto.year.substring(0, 4).trim()).toInt(),
        //durationInMinutes = ParseData.parseRuntime(titleDto.runtime)
        durationInMinutes = ParseData.newParseRuntime(titleDto.runtime)

    )

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

    /* Ordenamiento Compare con un criterio*/
    override fun compareTo(other: Title): Int = name.compareTo(other.name)
    /* Ordenamiento Compare con mas de un criterio, nota, no recomendable */
    /*override fun compareTo(other: Title): Int {
        val nameComparison = this.name.compareTo(other = other.name)
        if (nameComparison != 0) return nameComparison

        return this.releaseDate.compareTo(other = other.releaseDate)
    } */

    /* Ordenamiento coparator para mas de un criterio  */
    override fun compare(o1: Title?, o2: Title?): Int {
        // Manejo de nulos: si ambos son nulos, son iguales
        if (o1 == null && o2 == null) return 0
        // Si el primero es nulo, va antes que el segundo
        if (o1 == null) return -1
        // Si el segundo es nulo, va después del primero
        if (o2 == null) return 1

        return o1.name.compareTo(o2.name)
        // return compareValuesBy(o1, o2) { it?.name }
    }

    override fun toString(): String {
        return "Title: $name ($releaseDate), Duración: $durationInMinutes min"
    }

}