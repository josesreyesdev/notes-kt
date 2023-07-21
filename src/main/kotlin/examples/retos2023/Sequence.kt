package examples.retos2023

fun main() {
    //  Por ejemplo:
//  únicoEnOrden("AAAABBBCCDAABBB") == ['A', 'B', 'C', 'D', 'A', 'B']
//  únicoEnOrden("AAAABBBCCDAABBB") == ['A', 'B', 'C', 'c', 'A', 'D']
//  únicoEnOrden("1223312")

    val firstString = "AAAABBBCCDAABBB"
    val secondString = "ABBCcAD"
    val thirdString = "1223312"

    println(uniqueInOrder(firstString))
    println(uniqueInOrder(secondString))
    println(uniqueInOrder(thirdString))
}

fun uniqueInOrder(sequence: String): List<Char> {
    val separateSequence = sequence.toCharArray()
    val uniquesLetters = mutableListOf<Char>()
    for (element in 0 until separateSequence.size - 1) {
        if (separateSequence[element] != separateSequence[element + 1]) {
            uniquesLetters.add(separateSequence[element])
        }
    }
    //Agregar el ultimo elemento de la secuencia ya que no fue incluido
    if (separateSequence.isNotEmpty()) {
        uniquesLetters.add(separateSequence.last())
    }
    return uniquesLetters
}
