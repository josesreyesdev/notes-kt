package newsCodelabsGoogle.clasesyobjetos.example.myapp

interface FishAction2 {
    fun eat()
}

interface FishColor2 {
    val color : String
}

class Shark2 : FishAction2, FishColor2 {

    override fun eat() = println("Hunt and eat fish")

    override val color = "grey"
}

class Plecostomus2( eatFood: String, fishColor2: FishColor2 = GoldColor):
    FishAction2 by PrintingFishAction(eatFood),
    FishColor2 by fishColor2


//Singleton para FishColor2 para decir que todos tendran color estatico
object GoldColor : FishColor2 {
    override val color = "Gold"
}

//Clase para definir su comida a cada fishAction2
class PrintingFishAction(private val food : String) : FishAction2 {
    override fun eat() = println( food)
}



//Clase Sellada
sealed class Seal
class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal( seal: Seal): String {
    return when( seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}