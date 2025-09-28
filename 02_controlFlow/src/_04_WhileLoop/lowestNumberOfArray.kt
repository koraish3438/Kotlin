package _02_controlFlow._04_WhileLoop


fun main() {
    val arrayOfNumbers =
        arrayOf(105, 982, 430, 76, 214, 599, 812, 37, 671, 904, 123, 788, 450, 999, 345, 287, 610, 742, 558, 831)

    var sp = 1
    val ep = arrayOfNumbers.size

    var lowestNumber = arrayOfNumbers[0]
    while (sp < ep) {
        if (arrayOfNumbers[sp] < lowestNumber) {
            lowestNumber = arrayOfNumbers[sp]
        }
        sp++
    }
    print("The lowest number is : $lowestNumber")
}