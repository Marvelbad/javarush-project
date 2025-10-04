package ru.javarush.java.core.level11.task04;

public class Solution {
    public static void main(String[] args) {
        // Объявляем строковую переменную и явно присваиваем ей значение null
        String secretAgentName = null;

        // Пытаемся получить длину строки и вывести её на экран.
        System.out.println(secretAgentName.length());
        // Здесь произойдет NullPointerException, т.к. метод вызывается у null.

    }
}