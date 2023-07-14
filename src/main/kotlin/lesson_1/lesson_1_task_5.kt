package lesson_1

fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / 60 / 60
    val seconds = totalSeconds % 60
    val minutes = (totalSeconds - (hours  * 60 * 60) - seconds) / 60


    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}