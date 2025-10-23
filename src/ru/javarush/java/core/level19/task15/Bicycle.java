package ru.javarush.java.core.level19.task15;

public class Bicycle extends Vehicle {

    public Bicycle(String model) {
        this.model = model;
    }

    @Override
    public void move() {
        System.out.printf("Велосипед %s едет", model);
    }
}
