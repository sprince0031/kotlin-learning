package spices

fun main() {
    val currySpice = curry("yellow curry", "spicy")
    println("colour of curry is ${currySpice.colour}")
}

abstract class Spice (val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when (spiciness) {
                "hot hot hot!" -> 9
                "extremely spicy" -> 8
                "very spicy" -> 7
                "quite spicy" -> 6
                "spicy" -> 5
                "mild" -> 4
                "just a bit spicy" -> 3
                "maybe a little spicy" -> 2
                "not that spicy" -> 1
                "not spicy at all" -> 0
                else -> -1
            }
        }

    abstract fun prepareSpice()

}

class curry(name: String, spiciness: String) : Spice(name, spiciness), Grinder, spiceColour by yellowSpiceColour {
    init {
        println("The spice object $name has been created that is $spiciness" +
                " with a spiciness rating of $heat.")
    }
    override fun prepareSpice() {
        grind()
    }

}

interface Grinder {
    fun grind() { println("grind, grind, grind!") }
}

interface spiceColour {
    val colour : String
}

object yellowSpiceColour : spiceColour {
    override val colour = "yellow"
}