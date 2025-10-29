package ru.javarush.java.core.level21.task08;

public class Solution {
    public static void main(String[] args) {
        // Инициализируем переменную фабрики ссылкой на конструктор Animal
        // Это короче и нагляднее, чем писать лямбда-выражение (name) -> new Animal(name)
        AnimalFactory factory = Animal::new;
        // Создаем питомца по имени "Барсик" через фабрику
        Animal cat = factory.create("Барсик");

        // Выводим имя питомца, чтобы подтвердить успешное создание
        System.out.println(cat.getName());
    }

    static class Animal {
        private String name;


        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    @FunctionalInterface
    interface AnimalFactory {
        Animal create(String name);
    }
}