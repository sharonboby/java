package module1;
class Book
{
    String title;
    String author;
    double price;
    Book(String t, String a, double p)
    {
        title = t;
        author = a;
        price = p;
    }
    void displayBook()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class BookDemo
{
    public static void main(String args[])
    {
    	System.out.println("*------HERE ARE THE BOOK DETIALS:-----------*");
        Book b1 = new Book("harry potter", "J.K Rowling;", 500);
        Book b2 = new Book("Lord of the Rings", "J.R.R Tolkein", 450);
        b1.displayBook();
        System.out.println();
        b2.displayBook();
    }
}