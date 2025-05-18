import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        BookInventoryManager inventory = new BookInventoryManager();
        LendingManager lending = new LendingManager(inventory);
        PatronManager patronManager = new PatronManager();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addBook(scanner, inventory);
                case "2" -> inventory.printAllBooks();
                case "3" -> searchBookByISBN(scanner, inventory);
                case "4" -> {
                    System.out.println("Exiting system. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n=== Library Management Menu ===");
        System.out.println("1. Add Book");
        System.out.println("2. Display All Book Titles");
        System.out.println("3. Search Book by ISBN");
        System.out.println("4. Exit");
    }

    private static void addBook(Scanner scanner, BookInventoryManager inventory) {
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter Publication Year: ");
        int year = Integer.parseInt(scanner.nextLine());

        Book book = new Book(title, author, isbn, year);
        inventory.addBook(book);
        System.out.println("Book added successfully!");
    }

    private static void searchBookByISBN(Scanner scanner, BookInventoryManager inventory) {
        System.out.print("Enter ISBN to search: ");
        String isbn = scanner.nextLine();
        Book book = inventory   .searchByISBN(isbn);
        if (book != null) {
            System.out.println("Found Book:");
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }
}
