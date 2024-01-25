package lesson_3

fun main() {
    val data = "D2-D4;0"
    val split = data.split("-", ";")

    val startPos = split[0]
    val endPos = split[1]
    val moveCount = split[2]
    println(startPos)
    println(endPos)
    println(moveCount)
}