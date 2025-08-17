package Object_Oriented_Programming.Submission_on_Java_Classes_and_Objects;

import java.util.Scanner;

class Book {
    String title, author;
    double price;

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }
}

public class Program_to_Handle_Book_Details {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        Book b = new Book();

        System.out.print("Enter Book Title: ");
        b.title = sc.nextLine();

        System.out.print("Enter Book Author: ");
        b.author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        b.price = sc.nextDouble();

        System.out.println("\n--- Book Details ---");
        b.displayBook();
    }
}
