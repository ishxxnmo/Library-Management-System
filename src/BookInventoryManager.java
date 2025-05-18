import java.util.*;

public class BookInventoryManager {
    private final Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Book added: " + book);
    }

    public void removeBook(String isbn) {
        Book removed = books.remove(isbn);
        System.out.println(removed != null ? "Removed: " + removed : "Book not found.");
    }

    public void updateBookAvailability(String isbn, boolean isAvailable) {
        Book book = books.get(isbn);
        if (book != null) {
            book.setAvailable(isAvailable);
        }
    }

    public Book findByIsbn(String isbn) {
        return books.get(isbn);
    }

    public List<Book> searchByTitle(String title) {
        return books.values().stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    public List<Book> searchByAuthor(String author) {
        return books.values().stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    public void printAllBooks() {
        books.values().forEach(System.out::println);
    }
    public Book searchByISBN(String isbn) {
        return books.get(isbn);
    }
}
