package ru.javarush.java.core.level09.task20;

public class Solution {
    public static void main(String[] args) {
        // Инициализация стартовой фразы в StringBuilder
        StringBuilder sb = new StringBuilder("Я люблю Java!");

        // 1) Удаляем слово "люблю" вместе со следующим пробелом,
        // чтобы не осталось двойного пробела между "Я" и "Java!"
        int loveStart = sb.indexOf("люблю");
        sb.delete(loveStart, loveStart + "люблю ".length());

        // 2) Заменяем "Java" на "программирование"
        int javaStart = sb.indexOf("Java");
        sb.replace(javaStart, javaStart + "Java".length(), "программирование");

        // 3) Выводим обновлённую фразу
        System.out.println(sb);
    }
}