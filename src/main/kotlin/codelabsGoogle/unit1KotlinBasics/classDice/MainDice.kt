package codelabsGoogle.unit1KotlinBasics.classDice

fun main() {

    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")

    val myFirstCoin = Coin(4)
    println("Your ${myFirstCoin.coins} monedas, al girar muestra: ${myFirstCoin.rollCoin()} moneda(s)")
}

class Dice( val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

class Coin( val coins: Int) {

    fun rollCoin(): Int{
        return (1..coins).random()
    }
}