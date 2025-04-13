package org.example.MyMavenProject.classwork.Mar01.oldshelf;

public class Book implements Comparable<Book> {
	private final String name;
	private final Integer bookId;
	
	public Book(String bName, Integer bId) {
		this.name = bName;
		this.bookId = bId;
	}

	public String getName() {
		return name;
	}

	public Integer getBookId() {
		return bookId;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if (bookId == o.bookId) {
			return 0;
		} else if (bookId < o.bookId) {
			return -1;
		}
		return 1;
	}
}

