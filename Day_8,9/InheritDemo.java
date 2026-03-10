class parent {
    int num = 10;
    void display() {
        System.out.println("This is the parentclass");
    }
}
class child extends parent {
    int num = 20;
    void show() {
        System.out.println("This is the child class");
    }
}
public class InheritDemo {
    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.show();
        System.out.println("The Value of num in child class is : " + c.num);
        System.out.println("The value of num in parent class is : " + ((parent)c).num);
    }
}