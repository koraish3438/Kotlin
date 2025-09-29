package _02_controlFlow._01_if_else

fun main() {
    print("Enter your mark : ")
    val mark = readlnOrNull()?.toIntOrNull()

    if (mark == null || mark > 100 || mark < 0) {
        println("Please, Enter valid mark!")
    }
    else if (mark >= 95) {
        println("Your result is A+")
    }
    else if (mark >= 90) {
        println("Your result is A")
    }
    else if (mark >= 80) {
        println("Your result is B")
    }
    else if (mark >= 70) {
        println("Your result is C")
    }
    else if (mark >= 60) {
        println("Your result is D")
    }
    else if (mark >= 50) {
        println("Your result is E")
    }
    else {
        println("You are fail")
    }
//    print("enter the value of a : ")
//    val a = readln().toInt()
//    print("enter the value of b : ")
//    val b = readln().toInt()
//    print("enter the value of c : ")
//    val c = readln().toInt()
//
//    if (a > b && a > c) {
//        println("A is greater than B and C")
//    }
//    else if (b > a && b > c) {
//        println("B is greater than A and C")
//    }
//    else{
//        println("A is greater than B and C")
//    }

}