package com.twuc.shopping.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    private String name;
    private String price;
    private String unit;
    private String imageUrl;

    public Product(String name, String price, String unit, String imageUrl) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.imageUrl = imageUrl;
    }

}
