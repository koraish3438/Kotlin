package _02_controlFlow._04_WhileLoop

fun main() {
    print("Enter your digit : ")
    var num: Int = readln().toInt()

    var count = 0

    while (num > 0) {
        num /= 10
        count += 1
    }

    println("Enter number have $count digit")
}