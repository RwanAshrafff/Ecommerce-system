package org.example;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws Exception {

        try {
            Customer user = new Customer("Rwan", 100000000);
            Cart cart = new Cart();
            //Shippable products
            Products cheese = new Shippable_Products("cheese", 10, 50, 400);
            Products Tv = new Shippable_Products("TV", 5, 20, 200);
            //UnShippable products
            Products Biscuit = new Products("Biscuit", 50, 70);
            //Check Expire
            Products Meat = new Expiry_Products("Meat", 10,300, LocalDate.now().plusDays(10));

            cart.add(cheese, 2);
            cart.add(Tv, 3);
            cart.add(Biscuit, 3);
            cart.add(Meat,1);

            System.out.println("Shipping across egypt");
            CheckoutService.setPlace("Egypt");
            CheckoutService.checkout(user, cart);

            System.out.println("-----------------------------");

            System.out.println("Shipping to another country");
            CheckoutService.setPlace("Alexandria");
            CheckoutService.checkout(user, cart);

        }catch (Exception e){
            System.err.println("error"+e.getMessage());
        }
    }
}
