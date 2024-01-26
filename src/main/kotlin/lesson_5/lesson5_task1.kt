package lesson_5

import kotlin.random.Random


fun main() {
    val firstRandom: Int = Random.nextInt(0, 10)
    val secondRandom: Int = Random.nextInt(0, 10)

    println("Докажите что вы не робот. Решите пример $firstRandom + $secondRandom")
    val solution: String = readln()
    if ((firstRandom + secondRandom) == solution.toInt()) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён.")
    }
}