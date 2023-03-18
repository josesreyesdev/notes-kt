package examples

fun main() {
    val op1 = Operations(5, 4)
    with( op1) {
        println("The result de la summa es: ${sumar()}")
        println("The result de la rest es: ${restar()}")
        println("The result de la multiplication es: ${multiplicar()}")
        println("The result de la division es: ${dividir()}")
    }

    val summas = Sumas(2, 3, 4, 5)
    with( summas) {
        println("Result summa = ${sum1()}")
        println("Result rest = ${resta()}")
    }

}
open class Operations (private val num1 : Int, private val num2: Int) {
    fun sumar() = num1 + num2
    fun restar() = num1 - num2
    fun multiplicar() = num1 * num2
    fun dividir() = num1.toDouble() / num2
}

class Sumas(num1: Int, num2: Int, private val num3: Int, private val num4: Int): Operations(num1 , num2 ) {
    fun sum1() = num3 + num4
    fun resta() = num3 + super.restar()
}