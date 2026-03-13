/*
 Problem: Demonstrate Constructors and Constructor Chaining in Java.
 Day: 14
 Phase: Constructors

 Concepts:
    - Default Constructor
    - Parameterized Constructor
    - Constructor Overloading
    - this keyword
    - Constructor Chaining (this())
    - Object creation
*/
class Car {
    String brand;
    Car() {
        brand = "unknown";
        System.out.println("Default Constructor called");
    }
}
public class DefConstructor {
    public static void main(String [] args) {
        Car c = new Car();
        System.out.println("Brand : " +c.brand);
    }
    
}
