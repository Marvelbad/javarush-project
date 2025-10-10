package ru.javarush.java.core.level07.task11;

public class Solution {
    public static void main(String[] args) {
        // Создаем двумерный массив размером 3 строки и 4 столбца
        int[][] warehouseInventory = new int[3][4];

        // Переменная для заполнения массива числами от 1 до 12
        int numbers = 1;

        // Проходим по строкам
        for (int row = 0; row < warehouseInventory.length; row++) {
        // Вложенные циклы для заполнения массива
            for (int col = 0; col < warehouseInventory[row].length; col++) {
                warehouseInventory[row][col] = numbers;
                numbers++;
            }
        }
        // Вывод значения из второй строки и третьего столбца
        System.out.println(warehouseInventory[1][2]);
        // Индексы в массиве начинаются с 0, поэтому вторая строка — это индекс 1, третий столбец — это индекс 2
    }
}