fun whatShouldIDoToday(mood : String, weather : String = "sunny", temperature : Int = 24) : String {
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
//        mood == "sad" && weather == "sunny" && temperature > 24 -> "stay home and read"
//        mood == "sad" && weather == "sunny" -> "go for walk, it will cheer you up"
//        mood == "happy" && weather == "sunny" && temperature > 24 -> "go swimming"
//        mood == "happy" && weather == "rainy" -> "play in the rain!"
        mood == "sad" && weather == "rainy" -> "listen to good songs"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."

    }
}



fun main(args: Array<String>) {
    println(whatShouldIDoToday("sad"))
}