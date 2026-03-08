class Shape {
    void area(double area) {
        System.out.println("The area of the shape is " +area);
    }
}
class Circle extends Shape {
    void area(double r) {
        double area = 3.14 * r * r;
        super.area(area);
    }
}
class Rectangle extends Shape {
    void area(double l, double b) {
        double area = l * b;
        super.area(area);
    }
}
public class ShapeDemo {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.area(2);
        Rectangle r = new Rectangle();
        r.area(12, 5);
    }
}