package org.example.MyMavenProject.classwork.Feb22;

import java.util.ArrayList;
import java.util.List;

public class OldBookShelf {
    private final List<Book> bookShelf;

    public OldBookShelf() {
        this.bookShelf = new ArrayList<>();
    }

    /**
     * Given a book, adds the book to the shelf.
     * If the parameter is null, no action is taken.
     *
     * @param b book to add
     */
    public void addBook(Book b) {
        if (b != null) {
            bookShelf.add(b);
        }
    }

    /**
     * Retrieves the first book with the given name.
     *
     * @param name name of the book
     * @return a book if a book with the name exists, else null
     */
    public Book getBook(String name) {
        for (Book book : bookShelf) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Retrieves all books with the given name.
     *
     * @param name name of the book
     * @return an array of Books with the same name, else an empty array
     */
    public Book[] getBooks(String name) {
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : bookShelf) {
            if (book.getName().equals(name)) {
                matchingBooks.add(book);
            }
        }

        Book[] matchingBooksArray = new Book[matchingBooks.size()];

        for (int i = 0; i < matchingBooks.size(); i++) {
            matchingBooksArray[i] = matchingBooks.get(i);
        }

        return matchingBooksArray;
    }


    public static void main(String[] args) {
        OldBookShelf shelf = new OldBookShelf();

        shelf.addBook(new Book("Java Programming", 1001));
        shelf.addBook(new Book("Python Basics", 1002));
        shelf.addBook(new Book("Java Programming", 1003));

        Book book = shelf.getBook("Java Programming");
        System.out.println("First book found: " + book);

        Book[] books = shelf.getBooks("Java Programming");
        System.out.println("All books with name Java Programming :");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
