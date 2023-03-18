package examples

//ListOfNotNull + takeIf
fun main() {

    //Bad form
    val alice = User("Alice", 21)
    val moviesForAlice = getRecommendationsBad(alice)
    println(moviesForAlice) // [Comedy, Documentation, Action, Horror, Love Story]

    //Good form
    val bob = User("Bob", 17)
    val moviesForBob = getRecommendationsGood(bob)
    println(moviesForBob) // [Comedy, Documentation, Action, Love Story]

    val charlie = User("Charlie", 14)
    val moviesForCharlie = getRecommendationsGood(charlie)
    println(moviesForCharlie) // [Comedy, Documentation, Love Story]
}

class User ( val name: String, val age: Int)

//Bad recommendations for a list with conditions
fun getRecommendationsBad ( user: User) : List<String> {
    val movies = mutableListOf<String>()
    movies.add("Comedy")
    movies.add("Documentation")
    if (user.age >= 16) movies.add("Action")
    if (user.age >= 18) movies.add("Horror")
    movies.add("Love Story")
    return movies
}

//Good Recommendations for a list with conditions
fun getRecommendationsGood (user: User) = listOfNotNull(
    "Comedy",
    "Documentation",
    "Action".takeIf { user.age >= 16 },
    "Horror".takeIf { user.age >= 18 },
    "Love Story"
)
