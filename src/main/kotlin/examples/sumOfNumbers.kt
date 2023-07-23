package examples

fun main() {
    val numbers = 543
    println(sumOfNumbers(numbers))
}

fun sumOfNumbers(numbers: Int): Int {
    val chars = numbers.toString().toCharArray()
    var sum = 0

    chars.forEach {
        val digit = it.toString().toIntOrNull()
        if (digit != null) {
            sum += digit
        }
    }
    return sum
}