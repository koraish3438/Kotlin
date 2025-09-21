fun main() {
    print("Enter a number : ")
    val day = readlnOrNull()?.toIntOrNull()

    if (day == null || day < 0) {
        println("Please, enter valid number")
    }
    else {
        val d = (day % 7)
        if (d == 1) {
            println("Saturday")
        }
        else if (d == 2) {
            println("Sunday")
        }
        else if (d == 3) {
            println("Monday")
        }
        else if (d == 4) {
            println("Tuesday")
        }
        else if (d == 5) {
            println("Wednesday")
        }
        else if (d == 6) {
            println("Thursday")
        }
        else {
            println("Friday")
        }
    }
}