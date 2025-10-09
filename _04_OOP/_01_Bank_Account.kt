package _04_OOP._00_OOP_4P

abstract class BankBalance {
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

    fun getBalance () {
        println("Now your balance is : $balance")
    }

    open fun calculateInterest () {
        val a = 0.5 * balance

        balance += a
    }
}

class savingAccount: BankBalance() {
    override fun calculateInterest () {
        println("This is saving account")
    }
}

class currentAccount: BankBalance() {
    override fun calculateInterest() {
        println("This is current account")
    }
}


fun main() {
    val sA = savingAccount()
    val cA = currentAccount()

    sA.deposit(1000.0)
    sA.withdraw(200.0)
    sA.getBalance()

    cA.deposit(5000.0)
    cA.withdraw(500.0)
    cA.getBalance()
}