// Problem: Demonstrate method overloading in Java using an example of a Methodoverload class with different add methods for adding two integers, three integers, and two doubles.
// Day: 10
// Phase: polymorphism
// Concepts: method overloading, compile-time polymorphism, different parameter lists
class Methodoverload {
    int add(int a, int b) {
        return a+b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
    double add(double a, double b) {
        return a+b;
    }
}
public class MethodOl {
    public static void main(String[] args) {
        Methodoverload m = new Methodoverload();
        System.out.println(m.add(5,3));
        System.out.println(m.add(5,3,2));
        System.out.println(m.add(1.2, 2.3));
    }
}