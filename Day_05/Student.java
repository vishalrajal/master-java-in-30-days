// Problem: Demonstrate a simple Student class in Java with methods to determine pass/fail status and display student details.
// Day: 05
// Phase: Java Foundations
// Concepts: Class creation, instance variables, constructors, methods, user input with Scanner
import java.util.Scanner;

public class Student {
    int rollNo;
    String name;
    double marks;
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    boolean isPass() {
        return marks >=40;
    }
    void display() {
        System.out.println("Roll No: " +rollNo);
        System.out.println("Student Name: " +name);
        System.out.println("Marks: " +marks);
        System.out.println("Result: " + (isPass() ? "Pass" : "Fail"));
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Student Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the Marks: ");
        double marks = sc.nextDouble();
        sc.close();
        Student s = new Student(roll, name, marks);
        s.display();

    }
}
