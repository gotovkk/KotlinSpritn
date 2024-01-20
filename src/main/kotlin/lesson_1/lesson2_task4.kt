package lesson_1

import kotlin.math.roundToInt

fun main() {
    val crystalsCount: Int = 7
    val ironOreCount: Int = 11
    val buff: Double = 1.20
    val buffedCrystals: Int = ((crystalsCount * buff) - crystalsCount).roundToInt()
    val buffedIron: Int = ((ironOreCount * buff) - ironOreCount).roundToInt()
    println(buffedCrystals)
    println(buffedIron)
}