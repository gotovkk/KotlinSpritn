package lesson_3

fun main() {
    var startPos: String = "E2"
    var endPos: String = "E4"
    var moveCount: Int = 0

    println("[$startPos - $endPos; $moveCount]")
    startPos = "D2"
    endPos = "D3"
    moveCount += 1
    println("[$startPos - $endPos: $moveCount]")
}