/*
 Problem: Demonstrate a Defaultmethod in Interface.
 Day: 12
 Phase: Interface
 Concepts:
    - Interface creation and usage
    - Implementing interface in multiple classes
    - Runtime polymorphism (interface reference referring to different objects)
    - Default & static methods in interfaces (optional advanced)
    - Constructor usage for passing operands
    - Switch-case for operation selection
    - User input using Scanner
    - Basic arithmetic operations: Addition, Subtraction, Multiplication, Division
*/
interface Vehicle {

    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehicle {

}

public class DefaultDemo {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
    }
}