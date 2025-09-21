fun main() {

    print("Enter your age : ")
    val age = readlnOrNull()?.toIntOrNull()

    if (age == null || age < 0) {
        print("Please, valid input!")
    }
    else if (age >= 0 && age <= 17) {
        println("Not eligible to vote")
    }
    else {
        println("Eligible to vote")
    }
}