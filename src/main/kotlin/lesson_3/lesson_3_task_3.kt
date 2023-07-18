package lesson_3

fun main() {
    val number = 6
    println(multiplicationTable(number))
}

fun multiplicationTable(number: Int): String {
    val stringBuilder = StringBuilder()

    for (i in 1..9) {
        stringBuilder.append("$number x $i = ${number * i}\n")
    }

    return stringBuilder.toString()
}