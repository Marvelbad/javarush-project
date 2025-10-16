package ru.javarush.java.core.level09.task18;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с исходной фразой
        StringBuilder builder = new StringBuilder("Привет, мир!");

        // Находим позицию запятой
        int indexOfComma = builder.indexOf(",");

        // В исходной строке после запятой стоит пробел,
        // поэтому вставляем после запятой и пробела (+2)
        int insertPos = indexOfComma + 2;

        builder.insert(insertPos, "Java ");

        // Вставляем подстроку "Java " (с пробелом в конце)


        // Выводим результат
        System.out.println(builder);
    }
}