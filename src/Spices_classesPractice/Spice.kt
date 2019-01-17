package Spices_classesPractice

fun main(args: Array<String>) {
    val spice = SimpleSpice()
    println("The spice, ${spice.spiceName} has a heat level of ${spice.heat}.")
}

class SimpleSpice {
    val spiceName = "curry"
    val spiciness = "mild"

    val heat: Int get() = 5

}