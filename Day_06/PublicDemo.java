// Problem: Demonstrate a simple class in Java with a public instance variable and a method to access it.
// Phase: Java OOP Concepts
// Concepts: Class creation, instance variables, public access modifier, methods
class Demo {
    public int number = 100;
}

public class PublicDemo {
    public static void main(String args[]) {

        Demo d = new Demo();
        System.out.println(d.number);  // always accessible
    }
}