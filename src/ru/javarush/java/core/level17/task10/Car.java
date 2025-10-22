package ru.javarush.java.core.level17.task10;

public class Car extends Vehicle {


    public Car(String carBrand, int manufacturingYear) {
        super(carBrand);
        System.out.printf("Машина %s, год: %d%n", carBrand, manufacturingYear);
    }
}
