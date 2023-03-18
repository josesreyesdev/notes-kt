package newsCodelabsGoogle.extensiones

fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    with(mutableList) {
        println(add(10))                                // true
        println(remove(2))                     // true
        println(contains(4))                            // true
        println(reversed())                             // [10, 9, 8, 7, 6, 5, 4, 3, 1]
        println(subList(0, 4))                          // [1, 3, 4, 5]
        println(sorted())                               // [1, 3, 4, 5, 6, 7, 8, 9, 10]
        println(sum())                                  // 53
    }

    val list2 = listOf("a", "bbb", "cc")
    with(list2) {
        println(sumOf { it.length })                    // 6
        println(last())                                 // cc
    }

    for (s in list2) {
        println(s)                                      // => a bbb cc
    }

    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
    with(cures) {
        println(get("white spots"))                     // Ich
        println(cures["red sores"])                     // hole disease

        // si no encuentra el key, muestramos un valor por defecto
        println(getOrDefault("bloating", "Sorry, I don´t know"))

        // si necesitamos devolver un valor
        println(getOrElse("bloating") {"No cure for this"})
    }

    val inventory = mutableMapOf("Fish net" to 1)
    with(inventory) {
        put("tankn scrubber", 3)
        println(toString())                                 // {Fish net=1, tankn scrubber=3}
        println(remove("Fish net"))                    // 1
        println(toString())                                 // {tankn scrubber=3}
    }
}