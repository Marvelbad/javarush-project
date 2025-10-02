package ru.javarush.java.core.level07.task03;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Объявляем массив для хранения четырёх показаний датчиков
        double[] sensorReadings = new double[4];

        // В элемент с индексом 2 (третий по счёту) записываем значение 3.14
        sensorReadings[2] = 3.14;

        // Выводим все значения массива в одну строку, разделяя их пробелом
        for (int i = 0; i < sensorReadings.length; i++) {
            System.out.print(sensorReadings[i]);
            if (i < sensorReadings.length - 1) {
                System.out.print(" ");
            }
        }
    }
}