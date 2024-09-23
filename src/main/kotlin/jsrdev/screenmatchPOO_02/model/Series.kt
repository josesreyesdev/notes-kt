package jsrdev.screenmatchPOO_02.model


class Series(
    name: String,
    releaseDate: Int,
    val seasons: Int,
    val episodesBySeason: Int,
    val minutesByEpisode: Int
) : Title(name = name, releaseDate = releaseDate, durationInMinutes = seasons * episodesBySeason * minutesByEpisode)