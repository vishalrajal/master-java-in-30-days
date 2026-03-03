// Problem: Demonstrate a simple class in Java with methods to show different types of method definitions (with/without parameters and return types) and how to call them from the main method.
// Day: 05
// Phase: Java Foundations
// Concepts: Class creation, instance methods, method parameters, return types, main method
public class MethodDemo {
    // Method without parameter and return type
    void greet() {
        System.out.println("Hello !");
    }
    // Method with parameters and no return type
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " +sum);
    }
    // Method with parameters and return type
    int multiply(int x, int y){
        return x * y;
    }
    public static void main(String args[]) {
        MethodDemo demo = new MethodDemo();
        demo.greet();
        demo.add(2, 10);
        int result = demo.multiply(2, 10);
        System.out.println("Multiplication Result : " + result);
    }
}