package _02_controlFlow._07_Ranges

fun main() {
    //======With the for loop, you can also create ranges of values with ".."=====

    for (num in 5 .. 15) {
        print("$num ")
    }

    print("\n")

    for (char in 'a'..'k') {
        print("$char ")
    }

    println()

    //=====You can also use the break and continue keywords in a range/for loop:=====

    for (number in 5..15) {
        if (number == 10) {
            break
        }
        print("$number ")
    }

    println()

    for (numbers in 5..15) {
        if (numbers == 10) {
            continue
        }
        print("$numbers ")
    }

}

