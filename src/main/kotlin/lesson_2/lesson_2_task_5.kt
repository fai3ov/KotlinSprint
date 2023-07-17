package lesson_2
fun main() {
    // формула сложного процента A = P * (1 + r)^t
    val P = 70_000.0
    val r = 16.7 / 100
    val t = 20.0

    val A = P * Math.pow(1 + r, t)

    println(String.format("%.3f", A))
}