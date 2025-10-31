package ru.javarush.java.core.level20.task20;

public class Person implements Subscriber {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " получил новость: " + news);
    }
}