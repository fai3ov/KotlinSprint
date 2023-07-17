package lesson_2

fun main() {
    val studentScores = listOf(3, 4, 3, 5)
    val averageScore = studentScores.average()

    println("%.2f".format(averageScore))
}