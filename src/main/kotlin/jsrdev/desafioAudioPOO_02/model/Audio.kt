package jsrdev.desafioAudioPOO_02.model

open class Audio(val title: String, var duration: Int?): Classification {

    private var _totalPlays: Int = 0
    val totalPlays get() = _totalPlays

    private var _likes: Int = 0
    val likes get() = _likes

    fun like() {
      _likes++
    }

    fun play() {
        _totalPlays++
    }

    override fun getClassification(): Int = if (likes > 5_000 || totalPlays > 10_000) 8 else 4
}
