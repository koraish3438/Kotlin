package _03_Functions

fun sum (a: Int, b: Int) {
    val sum = a + b
    println("Addition is : $sum")
}

fun sub (a: Int, b: Int) {
    val sub = a - b
    println("Subtraction is : $sub")
}

fun mul (a: Int, b: Int) {
    val mul = a * b
    println("Multiplication is : $mul")
}

fun divi (a: Int, b: Int) {
    val divi = a / b
    println("Division is : $divi")
}

fun main() {
    sum(5,8)
    sub(15,8)
    mul(8,8)
    divi(64,8)
}