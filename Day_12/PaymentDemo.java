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

interface Payment {
    void payment(double amount);
}
class CreditCard implements Payment {
    public void payment(double amount) {
        System.out.println("payment of ₹ " +amount +" is made of Credit card");
    }
}
class UPI implements Payment {
    public void payment(double amount) {
        System.out.println("Payment of ₹ " +amount+ " is made of UPI Payment");
    }
}
class Cash implements Payment {
    public void payment(double amount) {
        System.out.println("Payment of ₹ " +amount+ " is made of Cash Payment");
    }
}
public class PaymentDemo {
    public static void main(String [] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        Payment p3 = new Cash();
        p1.payment(1200);
        p2.payment(2300);
        p3.payment(4000);
    }


}