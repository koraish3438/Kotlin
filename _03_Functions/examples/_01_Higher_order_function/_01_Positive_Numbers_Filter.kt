package _03_function._01_Higher_order_function

fun main() {
    val numbers = listOf<Int>(1,2,-3,-4,5,-6,7,8,-9)
    val positive = numbers.filter { it > 0 }

    println(positive)
}