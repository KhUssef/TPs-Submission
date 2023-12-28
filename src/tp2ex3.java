import java.util.ArrayList;

public class tp2ex3 {
}
// Book class
class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void displayInformation() {
        System.out.println(this.getTitle()+" by "+this.getAuthor()+" on the year "+this.getYearOfPublication());
    }
}

class Novel extends Book {
    private int numberPages;
    public Novel(String title, String author, int yearOfPublication, int numberPages) {
        super(title, author, yearOfPublication);
        this.numberPages=numberPages;
    }

    public void displayInformation() {
        System.out.println(this.getTitle()+" by "+this.getAuthor()+" on the year "+this.getYearOfPublication()+" . It is "+numberPages+" pages.");
    }
}

// Textbook subclass of Book
class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, int yearOfPublication, String subject) {
        super(title, author, yearOfPublication);
        this.subject=subject;
    }

    public void displayInformation() {
        System.out.println(this.getTitle()+" by "+this.getAuthor()+" on the year "+this.getYearOfPublication()+" . The subject is "+subject);
    }
}

// Library class

class Library {
    private ArrayList<Book> bookInventory;

    public Library() {
        this.bookInventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void removeBook(Book book) {
        bookInventory.remove(book);
    }

    public void listAllBooks() {
        for (Book book : bookInventory) {
            book.displayInformation();
        }
    }
}

interface LibraryUser {
    void borrowBook(Book book);
    void returnBook(Book book);

}
class Student implements LibraryUser {
    private LibraryCard libraryCard;

    public Student(String name) {
        this.libraryCard = new LibraryCard(name);
    }

    @Override
    public void borrowBook(Book book) {
        // Logic to borrow a book
    }

    @Override
    public void returnBook(Book book) {
        // Logic to return a book
    }
}

// Teacher class implementing LibraryUser interface
class Teacher implements LibraryUser {
    private LibraryCard libraryCard;

    public Teacher(String name) {
        this.libraryCard = new LibraryCard(name);
    }

    public void borrowBook(Book book) {
        libraryCard.addBook(book);
    }
    public void returnBook(Book book) {
        libraryCard.removeBook(book);
    }
}
class LibraryCard {
    private String name;
    private ArrayList<Book> books;

    public LibraryCard(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' borrowed successfully.");
    }

    public void removeBook(Book book) {
        if (books.contains(book)) {

            books.remove(book);
            System.out.println("Book '" + book.getTitle() + "' returned successfully.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in your borrowed books.");
        }
    }
}

