package ru.javarush.java.core.level25.task08;

public class Solution {
    public static void main(String[] args) {
        // Простейшая реализация Renderable через анонимный класс
        Renderable shape = new Renderable() {
            @Override
            public void paint() {
                System.out.println("Отрисовка объекта: простой квадрат.");
            }
        };

        // Вызываем обязательный метод отрисовки
        shape.paint();

        // Демонстрация default-метода интерфейса
        shape.adjustScale();

        // Вызов статического метода напрямую через интерфейс
        Renderable.validateColorPalette();
    }
}