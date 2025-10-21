package ru.javarush.java.core.level12.task16;

import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HttpClient из стандартной библиотеки Java
        HttpClient httpClient = HttpClient.newHttpClient();

        // Готовим GET-запрос на указанный URL
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/image/png"))
                .build();

        // Отправляем запрос и сразу получаем тело как массив байт
        HttpResponse<byte[]> response = httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray());

        // Извлекаем тип содержимого из заголовка Content-Type
        String contentType = response.headers().firstValue("Content-Type").orElse("unknown");

        // Определяем размер файла по длине массива байт ответа
        int contentLength = response.body().length;

        // 5. Выводим тип и размер
        System.out.printf("Тип: %s, Размер: %d байт%n", contentType, contentLength);

        // 6. Сохраняем файл
        Files.write(Path.of("image04.png"), response.body());

        // Сначала выводим информацию о типе и размере


        // Только после вывода сохраняем изображение на диск

    }
}