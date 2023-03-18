package examples.retos2023

/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */
fun main() {
    println(generatorPassword2())
}

fun generatorPassword(length: Int = 8,
                      uppercase: Boolean = false,
                      numbers: Boolean = false,
                      symbols: Boolean = false): String {

    //https://www.ascii-code.com/
    val characters = (97..122).toMutableList()
    if (uppercase) characters += (65..90).toList()
    if (numbers) characters += (48..57).toList()
    if (symbols) characters += ((33..47) + (58..64) + (91..96)).toList()

    var password2 = ""
    while ( password2.length < length) {
        password2 += characters.random().toChar()
    }
    return password2
}

fun generatorPassword2(length: Int = 8,
                      uppercase: Boolean = false,
                      numbers: Boolean = false,
                      symbols: Boolean = false): String {
    val maxLong = 16
    val symbolsList = listOf('@', '?', '¿', '!', '#', '$', '%', '&', '/', '(', ')', '=', '¡', '-', '.', '<', '>', '^', '_', '{', '}', '[', ']', '*', '|', '!', '~')
    val characters = listOfNotNull(
        ('a' .. 'z').toList(),
        ('A' .. 'Z').toList().takeIf { uppercase },
        ('0'..'9').toList().takeIf { numbers },
        symbolsList.takeIf { symbols }
    )

    return if (length in 8..maxLong) {
        val password = characters.random().shuffled().take(length).joinToString("")
        password
    } else "La recomendamos ingresar un número entre 8 y $maxLong para la longitud de caracteres"
}