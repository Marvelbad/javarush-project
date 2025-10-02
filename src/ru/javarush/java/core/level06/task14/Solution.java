package ru.javarush.java.core.level06.task14;

public class Solution {
    public static void main(String[] args) {
        // Исходная цена эликсира с налогом
        double elixirPriceWithTax = 17.34567;

        // Округляем до двух знаков после запятой:
        // Умножаем на 100, округляем с помощью Math.round, затем делим на 100.0
        double displayPrice = Math.round(elixirPriceWithTax * 100) / 100.0;


        // Выводим округлённую цену на экран
        System.out.println(displayPrice);
    }
}