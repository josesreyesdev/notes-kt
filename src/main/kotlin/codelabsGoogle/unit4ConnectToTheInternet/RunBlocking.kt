package codelabsGoogle.unit4ConnectToTheInternet

import kotlin.coroutines.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/* runBlocking() => Inicia corrutina nueva y bloquea el subproceso actual hasta que esta se completa. En especial,
    *               se usa para conectar códigos que provocan bloqueos con los que no lo hacen en fucniones y pruebas
    *               principales. No se utiliza con frecuencia en código tipico de android.
    *  */

val formatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_TIME
val time = { formatter.format(LocalDateTime.now())}

suspend fun getValue(): Double {
    println("entering getValue() at ${time()}")
    //delay(3000)
    println("leaving getValue() at ${time()}")
    return Math.random()
}

fun main() {

    /*runBlocking {
        val num1 = getValue()
        val num2 = getValue()
        println("result of num1 + num2 is ${num1 + num2}")
    } */
    /*Salida:
    * entering getValue() at 17:44:52.311
    * leaving getValue() at 17:44:55.319
    * entering getValue() at 17:44:55.32
    * leaving getValue() at 17:44:58.32
    * result of num1 + num2 is 1.4320332550421415
    * */

    /*runBlocking {
        val num1 = async { getValue()}
        val num2 = async { getValue()}
        println("result of num1 + num2 is ${num1.await() + num2.await()}")
    } */
    /*Salida:
    * entering getValue() at 07:41:07.418677
    * entering getValue() at 07:41:07.426481
    * leaving getValue() at 07:41:10.425901
    * leaving getValue() at 07:41:10.428158
    * result of num1 + num2 is 0.917403910796414
    * */
}

/* La funcion async() se define de la sigueinte manera */
/*
fun CoroutineScope.async() {
    context: CoroutineContext = EmptyCoroutineContext,
    start: CoroutineStart = CoroutineStart.DEFAULT,
    block: suspend CoroutineScope.() -> T
}: Deferred<T>
        */