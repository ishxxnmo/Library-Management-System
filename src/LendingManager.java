public class LendingManager {
    private final BookInventoryManager inventory;

    public LendingManager(BookInventoryManager inventory) {
        this.inventory = inventory;
    }

    public void checkoutBook(Patron patron, String isbn) {
        Book book = inventory.findByIsbn(isbn);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book already checked out.");
            return;
        }

        book.setAvailable(false);
        patron.addToHistory(book);
        System.out.println(patron.getName() + " checked out " + book.getTitle());
    }

    public void returnBook(String isbn) {
        Book book = inventory.findByIsbn(isbn);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        book.setAvailable(true);
        System.out.println("Book returned: " + book.getTitle());
    }
}
