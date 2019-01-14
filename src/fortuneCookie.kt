fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10 ) {
        fortune = getFortuneCookie(getBirthday())
        if (fortune.contains("valid birthday")) {println(fortune); continue}
        println("Your fortune is, '$fortune'")
        if (fortune.startsWith("Take it easy")) break
    }
}

fun getFortuneCookie(birthday : Int) : String {
    val fortuneList = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

//    return fortuneList[getBirthday().rem(fortuneList.size)]
    return when (birthday) {
        in 1..4 -> fortuneList[0]
        in 5..8 -> fortuneList[1]
        in 9..12 -> fortuneList[2]
        in 13..16 -> fortuneList[3]
        in 17..20 -> fortuneList[4]
        in 21..24 -> fortuneList[5]
        in 25..31 -> fortuneList[6]
        else -> "Enter a valid birthday"
    }
}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}