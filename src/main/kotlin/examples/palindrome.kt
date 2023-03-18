package examples

fun main() {

    println(palindrome("Anita LAva la tina"))
    println(palindrome("Anita LAva"))

}

fun palindrome(text: String) : Boolean {
    val spaces = text.lowercase().replace("[^a-z0-9]".toRegex(), "")
    return spaces == spaces.reversed()
}