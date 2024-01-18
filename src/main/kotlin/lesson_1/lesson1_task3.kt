package lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7
    println("Год полёта: $year")
    println("Время взлёта(часы): $hour")
    println("Время взлёта(минуты): $minute")
    // Изменение значений для печати времени посадки
    hour = 10
    minute = 55

    println("Время посадки - ${String.format("%02d", hour)}:${String.format("%02d", minute)}")

}