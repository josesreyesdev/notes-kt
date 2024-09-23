package jsrdev.api_04.model

class Series(
    name: String,
    releaseDate: Int,
    val seasons: Int = 0,
    val episodesBySeason: Int = 0,
    val minutesByEpisode: Int = 0
) : Title(name = name, releaseDate = releaseDate, durationInMinutes = seasons * episodesBySeason * minutesByEpisode){

    override fun toString(): String = "Series: $name ($releaseDate)"
}