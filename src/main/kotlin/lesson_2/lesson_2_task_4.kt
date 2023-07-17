package lesson_2

fun main() {
    val buff = 0.2
    val crystalOre = 7
    val ironOre = 11

    val bonusCrystalOre = (crystalOre * buff).toInt()
    val bonusIronOre = (ironOre * buff).toInt()

    println("Бонусные кристаллические руды: $bonusCrystalOre")
    println("Бонусные железные руды: $bonusIronOre")
}