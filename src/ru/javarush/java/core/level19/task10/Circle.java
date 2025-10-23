package ru.javarush.java.core.level19.task10;

public class Circle extends Figure {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
