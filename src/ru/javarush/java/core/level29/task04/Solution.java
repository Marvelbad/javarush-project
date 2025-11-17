package ru.javarush.java.core.level29.task04;

import java.util.Comparator;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        // Создаем двух участников
        Person anna = new Person("Анна");
        Person boris = new Person("Борис");

        // Создаем компаратор по имени
        PersonByNameComparator comparator = new PersonByNameComparator();

        // Сравниваем через Objects.compare, передавая компаратор
        int result = Objects.compare(anna, boris, comparator);

        // Выводим вердикт по результату сравнения
        if (result < 0) {
            System.out.println("Анна идет раньше Бориса");
        } else if (result > 0) {
            System.out.println("Борис идет раньше Анны");
        } else {
            System.out.println("Имена совпадают");
        }
    }
}

// Класс Person с единственным полем personName
class Person {
    String personName;

    Person(String personName) {
        this.personName = personName;
    }
}

// Компаратор, сравнивающий Person только по полю personName
class PersonByNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        // Сравниваем только имена; считаем, что оба объекта и их имена не null
        return a.personName.compareTo(b.personName);
    }
}