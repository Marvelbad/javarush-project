package ru.javarush.java.core.level24.task15;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        // Пытаемся открыть файл — здесь может возникнуть FileNotFoundException
        try {
            FileInputStream inputStream = new FileInputStream(path);
            inputStream.read();
            inputStream.close();
            inputStream.read();
        } catch (FileNotFoundException e) {
            System.out.println("Секретный документ не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка доступа к архиву!");
        }
    }
}