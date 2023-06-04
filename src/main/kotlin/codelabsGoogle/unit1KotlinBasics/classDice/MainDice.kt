package codelabsGoogle.unit1KotlinBasics.classDice

fun main() {

    val myFirstDice = Dice(6)
    with(myFirstDice) {
        println("Your $numSides sided dice rolled ${roll()}!")
    }

    val mySecondDice = Dice(20)
    with(mySecondDice) {
        println("Your $numSides sided dice rolled ${roll()}!")
    }

    val myFirstCoin = Coin(4)
    with(myFirstCoin) {
        println("Your $coins monedas, al girar muestra: ${rollCoin()} moneda(s)")
    }
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