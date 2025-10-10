package _000_Assignments._01_assignment_1

abstract class Person(private var name: String, private var personId: Int) {

    fun getName() = name
    fun getId() = personId

    abstract fun getInfo()

    abstract fun getRoleDescription(): String
}

class Student(name: String, personId: Int): Person(name, personId) {
    private var grade: String = "A+"

    fun getGrade() {
        println("Your grade is : $grade")
    }

    override fun getInfo() {
        println("I am ${getName()} | My id is ${getId()}")
    }

    override fun getRoleDescription(): String {
        return "I am a Student, my grade is $grade"
    }
}

class Teacher(name: String, personId: Int, private var subjectName: String): Person(name, personId) {

    override fun getInfo() {
        println("I am ${getName()} | My id is ${getId()}")
    }

    override fun getRoleDescription(): String {
        return "I am a Teacher, I teach $subjectName"
    }
}

fun main() {
    val sT: Person = Student("Koraish", 20)
    val tT: Person = Teacher("Aminul Islam Munna", 101, "Android Mobile Application Development")

    sT.getInfo()
    println(sT.getRoleDescription())

    tT.getInfo()
    println(tT.getRoleDescription())

}