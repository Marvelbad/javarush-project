package ru.javarush.java.core.level07.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив чисел с плавающей точкой длиной 5
        int[] roundScores = new int[10];

        // Заполняем массив числами от 0.5, увеличивая каждый раз на 0.5
        for (int i = 0; i < roundScores.length; i++) {
            roundScores[i] = i + 1;
        }
        // Выводим все элементы массива в одну строку через пробел
        for (int i = 0; i < roundScores.length; i++) {
            System.out.print(roundScores[i]);
            if (i < roundScores.length - 1) {
                System.out.print(" ");
            }
        }
        // Выводим текущий элемент массива

        // Добавляем пробел между элементами, кроме последнего


    }
}