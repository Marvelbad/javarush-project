package ru.javarush.java.core.level03.task12;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную roomTemperature типа int
        int roomTemperature = 22;
        boolean isComfortable = false;

        // Проверяем, находится ли roomTemperature в диапазоне от 20 до 25 включительно
        if (roomTemperature >= 20 && roomTemperature <= 25) {
            isComfortable = true;
            System.out.println(isComfortable);
        }

        // Выводим значение переменной isComfortable на экран

    }
}