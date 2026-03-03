// Problem: Demonstrate a simple Employee class in Java with instance variables, static variables, constructors, and methods to display employee details and count total employees.
// Day: 05
//  Phase: Java Foundations
// Concepts: Class creation, instance variables, static variables, constructors, methods

class Employee{
    int empID;
    String name;
    static String Companyname = "CWM International";
    static int count = 0;
    Employee(int empID, String name) {
        this.empID = empID;
        this.name = name;
        count++;
    }
    void display() {
        System.out.println("Employee ID: " + empID + ", Name: " +name + ", Company: " + Companyname);
    }
    static void showcount() {
        System.out.println("Total Employees: " + count);
    }
    public static void main(String args[]) {
        Employee e1 = new Employee(1, "Vishal");
        Employee e2 = new Employee(2, "Raja");
        e1.display();
        e2.display();
        Employee.showcount();
    }
}