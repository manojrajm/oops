import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this; 
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this; 
    }
    
    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public void displayBookDetails() {
        System.out.printf("Title: %s%nAuthor: %s%nPublisher: %s%n", title, author, publisher);
    }

    private static void updateBookDetails(Book book, Scanner scanner) {
        System.out.println("Enter the book title:");
        book.setTitle(scanner.nextLine());

        System.out.println("Enter the book author:");
        book.setAuthor(scanner.nextLine());

        System.out.println("Enter the book publisher:");
        book.setPublisher(scanner.nextLine());
    }

    public static void main(String[] args) {
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner");
        myBook.displayBookDetails();

        Scanner scanner = new Scanner(System.in);
        updateBookDetails(myBook, scanner); 
        System.out.println("\nUpdated Book Details:");
        myBook.displayBookDetails();

        scanner.close(); 
    }
}

