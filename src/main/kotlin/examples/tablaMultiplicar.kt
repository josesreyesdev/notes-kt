package examples

fun main() {

    multiply( 2)
    println()
    multiply2( 9)
}

fun multiply(num: Int) {

    (1..10).forEach{ ind ->
        println("$num * $ind = ${num * ind}")
    }
}

fun multiply2(num: Int) {
    Array(10) {
        println("$num * ${it + 1} = ${(it + 1) * num}")
    }
}
