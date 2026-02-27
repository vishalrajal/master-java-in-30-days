// Problem: Check if a number is positive, negative or zero
import java.util.Scanner;
class checknumber {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        if(num > 0) {
            System.out.println("Positive Number");
        }
        else if(num < 0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }
    }
}