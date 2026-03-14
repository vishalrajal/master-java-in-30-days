import java.util.Scanner;

public class ClosingScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            int result = 10 / num;
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        finally {
            sc.close();
            System.out.println("Scanner closed");
        }
    }
}