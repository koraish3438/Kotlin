package _02_controlFlow._03_arrays

fun main() {
    val name:Array<String> = arrayOf("Koraish", "Sagor", "Masud", "Sakil")
    println(name[0])
    println(name[1])
    println(name[2])
    println(name[3])

    val number:Array<Int> = arrayOf(21, 22, 23, 24)
    println(number.size)
    println(number.first())
    println(number.last())
    println(number.contains(4))

    val doubleNumbers:Array<Double> = arrayOf(5.1,6.31,8.12,45.35,6.15)
    println(doubleNumbers[4])

    val floatNumbers:Array<Float> = arrayOf(5.1f,6.31f,8.12f,45.35f,6.15f)
    println(floatNumbers.size)
}