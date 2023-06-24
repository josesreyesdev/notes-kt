package codelabsGoogle.unit2Layouts.listas

/* UNA LISTA: ES UNA COLECCION ORDENADA DE ELEMENTOS DE UN TIPO ESPECIFICO Y SU ORDEN NO IMPORTA*/
fun main() {
    /*---------------------------------------------LISTA NO MUTABLE ------------------------------------------------*/
    //listInt()
    //listString()

    /*---------------------------------------------LISTA MUTABLE ----------------------------------------------------*/
    //mutableList()

    /*-------------------------------------------- BUCLES DE LISTAS ------------------------------------------------*/
    //bucleWhile()
    bucleFor()

    //arrayOf()
    //matriz()
}

fun listInt() {

    //Declaracion de una lista
    val numbers1 : List<Int> = listOf()
    val numbers2 = listOf<Int>()
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println("List: $numbers")                                                       // List: [1, 2, 3, 4, 5, 6]

    //Recupero el tamaño de la lista
    println("Size: ${numbers.size}")                                                // Size: 6

    // Accediendo a los elementos de una lista
    println("First element: ${numbers.get(0)}")
    println("First element: ${numbers[0]}")
    println("Third element: ${numbers[2]}")
    println("Last index: ${numbers.size - 1}")                                      //Last index: 5
    println("Last element: ${numbers[numbers.size - 1]}")                           //Last element: 6
    println("Last index: ${numbers.first()}")
    println("Last element: ${numbers.last()}")

    // Saber si un elemento está dentro de mi lista
    println("Está 4 en numbers?: ${numbers.contains(4)}")
    println("Está 7 en numbers?: ${numbers.contains(7)}")

    // Ordenando la lista de forma inversa
    println("Reversed list: ${numbers.reversed()}")
    println("Real list: $numbers")

    //ordenando una lista de numeros de orden alfabetico
    val numberList = listOf(4, 3, 6, 2, 9, 1)
    println("Number list: $numberList")
    println("Sorted list: ${numberList.sorted()}")
}

fun listString() {
    val colors = listOf("Orange", "Yellow", "Green", "Blue")

    //Ordenando los elementos de forma inversa
    println("Colors: $colors")
    println("Reversed list: ${colors.reversed()}")

    //Ordenando los elementos alfabeticamente
    println("Sorted list: ${colors.sorted()}")
}

fun mutableList() {
    val entrees = mutableListOf<String>()
    val entrees2: MutableList<String> = mutableListOf()
    println("Entrees: $entrees")

    //Add an elements at list with add()
    entrees.add("noodles")
    println("Entrees: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    //Add varios elementos a la vez con addAll()
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Entrees: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

    //Quitando los elementos de una lista con remove()
    entrees.remove("spaghetti")
    println("Entrees: $entrees")

    //Intentando quitar un elemento que no existe en la lista
    println("Entrees: ${entrees.remove("rice")}")

    //Quitando el elemento por su indice con removeAt()
    entrees.removeAt(0)
    println("Entrees: $entrees")

    //Eliminar lista completa
    entrees.clear()
    println("Clear entrees: $entrees")

    //Comprobar si una lista esta vacia
    println("Entrees is empty?: ${entrees.isEmpty()}")
    println("Entrees is not empty?: ${entrees.isNotEmpty()}")
}

fun bucleWhile() {

    val guestPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0
    while ( index < guestPerFamily.size) {
        totalGuests += guestPerFamily[index]
        index++
    }
    println("Total de invitados or total guest count: $totalGuests")
}

fun bucleFor() {
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for (name in names) {
        println(" My name is: $name - Number of characters: ${name.length}")
    }
    println()
    for (item in names) print(item) // Iterate over items in a list
    println()
    for (character in 'b'..'g') print(character) // Range of characters in an alphabet
    println()
    for (num in 1..5) print(num) // Range of numbers
    println()
    for (numDownTo in 5 downTo 1) print(numDownTo) // Going backward
    println()
    for (numStep in 3..6 step 2) print(numStep) // Prints: 35
}

fun arrayRandom() {
    val school = arrayOf("Lic. Benito Juarez", "Esc. Sec. \"Villa de los Niños\"", "Bachillerato \"Villa de los Niños\"")
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }

    val array = Array (5) { it * 2 }
    println(array.contentToString()) // [0, 2, 4, 6, 8]
}