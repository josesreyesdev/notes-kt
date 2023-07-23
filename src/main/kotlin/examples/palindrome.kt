package examples

fun main() {

    println(palindrome("Anita LAva la tina"))
    println(palindrome("Anita LAva"))
    println("Is palindrome?: ${palindrome2("anita lava la tina")}")
    if (palindrome2("par")) println("Es palindrome") else println("Isn´t palindrome")
}

fun palindrome(text: String) : Boolean {
    val spaces = text.lowercase().replace("[^a-z0-9]".toRegex(), "")
    return spaces == spaces.reversed()
}

fun palindrome2(text: String): Boolean {
    val word = removeSpaces(text.lowercase())
    for (index in word.indices) {
        if(word[index] != word[word.length -index -1]) return false
    }
    return true
}

fun removeSpaces(input: String): String {
    //'\\s'representa todos los espacios los reemplace sin espacios
    //val removeSpace = input.lowercase().replace(Regex("\\s"), "")
    return input.filter { !it.isWhitespace() }
}