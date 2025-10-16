package ru.javarush.java.core.level09.task14;

public class Solution {
    public static void main(String[] args) {
        // Исходное имя файла
        String filename = "document.pdf";

        // Проверяем, начинается ли строка с "doc"
        boolean doc = filename.startsWith("doc");

        // Проверяем, заканчивается ли строка на ".pdf"
        boolean endsWith = filename.endsWith(".pdf");

        // Выводим результаты через пробел: сначала startsWith, затем endsWith
        System.out.println(doc + " " + endsWith);
    }
}