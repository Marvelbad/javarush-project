package ru.javarush.java.core.level07.task10;

public class Solution {
    public static void main(String[] args) {
        // Создаем двумерный массив строк 3x2 для отображения на табло
        String[][] displayGrid = new String[3][2];


        displayGrid[2][1] = "Hello";
        System.out.println(displayGrid[2][1]);
    }
}