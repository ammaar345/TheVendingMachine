package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class Main {
    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20, 44, 86);
        Chocolate chocolate = new Chocolate();
        Product product = new Product();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(product, 4);
        overloadedVendingMachine.buy(chocolate, 2);
        overloadedVendingMachine.buy(saltySnack, 1);
        overloadedVendingMachine.buy(softDrink, 5);
        System.out.println("There are " + overloadedVendingMachine.getStock(chocolate) + " chocolates available.");
        System.out.println("There are " + overloadedVendingMachine.getStock(saltySnack) + " salty snacks available.");
        System.out.println("There are " + overloadedVendingMachine.getStock(softDrink) + " soft drinks available.");
    }
}
