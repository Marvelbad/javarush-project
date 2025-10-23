package ru.javarush.java.core.level19.task08;

public abstract class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double getSalary();

    public String getName() {
        return name;
    }
}
