package ru.javarush.java.core.level02.task12;

public class Solution {
    public static void main(String[] args) {
        // Очки приходят как текстовые строки с отрицательными числами
        String numberOne = "-10";
        String numberTwo = "-25";

        // Преобразуем строки в числа типа int
        int numRes = Integer.parseInt(numberOne);
        int numRes2 = Integer.parseInt(numberTwo);

        // Складываем результаты двух раундов
        int totalRes = numRes + numRes2;

        // Выводим общий счёт на экран
        System.out.println(totalRes);
    }
}