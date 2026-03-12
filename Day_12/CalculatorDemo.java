/*
Problem: Demonstrate a Calculator using Interface and Polymorphism
Day: 12
Phase: Interface
Concepts:
- Interface creation
- Implementing interface
- Runtime Polymorphism
- Constructor usage
- Switch-case control structure
- User input using Scanner
- Basic arithmetic operations (Addition, Subtraction, Multiplication, Division)
*/

import java.util.Scanner;

interface Calculation {
    double calculate();
}

class Addition implements Calculation {

    double a,b;

    Addition(double a,double b){
        this.a = a;
        this.b = b;
    }

    public double calculate(){
        return a + b;
    }
}

class Subtraction implements Calculation {

    double a,b;

    Subtraction(double a,double b){
        this.a = a;
        this.b = b;
    }

    public double calculate(){
        return a - b;
    }
}

class Multiplication implements Calculation {

    double a,b;

    Multiplication(double a,double b){
        this.a = a;
        this.b = b;
    }

    public double calculate(){
        return a * b;
    }
}

class Division implements Calculation {

    double a,b;

    Division(double a,double b){
        this.a = a;
        this.b = b;
    }

    public double calculate(){
        if(b == 0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("\nChoose Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        Calculation calc = null;

        switch(choice){

            case 1:
                calc = new Addition(a,b);
                break;

            case 2:
                calc = new Subtraction(a,b);
                break;

            case 3:
                calc = new Multiplication(a,b);
                break;

            case 4:
                calc = new Division(a,b);
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }
        sc.close();

        System.out.println("Result = " + calc.calculate());

        
    }
}