package ru.javarush.java.core.level25.task05;

public class Square extends Shape {
    private final int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateSurface() {
        return sideLength * sideLength;
    }
}
