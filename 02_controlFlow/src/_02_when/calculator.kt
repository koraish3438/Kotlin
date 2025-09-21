fun main() {
    print("Enter the value of a : ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    print("Enter the value of a : ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    print("Choice your operation ( +, -, *, / ) : ")
    val c = readlnOrNull() ?: ""

    val result = when(c) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b != 0.0) a / b else "Please enter valid value"
        else -> "Choice a valid operation"
    }
    println("Your operation result is : $result")
}