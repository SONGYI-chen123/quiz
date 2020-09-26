package com.twuc.shopping.domain;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class OrderForm {
    @NotNull
    private double price;
    @NotNull
    @Min(1)
    private  int num;
    @NotNull
    private  String unit;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    private String name;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderForm( @NotNull String name,@NotNull double price, @NotNull @Min(1) int num, @NotNull String unit) {
        this.price = price;
        this.num = num;
        this.unit = unit;
        this.name = name;
    }
}
