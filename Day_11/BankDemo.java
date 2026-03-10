// Problem: Demonstrate Abstract Classes in Java using an example of a Bank class and its subclasses for SBI, HDFC, and ICICI.
// Day: 11
// Phase: Abstraction
// Concepts: Abstraction, Abstract classes, Inheritance,method overriding, runtime polymorphism, Dynamic method dispatch
abstract class Bank {

    abstract void getInterest();

}

class SBI extends Bank {

    void getInterest() {
        System.out.println("SBI Interest: 6%");
    }

}

class HDFC extends Bank {

    void getInterest() {
        System.out.println("HDFC Interest: 6.5%");
    }

}

class ICICI extends Bank {

    void getInterest() {
        System.out.println("ICICI Interest: 7%");
    }

}

public class BankDemo {

    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.getInterest();

        b = new HDFC();
        b.getInterest();

        b = new ICICI();
        b.getInterest();

    }

}