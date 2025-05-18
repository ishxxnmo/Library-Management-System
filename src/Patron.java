import java.util.ArrayList;
import java.util.List;

public class Patron {
    private final String id;
    private String name;
    private final List<Book> borrowingHistory;

    public Patron(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowingHistory = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void addToHistory(Book book) {
        borrowingHistory.add(book);
    }

    public List<Book> getBorrowingHistory() {
        return borrowingHistory;
    }

    @Override
    public String toString() {
        return "Patron: " + name + " (ID: " + id + ")";
    }
}
