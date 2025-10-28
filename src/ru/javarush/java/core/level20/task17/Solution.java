package ru.javarush.java.core.level20.task17;

public class Solution {
    public static void main(String[] args) {
        // Демонстрация гибкости: две реализации одного интерфейса
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();

        String testMessage = "Тестовое сообщение";

        // Оба вызываем одинаково, но поведение разное
        consoleLogger.log(testMessage);              // Выведет: Тестовое сообщение
        fileLogger.log(testMessage);                 // Выведет: Лог записан в файл: Тестовое сообщение
    }

    static class ConsoleLogger implements Logger {
        @Override
        public void log(String message) {
            System.out.println(message);
        }
    }

    static class FileLogger implements Logger {
        @Override
        public void log(String message) {
            System.out.println("Лог записан в файл: " + message);
        }
    }

    interface Logger {
        void log(String message);
    }
}