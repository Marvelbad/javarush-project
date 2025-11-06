package ru.javarush.java.core.level24.task17;

import java.io.BufferedReader;
import java.io.FileReader;

public class Solution {
    public static void main(String[] args) {
        // Используем try-with-resources, чтобы поток автоматически закрылся
        try (BufferedReader reader = new BufferedReader(new FileReader("article_text.txt"))) {
            String line = reader.readLine();
            System.out.println(line);
        } catch (Exception e) {
            System.out.println("Ошибка чтения статьи!");
        }
    }
}