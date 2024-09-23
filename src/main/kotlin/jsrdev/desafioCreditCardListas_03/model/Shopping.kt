package jsrdev.desafioCreditCardListas_03.model

data class Shopping(val product: String, val price: Double): Comparable<Shopping> {

    override fun compareTo(other: Shopping): Int = price.compareTo(other.price)

    override fun toString(): String  = "$product - $$price"
}
