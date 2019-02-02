package spices

fun main() {
    getSpice()
}

fun getSpice() {
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "very spicy")),
        SpiceContainer(Curry("Green Curry", "hot hot hot!"))
    )
    println("The spice cabinet contains ${spiceCabinet[0].label}, ${spiceCabinet[1].label}, ${spiceCabinet[2].label}")
}

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}