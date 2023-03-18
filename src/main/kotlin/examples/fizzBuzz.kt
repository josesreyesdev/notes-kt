package examples

fun main() {
    fizzbuzz(20)
}

fun fizzbuzz( num: Int) {
    for ( number in 1..num) {
        when {
            number % 15 == 0 -> println("fizzbuzz")
            number % 3 == 0 -> println("fizz")
            number % 5 == 0 -> println("buzz")
            else -> println(number)
        }
    }
}