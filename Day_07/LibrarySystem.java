package Day_07;
// Problem: Demonstrate a simple Library System in Java with classes for Book and Library, allowing users to add books, view books, borrow and return books.
// Day: 07
// Phase: Java OOP Concepts
// Concepts: Class creation, instance variables, constructors, methods, ArrayList for managing books, basic control flow for menu and user interaction.
import java.util.ArrayList;
import java.util.Scanner;

class Book {

    String title;
    String author;
    boolean isBorrowed;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    void display() {
        System.out.println("Title: " + title + " | Author: " + author + 
        " | Status: " + (isBorrowed ? "Borrowed" : "Available"));
    }
}

public class LibrarySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true) {

            System.out.println("\n====== Library Menu ======");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books.add(new Book(title, author));

                    System.out.println("Book added successfully.");
                    break;

                case 2:

                    if(books.isEmpty()) {
                        System.out.println("No books in library.");
                    } else {
                        for(int i = 0; i < books.size(); i++) {
                            System.out.print((i+1) + ". ");
                            books.get(i).display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter book number to borrow: ");
                    int borrow = sc.nextInt();

                    if(borrow > 0 && borrow <= books.size()) {

                        Book b = books.get(borrow-1);

                        if(b.isBorrowed) {
                            System.out.println("Book already borrowed.");
                        } else {
                            b.isBorrowed = true;
                            System.out.println("Book borrowed successfully.");
                        }

                    } else {
                        System.out.println("Invalid book number.");
                    }

                    break;

                case 4:

                    System.out.print("Enter book number to return: ");
                    int ret = sc.nextInt();

                    if(ret > 0 && ret <= books.size()) {

                        Book b = books.get(ret-1);

                        if(!b.isBorrowed) {
                            System.out.println("Book was not borrowed.");
                        } else {
                            b.isBorrowed = false;
                            System.out.println("Book returned successfully.");
                        }

                    } else {
                        System.out.println("Invalid book number.");
                    }

                    break;

                case 5:
                    System.out.println("Exiting Library System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}