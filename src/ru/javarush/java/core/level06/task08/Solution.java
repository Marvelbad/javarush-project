package ru.javarush.java.core.level06.task08;

public class Solution {
    public static void main(String[] args) {
        // Объявляем общее количество магических яблок
        int totalApples = 7;

        // Объявляем количество друзей-авантюристов
        int numberOfFriends = 2;

        // Приводим totalApples к типу double перед делением, чтобы сохранить дробную часть результата
        double apples = (double) totalApples;
        double applesPerFriend = apples / 2;

        // Выводим точную долю яблок на одного друга (с дробной частью) на экран
        System.out.println(applesPerFriend);
    }
}