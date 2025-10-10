package _000_Assignments._01_assignment_1

abstract class Employee(private var salary: Double) {
    fun getSalary() = salary

    abstract fun calculateBonus()
}

class Manager(salary: Double): Employee(salary) {
    override fun calculateBonus() {
        val bonus = getSalary() * 0.10
//        val totalSalary = getSalary() + bonus
        println("Manager salary bonus is : $bonus")
    }
}

class Developer(salary: Double): Employee(salary) {
    override fun calculateBonus() {
        val bonus = getSalary() * 0.05
//        val totalSalary = getSalary() + bonus
        println("Developer salary bonus is : $bonus")
    }
}

fun main() {
    val employee: List<Employee> = listOf(Manager(80000.0), Developer(50000.0))

    for (i in employee) {
        i.calculateBonus()
    }
}