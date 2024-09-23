package jsrdev.desafioCreditCardListas_03.main

fun main() {

    // solicitar el límite de crédito
    var creditLimit = requestCreditLimit()

    while (creditLimit == null) {
        println("\nThe entered limit is not valid, Please try again.")
        creditLimit = requestCreditLimit()
    }

    val productList: List<Product> = processPurchases(creditLimit)

    displayPurchaseSummary(productList)
}

fun requestCreditLimit(): Double? {
    println("\nEnter the credit card limit:")
    return readLine()?.toDoubleOrNull()
}

fun processPurchases(initialCreditLimit: Double): List<Product> {
    var credit = initialCreditLimit
    val productList = mutableListOf<Product>()
    var continueShopping = true

    while (continueShopping) {
        var item = requestPurchaseItem()
        var price = requestPurchasePrice()

        while (item == null || item == ""){
            println("\nInvalid input. Please try again.")
            item = requestPurchaseItem()
        }
        while (price == null){
            println("\nInvalid input. Please try again.")
            price = requestPurchasePrice()
        }

        if (price > credit) {
            println("\nInsufficient balance: you have $credit left.")
            break
        } else {
            credit -= price
            productList.add(Product(item = item, price = price))
            println("\nProduct added to the cart. Remaining balance: $$credit")
        }

        println("\nEnter 0 to finish or any other number to continue adding products")
        continueShopping = readLine()?.toIntOrNull() != 0
    }

    return productList
}

fun requestPurchaseItem(): String? {
    println("\nEnter the product of the purchase:")
    return readLine()
}

fun requestPurchasePrice(): Double? {
    println("\nEnter the price of the purchase:")
    return readLine()?.toDoubleOrNull()
}

fun displayPurchaseSummary(productList: List<Product>) {
    println()
    if (productList.isEmpty()) {
        println("No purchases made.")
    } else {
        val sortedLIst = productList.sorted()
        val total = sortedLIst.sumOf { item -> item.price }

        println("*****************************")
        println("PURCHASE SUMMARY:")
        println("-----------------------------")
        sortedLIst.forEach(::println)
        println("-----------------------------")
        println("Total --------- $${total}")
        println("*****************************")
    }
}

data class Product(val item: String, val price: Double): Comparable<Product> {

    override fun compareTo(other: Product): Int = this.price.compareTo(other.price)

    override fun toString(): String = "$item - $$price"

}
