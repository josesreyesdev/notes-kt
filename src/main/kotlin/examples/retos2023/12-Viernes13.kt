package examples.retos2023

/*
 * Crea una función que sea capaz de detectar si existe un viernes 13
 * en el mes y el año indicados.
 * - La función recibirá el mes y el año y retornará verdadero o falso.
 */
fun main() {
    val friday = friday13( 2023, 9)
    println("Existe un viernes 13: $friday")
}

private fun friday13(year: Int, month: Int = 1): Boolean {
    return try {
        true
        //LocalDate(year, month, 13).dayOfWeek.value == 5
    } catch (e: Exception) {
        false
    }
}