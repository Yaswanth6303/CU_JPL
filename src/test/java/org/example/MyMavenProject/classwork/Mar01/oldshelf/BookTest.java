package org.example.MyMavenProject.classwork.Mar01.oldshelf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {
	
	@Test
	void testBookEqual() {
		Book book1 = new Book("Atomic Habits", 101);
		Book book2 = new Book("Rich Dad Poor Dad", 101);
		
		assertEquals(0, book1.compareTo(book2));
	}
	
	@Test
	void testBookLesser() {
		Book book1 = new Book("Atomic Habits", 101);
		Book book2 = new Book("Rich Dad Poor Dad", 102);
		
		assertEquals(-1, book1.compareTo(book2));
	}
	
	@Test
	void testBookGreater() {
		Book book1 = new Book("Atomic Habits", 101);
		Book book2 = new Book("Rich Dad Poor Dad", 102);
		
		assertEquals(1, book2.compareTo(book1));
	}
}
