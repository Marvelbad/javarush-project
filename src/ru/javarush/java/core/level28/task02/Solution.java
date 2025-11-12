package ru.javarush.java.core.level28.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем изменяемый список с исходными названиями животных
        List<String> animalsList = new ArrayList<>(Arrays.asList(
                "cat",
                "elephant",
                "dog",
                "tiger",
                "rat",
                "lion"
        ));

        // Удаляем все строки, длина которых меньше 4 символов
        // removeIf принимает условие (Predicate): если возвращает true — элемент удаляется
        animalsList.removeIf(s -> s.length() < 4);

        // Выводим обновленный список после фильтрации
        System.out.println(animalsList);
    }
}