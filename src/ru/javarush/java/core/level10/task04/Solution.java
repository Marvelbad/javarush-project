package ru.javarush.java.core.level10.task04;

public class Solution {
    public static void main(String[] args) {
        // Строковое значение, пришедшее от датчика
        String sensorReadingText = "NaN";

        // Преобразуем строку в число типа double с помощью класса Double
        double parsedSensorData = Double.parseDouble(sensorReadingText);

        // Проверяем, является ли полученное значение "не числом" (NaN)
        boolean naN = Double.isNaN(parsedSensorData);

        // Выводим результат проверки (true/false)
        System.out.println(naN);
    }
}