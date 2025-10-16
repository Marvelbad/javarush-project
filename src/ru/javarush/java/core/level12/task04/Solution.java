package ru.javarush.java.core.level12.task04;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строк из консоли
        Scanner scanner = new Scanner(System.in);

        // Динамический список для хранения задач
        List<String> list = new ArrayList<>();

        // Считываем строки до тех пор, пока не введена пустая строка
        while (true) {
            String line = scanner.nextLine();
            if (line.isBlank()) break;
            list.add(line);
        }
        scanner.close();

        // добавляем задачу в список

        // Выводим задачи в обратном порядке: от последней к первой
        Collections.reverse(list);
        for (String text : list) {
            System.out.println(text);
        }
    }
}