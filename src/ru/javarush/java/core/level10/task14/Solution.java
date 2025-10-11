package ru.javarush.java.core.level10.task14;

// Перечисление с четырьмя временами года


public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа Season и присваиваем ей значение SUMMER
        enum Season {
            WINTER,
            SPRING,
            SUMMER,
            AUTUMN
        }

        Season season = Season.SUMMER;

        // Для каждого сезона выводим свое жизнерадостное сообщение
        switch (season) {
            case WINTER -> System.out.println("Пора кататься на лыжах!");
            case SPRING -> System.out.println("Пора кататься на тачках!");
            case SUMMER -> System.out.println("Пора кататься на членах!");
            case AUTUMN -> System.out.println("Пора кататься на тракторе");
        }
    }
}