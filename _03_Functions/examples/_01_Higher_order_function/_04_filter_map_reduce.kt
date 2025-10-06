package _03_function._01_Higher_order_function

fun main() {
    val numbers = listOf<Int>(2,4,6,5,8,7,3,44,16,9,54,14)

    val solve = numbers.filter { it % 2 == 0 }.map { it * it }.reduce { acc, n -> acc + n }

    println(solve)
}