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

interface Animal {
    void sound();   // no body
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}