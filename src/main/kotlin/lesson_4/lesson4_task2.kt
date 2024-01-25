package lesson_4

fun main() {
    var bagWeight: Int = 20
    var liters: Int = 80
    var average: Boolean = false

    println("Багаж $bagWeight кг./ $liters л. среднего размера -> ${((MAX_WEIGHT >= bagWeight) && (MIN_WEIGHT < bagWeight) && (MAX_LITERS >= liters))}")

    bagWeight = 50
    liters = 100

    println("Багаж $bagWeight кг./ $liters л. среднего размера -> ${((MAX_WEIGHT >= bagWeight) && (MIN_WEIGHT <= bagWeight) && (MAX_LITERS >= liters))}")

}

const val MAX_WEIGHT = 100
const val MIN_WEIGHT = 35
const val MAX_LITERS = 100