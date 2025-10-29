package ru.javarush.java.core.level20.task13;

public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа интерфейса и присваиваем ей лямбда-выражение,
        // которое просто печатает полученное сообщение
        MessagePrinter printer = System.out::println;

        // Вызываем метод и выводим сообщение на экран
        printer.print("Привет, Java!");
    }

    @FunctionalInterface
    interface MessagePrinter {
        void print(String message);
    }
}