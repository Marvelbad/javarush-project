package ru.javarush.java.core.level25.task05;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI * radius * radius;
    }
}
