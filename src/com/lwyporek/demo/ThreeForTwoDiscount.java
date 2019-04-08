package com.lwyporek.demo;

public class ThreeForTwoDiscount implements Discount {
    @Override
    public boolean doesApply(Cart cart) {
        // discount applies when there are 3 products in cart
        return cart.getItems().size() == 3;
    }

    @Override
    public void apply(Cart cart) {
        // discount sets discount price of cheapest product to 0
        Product cheapestProduct = cart.getCheapestItem();
        cheapestProduct.setDiscountPrice(0);
    }
}
