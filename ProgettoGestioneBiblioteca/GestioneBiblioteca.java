import java.util.ArrayList;
import java.util.Scanner;

public class GestioneBiblioteca {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        //aggiungiamo qualche libro
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        library.addBook(new Book("Le Cronache del Mondo Emerso", "Licia Troisi"));
        library.addBook(new Book("The Neuromancer", "William Gibson"));
        library.addBook(new Book("How to be the BEST programming teacher in the UNIVERSE!", "Mirko Campari")); // <3        

        //Diamo il menu con le opzioni all'utente
        boolean menu = true;
        while (menu) {
            System.out.println("\n Library Menu");
            System.out.println("1. List of all books.");
            System.out.println("2. Borrow a book.");
            System.out.println("3. Exit");
            System.out.print("Select your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consuma newline

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;

                case 2:
                    System.out.print("Which book do you want to borrow? ");
                    String title = sc.nextLine();
                    library.borrowBook(title);
                    break;

                case 3:
                    menu = false;
                    break;
                default:
                    System.out.println("Selection not valid.");
            }
        }
        //e chiudiamo
        sc.close();
        System.out.println("System closing.");
    }

    //Classe della biblioteca
    static class Library {
        public ArrayList<Book> books;
                public Library(){
                    books = new ArrayList<>();
                }

            public void addBook(Book book){
                books.add(book);
            }

            public void displayAllBooks(){
                for (Book book : books) {
                    book.displayBookInfo();
                }
            }

            public void borrowBook(String title){
                for (Book book : books) {
                    if (book.isAvailable && book.getTitle().equalsIgnoreCase(title)) {
                        System.out.println("You have borrowed " + title + " successfully.");
                    }
                } System.out.println("Book unavailable or non existent.");
            }
    }

    //Classe del libro singolo
    static class Book {
        String title;
        String author;
        boolean isAvailable;

        public Book(String title, String author){
            this.title=title;
            this.author=author;
            this.isAvailable=true;
        }

        public void displayBookInfo() {
            System.out.println("Title: " + title + "\n Author: " + author + "\n Available: " + (isAvailable ? "Yes" : "No"));
        }

        public String getTitle(){
            return title;
        }
    }
}