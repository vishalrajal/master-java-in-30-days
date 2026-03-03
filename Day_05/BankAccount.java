// Problem: Demonstrate a simple Bank Account class in Java with methods for deposit, withdrawal, and displaying account details.
// Day: 05
// Phase: Java Foundations
// Concepts: Class creation, instance variables, static variables, constructors, methods

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    static String bankName = "State Bank";
    static int totalAccounts = 0;
    // Constructor to initialize the account details
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }
    // Method to deposit money into the account
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + "Successfully");
    }
    // Method to withdraw money from the account
    void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + "Successfully");
        }
        else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
    // Method to display account details
    void display() {
        System.out.println("Account Number : " +accountNumber);
        System.out.println("Account Holder Name " + accountHolderName);
        System.out.println("Balance : " + balance);
        System.out.println("Bank Name : " + bankName);
        System.out.println("----------------------------------------");
    }
    // Static method to show total number of accounts
    static void showTotalAccounts() {
        System.out.println("Total Accounts : " + totalAccounts);
    }

        public static void main(String args[]) {

        BankAccount a1 = new BankAccount(101, "Vishal", 5000);
        BankAccount a2 = new BankAccount(102, "Raja", 3000);

        a1.deposit(1000);
        a1.withdraw(2000);

        a2.withdraw(4000);  // insufficient case

        a1.display();
        a2.display();

        BankAccount.showTotalAccounts();
    }
}
