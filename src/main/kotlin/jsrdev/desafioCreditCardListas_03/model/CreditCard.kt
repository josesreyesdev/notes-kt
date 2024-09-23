package jsrdev.desafioCreditCardListas_03.model

data class CreditCard(private val limit: Double) {

    private var _balance: Double = limit // saldo
    val balance get() = _balance

    private val shoppingList: MutableSet<Shopping> = mutableSetOf()
    val shoppingSet: Set<Shopping> get() = shoppingList.toSet()

    fun makeAPurchase(shopping: Shopping): Boolean {
        return if (_balance >= shopping.price) {
            _balance -= shopping.price
            shoppingList.add(shopping)
            true
        } else false
    }
}
