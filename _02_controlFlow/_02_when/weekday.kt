package _02_controlFlow._02_when

fun main() {
    print("Enter the day  : ")
    var day = readlnOrNull()?.toIntOrNull()
    if (day == null) {
        println("Please enter valid number")
    }
    else {
        day %= 7
    }

    val result = when (day) {
        1 -> "Saturday"
        2 -> "Sunday"
        3 -> "Monday"
        4 -> "Tuesday"
        5 -> "Wednesday"
        6 -> "Thursday"
        0 -> "Friday"
        else -> "Invalid day"
    }
    print(result)
}