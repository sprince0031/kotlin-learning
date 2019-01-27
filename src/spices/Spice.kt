package spices

fun main() {
    val spice = SimpleSpice()
    println("The spice, ${spice.spiceName} has a heat level of ${spice.heat}.")

//    val spiceList = listOf(curry("curry")
//    )
//     Spice("red pepper", "extremely spicy"),
//        Spice("green pepper", "very spicy"), Spice("sauce", "not that spicy")
//
//    val listOfSpicy = spiceList.filter { it.heat > 4}
//    val spicyList = listOfSpicy.toList()
//    val listOfNotSpicy = spiceList.filter { it.heat <= 4 }
//    println("The list of spicy stuff is \n$spicyList \n" +
//            "and the list of the not so spicy are \n${listOfNotSpicy.toList()}")
//
//    fun makeSalt() = Spice("salt")
}

class SimpleSpice {
    val spiceName = "curry"
    val spiciness = "mild"

    val heat: Int get() = 5

}

//class Spice (val name: String, val spiciness: String = "mild") {
//    val heat: Int
//        get() {
//                return when (spiciness) {
//                    "hot hot hot!" -> 9
//                    "extremely spicy" -> 8
//                    "very spicy" -> 7
//                    "quite spicy" -> 6
//                    "spicy" -> 5
//                    "mild" -> 4
//                    "just a bit spicy" -> 3
//                    "maybe a little spicy" -> 2
//                    "not that spicy" -> 1
//                    "not spicy at all" -> 0
//                    else -> -1
//                }
//        }
//
//    init {
//        println("The spice object ${this.name} has been created that is ${this.spiciness}" +
//                " with a spiciness rating of ${this.heat}.")
//    }
//}