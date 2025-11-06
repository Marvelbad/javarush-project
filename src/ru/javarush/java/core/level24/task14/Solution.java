package ru.javarush.java.core.level24.task14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws Exception {
        // try-with-resources автоматически закроет файл после работы
        try (BufferedReader reader = new BufferedReader(new FileReader("game_config.txt"))) {
            String line = reader.readLine();
            int level = Integer.parseInt(line);
            System.out.println(level);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}