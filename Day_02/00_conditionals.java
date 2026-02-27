// Problem: Demonstrate all types of Conditionals in Java
// Day: 02
// Phase: Java Foundations
// Concepts: if-else, if-else if Ladder, switch-case
import java.util.Scanner;
class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        //if else conditions
        if(age >= 18){
            System.out.println("You are Eligible to vote");
        }
        else{
            System.out.println("You are not Eligible to vote");
        }
        //if-else if Ladder
        System.out.println("Enter your mark :");
        int mark = sc.nextInt();
        if(mark >= 90){
            System.out.println("Grade  A");
        }
        else if(mark >=80 && mark <90) {
            System.out.println("Grade B");
        }
        else if(mark >=70&&mark<80){
            System.out.println("Grade C");
        }
        else if(mark >=60 && mark <70) {
            System.out.println("Grade D");
        }
        else if(mark >=50 && mark <60) {
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
        
        //switch case
        System.out.println("Enter a day of the week (1-7) :");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        sc.close();
    }

}