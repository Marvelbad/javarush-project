package ru.javarush.java.core.level24.task13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws Exception {
        // try-with-resources автоматически закроет файл даже при ошибках
        try (BufferedReader reader = new BufferedReader(new FileReader("daily_transactions.txt"))) {
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            System.out.println("Число " + number);

        } catch (FileNotFoundException e) {
            System.out.println("Файл транзакций не найден!");
        } catch (NumberFormatException e) {
            System.out.println("В файле обнаружены некорректные финансовые данные!");
        } catch (IOException e) {
            System.out.println("Ошибка чтения данных из файла!");
        }
    }
}