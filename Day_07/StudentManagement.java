package Day_07;
// Problem: Demonstrate a simple Student Management System in Java with classes for Student and a main class to manage students, allowing users to add students, view students, search for a student by ID, and delete a student.
// Day: 07
// Phase: Java OOP Concepts
// Concepts: Class creation, instance variables, constructors, methods, ArrayList for managing students, basic control flow for menu and user interaction.
import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while(true) {

            System.out.println("\n====== Student Menu ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(id, name, marks));

                    System.out.println("Student added successfully.");
                    break;

                case 2:

                    if(students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for(Student s : students) {
                            s.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(Student s : students) {
                        if(s.id == searchId) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = false;

                    for(int i = 0; i < students.size(); i++) {

                        if(students.get(i).id == deleteId) {
                            students.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if(removed) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 5:

                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}