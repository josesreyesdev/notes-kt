package examples.retos2023

import kotlin.math.sqrt

fun main() {
    checkPrimoFibonacciPar(2)
    checkPrimoFibonacciPar(7)
}

private fun checkPrimoFibonacciPar( num: Int) {
    if (num < 0) {
        println("Ingresa un numero positivo")
        return
    }

    var result = "$num "

    //Primo
    if (num > 1) {
        var prime = true
        for (i in 2 until num) {
            if (num % i == 0) {
                result += "no es primo, "
                prime = false
                break
            }
        }
        if (prime) result += "es primo, "
    } else {
        result += "no es primo, "
    }

    //Fibonacci
    result += if (num > 0 && isPerfectSquare(5 * num * num + 4) ||
        isPerfectSquare(5 * num * num - 4)
    ) "es fibonnacii " else "no es fibonnacii "

    //Par
    result += if (num % 2 == 0) "y es Par" else "y es Impar"

    println(result)
}

private fun isPerfectSquare(num: Int): Boolean {
    val sqr = sqrt(num.toDouble()).toInt()
    return sqr * sqr == num
}