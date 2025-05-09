package org.example.MyMavenProject.classwork.Mar01.oldshelf;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class OldBookShelfTest {
	private OldBookShelf shelf;
	
	@BeforeEach
	void setUp() {
		shelf = new OldBookShelf();
		shelf.addBook(new Book("Atomic Habits", 101));
		shelf.addBook(new Book("Rich Dad Poor Dad", 102));
		shelf.addBook(new Book("Python Programming", 103));
		shelf.addBook(new Book("Java Programming", 104));
	}
	
	@Test
	void testAddBook() {
		Book newBook = new Book("Rust Programming", 201);
		shelf.addBook(newBook);
		
		Book retrievedBook = shelf.getBook("Rust Programming");
		assertNotNull(retrievedBook);
		assertEquals(newBook.getName(), retrievedBook.getName());
		assertEquals(newBook.getBookId(), retrievedBook.getBookId());
	}
	
	@Test
	void testAddNullBook() {
		shelf.addBook(null);
		assertNotNull(shelf.getBook("Java Programming"));
		assertNull(shelf.getBook("Rust Programming"));
	}
	
	@Test
	void testGetBook() {
		Book book = shelf.getBook("Atomic Habits");
		assertNotNull(book);
		assertEquals("Atomic Habits", book.getName());
	}
	
	@Test
	void testGetBookNotFound() {
		Book book = shelf.getBook("Go Lang Book");
		assertNull(book);
	}
	
	@Test
	void testGetBooks() {
		Book book = new Book("Java Programming", 104);
		shelf.addBook(book);
		
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
