package ru.javarush.java.core.level06.task13;

public class Solution {
    public static void main(String[] args) {
        // Исходная оценка количества металла (в тоннах) с дробной частью
        double rawMetalEstimate = 789.456;

        // Округляем до ближайшего целого числа с помощью Math.round (результат типа long)
        long res = Math.round(rawMetalEstimate);

        // Выводим округленное значение на экран
        System.out.println(res);
    }
}