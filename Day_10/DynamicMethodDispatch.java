// Problem: Demonstrate dynamic method dispatch in Java using an example of an Animal class and its subclasses.
// Day: 10
// Phase: polymorphism
// Concepts: dynamic method dispatch, method overriding, runtime polymorphism
class Animal{
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal a;
        a = new Animal();
        a.sound();
        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
    }
    
}
