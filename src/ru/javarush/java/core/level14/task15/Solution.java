package ru.javarush.java.core.level14.task15;

public class Solution {
    public static void main(String[] args) {
        Car first = new Car("Toyota", "Carina", 2026);
        Car second = new Car("BMW", "M5");
        Car third = new Car();

        first.printCar();
        second.printCar();
        third.printCar();
    }
}
