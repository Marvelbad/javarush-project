package ru.javarush.java.core.level06.task05;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную journeyDistance и присваиваем ей значение 150.0 (световых лет)
        double journeyDistance = 150.0;
        // Объявляем переменную travelTime и присваиваем ей значение 2.5 (земных циклов)
        double travelTime = 2.5;

        // Вычисляем среднюю скорость: расстояние делим на время
        double speedResult = journeyDistance / travelTime;

        // Выводим результат вычисления средней скорости на экран
        System.out.println(speedResult);
    }
}