package jsrdev.screenmatchPOO_02.model


class Movie(name: String, releaseDate: Int, durationInMinutes: Int, var director: String = "") : Title(
    name = name, releaseDate = releaseDate, durationInMinutes = durationInMinutes
), Classification {

    override fun getClassification(): Int = (calculateAverage() / 2).toInt()
}