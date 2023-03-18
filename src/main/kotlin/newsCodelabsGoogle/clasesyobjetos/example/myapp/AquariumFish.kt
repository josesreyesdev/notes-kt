package newsCodelabsGoogle.clasesyobjetos.example.myapp

interface FishAction {
    fun eat()
}

abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() = println("Yum")
}

class Shark : AquariumFish(), FishAction {
    override val color = "grey"

    override fun eat() = println("Hunt and eat fish")
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() = println("eat algae")
}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() = print("Swim")
}

interface ColorFish {
    val color : String
}