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
    println( triple1(5))
    println( triple2(5))
    println( triple3(5))
}

fun superiorFunctions() {
    val peopleAges = mutableMapOf("Fred" to 38, "Ann" to 23)
    peopleAges.filter { it.key.length < 4 }

    //ordenar list
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe", "Adriana")
    println(peopleNames.sorted())

    //ordenar list por longitud de strings
    println( peopleNames.sortedWith{ str1: String, str2: String -> str1.length - str2.length} )
    println( peopleNames.sortedWith{ str1: String, str2: String -> str2.length - str1.length} )
}
