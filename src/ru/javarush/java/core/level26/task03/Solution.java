package ru.javarush.java.core.level26.task03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Используем интерфейс List для хранения названий предметов
        List<String> subjects = new LinkedList<>();

        // Добавляем три основных предмета
        subjects.add("Математика");
        subjects.add("Физика");
        subjects.add("Информатика");

        // Вставляем "Английский" на первую позицию списка
        subjects.add(0, "Английский");

        // Удаляем предмет "Физика" из расписания
        subjects.remove(2);

        // Выводим итоговое расписание: каждый предмет с новой строки
        System.out.println(subjects);
    }
}