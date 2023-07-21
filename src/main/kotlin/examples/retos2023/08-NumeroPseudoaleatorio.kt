package examples.retos2023

fun main() {
    for( i in 0..100 ) {
        println(randomNumber())
    }
}

fun randomNumber(): Int {
    return (System.nanoTime() % 101).toInt()
}
