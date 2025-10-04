package ru.javarush.java.core.level14.task18;

public class Solution {
    public static void main(String[] args) {

        Book standardBook = new Book();
        // Выводим стандартные значения на экран
        System.out.println(standardBook.bookTitle);
        System.out.println(standardBook.pageCount);
    }
}

// "Шаблон" книги с начальными значениями полей прямо при объявлении
class Book {
    String bookTitle = "Без названия";
    int pageCount = 100;
}