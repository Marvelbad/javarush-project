package ru.javarush.java.core.level02.task10;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа int для хранения номера рейса
        int number = 23;

        // Объявляем переменную типа String для хранения города назначения
        String target = "Zimbabva";

        // Объединяем номер рейса и город назначения в одну строку с помощью оператора +
        String result = "Рейс " + number + " " + "до " + target;

        // Выводим итоговую строку на экран
        System.out.println(result);
    }
}