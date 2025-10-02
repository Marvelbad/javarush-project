package ru.javarush.java.core.level06.task01;

public class Solution {
    public static void main(String[] args) {
        // Объявляем уровень персонажа (тип byte
        byte characterLevel = 64;
        // Объявляем показатель брони (тип short)
        short armorRating = 35;
        // Объявляем накопленный опыт (тип int)
        int experiencePoints = 8;
        // Объявляем количество золотых монет (тип long)
        long goldCoins = 3454456;
        // Объявляем сопротивление магии (тип float)
        float magicResistance = 3.14f;
        // Объявляем шанс критического удара (тип double)
        double criticalHitChance = 56.5;

        // Выводим каждую характеристику героя на новой строке
        System.out.println(characterLevel);
        System.out.println(armorRating);
        System.out.println(experiencePoints);
        System.out.println(goldCoins);
        System.out.println(magicResistance);
        System.out.println(criticalHitChance);
    }
}