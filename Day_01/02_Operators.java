// Problem: Demonstrate all types of Operators in Java
// Day: 01
// Phase: Java Foundations
// Concepts: Arithmetic operators, Relational Operators, Logical Operators

class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        //Arithmetic operators
        System.out.println("Addition : " + (a+b));
        System.out.println("Subtraction : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b));
        System.out.println("Modulus : " + (a%b));

        //Relational Operators
        System.out.println("Equal to " + (a==b));
        System.out.println("Not Equal to " + (a!=b));
        System.out.println("Greater than " +(a>b));
        System.out.println("Less than " + (a<b));
        System.out.println("Greater than or equal to " + (a>=b));
        System.out.println("Less than or equal to " + (a<=b));

        //Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND " + (x && y));
        System.out.println("Logical OR " + (x || y));
        System.out.println("Logical Not " + (!x));

    }
}
