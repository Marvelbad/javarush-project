package ru.javarush.java.core.level14.task13;

public class Solution {
    public static void main(String[] args) {
        // Регистрируем книгу, у которой пока есть только название
        Book first = new Book("Загадочный роман"); // pageCount должен стать 0 по умолчанию

        // Регистрируем книгу с названием и количеством страниц
        Book second = new Book("Путешествие по космосу", 500);

        // Выводим значения полей для обеих книг (по очереди: название, затем количество страниц)
        System.out.println(first.bookTitle);
        System.out.println(first.pageCount);
        System.out.println(second.bookTitle);
        System.out.println(second.pageCount);
    }
}

// "Форма" для книги: хранит название и количество страниц
class Book {
    String bookTitle; // название книги
    int pageCount;    // количество страниц

    // Конструктор: только название, страниц по умолчанию 0
    Book(String bookTitle) {
        this.bookTitle = bookTitle;
        this.pageCount = 0; // значение по умолчанию
    }

    // Конструктор: название и количество страниц
    Book(String bookTitle, int pageCount) {
        this.bookTitle = bookTitle;
        this.pageCount = pageCount;
    }
}