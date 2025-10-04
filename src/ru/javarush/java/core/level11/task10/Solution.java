package ru.javarush.java.core.level11.task10;

public class Solution {
    // Метод выводит положительный счёт или генерирует исключение для неположительных значений
    public static void displayPositiveScore(int currentScore) {
        if (currentScore > 0) {
            System.out.println(currentScore);
        } else {
            // Генерируем IllegalArgumentException с требуемым сообщением
            throw new IllegalArgumentException("Невозможно отобразить отрицательный счёт! Число отрицательное.");
        }
    }

    public static void main(String[] args) {
        // Корректный вызов: положительное значение
        displayPositiveScore(50);

        // Некорректный вызов: отрицательное значение, перехватываем исключение
        try {
            displayPositiveScore(-10);
        }
        // Выводим сообщение перехваченного исключения
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}