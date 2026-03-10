// Problem: Demonstrate Abstract Classes in Java using an example of a Shape class and its subclasses for Circle, Rectangle, and Triangle.
// Day: 11
// Phase: Abstraction
// Concepts: Abstraction, Abstract classes, Inheritance,method overriding, runtime polymorphism, Dynamic method dispatch
abstract class Shape {

    abstract void area();

}

class Circle extends Shape {

    double r;

    Circle(double r) {
        this.r = r;
    }

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * r * r));
    }

}

class Rectangle extends Shape {

    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }

}

class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

}

public class Calc {

    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        s.area();

        s = new Rectangle(4,6);
        s.area();

        s = new Triangle(3,8);
        s.area();

    }

}