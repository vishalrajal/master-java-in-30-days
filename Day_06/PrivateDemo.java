public class PrivateDemo {
    private int secretNumber;
    // Constructor to initialize the secret number
    PrivateDemo(int secretNumber) {
        this.secretNumber = secretNumber;
    }
    // Method to reveal the secret number
    void revealSecret() {
        System.out.println("The Secret Number is: " + secretNumber);
    }
    public static void main(String args[]) {
        PrivateDemo d1 = new PrivateDemo(42);
        d1.revealSecret();
    }
}