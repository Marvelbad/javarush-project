package ru.javarush.java.core.level27.task02;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // List хранит все предметы, включая повторы
        List<Integer> numbersOne = Arrays.asList(3, 7, 3, 9);

        // Set хранит только уникальные предметы (повторы игнорируются)
        Set<Integer> numbersTwo = new HashSet<>();

        // Добавляем идентификаторы 3, 7, 3, 9 в обе коллекции
        numbersTwo.add(3);
        numbersTwo.add(7);
        numbersTwo.add(3);
        numbersTwo.add(9);

        // Выводим количество: сначала общее (List), затем уникальное (Set)
        System.out.println(numbersOne);
        System.out.println(numbersTwo);
    }
}