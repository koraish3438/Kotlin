package _03_Functions

fun calculator(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val sum = calculator(5,10) {a, b -> a + b}
    val multi = calculator(50,10) {a, b -> a * b}

    println("Sum of a and b is : $sum")
    println("Multiplication of a and b is : $multi")
}