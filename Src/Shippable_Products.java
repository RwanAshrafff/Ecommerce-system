package org.example;

public class Shippable_Products extends Products implements ShippingInterface{
    private double weight;
    public Shippable_Products(String name ,int quantity, double weight , double price )
    {
        super(name,quantity,price);
        this.weight=weight;
    }

    @Override
    public String get_name() {return super.get_name();}

    @Override
    public double get_weight() {return weight;}

}
