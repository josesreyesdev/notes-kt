package examples

fun main() {
    fibonacci()
}

fun fibonacci() {
    /*
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */
    var n0 = 0
    var n1 = 1
    (0 .. 10).forEach { _ ->
        println(n0)         //0-1-1-2-3- 5- 8-13-21-34
        val fib = n0 + n1   //1-2-3-5-8-13-21-34-55-89
        n0 = n1             //1-1-2-3-5- 8-13-21-34-55
        n1 = fib            //1-2-3-5-8-13-21-34-55-89
    }
}