package lesson_1

fun main() {
    val totalSeconds = 6480

    val hours: Int = totalSeconds / 3600
    val remainingSecondsAfterHours: Int = totalSeconds % 3600

    val minutes: Int = remainingSecondsAfterHours / 60
    val seconds: Int = remainingSecondsAfterHours % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}