package ru.javarush.java.core.level14.task12;

public class Solution {
    public static void main(String[] args) {
        Book first = new Book();
        Book second = new Book("Java для начинающих", 350);

        System.out.println("Книга: " + first.getBookTitle() + ", страниц: " + first.getNumberOfPages());
        System.out.println("Книга: " + second.getBookTitle() + ", страниц: " + second.getNumberOfPages());
    }
}
