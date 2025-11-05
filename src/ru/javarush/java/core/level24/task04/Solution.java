package ru.javarush.java.core.level24.task04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {
            throw new FileNotFoundException("Отчёт не найден!");
            // Имитация поиска отчёта: намеренно бросаем исключение

        } catch (FileNotFoundException e) {
            System.out.println("Отчёт не найден");
            // Самый специфичный план: файл отсутствует
        } catch (IOException e) {
            System.out.println("Общие проблемы с доступом к данным");
            // Более общий план: проблемы ввода-вывода
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ситуация");
            // Самый общий план: любая другая непредвиденная ситуация
        }
    }
}