package ru.javarush.java.core.level21.task17;

public class NumberBox implements Comparable<NumberBox> {
    private int number;

    public NumberBox(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(NumberBox other) {
        return Integer.compare(this.number, other.number);
    }
}