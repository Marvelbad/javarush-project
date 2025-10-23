package ru.javarush.java.core.level19.task07;

public class Circle extends Shape {
    double radius;

    public Circle(String name ,double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
