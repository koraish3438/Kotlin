fun main() {
    print("Enter year : ")
    val year = readlnOrNull()?.toIntOrNull()

    if (year != null) {
        if (year == 1){
            println("Not a Leap Year")
        }
        else if (year / 400 == 0) {
            println("Leap Year")
        } else if (year / 4 == 0 && year / 100 != 0) {
            println("Leap Year")
        }
        else {
            println("Not a Leap Year")
        }
    }
}