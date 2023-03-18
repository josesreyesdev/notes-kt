package codelabsGoogle.unit1KotlinBasics.luckyDiceRoll


private const val TAG = "MainActivity"
fun main() {
    val myFirstDice = Dice(6)
    val diceRolled = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled $diceRolled")

    val luckyNumber = 5

    when (diceRolled) {
        luckyNumber -> println("You Win!!")
        1, 2, 3, 4, 5, 6 -> println("Please, Try again!, salió $diceRolled")
        else -> println("No tengo respuesta a este numero $diceRolled")
    }

    logging()
}

class Dice( val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

fun logging() {
    /*Log.e(TAG,"ERROR: a serious error like an app crash")
    Log.w(TAG,"WARN: warns about the potential for serious errors")
    Log.i(TAG,"INFO: reporting technical information, such as an operation succeeding")
    Log.d(TAG,"DEBUG: reporting technical information useful for debugging")
    Log.v(TAG,"VERBOSE: more verbose than DEBUG logs") */
}
