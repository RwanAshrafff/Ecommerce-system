package org.example;

public class Customer {
    private String Username;
    private double Balance ;

    public Customer(String Username,double Balance)
    {
        this.Username=Username;
        this.Balance=Balance;
    }

    public void payment (double invoice) throws Exception {
        if (invoice > Balance ) throw new Exception("Sorry but Your balance isn't enough !");
    }

    public void Deduct_Balance(double balance) throws Exception {
        if(balance> Balance) throw new Exception("Sorry but Your balance isn't enough !");
        Balance-=balance;
    }

}
