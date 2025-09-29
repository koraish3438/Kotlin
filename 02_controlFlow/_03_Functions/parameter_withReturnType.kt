package _03_Functions

fun add(a: Int, b: Int): Int {
    return a + b
}

fun multi(x: Int, y: Int, z: Int): Int {
    return x * y * z
}

fun main() {
    val result = add(5, 7)
    println("Result is : $result")

    val multiplication = multi(54,32,543)
    println("Multiplication of three numbers is : $multiplication")
}
