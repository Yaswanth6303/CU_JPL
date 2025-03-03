package org.example.MyMavenProject.classwork.Mar01.oldshelf;

public class Book implements Comparable<Book> {
	private final String bookName;
	private final Integer bookId;
	
	public Book(String bookName, Integer bookId) {
		this.bookName = bookName;
		this.bookId = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public Integer getBookId() {
		return bookId;
	}

	@Override
	public int compareTo(Book o) {
		if (bookId > o.bookId) {
			return 1;
		} else if (bookId < o.bookId) {
			return -1;
		} else {
			return 0;
		}
	}
}
