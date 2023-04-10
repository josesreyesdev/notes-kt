package examples.retos2023

fun main() {

}

fun advinaLaPalabra() {
    val words = listOf("mouredev", "brais", "moure")
    val word = words.random()
    val hiddenLetters = (word.length * 0.6).toInt()
    //val hiddenPositions = random.sample(range(word.length), hiddenLetters)
    val hiddenPositions = (0..word.length)

    var hiddenWord = ""
    for ((index, letter) in word.withIndex()) {
        hiddenWord += if(index in hiddenPositions) "_" else letter
    }

    var attemps = 5 //intentos

    while (attemps > 0) {
        println("Adivina la palabra: $hiddenWord")
        println("Tienes: $attemps intentos")

        println("Introduce una letra o la solucion completa: ")
        val text = readLine()

        if (text != null) {
            if (text.length == 1) {

                var newHiddenWord = ""
                var success = false
                for ((index, letter) in word.withIndex()) {
                    if (text == letter.toString() && hiddenWord[index] == '_') {
                        newHiddenWord += text
                        success = true
                    } else {
                        newHiddenWord += hiddenWord[index]
                    }

                    hiddenWord = newHiddenWord
                    if (success) {
                        if (word == hiddenWord) {
                            println("Haz acertado, la palabra oculta es: $word")
                            break
                        } else {
                            println("¡Haz acertado la letra!")
                        }
                    } else {
                        println("Letra no encontrada o ya visible.")
                        attemps -= 1
                    }
                }

            } else {
                if(text.length == word.length) {
                    if (text == word) {
                        println("Haz acertado, la palabra oculta era: $word")
                        break
                    } else {
                        println("La palabra no es correcta")
                        attemps -= 1
                    }
                } else {
                    println("Texto invalido.")
                }
            }
        }
    }

    if (attemps == 0) {
        println("Has perdido, La palabra oculta era $word")
    }
}