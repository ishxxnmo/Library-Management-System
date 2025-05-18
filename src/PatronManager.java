import java.util.*;

public class PatronManager {
    private final Map<String, Patron> patrons = new HashMap<>();

    public void addPatron(Patron patron) {
        patrons.put(patron.getId(), patron);
        System.out.println("Added patron: " + patron);
    }

    public void updatePatronName(String id, String newName) {
        Patron patron = patrons.get(id);
        if (patron != null) {
            patron.setName(newName);
            System.out.println("Updated patron: " + patron);
        } else {
            System.out.println("Patron not found.");
        }
    }

    public Patron findById(String id) {
        return patrons.get(id);
    }
}
