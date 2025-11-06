package ru.javarush.java.core.level25.task04;

// Интерфейс с единственным абстрактным методом
interface Pressable {
    void activateEngine();
}

public class Solution {
    public static void main(String[] args) {
        // Создаем объект интерфейса Pressable "на лету" с помощью анонимного класса
        Pressable p = new Pressable() {
            @Override
            public void activateEngine() {
                System.out.println("Двигатели запущены! Мы летим к звёздам!");
            }
        };

        // "Нажимаем" кнопку: вызываем метод активации
        p.activateEngine();
    }
}