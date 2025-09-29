package _03_Functions

fun greetUser(name: String) {
    println("Hello, $name")
}

fun printAny(name: String, roll: Int) {
    println("My name is $name")
    println("My roll is $roll")
}

fun main() {
    greetUser("Koraish")
    greetUser("Kajam-all")

    printAny("Md. Kajam-all Koraish", 108)
}


