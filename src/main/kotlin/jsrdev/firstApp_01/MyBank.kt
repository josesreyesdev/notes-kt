package jsrdev.firstApp_01

fun main() {
    client()
}

fun client() {
    val client = "Tony Stark"
    var saldo = 1599.99
    val account = "Corriente"
    println("*************************************************")
    println()
    println("Nombre del cliente: $client")
    println("Tipo de cuenta: $account")
    saldoDisponible(saldo)
    println()
    println("*************************************************")
    println()


    var option: Int
    val menu = """
        ** Escriba el número de la opción deseada **
        1.- Consultar Saldo
        2.- Retirar
        3.- Depositar
        9.- Salir
    """.trimIndent()
    while (true) {
        println(menu)
        println()
        option = readLine()?.toIntOrNull()!!
        when (option) {
            1 -> saldoDisponible(saldo)
            2 -> {
                saldo -= retirarSaldo(saldo)
                saldoDisponible(saldo)
            }
            3 -> {
                saldo += depositar()
                saldoDisponible(saldo)
            }
            9 -> {
                println("Gracias por utilizar el servicio")
                break
            }
            else -> println("Opción invalida intenta de nuevo")
        }
    }
}

fun saldoDisponible(saldo: Double) {
    println("Saldo disponible es de: $$saldo")
}

fun depositar(): Double {
    println("Ingresa la cantidad a depositar")
    val saldoAIngresar = readLine()?.toDoubleOrNull()!!
    return if (saldoAIngresar > 0) saldoAIngresar else {
        println("Ingresa un valor positivo")
        0.0
    }
}

fun retirarSaldo(saldo: Double): Double {
    println("Ingresa el saldo a retirar")
    val saldoARetirar = readLine()?.toDoubleOrNull()!!

    return if (saldoARetirar < saldo && saldoARetirar > 0) {
        saldoARetirar
    } else {
        println("Saldo insuficiente")
        0.0
    }
}
