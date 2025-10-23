package ru.javarush.java.core.level19.task11;

public class Manager extends Employee {
    public double salary;

    public Manager(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
