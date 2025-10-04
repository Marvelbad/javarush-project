package ru.javarush.java.core.level14.task10;

public class Dog {
    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public void printInfo() {
        System.out.printf("Собаку зовут %s, ей %d лет", dogName, dogAge);
    }
}
