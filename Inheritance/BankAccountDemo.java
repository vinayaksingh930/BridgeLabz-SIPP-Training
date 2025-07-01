class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
}

class FixedDepositAccount extends BankAccount {
    FixedDepositAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(101, 5000.0, 3.5);
        BankAccount checking = new CheckingAccount(102, 3000.0, 1000.0);
        BankAccount fixedDeposit = new FixedDepositAccount(103, 10000.0);

        System.out.println("Savings Account: " + savings.accountNumber + ", Balance: $" + savings.balance + ", Interest Rate: " + ((SavingsAccount) savings).interestRate + "%");
        System.out.println("Checking Account: " + checking.accountNumber + ", Balance: $" + checking.balance + ", Withdrawal Limit: $" + ((CheckingAccount) checking).withdrawalLimit);
        System.out.println("Fixed Deposit Account: " + fixedDeposit.accountNumber + ", Balance: $" + fixedDeposit.balance);
    }
}