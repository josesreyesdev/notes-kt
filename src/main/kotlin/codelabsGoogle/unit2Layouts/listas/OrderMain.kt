package codelabsGoogle.unit2Layouts.listas

open class Item( val name: String, val price: Int)

class Noodles : Item ("Noodles", 10) { //Fideos
    override fun toString(): String {
        return name
    }
}

//class Vegetables (private val toppings: List<String>) : Item ( "Vegetables", 5) {
class Vegetables (private vararg val toppings: String) : Item ( "Vegetables", 5) {

    override fun toString(): String {
        return if (toppings.isEmpty()) {
            "$name Chef´s choice"
        } else {
            "$name: ${toppings.joinToString()}" //Usamos el separador distinto de coma ej: joinToString(" ")
        }
    }
}

class Order (private val orderNumber: Int) {

    private val itemList = mutableListOf<Item>()

    /* Para implementar el PATRON BUILDER es retornar un objeto Order en las funciones addItem y addAllItems con return this*/
    fun addItem ( newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAllItems ( newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order: #$orderNumber")
        var total = 0
        for (item in itemList) {
            println("$item: $${item.price}")
            total += item.price
        }
        println("Total: $$total")
    }
}

fun printOrders() {

    val orderList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    orderList.add(order1)

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    orderList.add(order2)

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"), Noodles(), Vegetables("Zanahorias", "Jamon"))
    order3.addAllItems( items)
    orderList.add(order3)

    //patter builder => notacion de puntos
    val order4 = Order(4)
        .addItem(Noodles())
        .addAllItems(listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery")))
    order4.addItem(Noodles()).addItem(Vegetables())
    orderList.add(order4)

    orderList.add(
        Order(5)
            .addItem(Noodles())
            .addAllItems(listOf(Noodles(), Vegetables()))
            .addItem(Vegetables("Spinach"))
    )

    for (order in orderList) {
        order.print()
        println()
    }
}

fun main () {
    printOrders()
}