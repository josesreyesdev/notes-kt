package jsrdev.firstApp_01

fun main() {
    val randomNumber = (1..100).random()
    var userNumber: Int?
    var intentos = 5

    println(randomNumber)

    while (intentos > 0) {
        println("Adivina el número aleatorio entre el 1 y 100, tienes $intentos intento(s)")
        userNumber = readLine()?.toIntOrNull()

        if (randomNumber == userNumber!!) {
            println("Acertaste")
            break
        }

        val cond = if ( randomNumber > userNumber) "Mayor" else "Menor"
        println("El número debe ser $cond")

        intentos--
        println()
    }
    if (intentos == 0) println("El número era: $randomNumber")
}