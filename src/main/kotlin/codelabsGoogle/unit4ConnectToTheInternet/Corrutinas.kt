package codelabsGoogle.unit4ConnectToTheInternet

fun main() {
    /* Corrutinas: Permite realizar varias tareas a la vez
    * ==> Permite almacenar el estado, representado por las "Continuations"
    * ==> Permite que partes del código indiquen cuando necesitan otorgar control o esperar a que otra corrutina
    *     complete su trabajo antes de reanudar.
    * ==> Las corrutinas integran:
    *     --> Job: Unidad de trabajo cancelable, como una creada con la funcion launch()
    *     --> CoroutineScope: Las funciones que se usan para crear corrutinas  nuevas como launch() y async()
    *                         extienden CoroutineScope.
    *     --> Dispatcher: Determinara el subproceso que usara la corrutina. El despachador Main siempre ejecutará
    *                     corrutinas en el subproceso principal, mientras que aquellos como Default, IO o Unconfined
    *                     usarán otros subprocesos.
    *
    * launch() => Se usa cuando no se necesita que se muestre un valor fuera de los limites de la corrutina.
    * */

    /*repeat(3) {
        GlobalScope.launch {                                --
            println("Hi from ${Thread.currentThread()}")      |- Solo se recomienda usar esto con fines de prueba
        }                                                   --
    }
    //Hi from Thread[DefaultDispatcher-worker-2@coroutine#2,5,main]
    //Hi from Thread[DefaultDispatcher-worker-1@coroutine#1,5,main]
    //Hi from Thread[DefaultDispatcher-worker-1@coroutine#3`,5,main]

    */
}

/* La funcion launch() se define de la siguiente manera */
/*fun CoroutineScope.launch {
    context: CoroutineContext = EmptyCoroutineContext,
    start: CoroutineStart = CoroutineStart.DEFAULT,
    block: suspend CoroutineScope.() -> Unit            //indica que el bloque de codigo o funcion se pueden pausar o reanudarse
} */




