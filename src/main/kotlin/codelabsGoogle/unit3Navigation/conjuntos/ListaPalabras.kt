package codelabsGoogle.unit3Navigation.conjuntos

fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief",
                       "class", "Coffee", "creative", "Cold", "diego", "Dolphin", "dialog")

    //Filtered words that start with the letter "d", ignore cases para mayusculas y minusculas
    val filteredWords = words.filter { it.startsWith("d", ignoreCase = true) }
        .shuffled() //mezcla o desordena los elementos al azar
        .take(2) //toma dos elementos del filtro devuelto
        .sorted() // ordena los elementos devueltos
    println(filteredWords)

    //Filtered words that start with the letter "c", ignore cases para solo los que comiencen con c mayuscula
    val filteredWordsWithC = words.filter { it.startsWith("C", ignoreCase = false) }.shuffled().take(3)
    println(filteredWordsWithC)

    val cities = listOf("Jeddah", "Bengaluru", "Shenzhen", "Abu Dhabi", "Mountain View", "Tripoli", "Bengaluru", "Lima", "Mandalay", "Tripoli")
    val oneWordCities = cities.toSet().toList().filter { !it.contains(" ")}.sorted()
    println(oneWordCities) //println("Jeddah, Bengaluru, Shenzhen, Tripoli, Lima, Mandalay")

    println()
    //Ejemplo de separar una palabra
    val word = "Hola".toCharArray()
    println(word.contentToString())
}