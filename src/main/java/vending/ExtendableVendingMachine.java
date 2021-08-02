package vending;

import vending.product.*;

public class ExtendableVendingMachine {
    private int chocolateQty, softDrinkQty, saltySnackQty;

    public ExtendableVendingMachine(int chocolateQty, int softDrinkQty, int saltySnackQty) {
        this.chocolateQty = chocolateQty;
        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnackQty;
    }

    public void addStock(Product product,int stock) {
        if (product instanceof Chocolate) {
            chocolateQty += stock;
        }
        if (product instanceof SaltySnack) {
            saltySnackQty += stock;
        }
        if (product instanceof SoftDrink) {
            softDrinkQty += stock;
        }
    }

    public void buy(Product product,int amt) {
        if (product instanceof Chocolate) {
            chocolateQty-=amt;
        }
        if (product instanceof SaltySnack) {
            saltySnackQty-=amt;
        }
        if (product instanceof SoftDrink) {
            softDrinkQty-=amt;
        }
    }

    public int getProductQty(Product product) {
        int qty = 0;
        if (product instanceof Chocolate) {
            qty = chocolateQty;

        }
        if (product instanceof SoftDrink) {
            qty = softDrinkQty;

        }
        if (product instanceof SaltySnack) {
            qty = saltySnackQty;
        }
        return qty;

    }
}
