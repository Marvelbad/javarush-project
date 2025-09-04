package ru.javarush.java.core.level03.task15;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем переменные для условий допуска
        boolean hasInvitation = true;
        boolean dressCodeMet = false;
        boolean passwordIsCorrect = true;

        // Основное логическое выражение без дополнительных скобок
        boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect;

        // Выражение с группировкой первых двух условий
        boolean admitted2 = (hasInvitation && dressCodeMet) && passwordIsCorrect;

        // Выражение с группировкой последних двух условий
        boolean admitted3 = hasInvitation && (dressCodeMet && passwordIsCorrect);

        // Выводим результаты всех трёх выражений на экран
        System.out.println(admitted);
        System.out.println(admitted2);
        System.out.println(admitted3);

    }
}