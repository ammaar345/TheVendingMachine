package vending;

import vending.product.Product;
import vending.productException.*;

public class ExceptionalVendingMachine {
    private int chocolateQty, saltySnackQty, softDrinkQty;

    public ExceptionalVendingMachine(int chocQty, int snackQty, int drinkQty) {
        this.chocolateQty = chocQty;
        this.saltySnackQty = snackQty;
        this.softDrinkQty = drinkQty;
    }
    public class ProductNotFoundException  extends Exception {
        public ProductNotFoundException (String message) {
            super(message);
        }
    }
    public class SoftDrinksOutOfStockException extends ProductNotFoundException {
        public SoftDrinksOutOfStockException(String message) {
            super(message);
        }
    }

    public class SaltyCracksAllEatenException extends ProductNotFoundException {
        public SaltyCracksAllEatenException(String message) {
            super(message);
        }
    }

    public class ChocolatesAllGoneException extends ProductNotFoundException {
        public ChocolatesAllGoneException(String message) {
            super(message);
        }
    }

    public void buy(Product product) throws ProductNotFoundException{

        if (product instanceof Chocolate) {
            chocolateQty--;
        }
        if (product instanceof SaltySnack) {
            saltySnackQty--;
        }
        if (product instanceof SoftDrink) {
            softDrinkQty--;
        }
        if (softDrinkQty < 0) {
            throw new SoftDrinksOutOfStockException("No more soft drinks.");
        }
        if (saltySnackQty < 0) {
            throw new SaltyCracksAllEatenException("No more salty cracks.");
        }
        if (chocolateQty < 0) {
            throw new ChocolatesAllGoneException("No more chocolates.");
        }
        //  Block of code to try
//        throw new ProductNotFoundException("");
        //  Block of code to handle errors


    }

    void addStock(Product product, int newStock) {

        if (product instanceof Chocolate) {
            chocolateQty += newStock;
        }
        if (product instanceof SaltySnack) {
            saltySnackQty += newStock;
        }
        if (product instanceof SoftDrink) {
            softDrinkQty += newStock;
        }


    }

    int getStock(Product product) {
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
