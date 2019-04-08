package com.lwyporek.demo;

public class Product {
    private String name;
    private String code;
    private double price;
    private Double discountPrice;

    public Product(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                '}';
    }
}