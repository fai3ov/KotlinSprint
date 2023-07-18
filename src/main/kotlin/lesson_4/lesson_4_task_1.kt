package lesson_4

fun main() {
    val totalTables = 13
    val bookedToday = totalTables
    val bookedTomorrow = totalTables - 4

    val isAvailableToday = totalTables > bookedToday
    val isAvailableTomorrow = totalTables > bookedTomorrow

    println("[Доступность столиков на сегодня: $isAvailableToday]")
    println("[Доступность столиков на завтра: $isAvailableTomorrow]")
}