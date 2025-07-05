package org.example;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List <CartItem> CartItems =new ArrayList<>();

    public List<CartItem> get_CartItems()
    {
        return CartItems;
    }

    public void add(Products product ,int quantity ) throws Exception {
        if ( quantity > Products.getQuantity())
        {
            throw new Exception("The quantity needed isn't availble ");
        }
        CartItems.add(new CartItem(product,quantity));
        product.Decrement_Quantity(quantity);
    }
}
