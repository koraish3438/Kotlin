package _04_OOP._00_OOP_4P

open class BankBalance {
    private var balance: Double = 0.0

    fun deposit (depositAmount: Double) {
        if (depositAmount > 0) {
            balance += depositAmount
        }
        else {
            println("Invalid or Insufficient balance")
        }
    }

    fun withdraw (withdrawAmount: Double) {
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount
        }
        else {
            println("Invalid or Insufficient balance")
        }
    }
}

abstract class BankAccount {
    abstract fun savingAccount ()

    abstract fun currentAccount ()
}

class AccountType: BankAccount() {
    override fun savingAccount() {
        println("This is your saving account")
    }

    override fun currentAccount() {
        println("This is your current account")
    }
}

fun main() {

}