// Problem: Demonstrate Abstract Classes in Java using an example of an Employee class and its subclasses for Manager, Developer, and Intern.
// Day: 11
// Phase: Abstraction
// Concepts: Abstraction, Abstract classes, Inheritance,method overriding, runtime polymorphism, Dynamic method dispatch
abstract class Employee {

    abstract void calculateSalary();

}

class Manager extends Employee {

    void calculateSalary() {
        System.out.println("Manager Salary: 80000");
    }

}

class Developer extends Employee {

    void calculateSalary() {
        System.out.println("Developer Salary: 60000");
    }

}

class Intern extends Employee {

    void calculateSalary() {
        System.out.println("Intern Salary: 15000");
    }

}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e;

        e = new Manager();
        e.calculateSalary();

        e = new Developer();
        e.calculateSalary();

        e = new Intern();
        e.calculateSalary();

    }

}