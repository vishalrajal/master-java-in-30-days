// Problem: Demonstrate a simple Bank class in Java with methods for deposit, withdrawal, and displaying balance.
// Day: 06
// Phase: Java OOP Concepts
// Concepts: Class creation, instance variables, constructors, methods
class Bank {
    private double balance;

    Bank(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
            return;
        }
        balance += amount;
        
    }
    public void withdraw(double amount) {
        if (amount <= 0 ) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
            return;
        }
        if(amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
            return;
        }
        
        balance -= amount;
        
    }
    double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Bank bank = new Bank(1000);
        System.out.println("Initial Balance: " + bank.getBalance());
        bank.deposit(500);
        System.out.println("Balance after deposit: " + bank.getBalance());
        bank.withdraw(200);
        System.out.println("Balance after withdrawal: " + bank.getBalance());
    }

}