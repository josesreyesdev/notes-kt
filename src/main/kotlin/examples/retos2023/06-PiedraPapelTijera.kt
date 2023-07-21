package examples.retos2023

/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera, lagarto, spock.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
 *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
 * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
 *
*/
enum class Game {
    Rock, Paper, Scissors, Lizard, Spock
}

fun main() {
    val games = arrayOf(Pair(Game.Rock, Game.Paper), Pair(Game.Lizard, Game.Spock), Pair(Game.Scissors, Game.Lizard))
    println(rockPaperScissorLizardSpock(games))
}

fun rockPaperScissorLizardSpock(games: Array<Pair<Game, Game>>): String {

    val rules = mapOf(
        Game.Rock to listOf(Game.Scissors, Game.Lizard),
        Game.Paper to listOf(Game.Rock, Game.Spock),
        Game.Scissors to listOf(Game.Paper, Game.Lizard),
        Game.Lizard to listOf(Game.Spock, Game.Paper),
        Game.Spock to listOf(Game.Rock, Game.Scissors)
    )

    var playerOne = 0
    var playerTwo = 0

    for (game in games) {
        if (game.first != game.second) {
            if (rules[game.first]?.contains(game.second) == true) {
                playerOne++
            } else playerTwo++
        }
    }

    return if (playerOne == playerTwo) "Empate" else if (playerOne > playerTwo) "Player One" else "Player Two"
}