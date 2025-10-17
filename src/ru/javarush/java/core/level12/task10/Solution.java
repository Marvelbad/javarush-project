package ru.javarush.java.core.level12.task10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Задаем путь к файлу "note.txt" с помощью класса Path
        Path filePath = Path.of("note.txt");

        // Считываем весь текст файла целиком удобным методом Files.readString
        String s = Files.readString(filePath);

        // Выводим считанное содержимое без добавления лишней новой строки
        System.out.println(s);
    }
}