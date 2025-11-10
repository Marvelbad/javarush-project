package ru.javarush.java.core.level27.task04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Создаем множество HashSet<String> для хранения технологи
        Set<String> technologies = new HashSet<>();

        // Добавляем названия технологий
        technologies.add("java");
        technologies.add("python");
        technologies.add("c++");
        technologies.add("javascript");

        // Удаляем элементы, содержащие символ '+', используя итератор
        Iterator<String> it = technologies.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("+")) {
                it.remove();
            }
        }

        // Выводим оставшиеся элементы множества, каждый на новой строке (порядок не гарантируется)
        for (String str : technologies) {
            System.out.println(str);
        }
    }
}