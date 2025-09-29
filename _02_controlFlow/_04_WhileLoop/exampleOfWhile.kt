package _02_controlFlow._04_WhileLoop

fun main() {
    print("Enter a positive number : ")
    val num: Int? = readlnOrNull()?.toIntOrNull()

    if (num == null || num < 1) {
        println("Please enter a valid positive number")
    }
    else {
        var x = 1
        while (x <= num) {
            if (x % 2 == 0) {
                println(x)
            }
            x++
        }
    }
}