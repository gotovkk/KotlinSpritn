package lesson_4

fun main() {
    val tables = 13
    var bookedToday: Int = 10
    var bookedTomorrow: Int = 13
    var isBookedToday: Boolean = false
    var isBookedTomorrow: Boolean = false

    isBookedToday = tables != bookedToday

    isBookedTomorrow = tables != bookedTomorrow

    println("[Доступность столиков на сегодня: $isBookedToday]")
    println("[Доступность столиков на сегодня: $isBookedTomorrow]")

}