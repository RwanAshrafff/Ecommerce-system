package org.example;
import java.util.List;

public class ShippingService {

    public void shipping(List <ShippingInterface> products)
    {
        double Total_Weight=0;

        System.out.println("** Shipment notice **");

        for (ShippingInterface i : products)
        {
            System.out.println(i.get_name()+ " "+ i.get_weight() +"kg");
            Total_Weight+=i.get_weight();
        }

        System.out.println("Total package weight " + Total_Weight +"kg");
    }
}
