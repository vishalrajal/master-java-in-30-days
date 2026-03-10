// Problem: Demonstrate Abstract Classes in Java using an example of a Vehicle class and its subclasses for just learning.
// Day: 11
// Phase: Abstraction
// Concepts: Abstraction, Abstract classes, Inheritance,method overriding, runtime polymorphism, Dynamic method dispatch
abstract class Vehicle {

    abstract void start();

}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with key");
    }

}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts with kick");
    }

}

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();

    }

}