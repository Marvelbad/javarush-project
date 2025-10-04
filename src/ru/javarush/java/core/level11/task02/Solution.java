package ru.javarush.java.core.level11.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив collectedGems длиной 3
        int[] collectedGems = {10, 20, 30};

        // Пытаемся вывести элемент по индексу 5.
        try {
            System.out.println(collectedGems[5]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getClass().getSimpleName());
        }
        // В массиве всего 3 элемента (индексы 0..2), поэтому ниже возникнет исключение
        // ArrayIndexOutOfBoundsException.

    }
}