package newsCodelabsGoogle.functions

import java.util.*

fun main( args: Array<String>) {
    val temperature = 55
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    //println(message)

    feedTheFinish()
}

//Random day of the week
private fun feedTheFinish() {
    val day  = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change Water: ${shouldChangeWater(day)}")
}

private fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

private fun fishFood( day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        else -> "plankton"
    }
}