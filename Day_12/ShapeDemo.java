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

interface Shape {
    double area();
}

class Circle implements Shape {
    double r;

    Circle(double r){
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }
}

class Rectangle implements Shape {
    double l;
    double b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return l * b;
    }
}
class Square implements Shape {
    double a;
    Square(double a) {
        this.a = a;
    }
    public double area() {
        return a*a;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Square(2.5);

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
        System.out.println("Square Area: " + s3.area());
    }
}