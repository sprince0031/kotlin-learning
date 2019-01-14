import java.util.*

fun dayOfWeek() {
    println("What day is it today?")
    val dOW = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    val daysOfWeek :List<String> = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    when (dOW) {
        in 1..7 -> println("It is ${daysOfWeek[dOW-1]}. Happy ${daysOfWeek[dOW-1]}!")
        else -> println("It is the end of time and the world as we know it!")
    }
}

fun main(args: Array<String>) {
    println("Hello Kotlin!")
    dayOfWeek()
}