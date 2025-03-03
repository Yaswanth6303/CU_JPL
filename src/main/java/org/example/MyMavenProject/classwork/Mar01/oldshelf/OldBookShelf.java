package org.example.MyMavenProject.classwork.Mar01.oldshelf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OldBookShelf {
	
	List<Book> books;
	
	public OldBookShelf() {
		this.books = new ArrayList<Book>();
	}
	
	/**
	 * Given a book adds the book to the shelf if the parameter is null, no action
	 * is taken;
	 * 
	 * @param b book to add
	 * @return void
	 */
	public void addBook(Book b) {
		if (b != null) {
			books.add(b);
		}
	}
	
	/**
	 * @param name of the book
	 * @return a book if a book with a name exists else null
	 */
	public Book getBook(String name) {
		for (Book book : books) {
			if (book.getBookName().equals(name)) {
				return book;
			}
		}
		return null;
	}
	
	/**
	 * @param name - name of the book
	 * @return an array of Books with the same name else an empty Array
	 */
	public Book[] getBooks(String name) {
		List<Book> listOfBooks = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getBookName().equals(name)) {
				listOfBooks.add(book);
			}
		}
		return books.toArray(new Book[0]);
	}
}
