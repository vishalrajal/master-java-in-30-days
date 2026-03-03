// Problem: Demonstrate a simple class in Java with method overloading to perform addition of different types and numbers of parameters.
// Day: 05
// Phase: Java Foundations
// Concepts: Class creation, method overloading, instance methods, main method
class MethodOL {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    public static void main(String args[]) {
        MethodOL m1 = new MethodOL();
        System.out.println("Sum of 2 amd 3 is : " + m1.add(2, 3));
        System.out.println("Sum of 2, 3 and 4 is : " + m1.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5 is : " + m1.add(2.5, 3.5));
        

    }
}