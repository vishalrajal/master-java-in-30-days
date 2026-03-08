class Person {
    String name;
    void displayPerson() {
        System.out.println("Person name is : " + name);
    }
}
class Employee extends Person {
    int employeeID;
    int salary;
    void displayEmployee() {
        System.out.println("Employee name is : " + name);
        System.out.println("Employee ID is : " + employeeID);
        System.out.println("Employee salary is : " + salary);
    }
}
class Manager extends Employee {
    String department;
    void displayManager() {
        System.out.println("Manager name is : " + name);
        System.out.println("Manager ID is : " + employeeID);
        System.out.println("Manager salary is : " + salary);
        System.out.println("Manager department is : " + department);
    }
}
public class Challenge {
    public static void main(String args[]) {
        Manager m = new Manager();
        m.name = "Vishal";
        m.employeeID = 12345;
        m.salary = 50000;
        m.department = "IT";

        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}   