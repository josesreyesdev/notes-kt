package examples.retos2023

fun main() {
    fizzBuzz(100)
}

fun fizzBuzz(num: Int) {
     for (number in 1..num) {
         if (number % 3 == 0 && number % 5 == 0) {
             println("fizzbuzz")
         }else if (number % 3 == 0) {
             println("fizz")
         } else if (number % 5 == 0) {
             println("buzz")
         } else {
             println(number)
         }
     }
}
