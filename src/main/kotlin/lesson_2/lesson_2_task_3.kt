package lesson_2

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val travelMinutes = 457

    val arrivalHours = ((travelMinutes + departureMinutes) / 60 + departureHours) % 24
    val arrivalMinutes = (travelMinutes + departureMinutes) % 60

    println(String.format("Поезд приедет в %02d:%02d", arrivalHours, arrivalMinutes))
}