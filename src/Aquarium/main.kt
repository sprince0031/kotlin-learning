package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Default dimensions of the aquarium are \n" +
            "height = ${myAquarium.height} " +
            "width = ${myAquarium.width} " +
            "length = ${myAquarium.length}")

    myAquarium.width = 30

    println("Updated dimensions of the aquarium are \n" +
            "height = ${myAquarium.height} " +
            "width = ${myAquarium.width} " +
            "length = ${myAquarium.length}")

    println("Volume of the aquarium (in litres) is ${myAquarium.volume}l")
}