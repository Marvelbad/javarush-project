package ru.javarush.java.core.level07.task07;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив с быстрой инициализацией
        int[] itemPrices = {5, 7, 2, 9};

        // Переменная для хранения суммы
        int totalPrice = 0;

        // Суммируем все элементы массива
        for (int price : itemPrices) {
            totalPrice += price;
        }

        // Выводим итоговую сумму на экран
        System.out.println(totalPrice);
    }
}