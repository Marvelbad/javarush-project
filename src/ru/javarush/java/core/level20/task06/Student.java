package ru.javarush.java.core.level20.task06;

public class Student extends Person implements Identifiable {

    public Student(String name) {
        super(name);
    }

    @Override
    public void printInfo() {
        System.out.println(name + " " + ID);
    }
}
