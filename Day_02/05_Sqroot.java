// Problem: Check if a number is prime or not optimized
import java.util.Scanner;
class Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        sc.close();
        if (isPrime(x)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
