class Livingbeing {
    void breath() {
        System.out.println("Living being is breathing");
    }
}
class Animal extends Livingbeing{
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
public class MultilevelDemo {
    public static void main(String []args) {
        Dog d = new Dog();
        d.breath();
        d.eat();
        d.bark();
    }
}