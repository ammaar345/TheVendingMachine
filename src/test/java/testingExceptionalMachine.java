import org.junit.Test;

import static org.junit.Assert.*;

import vending.ExceptionalVendingMachine;
import vending.productException.*;

public class testingExceptionalMachine {
    @Test
    public void shouldTestChocException() throws Exception {


        try {
            Chocolate chocolate = new Chocolate();
            SaltySnack saltySnack = new SaltySnack();
            SoftDrink softDrink = new SoftDrink();
            ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(1, 1, 1);
            exceptionalVendingMachine.buy(chocolate);
            exceptionalVendingMachine.buy(chocolate);
        } catch (ExceptionalVendingMachine.ProductNotFoundException ex) {
            assertEquals(ex.getMessage(),"No more chocolates.");
        }
    }

    @Test
    public void shouldTestDrinkException() throws Exception {


        try {
            Chocolate chocolate = new Chocolate();
            SaltySnack saltySnack = new SaltySnack();
            SoftDrink softDrink = new SoftDrink();
            ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(13, 3, 0);
            exceptionalVendingMachine.buy(softDrink);

        } catch (ExceptionalVendingMachine.ProductNotFoundException ex) {
            assertEquals(ex.getMessage(),"No more soft drinks.");
        }
    }

    @Test
    public void shouldTestSaltyException() throws Exception {


        try {
            Chocolate chocolate = new Chocolate();
            SaltySnack saltySnack = new SaltySnack();
            SoftDrink softDrink = new SoftDrink();
            ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 90);
            exceptionalVendingMachine.buy(saltySnack);
            exceptionalVendingMachine.buy(saltySnack);
        } catch (ExceptionalVendingMachine.ProductNotFoundException ex) {
            assertEquals(ex.getMessage(),"No more salty cracks.");
//            System.err.print(ex);
        }
    }

}
