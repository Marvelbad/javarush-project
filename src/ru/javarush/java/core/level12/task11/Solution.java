package ru.javarush.java.core.level12.task11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 1) Создаем массив байтов с ASCII-кодами букв H, I, J
        byte[] byteArray = {72, 73, 74};

        // 2) Записываем массив в бинарный файл "letters.bin"
        Path filePath = Path.of("letters.bin");
        Files.write(filePath, byteArray);

        // 3) Читаем содержимое файла обратно в новый массив байтов
        byte[] bytes = Files.readAllBytes(filePath);

        // 4) Выводим каждый байт как символ, разделяя пробелами
        for (int i = 0; i < bytes.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print((char) bytes[i]);
        }
    }
}