fun main() {
    // 1️⃣ Integer Type (Int)
    // Size: 32-bit, Range: -2,147,483,648 to 2,147,483,647
    val age: Int = 25
    println("Age: $age")

    // 2️⃣ Long Type
    // Size: 64-bit, Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    val population: Long = 8000000000
    println("Population: $population")

    // 3️⃣ Short Type
    // Size: 16-bit, Range: -32,768 to 32,767
    val roomNumber: Short = 305
    println("Room Number: $roomNumber")

    // 4️⃣ Byte Type
    // Size: 8-bit, Range: -128 to 127
    val level: Byte = 100
    println("Level: $level")

    // 5️⃣ Float Type
    // Size: 32-bit, Approx. Range: 1.4E-45 to 3.4028235E38
    val temperature: Float = 36.6f
    println("Temperature: $temperature°C")

    // 6️⃣ Double Type
    // Size: 64-bit, Approx. Range: 4.9E-324 to 1.7976931348623157E308
    val pi: Double = 3.14159265359
    println("Value of Pi: $pi")

    // 7️⃣ String Type
    // Size: variable, depends on text length, Range: depends on memory
    val name: String = "Md Koraish"
    println("Name: $name")

    // 8️⃣ Char Type
    // Size: 16-bit, Range: '\u0000' to '\uffff'
    val grade: Char = 'A'
    println("Grade: $grade")

    // 9️⃣ Boolean Type
    // Size: 1-bit, Range: true/false
    val isLearning: Boolean = true
    println("Am I learning Kotlin? $isLearning")

    // 🔟 Nullable Type
    // String? can store null or String value
    var city: String? = null
    println("City: $city")
    city = "Dhaka"
    println("City: $city")
}