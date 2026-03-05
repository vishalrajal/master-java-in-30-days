class Animal {
    protected void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        sound();
    }
}

public class ProtectedDemo {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}