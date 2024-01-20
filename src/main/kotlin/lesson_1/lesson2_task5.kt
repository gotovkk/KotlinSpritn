package lesson_1

import kotlin.math.pow

fun main() {
    val deposit: Int = 70_000
    var sum: Double = 0.0
    val percent: Double = 0.167
    val years: Int = 20
    val chargeInYear: Int = 1

    sum += deposit * (1 + percent / chargeInYear).pow(chargeInYear * years.toDouble())
    println("%.3f".format(sum))
}