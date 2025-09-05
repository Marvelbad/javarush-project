package ru.javarush.java.core.level04.task03;

public class Solution {
    public static void main(String[] args) {
        // Инициализируем переменную для номера кресла
        int placeNumber = 2;

        // Используем цикл while для перебора номеров кресел
        while (placeNumber <= 10) {
            // Выводим текущий номер кресла на новой строке
            System.out.println(placeNumber);
            // Увеличиваем номер кресла на 2
            placeNumber += 2;
        }
    }
}