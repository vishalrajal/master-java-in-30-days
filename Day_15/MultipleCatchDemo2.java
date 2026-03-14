import java.util.Scanner;

public class MultipleCatchDemo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Numerator: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Denominator: ");
            int num2 = sc.nextInt();

            int result = num1/num2;
            System.out.println("Result: " + result);

            int arr[] = new int[6];
            arr[10] = 20;

        }

        catch (ArithmeticException e) {
            System.out.println("You cannot divide " + e.getMessage());
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid" +e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Invalid input" + e.getMessage());
        }

        sc.close();
    }
}