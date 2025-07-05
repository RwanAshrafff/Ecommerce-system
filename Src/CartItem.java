package org.example;

public class CartItem {

    private Products product ;
    private int quantity;

    public CartItem(Products product, int quantity)
    {
        this.product=product;
        this.quantity=quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Products getProduct() {
        return product;
    }
}
