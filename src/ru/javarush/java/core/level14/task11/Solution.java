package ru.javarush.java.core.level14.task11;

public class Solution {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();


        car.carBrand = "Toyota";
        car.carYear = 2020;

        car2.carBrand = "Lada";
        car2.carYear = 2010;

        System.out.println("Марка: " + car.carBrand + ", год выпуска: " + car.carYear);
        System.out.println("Марка: " + car2.carBrand + ", год выпуска: " + car2.carYear);
    }
}
