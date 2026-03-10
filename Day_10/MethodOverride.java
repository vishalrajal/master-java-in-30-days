// Problem: Demonstrate method overriding in Java using an example of an Employee class and its subclasses (Manager, Developer, Intern) with different salary calculations.
// Day: 10
// Phase: polymorphism
// Concepts: method overriding, inheritance, runtime polymorphism
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class MethodOverride {
    public static void main(String [] args) {
        Dog d = new Dog();
        d.sound();
    }
    
}