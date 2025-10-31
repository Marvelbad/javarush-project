package ru.javarush.java.core.level21.task19;

import java.util.Comparator;

public class Product {
    private final String name;
    private final int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static Comparator<Product> byName = new Comparator<Product>() {
        public int compare(Product o1, Product o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    };


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
