// Problem: Demonstrate modern switchcase in Java
// Day: 02
// Phase: Java Foundations
// Concepts: switch case, multiple cases in switch case
import java.util.Scanner;
class SwitchModern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week (1-7) :");
        int day = sc.nextInt();
        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        //multiple cases
        System.out.println("Enter a month of the year (1-12) : ");
        int month = sc.nextInt();
        sc.close();
        switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 Days");
            case 4, 6, 9, 11 -> System.out.println("30 Days");
            case 2 -> System.out.println("28 or 29 days");
        }
    }
}