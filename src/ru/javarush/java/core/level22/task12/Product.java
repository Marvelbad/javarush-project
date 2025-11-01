package ru.javarush.java.core.level22.task12;

import java.util.Objects;

public record Product(String name, double price) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // Сравниваем только объекты типа Product
        if (!(o instanceof Product other)) return false;
        // ВАЖНО: сравниваем только название, цену игнорируем
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
