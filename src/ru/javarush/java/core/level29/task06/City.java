package ru.javarush.java.core.level29.task06;

import java.util.Objects;

public class City implements Comparable<City> {
    private String cityName;
    private int cityPopulation;

    public City(String cityName, int cityPopulation) {
        this.cityName = cityName;
        this.cityPopulation = cityPopulation;
    }

    @Override
    public int compareTo(City other) {
        return Integer.compare(this.cityPopulation, other.cityPopulation);
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
