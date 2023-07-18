package lesson_2
fun main() {
    val initialDeposit = 70_000.0
    val annualInterestRate = 16.7 / 100
    val numberOfTimesInterestAppliedPerYear = 1
    val numberOfYears = 20

    val finalAmount = initialDeposit * Math.pow(1 + annualInterestRate / numberOfTimesInterestAppliedPerYear, numberOfTimesInterestAppliedPerYear.toDouble() * numberOfYears)

    println("%.3f".format(finalAmount))
}