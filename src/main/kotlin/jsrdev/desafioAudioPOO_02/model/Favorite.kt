package jsrdev.desafioAudioPOO_02.model

class Favorite {
    fun addFavorite(audio: Audio) {
        val classification = audio.getClassification()
        when {
            classification >= 8 -> println("${audio.title} es uno de los favoritos")
            classification >= 6 -> println("${audio.title} es de los mejores")
            else -> println("${audio.title} agregalo a tu album")
        }
    }
}