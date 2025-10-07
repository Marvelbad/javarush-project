package ru.javarush.java.core.level08.task12;

public class Solution {

    // Метод с возвращаемым значением int: принимает массив оценок и возвращает их сумму
    public static int calculateTotalGrades(int[] studentExamResults) {

        // Проходим по всем элементам массива и накапливаем сумму
        int result = 0;
        for (int i = 0; i < studentExamResults.length; i++) {
            int number = studentExamResults[i];
            result += number;
        }
        // Возвращаем итоговую сумму
        return result;
    }

    public static void main(String[] args) {
        // Виртуальный список оценок студента
        int[] currentGrades = {5, 4, 3, 5, 4};

        // Вызываем метод подсчёта и сохраняем результат в переменную finalTotalPoints
        int finalTotalPoints = calculateTotalGrades(currentGrades);

        // Выводим результат на экран
        System.out.println("Сумма всех оценок: " + finalTotalPoints);
    }
}