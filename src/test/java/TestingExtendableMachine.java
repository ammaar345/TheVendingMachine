import org.junit.Test;

import static org.junit.Assert.*;

import vending.ExtendableVendingMachine;
import vending.product.*;

public class TestingExtendableMachine {
    @Test
    public void shouldTestAddStockChoc() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(1, 0, 2);
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        extendableVendingMachine.addStock(chocolate, 4);
        assertEquals(extendableVendingMachine.getProductQty(chocolate), 5);
        assertEquals(extendableVendingMachine.getProductQty(softDrink), 0);
        assertEquals(extendableVendingMachine.getProductQty(saltySnack), 2);
    }

    @Test
    public void shouldTestAddStockDrink() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(30, 23, 49);
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        extendableVendingMachine.addStock(softDrink, 2);
        extendableVendingMachine.buy(softDrink, 10);
        assertEquals(extendableVendingMachine.getProductQty(chocolate), 30);

        assertEquals(extendableVendingMachine.getProductQty(softDrink), 15);

        assertEquals(extendableVendingMachine.getProductQty(saltySnack), 49);
    }

    @Test
    public void shouldTestAddStockSaltSnack() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(19, 73, 5);
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        extendableVendingMachine.addStock(saltySnack, 27);
        extendableVendingMachine.buy(saltySnack, 7);
        extendableVendingMachine.buy(chocolate, 9);
        assertEquals(extendableVendingMachine.getProductQty(chocolate), 10);
        assertEquals(extendableVendingMachine.getProductQty(softDrink), 73);
        assertEquals(extendableVendingMachine.getProductQty(saltySnack), 25);
    }
}
