// Problem: Demonstrate Abstract Classes in Java using an example of a Payment class and its subclasses for UPIPayment, CardPayment, and CashPayment.
// Day: 11
// Phase: Abstraction
// Concepts: Abstraction, Abstract classes, Inheritance,method overriding, runtime polymorphism, Dynamic method dispatch
abstract class Amount {

    abstract void pay(double amount);

}

class UPIPayment extends Amount {

    void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }

}

class CardPayment extends Amount {

    void pay(double amount) {
        System.out.println("Card Payment: " + amount);
    }
}

class CashPayment extends Amount {

    void pay(double amount) {
        System.out.println("Cash Payment: " + amount);
    }

}

public class Payment {

    public static void main(String[] args) {

        Amount a;

        a = new UPIPayment();
        a.pay(500);

        a = new CardPayment();
        a.pay(5000);

        a = new CashPayment();
        a.pay(1000);

    }

}