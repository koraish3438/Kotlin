package _03_Functions

fun num(): Int {
    return (1..6).random()
}

fun main() {
    val value = num()
    println("The value is $value")
}