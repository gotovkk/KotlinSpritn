package lesson_1

fun main() {
    val hours: Int = 9
    val minutes: Int = 39
    val travelTime: Int = 457
    val minutesInHour = 60
    val arrivalMinutes: Int = (travelTime+minutes) % minutesInHour
    val arrivalHours: Int = (travelTime+ minutes) / minutesInHour

    println("Время прибытия - ${arrivalHours + hours}:${arrivalMinutes}")
}