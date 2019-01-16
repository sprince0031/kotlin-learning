import java.util.*

fun main(args: Array<String>) {
    val rollDice = { sides: Int -> if (sides == 0) 0
        else Random().nextInt(sides) + 1 }

    val rollDice2: (Int) -> Int = { sides -> if (sides == 0) 0
        else Random().nextInt(sides) + 1 }

    println(rollDice(6))
    println(rollDice2(12))

    gameplay(rollDice(13))
    gameplay(rollDice2(14))
}

fun gameplay(diceRoll: Int) {
    println(diceRoll)
}