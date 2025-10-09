package _04_OOP._04_encapsulation

class BankAccount {
    private var balance: Double = 0.0

    fun deposit (depoAmount: Double) {
        if (depoAmount > 0) {
            balance += depoAmount
        }
        else {
            println("Invalid or Insufficient balance")
        }
    }

    fun withdraw (withdrawAmount: Double) {
        if (withdrawAmount > 0 && withdrawAmount < balance) {
            balance -= withdrawAmount
        }
        else {
            println("Invalid or Insufficient balance")
        }
    }

    fun getBalance () {
        println("Now your balance is : $balance")
    }
}

fun main() {
    val bankAccount = BankAccount()

    bankAccount.deposit(2000.0)
    bankAccount.withdraw(500.0)

    bankAccount.getBalance()
}