package examples.retos2023

fun main() {
    println("Es un heterograma?: ${heterograma("frase")}")
    println("Es un heterograma?: ${heterograma("hola")}")
    println("Es un heterograma?: ${heterograma("aaabbCCDD")}")
    println("Es un heterograma?: ${heterograma("amma")}")
    //isograma(frase)
    //pentagrama(frase)
}

fun heterograma( frase: String) : Boolean {
    val string = frase.lowercase().replace("[^a-z0-9]".toRegex(), "")
    var counter2 = 0
    string.forEach { char ->
        var counter = 0
        for (letter in string) {
            if (char == letter) counter2 += counter++
            if (counter2 > 1) break
        }
    }
    return counter2 <= 1
}

//mismo numero de veces
fun isograma( frase: String) : Boolean {
    var order = 0
    for (counter in letters(frase).values) {
        //if (order is 0) order = counter
        //retunr if (order  counter) false eslse
    }
    return true
}

//contenga todas las letras del abecedario
fun pentagrama( frase: String) {
    TODO("Not yet implemented")
}

private fun letters(text : String): Map<Char, Int> {
    val string = text.lowercase().replace("[^a-z0-9]".toRegex(), "")
    val charCounter = mutableMapOf<Char, Int>()
    string.forEach { char ->
        if (char in charCounter.keys) {
            charCounter[char] = charCounter[char]!! + 1
        } else charCounter[char] = 1
    }
    return charCounter
}

