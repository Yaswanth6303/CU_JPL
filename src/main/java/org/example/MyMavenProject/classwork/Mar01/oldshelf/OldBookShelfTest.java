package org.example.MyMavenProject.classwork.Mar01.oldshelf;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OldBookShelfTest {
    private OldBookShelf shelf;

    @BeforeEach
    void setUp() {
        shelf = new OldBookShelf();
        shelf.addBook(new Book("Java Programming", 1001));
        shelf.addBook(new Book("Python Basics", 1002));
        shelf.addBook(new Book("Java Programming", 1003));
    }

    @Test
    void testAddBook() {
        Book newBook = new Book("C++ Basics", 1004);
        shelf.addBook(newBook);

        Book retrievedBook = shelf.getBook("C++ Basics");
        assertNotNull(retrievedBook);
        assertEquals(newBook.getName(), retrievedBook.getName());
        assertEquals(newBook.getBookId(), retrievedBook.getBookId());
    }

    @Test
    void testAddNullBook() {
        shelf.addBook(null);
        assertNotNull(shelf.getBook("Java Programming"));
    }

    @Test
    void testGetBook() {
        Book book = shelf.getBook("Java Programming");
        assertNotNull(book);
        assertEquals("Java Programming", book.getName());
    }

    @Test
    void testGetBookNotFound() {
        Book book = shelf.getBook("Nonexistent Book");
        assertNull(book);
    }

    @Test
    void testGetBooks() {
        Book[] books = shelf.getBooks("Java Programming");
        assertEquals(2, books.length);
        assertEquals("Java Programming", books[0].getName());
        assertEquals("Java Programming", books[1].getName());
    }

    @Test
    void testGetBooksEmpty() {
        Book[] books = shelf.getBooks("Nonexistent Book");
        assertEquals(0, books.length);
    }
}
