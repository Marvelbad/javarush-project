package ru.javarush.java.core.level11.task03;

public class Solution {
    public static void main(String[] args) {
        // Объявляем строковую переменную playerAgeInput и присваиваем ей некорректное число
        String playerAgeInput = "abc";
        
        // Пытаемся преобразовать строку в целое число и вывести результат.
        try {
            System.out.println(Integer.parseInt(playerAgeInput));
        } catch (NumberFormatException e) {
            System.out.println(e.getClass().getSimpleName());
        }
        // При выполнении Integer.parseInt будет выброшено исключение NumberFormatException,
        // поскольку "abc" не является корректным представлением целого числа.

    }
}