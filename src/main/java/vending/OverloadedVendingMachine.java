package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {

    int softDrinkQty, saltySnackQty, chocolateQty, productQty;

    OverloadedVendingMachine(int softDrinkQty, int saltySnackQty, int chocolateQty) {
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnackQty;
        this.chocolateQty = chocolateQty;
    }

    void buy(SoftDrink softdrink) {
        softDrinkQty++;

    }

    void buy(SaltySnack saltySnack) {

        saltySnackQty++;
    }

    void buy(Chocolate chocolate) {

        chocolateQty++;
    }

    void buy(Product product) {
        softDrinkQty++;
        saltySnackQty++;
        chocolateQty++;
    }

    int getStock(SoftDrink softdrink) {
        return softDrinkQty;
    }

    int getStock(SaltySnack saltySnack) {
        return saltySnackQty;
    }

    int getStock(Chocolate chocolate) {
        return chocolateQty;
    }

    int getStock() {
        return productQty;
    }


}
