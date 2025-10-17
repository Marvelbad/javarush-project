package ru.javarush.java.core.level12.task13;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // URL изображения, которое нужно скачать
        String imageUrl = "https://httpbin.org/image/png";
        // Имя файла, в который будет сохранено изображение
        String fileName = "image01.png";

        URL url = new URL(imageUrl);
        Files.copy(url.openStream(), Path.of(fileName));
        System.out.println("Изображение успешно загружено и сохранено как " + fileName);
    }
}