package com.lwyporek.demo;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("beer", "001", 250.00),
                new Product("butter", "002", 60.00),
                new Product("bread", "003", 5.00)
        );

        Cart cart = new Cart();
        for (Product item: products) {
            cart.addToCart(item);
        }
        System.out.println("Items in cart: " + cart.getItems());
        System.out.println("Cart total: " + cart.getTotal());

        cart.applyDiscount(new PercentageDiscount());
        System.out.println("Items in cart: " + cart.getItems());
        System.out.println("Cart total: " + cart.getTotal());

        cart.applyDiscount(new ThreeForTwoDiscount());
        System.out.println("Items in cart: " + cart.getItems());
        System.out.println("Cart total: " + cart.getTotal());

        cart.applyDiscount(new FreeCupDiscount());
        System.out.println("Items in cart: " + cart.getItems());
        System.out.println("Cart total: " + cart.getTotal());

        cart.applyDiscount(new ProductDiscount("001"));
        System.out.println("Items in cart: " + cart.getItems());
        System.out.println("Cart total: " + cart.getTotal());
    }
}
