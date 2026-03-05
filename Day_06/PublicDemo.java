class Demo {
    public int number = 100;
}

public class PublicDemo {
    public static void main(String args[]) {

        Demo d = new Demo();
        System.out.println(d.number);  // always accessible
    }
}