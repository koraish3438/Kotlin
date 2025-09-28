package _02_controlFlow._03_arrays

fun main() {
    val cars:Array<String> = arrayOf("volvo", "BMW", "Audi", "Toyota", "Ford")

    print("Enter your brand name : ")
    val nameOfCar = readln().toString()

    if (nameOfCar in cars) {
        println("It exists")
    }
    else {
        println("It doesn't exists")
    }


    // === using for loop ===
    val name:Array<String> = arrayOf(
        "Arif", "Bipul", "Chandan", "Dipak", "Emon",
        "Farhan", "Gias", "Hasan", "Imran", "Jahid",
        "Karim", "Liton", "Mithun", "Nayeem", "Omar",
        "Papon", "Rafiq", "Sabbir", "Tuhin", "Uzzal"
    )

    for (x in name) {
        println("$x ")
    }
}

