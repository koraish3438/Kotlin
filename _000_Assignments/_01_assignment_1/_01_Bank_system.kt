package _000_Assignments._01_assignment_1

abstract class BankAccount (
    private var balance: Double,
    private val accountNumber: String,
    private val accountHolderName: String) {

    fun deposit(depositAmount: Double) {
        if (depositAmount > 0) {
            balance += depositAmount
        }
        else {
            println("Invalid or Insufficient balance")
        }
    }

    fun withdraw(withdrawAmount: Double) {
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount
        }
        else{
            println("Invalid or Insufficient balance")
        }
    }

    fun getBalance(): Double = balance

    abstract fun calculateInterest(): Double

}

class SavingAccount(
    balance: Double,
    accountNumber: String,
    accountHolderName: String
): BankAccount(
    balance, accountNumber, accountHolderName) {

    private val interestRate = 0.05

    override fun calculateInterest(): Double {
        val interest = getBalance() * interestRate
        return interest
    }
}

class CurrentAccount(
    balance: Double,
    accountNumber: String,
    accountHolderName: String
): BankAccount(
    balance, accountNumber, accountHolderName) {

    private val interestRate = 0.02

    override fun calculateInterest(): Double {
        val interest = getBalance() * interestRate
        return interest
    }
}

fun main() {
    val acc1: BankAccount = SavingAccount(10000.0, "616387", "KORAISH")
    val acc2: BankAccount = CurrentAccount(5000.0, "616382", "MD. KAJAM-ALL")

    acc1.deposit(5000.0)
    acc1.withdraw(2000.0)
    println("Account holder name is : KORAISH , Interest : ${acc1.calculateInterest()} , Balance : ${acc1.getBalance()}")

    acc2.deposit(2000.0)
    acc2.withdraw(1000.0)
    println("Account holder name is : MD. KAJAM-ALL , Interest : ${acc2.calculateInterest()} , Balance : ${acc2.getBalance()}")

}