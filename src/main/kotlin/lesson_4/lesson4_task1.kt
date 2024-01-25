package lesson_4

fun main() {
    var bookedToday: Int = 10
    var bookedTomorrow: Int = 13
    var isBookedToday: Boolean = false
    var isBookedTomorrow: Boolean = false

    isBookedToday = TABLES != bookedToday

    isBookedTomorrow = TABLES != bookedTomorrow

    println("[Доступность столиков на сегодня: $isBookedToday]")
    println("[Доступность столиков на сегодня: $isBookedTomorrow]")

}

const val TABLES = 13