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
public class Student {
    // Private fields (encapsulation)
    private String name;
    private int age;
    private char grade;

    // Constructor
    public Student(String name, int age, char grade) {
        setName(name);   // use setters to include validation
        setAge(age);
        setGrade(grade);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter for grade
    public char getGrade() {
        return grade;
    }

    // Setter for grade with validation
    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade!");
        }
    }

    // Main method to run and test the class
    public static void main(String[] args) {
        // Create a student object
        Student student1 = new Student("Alice", 20, 'A');

        // Print initial details using getters
        System.out.println("Student Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());

        // Update student info using setters
        student1.setName("Alice Johnson");
        student1.setAge(21);
        student1.setGrade('B');

        System.out.println("\nUpdated Student Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());

        // Try invalid updates
        student1.setAge(-5);    // Invalid age!
        student1.setGrade('Z'); // Invalid grade!
        student1.setName("");   // Invalid name!
    }
}