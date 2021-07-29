package vending;

import vending.productException.*;
import vending.ExceptionalVendingMachine.ProductNotFoundException;

public class MainExceptionalMachine {
    public static void main(String[] args) throws ProductNotFoundException {
        try {
            Chocolate chocolate = new Chocolate();
            SaltySnack saltySnack = new SaltySnack();
            SoftDrink softDrink = new SoftDrink();
            ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(3, 6, 2);
            exceptionalVendingMachine.addStock(chocolate, 4);
            exceptionalVendingMachine.buy(softDrink);
            exceptionalVendingMachine.buy(softDrink);
            exceptionalVendingMachine.buy(softDrink);
            System.out.println("There are "+exceptionalVendingMachine.getStock(chocolate)+ " in stock." );
            System.out.println("There are " +exceptionalVendingMachine.getStock(saltySnack)+ " in stock.");
            System.out.println("There are " +exceptionalVendingMachine.getStock(softDrink)+ " in stock.");
        } catch (ProductNotFoundException ex) {
            System.out.print(ex);
        }
    }
}
