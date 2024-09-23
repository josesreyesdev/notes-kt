package jsrdev.api_04.model

class Movie(name: String, releaseDate: Int, durationInMinutes: Int = 0, var director: String = "") :
    Title(name = name, releaseDate = releaseDate, durationInMinutes = durationInMinutes),
    Classification {

    override fun getClassification(): Int = (calculateAverage() / 2).toInt()

    override fun toString(): String = "Movie: $name ($releaseDate)"
}