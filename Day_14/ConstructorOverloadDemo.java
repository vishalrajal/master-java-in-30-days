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
class Book {

    String title;
    String author;
    int price;

    // Constructor 1
    Book() {
        System.out.println("Default Constructor Called");
    }

    // Constructor 2
    Book(String title) {
        this.title = title;
        System.out.println("Title: " + title);
    }

    // Constructor 3
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Title: " + title + " Author: " + author + " Price: " + price);
    }
}

public class ConstructorOverloadDemo {

    public static void main(String[] args) {

        Book b1 = new Book();

        Book b2 = new Book("Java Programming");

        Book b3 = new Book("Java Programming", "James Gosling", 500);

    }
}