fun whatShouldIDoToday(mood : String, weather : String = "sunny", temperature : Int = 24) : String {
    return when {
        goSwimming(temperature) -> "go swimming"
        goForWalk(mood, weather)-> "go for a walk"
//        mood == "sad" && weather == "sunny" && temperature > 24 -> "stay home and read"
//        mood == "sad" && weather == "sunny" -> "go for walk, it will cheer you up"
//        mood == "happy" && weather == "sunny" && temperature > 24 -> "go swimming"
//        mood == "happy" && weather == "rainy" -> "play in the rain!"
        stayInBed(mood, weather, temperature) -> "stay in bed"
        listenToSongs(mood, weather) -> "listen to good songs"
        else -> "Stay home and read."

    }
}

fun goForWalk(mood : String, weather : String) = mood == "happy" && weather == "sunny"
fun listenToSongs(mood : String, weather : String) = mood == "sad" && weather == "rainy"
fun stayInBed(mood : String, weather : String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun goSwimming(temperature: Int) = temperature > 35

fun main(args: Array<String>) {
    println(whatShouldIDoToday(readLine()!!, "sunny"))
}