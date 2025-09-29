package _02_controlFlow._01_if_else

fun main() {
    print("Enter temperature in Celsius : ")
    val tem = readlnOrNull()?.toIntOrNull()

    if (tem == null) {
        println("Please, Enter valid input!")
    }
    else if (tem >= 40) {
        println("Very Hot")
    }
    else if (tem >= 30) {
        println("Hot")
    }
    else if (tem >= 20) {
        println("Warm")
    }
    else if (tem >= 10){
        println("cold")
    }
    else {
        println("Very cold")
    }
}