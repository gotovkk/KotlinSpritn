package lesson_1

fun main() {
    val seconds: Int = 6480
    val hours: Int = seconds / 3600
    val minutes: Int = (seconds % 3600) / 60
    val remainSeconds: Int = seconds % 60
    println("${String.format("%02d",hours)}:${String.format("%02d",minutes)}:${String.format("%02d",remainSeconds)}")
}