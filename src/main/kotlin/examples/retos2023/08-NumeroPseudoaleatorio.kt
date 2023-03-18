package examples.retos2023

fun main() {
    for( i in 0..100 ) {
        println(numAleatorio())
    }
}

fun numAleatorio(): Int {
    return (System.nanoTime() % 101).toInt()
}
