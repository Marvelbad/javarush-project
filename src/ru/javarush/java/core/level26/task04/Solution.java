package ru.javarush.java.core.level26.task04;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список (ArrayList) для названий фильмов
        List<String> movieList = new ArrayList<>();

        // Добавляем фильмы в список
        movieList.add("Титаник");
        movieList.add("Матрица");
        movieList.add("Интерстеллар");
        // по ошибке добавили снова
        movieList.add("Матрица");

        // Ищем первое вхождение "Матрица"
        int matrixIndex = movieList.indexOf("Матрица");
        System.out.println(matrixIndex);

        // Проверяем наличие "Аватар" в списке
        boolean avatarIsPresent = movieList.contains("Аватар");
        // contains возвращает true/false
        System.out.println(avatarIsPresent);

        // Очищаем список
        movieList.clear();

        // Выводим содержимое списка после очистки — должен быть пустым: []
        System.out.println(movieList);
    }
}