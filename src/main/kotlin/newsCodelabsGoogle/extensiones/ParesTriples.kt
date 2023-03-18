package newsCodelabsGoogle.extensiones

fun main() {
    val twoList = "Hola" to "José S R"
    //println(twoList)                                            // (Hola, José S R)
    //println("${twoList.first} eres ${twoList.second}")          // Hola, eres José S R

    val numbers = Triple(6, 9,42)
    //println(numbers.toString())                                 // (6, 9, 42)
    //println(numbers.toList())                                   // [6, 9, 42

    val completeName = "José" to "S. Reyes"
    val (name, apellido) = completeName
    println("$name tu apellido es $apellido")                    // Jose tu apellido es S. Reyes

    val numbers1 = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers1
    println("$n1 $n2 $n3")                                       // 6 9 42
}