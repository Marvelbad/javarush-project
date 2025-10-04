package ru.javarush.java.core.level14.task15;

public class Car {
    private String carBrand;
    private String carModel;
    private int productionYear;

    public Car(String carBrand, String carModel, int productionYear) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.productionYear = productionYear;
    }

    public Car(String carBrand, String carModel) {
        this(carBrand, carModel, 2024);
    }

    public Car() {
        this("Unknown", "Unknown");
    }

    public void printCar() {
        System.out.println(carBrand + " " + carModel + " " +productionYear);
    }
}
