package tutorial4;
import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book 1 details");
        System.out.print("Title: ");
        String title1 = sc.nextLine();
        System.out.print("Author: ");
        String author1 = sc.nextLine();
        System.out.print("Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();
        Book b1 = new Book(title1, author1, price1);
        System.out.println("\nEnter Book 2 details");
        System.out.print("Title: ");
        String title2 = sc.nextLine();
        System.out.print("Author: ");
        String author2 = sc.nextLine();
        System.out.print("Price: ");
        double price2 = sc.nextDouble();
        Book b2 = new Book(title2, author2, price2);
        System.out.println("\n--- Book Details ---");
        b1.displayBook();
        b2.displayBook();
        sc.close();
    }
}