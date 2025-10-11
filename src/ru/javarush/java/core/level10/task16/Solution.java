package ru.javarush.java.core.level10.task16;

// Перечисление космических тел с фиксированными значениями
enum CelestialBody {
    EARTH,
    MARS,
    JUPITER
}

public class Solution {
    public static void main(String[] args) {
        // 1) Создаем переменную типа CelestialBody и присваиваем ей MARS
        CelestialBody body = CelestialBody.MARS;

        // 2) Выводим официальное имя текущей планеты через специальный метод name()
        System.out.println(body.name());

        // 3) Выводим "порядковый номер" текущей планеты через метод ordinal()
        System.out.println(body.ordinal());

        // 4) Преобразуем строку "JUPITER" в значение перечисления через valueOf()
        String incoming = "JUPITER";
        CelestialBody newTarget = CelestialBody.valueOf(incoming);
        // Выводим новое значение enum для подтверждения переключения
        System.out.println(newTarget);
    }
}