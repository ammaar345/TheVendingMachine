package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {

    public int softDrinkQty, saltySnackQty, chocolateQty, productQty;


    //create a buy method that allows you to specify how many of a certain Product you want to buy
//create a addStock method that allows you to specify how many of a certain Product you want to add to stock.
    public OverloadedVendingMachine(int softDrinkQty, int saltySnackQty, int chocolateQty) {
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnackQty;
        this.chocolateQty = chocolateQty;
        this.productQty = saltySnackQty + chocolateQty + softDrinkQty;
    }

    public void buy(SoftDrink softdrink, int qty) {
        softDrinkQty -= qty;
        productQty--;
    }

    public void buy(SaltySnack saltySnack, int qty) {

        saltySnackQty -= qty;
        productQty--;
    }

    public void buy(Chocolate chocolate, int qty) {

        chocolateQty -= qty;
        productQty--;
    }

    public void buy(Product product, int qty) {
        softDrinkQty -= qty;
        saltySnackQty -= qty;
        chocolateQty -= qty;
    }

    public void addStock(SoftDrink softDrink) {
        softDrinkQty++;
        productQty++;
    }

    public void addStock(SaltySnack saltySnack) {
        saltySnackQty++;
        productQty++;
    }

    public void addStock(Chocolate chocolate) {
        chocolateQty++;
        productQty++;
    }

    public void addStock(Product product) {
        chocolateQty += 3;
        saltySnackQty += 3;
        softDrinkQty += 3;
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

    public int getStock() {
        return productQty;
    }


}
