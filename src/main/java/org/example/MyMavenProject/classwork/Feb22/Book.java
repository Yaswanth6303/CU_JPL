package org.example.MyMavenProject.classwork.Feb22;

public class Book {
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
    public String toString() {
        return "Book{name='" + name + "', bookId=" + bookId + "}";
    }
}
