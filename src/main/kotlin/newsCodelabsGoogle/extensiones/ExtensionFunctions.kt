package newsCodelabsGoogle.extensiones

fun main() {
    println("message".hasSpaces())                  // false
    println("That is a message".hasSpaces())        // true
    println()

    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    val aquariumPlant: AquariumPlant2 = plant
    aquariumPlant.print()  // what will it print?

    println()
    val plant2: AquariumPlant? = null
    plant2.pull()                       // Nunca se llamara por que es null
}

fun String.hasSpaces() = this.find { it == ' ' } != null // Encontrar espacios

/* Limitaciones */
class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "red"
//fun AquariumPalnt.isBig() = size > 50 // Error no tenemos acceso a size


open class AquariumPlant2(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant2("green", size)

fun AquariumPlant2.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")


/*  Receptores que admiten valores null*/
fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}