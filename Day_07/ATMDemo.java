package Day_07;
// Problem: Demonstrate a simple ATM class in Java with methods for authentication, deposit, withdrawal, balance check, and transaction history.
// Day: 07
// Phase: Java OOP Concepts
// Concepts: Class creation, instance variables, constructors, methods, ArrayList for transaction history, basic control flow for menu and authentication attempts.
import java.util.ArrayList;
import java.util.Scanner;

public class ATMDemo {

    private double balance;
    private int pin;

    private int pinAttempts = 0;
    private final int MAX_PIN_ATTEMPTS = 3;

    private final double WITHDRAW_LIMIT = 5000;

    private ArrayList<String> transactions = new ArrayList<>();


    ATMDemo(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    // PIN Authentication
    public boolean authenticate(int enteredPin) {

        if (enteredPin == pin) {
            pinAttempts = 0;
            return true;
        } else {
            pinAttempts++;
            System.out.println("Incorrect PIN.");

            if (pinAttempts >= MAX_PIN_ATTEMPTS) {
                System.out.println("ATM blocked due to 3 wrong PIN attempts.");
                return false;
            }

            System.out.println("Attempts remaining: " + (MAX_PIN_ATTEMPTS - pinAttempts));
            return false;
        }
    }

    // Deposit
    public boolean deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return false;
        }

        balance += amount;
        transactions.add("Deposited: " + amount);
        return true;
    }

    // Withdraw
    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        if (amount > WITHDRAW_LIMIT) {
            System.out.println("Withdrawal limit per transaction is " + WITHDRAW_LIMIT);
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        }

        balance -= amount;
        transactions.add("Withdrawn: " + amount);
        return true;
    }

    // Balance check
    public void checkBalance() {

        System.out.println("-----------------------------------");
        System.out.println("Current Balance: " + balance);
        System.out.println("-----------------------------------");

        transactions.add("Checked Balance");
    }

    // Transaction History
    public void showTransactions() {

        System.out.println("\n----- Transaction History -----");

        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }

        for (String t : transactions) {
            System.out.println(t);
        }
    }

    // Receipt printing
    public void printReceipt(String type, double amount) {

        System.out.println("\n------ RECEIPT ------");
        System.out.println("Transaction: " + type);
        System.out.println("Amount: " + amount);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }

    public static void pause() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Delay interrupted.");
        }

    }

    public static void showMenu() {

        System.out.println("\n====== ATM MENU ======");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transaction History");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATMDemo atm = new ATMDemo(10000, 1234);

        System.out.println("Welcome to Mariyamman Indian Bank");

        // PIN verification with attempts
        while (true) {

            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (atm.authenticate(enteredPin)) {
                break;
            }

            if (atm.pinAttempts >= atm.MAX_PIN_ATTEMPTS) {
                sc.close();
                return;
            }
        }

        // ATM operations
        while (true) {

            showMenu();
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    atm.checkBalance();
                    pause();
                    break;

                case 2:

                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    System.out.println("Processing deposit...");
                    pause();

                    if (atm.deposit(depositAmount)) {
                        System.out.println("Deposit successful.");
                        atm.printReceipt("Deposit", depositAmount);
                    } else {
                        System.out.println("Deposit failed.");
                    }

                    pause();
                    break;

                case 3:

                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    System.out.println("Processing withdrawal...");
                    pause();

                    if (atm.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                        atm.printReceipt("Withdrawal", withdrawAmount);
                    } else {
                        System.out.println("Withdrawal failed.");
                    }

                    pause();
                    break;

                case 4:
                    atm.showTransactions();
                    pause();
                    break;

                case 5:
                    System.out.println("Thank you for using Mariyamman Indian Bank ATM.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}