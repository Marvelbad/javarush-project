package ru.javarush.java.core.level23.task20;


public class Product {
    static int totalProductCount;
    private String productName;

    public Product(String productName) {
        this.productName = productName;
        totalProductCount++;
    }

    public String getProductName() {
        return productName;
    }
}
