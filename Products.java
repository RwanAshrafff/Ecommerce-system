package org.example;

public class Products {

    protected String name ;
    protected static int quantity;
    protected double price ;

    public Products(String name , int quantity , double price ){
        this.name=name;
        this.price =price ;
        Products.quantity=quantity;
    }

    public String get_name(){
        return name ;
    }
    public double get_price() {
        return price;
    }

    public static int getQuantity() {
        return quantity;
    }

    // Checking if product exist or not
    public boolean Existance(int quan){
        return quantity>=quan;
    }

    public void Decrement_Quantity(int quan ){
        quantity-=quan;
    }


}
