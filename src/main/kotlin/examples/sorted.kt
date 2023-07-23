package examples

fun main() {
    val numbers = listOf(5, 2, 6, -4, 9)
    println(numbers.sorted())
    println(numbers.sortedWith{ num1: Int, num2: Int -> num1 - num2})
}