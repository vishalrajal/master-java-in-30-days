class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    void CircleInfo() {
        System.out.println("Circle Shape");
    }
}
class Rectangle extends Shape {
    void RectangleInfo() {
        System.out.println("Rectangle Shape");
    }
}
class Triangle extends Shape{
    void TriangleInfo() {
        System.out.println("Triangle Shape");
    }
}
public class HierarchicalDemo {
    public static void main(String [] args) {
        Circle c = new Circle();
        c.CircleInfo();
        c.draw();
        Rectangle r = new Rectangle();
        r.RectangleInfo();
        r.draw();
        Triangle t = new Triangle();
        t.TriangleInfo();
        t.draw();
    }
}