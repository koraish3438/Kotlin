fun main() {
    //======syntax of variable======
//    var variableName = value
//    val variableName = value

    /*===== what is val? =====
    ===> val is immutable and can not be changed
    */

    /*===== what is var? =====
    ===> val is mutable and can be changed
    */

    //====Example====
    // Using val (immutable)
    val pi = 3.1416
    println("Value of pi: $pi")
    // pi = 3.15   // ❌ Error: Val cannot be reassigned

    // Using var (mutable)
    var age = 20
    println("Current age: $age")

    age = 21   // ✅ allowed
    println("New age: $age")

    //=======variable type=====

    // Integer type (Int)
    val marks: Int = 90
    println("Marks: $marks")

    // Double type (decimal number)
    val price: Double = 249.50
    println("Price: $price")

    // Float type (needs 'f' at the end)
    val speed: Float = 88.7f
    println("Speed: $speed km/h")

    // Long type (large integer)
    val population: Long = 170000000
    println("Population: $population")

    // String type (text)
    val country: String = "Bangladesh"
    println("Country: $country")

    // Boolean type (true / false)
    val isRaining: Boolean = false
    println("Is it raining? $isRaining")

    // Char type (single character)
    val grade: Char = 'B'
    println("Grade: $grade")
}