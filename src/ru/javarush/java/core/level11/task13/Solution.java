package ru.javarush.java.core.level11.task13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Solution {

    // Метод объявляет проброс исключения: обработка ошибки перекладывается на вызывающий код
    public static void accessSecretDocument(String documentPath) throws FileNotFoundException {
        // Пытаемся открыть файл по указанному пути.
        FileReader reader = new FileReader(documentPath);
        // Если файл не найден, конструктор FileReader выбросит FileNotFoundException.
    }



    // Небольшая демонстрация использования
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length > 0) {
            accessSecretDocument(args[0]);
        }
    }
}