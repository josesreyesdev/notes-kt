package examples.retos2023

import kotlin.math.abs

/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 *
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.
 */

fun main() {
    val players = arrayOf(Player.P1, Player.P1, Player.P2, Player.P2, Player.P1, Player.P2, Player.P1, Player.P1)
    tennisGame(players)
}

enum class Player {
    P1, P2
}

fun tennisGame(points: Array<Player>) {

    val game = arrayOf("Love", "15", "30", "40")
    var counterP1 = 0
    var counterP2 = 0
    var finished = false
    var error = false

    points.forEach {
        error = finished

        if (it == Player.P1) counterP1++ else counterP2++

        when {
            counterP1 >= 3 && counterP2 >= 3 -> {
                if (!finished && abs(counterP1 - counterP2) <= 1) {
                    println(
                        if (counterP1 == counterP2) "Deuce"
                        else if (counterP1 > counterP2) "Ventaja P1" else "Ventaja P2"
                    )
                } else finished = true
            }
            else -> {
                if (counterP1 < 4 && counterP2 < 4) {
                    println("${game[counterP1]} - ${game[counterP2]}")
                } else finished = true
            }
        }
    }
    println(
        if (error || !finished) "Los puntos jugados no son correctos"
        else if (counterP1 > counterP2) "Ha ganado el P1" else "Ha ganado el P2"
    )
}

