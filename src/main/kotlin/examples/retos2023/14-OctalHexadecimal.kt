package examples.retos2023

fun main() {
    octalAndHexadecimal(0)
    octalAndHexadecimal(100)
    octalAndHexadecimal(1000)
}

fun octalAndHexadecimal( decimalNumber : Int) {

    var currentDecimal = decimalNumber

    // Octal
    var octal = ""
    while ( currentDecimal > 0) {
        octal = (currentDecimal % 8).toString() + octal
        currentDecimal /= 8
    }
    octal = if (octal == "") "0" else octal
    println("$decimalNumber en octal es $octal")

    currentDecimal = decimalNumber

    // Hexadecimal
    val hexValues = "0123456789ABCDEF"
    var hexadecimal = ""
    while ( currentDecimal > 0) {
        hexadecimal = hexValues[currentDecimal % 16] + hexadecimal
        currentDecimal /= 16
    }
    hexadecimal = if (hexadecimal == "") "0" else hexadecimal
    println("$decimalNumber en hexadecimal es $hexadecimal")
}