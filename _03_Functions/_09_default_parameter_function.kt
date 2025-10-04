package _03_Functions

fun getName (name: String = "Guest") {
    println("Hello, $name")
}

fun main() {
    getName("Koraish")
    getName()
}
