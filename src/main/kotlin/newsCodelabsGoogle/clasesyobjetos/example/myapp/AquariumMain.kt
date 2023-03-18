package newsCodelabsGoogle.clasesyobjetos.example.myapp

import newsCodelabsGoogle.clasesyobjetos.example.myapp.decor.Decoration
import newsCodelabsGoogle.clasesyobjetos.example.myapp.decor.Decoration2

fun main() {
    //Open class
    //buildAquarium()

    // Abstract class, interface,
    //makeFish()

    // Abstract class, interface, companion object(Singleton)
    //makeFish2()

    //DataClass
    makeDecorations()
}

fun buildAquarium() {
    //val myAquarium  = Aquarium()
    //myAquarium.printSize()

    //default height and length
    //val aquarium2 = Aquarium(width = 25)
    //aquarium2.printSize()

    //default width
    //val aquarium3 = Aquarium(height = 35, length = 110)
    //aquarium3.printSize()

    //everything custom
    //val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    //aquarium4.printSize()

    //val aquarium5 = Aquarium( numberOfFish = 29)
    //aquarium5.printSize()

    val aquarium6 = Aquarium( length = 25, width = 25, height = 40)
    aquarium6.printSize()

    println()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark color: ${shark.color}")
    shark.eat()
    println()
    println("Plecostomus color: ${pleco.color}")
    pleco.eat()
}

fun makeFish2() {
    val shark2 = Shark2()
    val pleco2 = Plecostomus2( eatFood = "Lettuce" )

    println("Shark color: ${shark2.color}")
    shark2.eat()
    println()
    println("Plecostomus color: ${pleco2.color}")
    pleco2.eat()
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("Slate")
    println(decoration2)

    val decoration3 = Decoration("Slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))
    println()

    //Acceder a las propiedades de una clase Decoration2
    val newDecoration = Decoration2( "crystal", "wood", "diver")
    //val rock = newDecoration.rocks
    //val wood = newDecoration.wood
    //val diver = newDecoration.diver
    val (rock, wood, diver) = newDecoration
    println(rock)
    println(wood)
    println(diver)

    // omitiendo propiedades
    val newDecoration2 = Decoration2("palace", "wood2", "diver2")
    val (newRock, _, newDiver) = newDecoration2
    println(newRock)
    println(newDiver)
}