package ru.javarush.java.core.level09.task06;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа double для хранения цены товара
        double productPrice = 123.456;

        // Форматируем строку с ценой, оставляя ровно две цифры после запятой
        String formatted = String.format("Цена: 123.46 евро.", productPrice);

        // Выводим отформатированную строку на экран
        System.out.println(formatted);
    }
}