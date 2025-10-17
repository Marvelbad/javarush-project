package ru.javarush.java.core.level12.task09;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем объект Path для файла "note.txt" в текущей директории
        Path path = Path.of("note.txt");

        // Строка, которую нужно записать в файл
        String text = "Сегодня отличный день!";

        // Записываем строку в файл с использованием кодировки UTF-8
        Files.writeString(path, text, StandardCharsets.UTF_8);
    }
}