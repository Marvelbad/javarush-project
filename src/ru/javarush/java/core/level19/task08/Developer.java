package ru.javarush.java.core.level19.task08;

public class Developer extends Employee {
    public String name;
    public double hourlyRate;
    public int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getSalary() {
        return hourlyRate * hoursWorked;
    }
}
