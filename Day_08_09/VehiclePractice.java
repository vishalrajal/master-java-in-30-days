/*Problem 1: Simple Inheritance
Create a Parent class Vehicle with:
- Variables: speed
- Method: displaySpeed() → prints "Speed: " + speed
- Create a Child class Car that extends Vehicle and adds:
- Variable: brand
- Method: displayBrand() → prints "Brand: " + brand
Tasks:
- Create a Car object.
- Set speed and brand.
- Call both methods. */
//Day: 08
//Phase: Java OOP Concepts
//Concepts: Inheritance, method overriding, instance variables, class creation, object instantiation
class Vehicle {
    void displayspeed(double speed) {
        System.out.println("The speed of the vehicle is : " +speed + " kn/hr");
    }
}
class Childvehicle extends Vehicle {
 void displaybrand(String brand) {
    System.out.println("The brand of the vehicle is : " +brand);
 }   
}
public class VehiclePractice {
    public static void main(String args[]) {
        Childvehicle c = new Childvehicle();
        c.displaybrand("BMW");
        c.displayspeed(200);
    }
}