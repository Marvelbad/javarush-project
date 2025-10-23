package ru.javarush.java.core.level19.task10;

public class Square extends Figure {
    public int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
