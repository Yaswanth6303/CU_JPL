package org.example.MyMavenProject.classwork.Mar01.oldshelf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OldBookShelfTests {
    static String[] BookNames = new String[] {
            "The Art of Computer Programming",
            "Algorithms",
            "Compilers",
            "Core Java",
            "Types and Programming Languages"
    };

    static Integer[] ids = new Integer[] {
    		101, 102, 103, 104, 105
    };

    OldBookShelf oldShelfOne;

    @BeforeEach
    void setUp() {
        this.oldShelfOne = new OldBookShelf();
        int numBooks = BookNames.length;
        
        for (int i = 0; i < numBooks; ++i) {
            Book b = new Book(BookNames[i], ids[i]);
            this.oldShelfOne.addBook(b);
        }
    }

    @AfterEach
    void tearDown() {
        oldShelfOne = null;
    }

    @Test
    void testAddBook() {
        Book b = new Book("Java Concurrency In Practice", 201);
        this.oldShelfOne.addBook(b);
        
        Book retrievedBook = this.oldShelfOne.getBook(b.getName());
        assertNotNull(retrievedBook);
        assertEquals(b.getName(), retrievedBook.getName());
        assertEquals(b.getBookId(), retrievedBook.getBookId());
    }

    @Test
    void testGetBook_Found() {
        Book b = this.oldShelfOne.getBook("Core Java");
        assertNotNull(b);
        assertEquals("Core Java", b.getName());
    }

    @Test
    void testGetBook_NotFound() {
        Book b = this.oldShelfOne.getBook("Non-Existing Book");
        assertNull(b);
    }

    @Test
    void testGetBooks_Found() {
        oldShelfOne.addBook(new Book("Core Java", 106)); // Adding duplicate name
        Book[] books = this.oldShelfOne.getBooks("Core Java");
        assertNotNull(books);
        assertEquals(2, books.length);
    }

    @Test
    void testGetBooks_NotFound() {
        Book[] books = this.oldShelfOne.getBooks("Calculus");
        assertNotNull(books);
        assertEquals(0, books.length);
    }

    @Test
    void testGetBooks_DuplicateEntries() {
        Book b1 = new Book("Java", 202);
        Book b2 = new Book("Java", 203);
        oldShelfOne.addBook(b1);
        oldShelfOne.addBook(b2);

        Book[] books = this.oldShelfOne.getBooks("Java");
        assertNotNull(books);
        assertEquals(2, books.length);
        assertEquals("Java", books[0].getName());
        assertEquals("Java", books[1].getName());
    }
}
