package lesson_4


fun main() {
        val sunnyWeather = true
        val tentOpen = true
        val airHumidity = 20
        val currentSeason = "winter"

        val favorableConditions: Boolean = (sunnyWeather == GOOD_WEATHER) && (tentOpen == PERFECT_TENT) && (airHumidity == PERFECT_PERCENT) && (currentSeason != PERFECT_SEASON)
        println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}
const val GOOD_WEATHER = true
const val PERFECT_TENT = true
const val PERFECT_PERCENT = 20
const val PERFECT_SEASON = "winter"