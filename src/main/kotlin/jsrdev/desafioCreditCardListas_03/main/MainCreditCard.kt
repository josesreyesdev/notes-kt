package jsrdev.desafioCreditCardListas_03.main

import jsrdev.desafioCreditCardListas_03.model.CreditCard
import jsrdev.desafioCreditCardListas_03.model.Shopping

fun main() {

    // solicitar el límite de crédito
    var creditCardLimit = requestCreditCardLimit()

    while (creditCardLimit == null) {
        println("\nThe entered limit is not valid, Please try again.")
        creditCardLimit = requestCreditLimit()
    }

    processPurchase(creditCardLimit)
}

fun processPurchase(limit: Double) {
    val card = CreditCard(limit = limit)
    var continueShopping = true

    while (continueShopping) {
        var item = requestPurchaseProductName()
        var price = requestPurchaseProductPrice()

        while (item == null || item == ""){
            println("\nInvalid input. Please try again.")
            item = requestPurchaseProductName()
        }
        while (price == null){
            println("\nInvalid input. Please try again.")
            price = requestPurchaseProductPrice()
        }

        val shopping = Shopping(product = item, price = price)
        val purchase = card.makeAPurchase(shopping = shopping)

        if (!purchase) {
            println("\nInsufficient balance: you have ${card.balance} left.")
            break
        } else {
            println("\nProduct added to the cart. Remaining balance: $${card.balance}")
        }

        println("\nEnter 0 to finish or any other number to continue adding products")
        continueShopping = readLine()?.toIntOrNull() != 0
    }
    displayPurchaseSummaryCard(card.shoppingSet)
}

fun requestCreditCardLimit(): Double? {
    println("\nEnter the credit card limit:")
    return readLine()?.toDoubleOrNull()
}

fun requestPurchaseProductName(): String? {
    println("\nEnter the product of the purchase:")
    return readLine()
}

fun requestPurchaseProductPrice(): Double? {
    println("\nEnter the price of the purchase:")
    return readLine()?.toDoubleOrNull()
}

fun displayPurchaseSummaryCard(shoppingSet: Set<Shopping>) {
    println()
    if (shoppingSet.isEmpty()) {
        println("No purchases made.")
    } else {
        val sortedLIst = shoppingSet.sorted()
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