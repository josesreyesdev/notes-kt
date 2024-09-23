package jsrdev.firstApp_01

fun main() {
    var note: Double? = 0.0
    var mediaEvaluations = 0.0
    var totalEvaluations = 0

    while (note?.toInt() != -1) {
        println("Escribe la nota que le darias a Matrix")
        note = readLine()?.toDoubleOrNull()

        if (note != null && note.toInt() != -1) {
            mediaEvaluations += note
            totalEvaluations++
        }
    }
    println(mediaEvaluations)
    println(totalEvaluations)
    println("La media de evaluaciones es de ${mediaEvaluations / totalEvaluations}")
}