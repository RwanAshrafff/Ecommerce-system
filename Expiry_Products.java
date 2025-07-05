package org.example;

import java.time.LocalDate;

public class Expiry_Products extends Products{
    private LocalDate expirydate;

    public Expiry_Products(String name,int quantity,double price,LocalDate expirydate)
    {
        super(name,quantity,price);
        this.expirydate=expirydate;
    }
    // checking if the product is expired or not
    public boolean is_expired()
    {
        return expirydate.isBefore(LocalDate.now());
    }
}
