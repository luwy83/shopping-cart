package com.lwyporek.demo;

public interface Discount {
    boolean doesApply(Cart cart);
    void apply(Cart cart);
}
