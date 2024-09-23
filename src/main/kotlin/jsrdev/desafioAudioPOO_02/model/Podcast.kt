package jsrdev.desafioAudioPOO_02.model

class Podcast(
    title: String, duration: Int?, var host: String?, var description: String?
) : Audio(title, duration) {

    override fun getClassification(): Int = if (totalPlays >= 2_000) 9 else 2
}