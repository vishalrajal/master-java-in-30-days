class Employee {
    String name;
    int salary;

    void displayEmployee() {
        System.out.println("Employee name is " + name);
        System.out.println("Employee salary is " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Manager department is : " + department);
        System.out.println("Manager name is : " + name);
        System.out.println("Manager salary is : " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String args[]) {

        Manager m = new Manager();
        m.name = "Vishal";
        m.salary = 50000;
        m.department = "IT";

        m.displayEmployee();
        m.displayManager();
    }
}