/*
 Problem: Demonstrate Encapsulation in java.
 Day: 13
 Phase: Encapsulation
 Concepts:
    - Encapsulation
    - Private variables
    - Constructor
    - Getter methods
    - Setter methods
    - Object creation
*/
class EmployeeData {
    private String name;
    private int id;
    private int salary;
    EmployeeData(String name,int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class Employee {
    public static void main(String [] args) {
        EmployeeData e1 = new EmployeeData("Vishal",100,5000);
        System.out.println(e1.getName());
        e1.setName("Raja");
        e1.setId(102);
        e1.setSalary(20000);
        System.out.println(e1.getName() );
        System.out.println(e1.getId());
        System.out.println(e1.getSalary());

    }
}