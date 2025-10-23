package ru.javarush.java.core.level19.task15;

public class Car extends Vehicle {

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void move() {
        System.out.printf("Машина %s едет%n", model);
    }
}
