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
class StudentDetails {
    String name;
    int id;
    StudentDetails(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("The Student Name : " +name+ " and Id : " +id);
    }
}

public class ParamConstructor {
    public static void main(String [] args) {
        StudentDetails s = new StudentDetails("vishal", 101);

    }
    
}
