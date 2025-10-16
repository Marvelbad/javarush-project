package ru.javarush.java.core.level09.task17;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с начальным содержимым "Java"
        StringBuilder builder = new StringBuilder("Java");

        // Добавляем к строке нужную фразу с помощью метода append()
        builder.append(" - это круто!");
        // Выводим итоговую строку на экран
        System.out.println(builder);
    }
}