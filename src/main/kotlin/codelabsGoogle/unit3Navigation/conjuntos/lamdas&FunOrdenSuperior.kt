package codelabsGoogle.unit3Navigation.conjuntos

fun main() {
    /* TIPOS DE FUNCIONES CON EXPRESIONES LAMBDA */
    lambdaFunction()

     /* FUNCIONES DE ORDEN SUPERIOR*/
    superiorFunctions()
}

fun lambdaFunction() {
    val triple1: (Int) -> Int = { a: Int -> a * 3}
    val triple2: (Int) -> Int = { it * 3 }
    val triple3 = { a: Int -> a * 3}
    val exampleSuma: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    val exampleRest = { a: Int, b: Int -> a - b}

    println( triple1(5))
    println( triple2(5))
    println( triple3(5))
    println( "Suma: ${exampleSuma(5, 6)}")
    println( "Rest: ${exampleRest(5, 6)}")
}

fun superiorFunctions() {
    val peopleAges = mutableMapOf("Fred" to 38, "Ann" to 23)
    peopleAges.filter { it.key.length < 4 }

    //ordenar list
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe", "Adriana")
    println("Sorted: ${peopleNames.sorted()}")

    //ordenar list por longitud de strings
    println( "Order with SortedWith(): ${peopleNames.sortedWith{ str1: String, str2: String -> str1.length - str2.length} }")
    println( "Order with SortedWith() inverso: ${peopleNames.sortedWith{ str1: String, str2: String -> str2.length - str1.length} }")

    val numbers = listOf(1, 4, 5, 2, 6, 2, 8, 8, 9, 7, 0)
    println(numbers)
    println(numbers.sortedWith{ num1: Int, num2: Int -> num1 - num2} ) // [0, 1, 2, 2, 4, 5, 6, 7, 8, 8, 9]
}
