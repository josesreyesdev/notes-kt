package codelabsGoogle.unit4ConnectToTheInternet

fun main() {
    //Devuelve el nombre, prioridad y grupo de subproceso
    /*val thread = Thread{
        println("${Thread.currentThread()} has run.")
    }
    thread.start() //Thread[Thread-0,5,main] has run. */

    //Crea y jecuta varios subprocesos
    /*val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
    repeat(3) {
        Thread {
            println("${Thread.currentThread()} has started")
            for (i in states) {
                println("${Thread.currentThread()} - $i")
                Thread.sleep(50)
            }
        }.start()
    } */

    //Condiciones de carrera y comportamiento impredecible
    var count = 0
    for (i in 1..50) {
        Thread {
            count += 1
            println("Thread: $i count: $count")
        }.start()

    }
}


