package ru.javarush.java.core.level04.task01;

public class Solution {
    public static void main(String[] args) {
        // Инициализируем переменную для обратного отсчета
        int countDown = 3;

        // Цикл while выполняется, пока значение countdown больше 0
        while (countDown > 0) {
            // Выводим текущее значение countdown
            System.out.println(countDown);
            // Уменьшаем значение countdown на 1
            countDown--;
        }

        // После завершения цикла выводим сообщение "Старт!"
        System.out.println("Старт!");
    }
}