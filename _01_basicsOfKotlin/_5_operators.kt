package _01_basicsOfKotlin

fun main() {
    // 1️⃣ Arithmetic Operators → +, -, *, /, %
    val a = 10
    val b = 3
    println("a + b = ${a + b}") // Addition
    println("a - b = ${a - b}") // Subtraction
    println("a * b = ${a * b}") // Multiplication
    println("a / b = ${a / b}") // Division
    println("a % b = ${a % b}") // Modulus (remainder)

    // 2️⃣ Assignment Operators → =, +=, -=, *=, /=
    var x = 5
    x += 3  // equivalent to x = x + 3
    println("x after +=3 : $x")
    x -= 2  // equivalent to x = x - 2
    println("x after -=2 : $x")

    // 3️⃣ Comparison Operators → ==, !=, >, <, >=, <=
    val p = 10
    val q = 20
    println("p == q : ${p == q}")  // Equal to
    println("p != q : ${p != q}")  // Not equal to
    println("p > q  : ${p > q}")   // Greater than
    println("p < q  : ${p < q}")   // Less than
    println("p >= q : ${p >= q}")  // Greater than or equal
    println("p <= q : ${p <= q}")  // Less than or equal

    // 4️⃣ Logical Operators → &&, ||, !
    val isSunny = true
    val hasUmbrella = false
    println("isSunny && hasUmbrella : ${isSunny && hasUmbrella}") // AND
    println("isSunny || hasUmbrella : ${isSunny || hasUmbrella}") // OR
    println("!isSunny : ${!isSunny}")                             // NOT

    // 5️⃣ Increment / Decrement → ++, --
    var counter = 5
    counter++  // Increment by 1
    println("counter after ++ : $counter")
    counter--  // Decrement by 1
    println("counter after -- : $counter")
}
