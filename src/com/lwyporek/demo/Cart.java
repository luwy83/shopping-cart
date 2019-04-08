package com.lwyporek.demo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Product> getItems() {
        return items;
    }

    public Product getCheapestItem() {
        Product cheapest = this.items.get(0);
        for (Product item : this.items) {
            if (item.getPrice() < cheapest.getPrice()) {
                cheapest = item;
            }
        }
        return cheapest;
    }

    public void addToCart(Product item) {
        this.items.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (Product item: this.items) {
            // if there is no discount price then regular price is added
            total = total + (item.getDiscountPrice() == null ? item.getPrice() : item.getDiscountPrice());
        }
        return total;
    }

    public void applyDiscount(Discount discount) {
        if (discount.doesApply(this)) {
            discount.apply(this);
        }
    }
}
