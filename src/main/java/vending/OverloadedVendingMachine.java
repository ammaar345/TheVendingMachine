package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {

    public int softDrinkQty, saltySnackQty, chocolateQty, productQty;

    public OverloadedVendingMachine(int softDrinkQty, int saltySnackQty, int chocolateQty) {
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnackQty;
        this.chocolateQty = chocolateQty;
    }

    public void buy(SoftDrink softdrink) {
        softDrinkQty++;

    }

    public void buy(SaltySnack saltySnack) {

        saltySnackQty++;
    }

    public void buy(Chocolate chocolate) {

        chocolateQty++;
    }

    public void buy(Product product) {
        softDrinkQty++;
        saltySnackQty++;
        chocolateQty++;
    }

    public int getStock(SoftDrink softdrink) {
        return softDrinkQty;
    }

    public int getStock(SaltySnack saltySnack) {
        return saltySnackQty;
    }

    public int getStock(Chocolate chocolate) {
        return chocolateQty;
    }

    public int getStock(Product product) {
        return productQty;
    }


}
