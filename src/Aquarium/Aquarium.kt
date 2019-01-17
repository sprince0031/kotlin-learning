package Aquarium

class Aquarium {
    var length: Int = 100
    var height: Int = 40
    var width: Int = 20

    val volume : Int get() = (height * width * length) / 1000
}