package com.twuc.shopping.domain;

public class Product {
    private String name;
    private double price;
    private String unit;
    private String imageUrl;

    public Product(String name, double price, String unit, String imageUrl) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
