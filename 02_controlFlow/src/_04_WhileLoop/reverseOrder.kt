package _02_controlFlow._04_WhileLoop

fun main() {
    print("Enter your digit : ")
    var num:  Int? = readlnOrNull()?.toIntOrNull()

    if (num == null) {
        println("Enter valid input please!")
    }
    else {
        var reverse = 0
        while (num > 0) {
            val digit = num % 10
            reverse = reverse * 10 + digit
            num /= 10
        }
        print("Reverse number is : $reverse")
    }
}