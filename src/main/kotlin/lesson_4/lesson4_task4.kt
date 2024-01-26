package lesson_4

fun main() {
    var currentDay = 5
    val armAndAbsDay = currentDay % 2 != 0

    val armExercises = armAndAbsDay
    val legExercises = !armAndAbsDay
    val backExercises = !armAndAbsDay
    val absExercises = armAndAbsDay

    println("Упражнения для рук:    $armExercises")
    println("Упражнения для ног:    $legExercises")
    println("Упражнения для спины:  $backExercises")
    println("Упражнения для пресса: $absExercises")
}