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

interface A {
    void show();
}
interface B {
    void display();
}
class Combine implements A, B {
    public void show() {
        System.out.println("This is from Interface A");
    }
    public void display() {
        System.out.println("this is from interface B");
    }

}
public class MultipleInterfaceDemo {
    public static void main(String [] args) {
        Combine c = new Combine();
        c.show();
        c.display();
    }
    
}
