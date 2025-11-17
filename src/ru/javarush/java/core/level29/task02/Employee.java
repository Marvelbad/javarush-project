package ru.javarush.java.core.level29.task02;

import java.util.Objects;

public class Employee {
    private String employeeName;
    private int employeeId;

    public Employee(String name, int id) {
        this.employeeName = name;
        this.employeeId = id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId &&
                Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, employeeId);
    }
}
