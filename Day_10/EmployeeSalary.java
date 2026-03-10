// Problem: Demonstrate method overriding in Java using an example of an Employee class and its subclasses (Manager, Developer, Intern) with different salary calculations.
// Day: 10
// Phase: polymorphism
// Concepts: method overriding, inheritance, runtime polymorphism
class Employee {
    double salary;
    void calculateSalary(double salary) {
        System.out.println("Employee Salary : " + salary);
        System.out.println("Employee Bonus : " + (salary*0.1));
    }
}
class Manager extends Employee {
    void calculateSalary(double salary) {
        System.out.println("Manager Salary : " + salary);
        System.out.println("Manager Bonus : " + (salary*0.2));
    }
}
class Developer extends Employee {
    void calculateSalary(double salary) {
        System.out.println("Developer Salary : " + salary);
        System.out.println("Developer Bonus : " + (salary*0.15));
    }
}
class Intern extends Employee {
    void calculateSalary(double salary) {
        System.out.println("Intern Salary : " + salary);
        System.out.println("Intern Bonus : " + (salary*0.05));
    }
}
public class EmployeeSalary {
    public static void main(String [] args) {
        Employee e = new Employee();
        e.calculateSalary(50000);
        Manager m = new Manager();
        m.calculateSalary(80000);
        Developer d = new Developer();
        d.calculateSalary(60000);
        Intern i = new Intern();
        i.calculateSalary(20000);
    }
    
}
