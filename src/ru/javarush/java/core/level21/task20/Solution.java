package ru.javarush.java.core.level21.task20;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Используем try-with-resources: ресурс будет закрыт автоматически
        try (DemoResource res = new DemoResource()) {
            System.out.println("Работа с ресурсом");
        }
    }
}