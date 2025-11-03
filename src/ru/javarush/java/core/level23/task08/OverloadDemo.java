package ru.javarush.java.core.level23.task08;

public class OverloadDemo {

    public void print(int valueToPoint) {
        System.out.println("int: " + valueToPoint);
    }

    public void print(double valueToPrint) {
        System.out.println("double: " + valueToPrint);
    }
}
