package org.picokernel.books.resources.models;

import java.util.Objects;

public class BookInfo {
    private String name;
    private String isbn;
    private String author;
    private String publisher;

    public BookInfo() {
    }

    public BookInfo(String name, String isbn, String author, String publisher) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookInfo bookInfo = (BookInfo) o;
        return getName().equals(bookInfo.getName()) && getIsbn().equals(bookInfo.getIsbn()) && getAuthor().equals(bookInfo.getAuthor()) && getPublisher().equals(bookInfo.getPublisher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getIsbn(), getAuthor(), getPublisher());
    }
}
