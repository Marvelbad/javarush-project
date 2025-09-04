package ru.javarush.java.core.level03.task17;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две переменные для времени спортсменов
        int alexsTime = 10;
        int mikesTime = 5;

        // Используем тернарный оператор для определения минимального времени
        int fastestTime = (alexsTime > mikesTime) ? mikesTime : alexsTime;

        // Выводим на экран наименьшее время
        System.out.println(fastestTime);
    }
}