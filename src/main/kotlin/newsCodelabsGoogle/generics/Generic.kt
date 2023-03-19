package newsCodelabsGoogle.generics

fun main() {
    genericExample()
}
/*
class MyList<T> {
    fun get(pos: Int): T {
        TODO("implement")
    }
    fun addItem(item: T) {}
}
*/

open class WaterSupply( var needsProcessing: Boolean)
class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}
class FishStoreWater: WaterSupply(false)
class LakeWater: WaterSupply(true) {
    fun filtrar() {
        needsProcessing = false
    }
}
/* Clase generica a partir de las clases anteriores*/
class Aquarium<Type: Any>(val waterSupply: Type)

class Aquarium2<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")
    }
}

fun genericExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    println("Water needs processing => ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("Water needs proccesing2 => ${aquarium.waterSupply.needsProcessing}")

    println()
    val aquarium2 = Aquarium("This is a string")
    print(aquarium2.waterSupply)

    println()
    /*val aquarium3 = Aquarium(null) // Al agregar Any en la clase ya no podemos asignar null
    if ( aquarium3.waterSupply == null) {
        println("waterSupply is always null")
    }*/

    //checks
    val aquarium4 = Aquarium2(LakeWater())
    //aquarium4.addWater() // mostrar error por que debe filtrarse primero
    aquarium4.waterSupply.filtrar()
    aquarium4.addWater()
}