package ru.javarush.java.core.level26.task09;

import ru.javarush.java.core.level21.task12.B;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем дженерик-коллекцию для хранения книг (каталог)
        List<Book> catalog = new ArrayList<>();

        // Добавляем две разные книги с разными названиями и авторами
        catalog.add(new Book("War and piece", "Tolstoy"));
        catalog.add(new Book("Master and Margarita", "Bulgakov"));

        // Перебираем каталог и выводим название и автора каждой книги
        for (Book book : catalog) {
            String formatted = String.format("Book: %s, Author: %s", book.getTitle(), book.getAuthor());
            System.out.println(formatted);
        }
    }
}

// Отдельный класс, представляющий книгу: хранит название и автора
class Book {
    private final String title;
    private final String author;

    // Конструктор инициализирует поля книги
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттеры для доступа к полям
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}