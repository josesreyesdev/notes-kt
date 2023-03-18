package newsCodelabsGoogle.functions

fun main() {
    swim()
    swim("slow")
    swim(speed = "turtle-like")
}

private fun swim( speed: String = "fast") {
    println("swimming $speed")
}

// Está funcion se llama desde Hello.Kt
fun shouldChangeWater( day: String, temperature: Int = 22, dirty: Int = 20) : Boolean {
    return when  {
        //temperature > 30 -> true
        isTooHot(temperature) -> true
        //dirty > 30 -> true
        isDirty(dirty) -> true
        //day == "Sunday" -> true
        isSunday(day) -> true
        else -> false
    }
}

/** Funciones compactas */

private fun isTooHot( temperature: Int) = temperature > 30
private fun isDirty( dirty: Int) = dirty > 30
private fun isSunday(day: String) = day == "Sunday"
