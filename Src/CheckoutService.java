package org.example;
import java.util.ArrayList;
import java.util.List;

public class CheckoutService {

    private static String place ;

    public static void setPlace(String place) {
        CheckoutService.place = place;
    }

    public static String getPlace() {
        return place;
    }

    public static void checkout(Customer customer, Cart cart) throws Exception {
        System.out.println("** Checkout receipt **");

        double subtotal=0;
        double shipping=0;
        double totalcost=0;

        if (getPlace().equals("Egypt") ) shipping += 60;
        else shipping += 120;

        List<ShippingInterface> ShippingProducts = new ArrayList<>();
        for (CartItem i : cart.get_CartItems()) {
            Products product = i.getProduct();
            int quantity = i.getQuantity();
            double Total_Item = quantity * product.get_price();
            System.out.println(quantity + "x " + product.get_name() + " " + Total_Item);
            subtotal += Total_Item;

            if (product instanceof ShippingInterface) {
                ShippingProducts.add(new ShippingInterface() {
                    @Override
                    public String get_name() {
                        return quantity + "x " + product.get_name();
                    }

                    @Override
                    public double get_weight() {
                        return ((ShippingInterface) product).get_weight() * quantity;
                    }
                });
            }

        }

        ShippingService shippingService = new ShippingService();
        shippingService.shipping(ShippingProducts);

        totalcost= subtotal+shipping;
        customer.Deduct_Balance(totalcost);
        System.out.println("----------------------");
        System.out.println("Subtotal " + subtotal);
        System.out.println("Shipping " + shipping);
        System.out.println("Total " + totalcost);
    }

}
