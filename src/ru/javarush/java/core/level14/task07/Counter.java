package ru.javarush.java.core.level14.task07;

// Публичный класс цифрового счётчика
public class Counter {
    // Поле для хранения текущего значения счётчика
    int currentValue;

    // Конструктор по умолчанию: стартуем с нуля (для наглядности, хотя int по умолчанию и так 0)
    public Counter() {
        currentValue = 0;
    }

    // Увеличиваем значение счётчика на 1
    public void increment() {
        currentValue++;
    }

    // Выводим текущее значение счётчика на экран
    public void printValue() {
        System.out.println(currentValue);
    }
}
