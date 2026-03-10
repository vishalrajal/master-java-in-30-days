// Problem: Calculate the area of different shapes
// Day: 10
// Phase: polymorphism
// Concepts: method overloading, area calculation for square, rectangle, and circle
class Area {
    void area(int a) {
        System.out.println("Area of Square : " + (a*a));
    }
    void area(int l, int b) {
        System.out.println("Area of the Rectangle : " + (l*b));
    }
    void area(double r) {
        System.out.println("Area of the circle : " + (3.14*r*r));
    }
}

public class Areacalc {
    public static void main(String [] args) {
        Area a = new Area();
        a.area(5);
        a.area(5,2);
        a.area(2.5);
    }
    
}
