package com.lwyporek.demo;

public class PercentageDiscount implements Discount {
    private static final double THRESHOLD = 300;
    private static final int PERCENTAGE = 5;

    @Override
    public boolean doesApply(Cart cart) {
        return cart.getTotal() > THRESHOLD;
    }

    @Override
    public void apply(Cart cart) {
        for (Product item : cart.getItems()) {
            item.setDiscountPrice(item.getPrice() * (100 - PERCENTAGE)/100);
        }
    }
}
