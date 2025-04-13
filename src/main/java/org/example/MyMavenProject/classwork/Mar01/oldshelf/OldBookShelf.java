package org.example.MyMavenProject.classwork.Mar01.oldshelf;

import java.util.ArrayList;
import java.util.List;

public class OldBookShelf {

	List<Book> listOfBooks;

	public OldBookShelf() {
		this.listOfBooks = new ArrayList<>();
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
			this.listOfBooks.add(b);
		}
	}

	/**
	 * 
	 * @param name of the book
	 * @return a book if a book with a name exists else null
	 */
	public Book getBook(String name) {
		int length = this.listOfBooks.size();
		
		for (int i = 0 ; i < length; ++i) {
			Book book = this.listOfBooks.get(i);

			String bookName = book.getName();
			if (bookName.equals(name))
				return book;
		}
		
		return null;
	}

	/**
	 * 
	 * @param name - name of the book
	 * @return an array of Books with the same name else an empty Array
	 */
	public Book[] getBooks(String name) {
		List<Book> books = new ArrayList<>();
		for (Book book:  this.listOfBooks) {
			if (book.getName().equals(name) ) {
				books.add(book);
			}
		}
		return books.toArray(new Book[10]);
	}

}
