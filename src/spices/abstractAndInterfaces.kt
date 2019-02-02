package spices

fun main() {
    val currySpice = Curry("yellow curry", "spicy")
    println("colour of curry is ${currySpice.colour} whose RGB value is ${currySpice.colour.rgb}")
}

sealed class Spice (val name: String, val spiciness: String = "mild", colour : SpiceColour ) : SpiceColour by colour {
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

class Curry(name: String, spiciness: String, colour : SpiceColour = YellowSpiceColour) : Spice(name, spiciness, colour), Grinder {
    init {
        println("The spice object $name has been created that is $spiciness" +
                " with a heat level of $heat.")
    }

    override fun grind() {

    }

    override fun prepareSpice() {
        grind()
    }

}

interface Grinder {
    fun grind() { println("grind, grind, grind!") }
}

interface SpiceColour {
    val colour : Colour
}

enum class Colour(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
}

object YellowSpiceColour : SpiceColour {
    override val colour = Colour.YELLOW
}