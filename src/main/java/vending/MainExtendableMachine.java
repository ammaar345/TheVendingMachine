package vending;
import vending.product.*;
public class MainExtendableMachine {
    public static void main(String[] args) {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10, 42, 75);
        Chocolate chocolate = new Chocolate();
        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        extendableVendingMachine.addStock(chocolate, 37);
        extendableVendingMachine.buy(saltySnack, 49);
        extendableVendingMachine.addStock(saltySnack, 16);
        extendableVendingMachine.addStock(softDrink, 12);
        extendableVendingMachine.buy(chocolate, 9);
        extendableVendingMachine.addStock(saltySnack, 25);
        System.out.println("There are " + extendableVendingMachine.getProductQty(chocolate) + " chocolates available.");
        System.out.println("There are " + extendableVendingMachine.getProductQty(softDrink) + " soft drinks available");
        System.out.println("There are " + extendableVendingMachine.getProductQty(saltySnack) + " salty snacks available.");
    }
}
