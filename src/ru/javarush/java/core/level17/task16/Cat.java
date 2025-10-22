package ru.javarush.java.core.level17.task16;

public class Cat extends Mammal {

    @Override
    public void eat() {
        System.out.println(animalName + " ест рыбу.");
    }

    public void purr() {
        System.out.println(animalName + " мурлычет.");
    }
}
