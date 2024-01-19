package lesson_1

fun main() {
    val year: Int = 1961
    var hour: String = "09"
    var minute: String = "07"
    println("Год полёта: $year")
    println("Время взлёта(часы): $hour")
    println("Время взлёта(минуты): $minute")

    hour = "10"
    minute = "55"

    println("Время посадки - $hour:$minute")
}