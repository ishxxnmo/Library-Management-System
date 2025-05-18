# Library Management System (Java, Terminal-Based)

This is a Java-based terminal Library Management System designed to demonstrate:

- Object-Oriented Programming (OOP)
- SOLID Principles
- Basic Design Patterns

The system provides basic functionality for managing books and patrons through a simple terminal interface.

---

## Features

- Add a new book
- Display all book titles
- Search a book by ISBN
- Menu-driven terminal interface
- Structured for extensibility (e.g., book checkout, reservations)

---

## SOLID Principles Applied

- **Single Responsibility**: Each class has one clear responsibility (e.g., `BookInventoryManager` handles books).
- **Open/Closed**: The system is easy to extend without modifying existing logic.
- **Liskov Substitution**: Follows good inheritance practices (where applicable).
- **Interface Segregation**: Can be adapted to support UI or API without enforcing unused methods.
- **Dependency Inversion**: `LendingManager` depends on abstraction (via `BookInventoryManager`) instead of direct manipulation.

---

## Project Structure

![LMS](https://github.com/user-attachments/assets/2380e73e-3394-4a2b-8101-8b882791c869)
