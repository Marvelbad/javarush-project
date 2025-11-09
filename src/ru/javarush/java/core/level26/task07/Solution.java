package ru.javarush.java.core.level26.task07;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // TreeSet автоматически сортирует строки по алфавиту и не допускает дубликатов
        Set<String> names = new TreeSet<>();

        // Добавляем первых трёх зарегистрировавшихся (порядок добавления произвольный)
        names.add("Борис");
        names.add("Алексей");
        names.add("Виктор");

        // Выводим список участников в алфавитном порядке
        System.out.println(names);
    }
}