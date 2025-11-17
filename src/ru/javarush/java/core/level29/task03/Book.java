package ru.javarush.java.core.level29.task03;

import java.util.Objects;

public class Book {
    private String bookTitle;
    private String bookAuthor;

    public Book(String title, String author) {
        this.bookTitle = title;
        this.bookAuthor = author;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookTitle, book.bookTitle) &&
                Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor);
    }
}
