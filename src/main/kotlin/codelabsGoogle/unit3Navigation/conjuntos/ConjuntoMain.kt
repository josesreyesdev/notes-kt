package codelabsGoogle.unit3Navigation.conjuntos

fun main() {
    /*--------------------------------------------------CONJUNTO ------------------------------------------------------*/
    /** CONJUNTO: ES UN GRUPO DE ELEMENTOS RELACIONADOS, PERO NO PUEDE HABER DUPLICADOS Y EL ORDEN NO IMPORTA. */
    //conjunto()

    /*-----------------------------------------------MAPA O DICCIONARIO-----------------------------------------------*/
    /* MAPA: ES UN CONJUNTO DE PARES CLAVE-VALOR, DISEÑADOS PARA FACILITAR LA BUSQUEDA DE UN VALOR SEGUN LA CLAVE
    *        DETERMINADA. LAS CLAVES SON UNICAS Y CADA UNA SE MAPEA A UN SOLO VALOR, PERO LOS VALORES PUEDEN TENER
    *        DUPLICADOS */
    mapas()
}

fun conjunto() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("List:   $numbers")
    println("Sorted: ${numbers.sorted()}")
    
    // Convirtiendo la lista de numeros a un conjunto
    val setOfNumbers = numbers.toSet()
    println("Set:    $setOfNumbers")
    println("Sorted: ${setOfNumbers.sorted()}")

    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf( 3, 2, 1)

    //Son iguales
    println("$set1 == $set2: ${set1 == set2}")

    println("Set Numbers: $setOfNumbers")
    println("Contains 7: ${setOfNumbers.contains(7)}")
    println("Contains 5: ${setOfNumbers.contains(5)}")
}

fun mapas() {
    val peopleAges = mutableMapOf<String, Int>("Fred" to 38, "Ann" to 23)
    println(peopleAges)

    //Agregar nuevo elemento clave-valor con put y notacion abreviada
    peopleAges.put("Barbara", 42)
    peopleAges["Adriana"] = 25

    peopleAges["Fred"] = 31
    println(peopleAges)
    println()

    /* FOREACH => Hace un recorrido de cada elemento */
    peopleAges.forEach { println("${it.key} is ${it.value} years old, ") }

    /* MAP => Aplica una transformacion de cada elemento */
    println()
    println()
    println( peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))
    peopleAges.map { println("${it.key} is ${it.value}") }

    /** FILTER => Encuentra los elementos que cumplan con una condicion especifica */
    println()
    val filteredNames = peopleAges.filter { it.key.length > 4 }
    val filteredAges = peopleAges.filter { it.value in 24..28 }
    println(filteredNames)
    println(filteredAges)
}