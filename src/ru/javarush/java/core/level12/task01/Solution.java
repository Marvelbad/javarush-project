package ru.javarush.java.core.level12.task01;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список для хранения числовых идентификаторов артефактов
        List<Integer> artefacts = new ArrayList<Integer>();

        // Добавляем идентификатор 42 в список
        artefacts.add(42);

        // Получаем первый элемент списка по индексу 0
        Integer i = artefacts.get(0);

        // Выводим значение первого элемента на экран
        System.out.println(i);
    }
}