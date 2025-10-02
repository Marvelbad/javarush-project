package ru.javarush.java.core.level06.task19;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа int и присваиваем ей значение 200
        int currentCityTemperature = 200;

        // Явно приводим значение переменной currentCityTemperature к типу byte
        byte sensorReading = (byte) currentCityTemperature;

        // Выводим результат на экран
        System.out.println(sensorReading);
    }
}