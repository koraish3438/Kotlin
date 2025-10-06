package _03_function._01_Higher_order_function

fun main() {
    val numbers = listOf<Int>(1,64,8,4,5,4,56,89)
    val sum = numbers.reduce { acc, n -> acc + n }

    println(sum)
}