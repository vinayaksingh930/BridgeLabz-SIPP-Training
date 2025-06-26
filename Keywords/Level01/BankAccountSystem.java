class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 101);
        BankAccount account2 = new BankAccount("Bob", 102);

        account1.displayDetails();
        account2.displayDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}