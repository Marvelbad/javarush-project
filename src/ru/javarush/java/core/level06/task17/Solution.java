package ru.javarush.java.core.level06.task17;

public class Solution {
    public static void main(String[] args) {
        // Общая масса материала в килограммах
        double totalMaterialWeight = 7.89;

        // Явно приводим double к int — дробная часть отбрасывается
        int completeItemsCount = (int) totalMaterialWeight;

        // Выводим количество целых предметов
        System.out.println(completeItemsCount);
    }
}