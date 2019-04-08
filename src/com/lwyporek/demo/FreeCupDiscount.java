package com.lwyporek.demo;

public class FreeCupDiscount implements Discount {
    private static final double THRESHOLD = 200;

    @Override
    public boolean doesApply(Cart cart) {
        return cart.getTotal() > THRESHOLD;
    }

    @Override
    public void apply(Cart cart) {
        cart.addToCart(new Product("Free cup!", "999", 0));
    }
}
