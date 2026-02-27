// Problem: Find the maximum of two numbers
import java.util.Scanner;
class Max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int x = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int y = sc.nextInt();
        sc.close();
        if(x>y) {
            System.out.println("First number is geater than the second number");
        }
        else if(y>x) {
            System.out.println("Second number is greater than the first number");
        }
        else {
            System.out.println("Both numbers are equal");
        }

    }
}