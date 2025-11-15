package ru.javarush.java.core.level29.task01;

import java.util.Objects;

public class City {
    private String cityName;
    private int cityPopulation;

    public City(String cityName, int cityPopulation) {
        this.cityName = cityName;
        this.cityPopulation = cityPopulation;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityPopulation == city.cityPopulation &&
                Objects.equals(cityName, city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, cityPopulation);
    }
}
