/*
 Problem: Demonstrate Constructors and Constructor Chaining in Java.
 Day: 14
 Phase: Constructors

 Concepts:
    - Default Constructor
    - Parameterized Constructor
    - Constructor Overloading
    - this keyword
    - Constructor Chaining (this())
    - Object creation
*/
class Employee {

    String name;
    int id;
    int salary;

    // Default constructor
    Employee() {
        this("Unknown", 0, 0);
        System.out.println("Default constructor called");
    }

    // Constructor with one parameter
    Employee(String name) {
        this(name, 0, 0);
        System.out.println("One parameter constructor called");
    }

    // Main constructor
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class ConstructorChainingDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee("Vishal");

    }
}