package examples.retos2023

/*
 * Crea un programa que simule el comportamiento del sombrero seleccionador del
 * universo mágico de Harry Potter.
 * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
 * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
 * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
 *   coloque al alumno en una de las 4 casas de Hogwarts:
 *   (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
 * - Ten en cuenta los rasgos de cada casa para hacer las preguntas
 *   y crear el algoritmo seleccionador:
 *   Por ejemplo, en Slytherin se premia la ambición y la astucia.
 */

enum class House {
    Gryffindor, Hufflepuff, Ravenclaw, Slytherin
}

fun main() {
    sombreroSeleccionador()
}

fun sombreroSeleccionador() {

    val questions = mapOf(
        "Cómo te definirías?" to listOf(
            mapOf(House.Gryffindor to "1. Valentia"),
            mapOf(House.Hufflepuff to "2. Lealtad" ),
            mapOf(House.Ravenclaw to "3. Sabio"),
            mapOf(House.Slytherin to "4. Ambicioso")
        ),
        "Cuál es tu clase favorita" to listOf(
            mapOf(House.Gryffindor to "1. Vuelo" ),
            mapOf(House.Hufflepuff to "2. Pociones"),
            mapOf(House.Ravenclaw to "3. Defenza contra artes obscuras"),
            mapOf(House.Slytherin to "4. Animales fantásticos")
        )
    )

    var gryffindor = 0
    var hufflepuff = 0
    var ravenclaw = 0
    var slytherin = 0

    questions.forEach { question ->
        println(question.key)
        question.value.forEach { answers ->
            println(answers.values.joinToString(""))
        }
        question.value[getAnswer() - 1].forEach{ house ->
            when (house.key) {
                House.Gryffindor -> gryffindor++
                House.Hufflepuff -> hufflepuff++
                House.Ravenclaw -> ravenclaw++
                else -> slytherin++
            }
        }
        println()
    }
    val houses = mutableMapOf(
        House.Gryffindor to gryffindor,
        House.Hufflepuff to hufflepuff,
        House.Ravenclaw to ravenclaw,
        House.Slytherin to slytherin
    )
    val selectedHouse = mutableListOf<House>()
    var maxPoints = 0
    houses.forEach { house ->
        if (house.value > maxPoints) {
            selectedHouse.clear()
            selectedHouse.add(house.key)
            maxPoints = house.value
        } else if (house.value == maxPoints) {
            selectedHouse.add(house.key)
            maxPoints = house.value
        }
    }

    if (selectedHouse.size == 1)
        println("Lo tengo muy claro, hirás a la casa: ${selectedHouse[0]}")
    else
        println("Ha estado complicado, decidí que hirás a la casa:${selectedHouse.random()}")

    println()
    println("Gryffindor: $gryffindor")
    println("Hufflepuff: $hufflepuff")
    println("Ravenclaw: $ravenclaw")
    println("Slytherin: $slytherin")
}

fun getAnswer(): Int {
    print("Responde 1, 2, 3 ó 4 ==> ")
    val answer = readLine()?.toInt() as Int
    if (answer == 1 || answer == 2 || answer == 3 || answer == 4) return answer
    return getAnswer()
}