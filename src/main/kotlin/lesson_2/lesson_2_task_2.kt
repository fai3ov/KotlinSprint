package lesson_2

fun main() {
    val oldEmployeesCount = 50
    val oldEmployeesSalary = 30_000
    val newEmployeesCount = 30
    val newEmployeesSalary = 20_000

    val salaryExpensesNewEmployees = oldEmployeesSalary * oldEmployeesCount
    val totalSalary = newEmployeesSalary * newEmployeesCount + salaryExpensesNewEmployees
    val avgSalary = totalSalary / (oldEmployeesCount + newEmployeesCount)

    println("Расходы на выплату з/п постоянным сотрудникам: $salaryExpensesNewEmployees")
    println("Общие расходы по з/п после прихода стажеров: $totalSalary")
    println("Средняя з/п одного сотрудника после устройства стажеров: $avgSalary")
}