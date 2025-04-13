package org.example.MyMavenProject.classwork.Mar01.oldshelf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void testCompareEqual() {
        Book book1 = new Book("Java Programming", 101);
        Book book2 = new Book("Python Programming", 101);
        
        assertEquals(0, book1.compareTo(book2), "Books with the same ID should be equal.");
    }

    @Test
    void testCompareSmaller() {
        Book book1 = new Book("Java Programming", 101);
        Book book2 = new Book("Python Programming", 102);
        
        assertEquals(-1, book1.compareTo(book2), "Book with a smaller ID should be less.");
    }

    @Test
    void testCompareLarger() {
        Book book1 = new Book("Java Programming", 103);
        Book book2 = new Book("Python Programming", 102);
        
        assertEquals(1, book1.compareTo(book2), "Book with a larger ID should be greater.");
    }
}
