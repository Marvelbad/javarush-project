package ru.javarush.java.core.level12.task05;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем ассоциативный массив (HashMap) для хранения переводов слов
        HashMap<String, String> travelPhrasebook = new HashMap<>();

        // Добавляем в словарь перевод: ключ "дом", значение "house"
        travelPhrasebook.put("дом", "house");

        // Получаем перевод слова "дом" из словаря
        String translation = travelPhrasebook.get("дом");

        // Выводим перевод на экран
        System.out.println(translation);
    }
}