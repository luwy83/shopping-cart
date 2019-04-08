package com.lwyporek.demo;

public class ProductDiscount implements Discount {
    private static final double PERCENTAGE = 30;
    // code of product the discount applies for
    private String code;

    public ProductDiscount(String code) {
        this.code = code;
    }

    @Override
    public boolean doesApply(Cart cart) {
        // the discount always applies if product with given code is in cart
        return true;
    }

    @Override
    public void apply(Cart cart) {
        for (Product item: cart.getItems()) {
            if (this.code.equals(item.getCode())) {
                item.setDiscountPrice(item.getPrice() * (100 - PERCENTAGE)/100);
            }
            // will set discount price only for first matched product
            return;
        }
    }
}
