package _03_function._01_Higher_order_function

fun main() {
    val numbers = listOf<Int>(2,8,4,5,6,4)
    val square = numbers.map { it * it }

    println(square)
}