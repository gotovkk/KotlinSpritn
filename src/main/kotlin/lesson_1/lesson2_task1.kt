package lesson_1

fun main() {
    val markStudent1: Int = 3
    val markStudent2: Int = 4
    val markStudent3: Int = 3
    val markStudent4: Int = 5
    val averageMark = (markStudent1 + markStudent2 + markStudent3 + markStudent4) / 4.0
    println("%.2f".format(averageMark))
}