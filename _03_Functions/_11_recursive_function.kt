package _03_Functions

fun factorial(a: Int): Int {
    return if (a == 0) 1
    else a * factorial(a - 1)
}

fun main() {
    val fact = factorial(5)
    println("Factorial of a is : $fact")
}