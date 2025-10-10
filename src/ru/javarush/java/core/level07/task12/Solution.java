package ru.javarush.java.core.level07.task12;

public class Solution {
    public static void main(String[] args) {
        // Создаем двумерный массив для хранения показаний (2 строки, 5 столбцов)
        int[][] sensorData = new int[2][5];
        // Начальное значение для заполнения массива
        int value = 10;
        // Заполняем массив по строкам, слева направо
        for (int i = 0; i < sensorData.length; i++) {
            for (int j = 0; j < sensorData[i].length; j++) {
                sensorData[i][j] = value++;
            }
        }
        // Выводим массив в виде таблицы
        for (int i = 0; i < sensorData.length; i++) {
            for (int j = 0; j < sensorData[i].length; j++) {
                // Печатаем значение элемента
                System.out.print(sensorData[i][j]);
                // Если это не последний элемент в строке, добавляем пробел
                if (j < sensorData[i].length - 1) {
                    System.out.print(" ");
                }
            }
            // После каждой строки переходим на новую
            System.out.println();
        }
    }
}