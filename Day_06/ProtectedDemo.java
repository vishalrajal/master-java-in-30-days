// Problem: Demonstrate a simple animal class in Java with a protected method and a subclass that accesses it.
// Phase: Java OOP Concepts
// Concepts: Class creation, inheritance, protected access modifier, method overriding

class Animal {
    protected void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        sound();
    }
}

public class ProtectedDemo {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}