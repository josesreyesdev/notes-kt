package jsrdev.desafioAudioPOO_02.model

class Song(
    title: String, val singer: String, duration: Int?, var album: String?, var genre: String?
) : Audio(title = title, duration = duration){

    override fun getClassification(): Int = if (likes >= 5000) 8 else 4
}