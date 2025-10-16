package ru.javarush.java.core.level09.task15;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две строковые переменные с начальными значениями
        String first = "apple";
        String second = "banana";

        int result1 = first.compareTo(second);
        System.out.println(result1);

        // Меняем значения переменных местами
        String temp = first;
        first = second;
        second = temp;

        // Повторяем сравнение после обмена
        int result2 = first.compareTo(second);
        System.out.println(result2);
    }
}