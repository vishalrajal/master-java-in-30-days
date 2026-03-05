import java.util.Scanner;

public class MiniATM {

    private double balance;

    MiniATM(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount.");
            return;
        }

        balance += amount;
        System.out.println("Deposit successful.");
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount.");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient Funds.");
            return false;
        }

        balance -= amount;
        return true;
    }

    public void checkBalance() {
        System.out.println("-----------------------------------");
        System.out.println("Current Balance: " + balance);
        System.out.println("-----------------------------------");
    }

    // delay method
    public static void pause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Delay interrupted.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MiniATM atm = new MiniATM(10000);

        while (true) {

            System.out.println("\nWelcome to Mariyamman Indian Bank");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    atm.checkBalance();
                    System.out.println("Returning to main menu...");
                    pause();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    System.out.println("Deposit in progress...");
                    pause();

                    atm.deposit(depositAmount);

                    System.out.println("Returning to main menu...");
                    pause();
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    System.out.println("Withdrawal in progress...");
                    pause();

                    if (atm.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Withdrawal failed.");
                    }

                    System.out.println("Returning to main menu...");
                    pause();
                    break;

                case 4:
                    System.out.println("Thank you for using Mariyamman Indian Bank ATM.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}