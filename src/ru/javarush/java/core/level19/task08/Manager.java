package ru.javarush.java.core.level19.task08;

public class Manager extends Employee {
    public double baseSalary;

    public Manager(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }
}
