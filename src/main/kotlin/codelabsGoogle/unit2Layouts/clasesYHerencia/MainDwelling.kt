package codelabsGoogle.unit2Layouts.clasesYHerencia

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val squareCabin = SquareCabin(6 ,50.0)
    with( squareCabin) {
        println("\nSquare Cabin\n===============================")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        when (hasRoom()) {
            true -> println("Hay ${availablePlaces()} lugar(es) disponible(s)")
            else -> println("No hay lugares disponibles")
        }
        println("Longitud/Area: %.2f".format(floorArea()))
    }

    val roundHut = RoundHut(3, 10.0)
    with(roundHut) {
        println("\nRound Hut\n===============================")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        when (hasRoom()) {
            true -> println("Hay ${availablePlaces()} lugar(es) disponible(s)")
            else -> println("No hay lugares disponibles")
        }
        println("Longitud/Area: %.2f".format(floorArea()))
        println("Carpet Size: ${calculateMaxCarpetSize()}")
    }

    val roundTower = RoundTower( residents = 4, radius = 15.5)
    with(roundTower) {
        println("\nRound Tower\n===============================")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        when (hasRoom()) {
            true -> println("Hay ${availablePlaces()} lugar(es) disponible(s)")
            else -> println("No hay lugares disponibles")
        }
        println("Longitud/Area: %.2f".format(floorArea()))
        println("Carpet Size: ${calculateMaxCarpetSize()}")
    }
}

abstract class Dwelling( private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean {
        return residents < capacity
    }

    //Obtener habitacion
    fun getRoom() {
        if (capacity > residents) { //if (hasRoom())
            residents++
            println("You got a room!")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }

    fun availablePlaces(): Int {
        return capacity - residents
    }

    //calculo de la superficie
    abstract fun floorArea(): Double
}

class SquareCabin(residents: Int, private val length: Double) : Dwelling(residents) {
    override val buildingMaterial = "Wood/Madera"
    override val capacity = 6
    override fun floorArea(): Double {
        return length * length
    }
}

open class RoundHut(residents: Int, private val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw/Paja"
    override val capacity = 4
    override fun floorArea(): Double {
        return PI * radius * radius
    }

   //Calculate alfombra de vivienda redonda
   fun calculateMaxCarpetSize(): Double {
       val diameter = 2 * radius
       return sqrt(diameter * diameter / 2)
   }
}

class RoundTower(residents: Int, radius: Double, private val floors: Int = 2) : RoundHut( residents, radius){
    override val buildingMaterial = "Stone/Piedra"
    override val capacity = 4 * floors
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}
