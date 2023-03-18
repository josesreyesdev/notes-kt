package examples

fun main() {
    letterDNI('l', 29824096)
}

fun letterDNI(letterDNI: Char, numberDNI: Int) {

    val letters: List<Char> = listOf('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
        'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E')
    if (letterDNI != ' ' && numberDNI >= 0 && numberDNI <= 99_999_999) {
        val upperLetter = letterDNI.uppercase()
        when ((letters[numberDNI % 23]).toString()) {
            upperLetter -> println("$upperLetter is valid")
            else -> println("$letterDNI: isn´t valid, verifica tus datos e intenta de nuevo")
        }
    } else println("Please, ingresa valores validos")
}
