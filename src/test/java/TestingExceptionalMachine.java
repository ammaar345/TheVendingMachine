import org.junit.Test;

import static org.junit.Assert.*;

import vending.ExceptionalVendingMachine;

import vending.exceptions.ChocolatesAllGoneException;
import vending.exceptions.SaltyCracksAllEatenException;
import vending.exceptions.SoftDrinksOutOfStockException;
import vending.product.*;

public class TestingExceptionalMachine {
    @Test
    public void shouldTestChocException() throws Exception {


        Chocolate chocolate = new Chocolate();
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        Exception exception = assertThrows(ChocolatesAllGoneException.class, () -> {
            exceptionalVendingMachine.buy(chocolate);
        });

        String expectedMessage = "No more chocolates.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void shouldTestDrinkException() throws Exception {


        SoftDrink softDrink = new SoftDrink();
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        Exception exception = assertThrows(SoftDrinksOutOfStockException.class, () -> {
            exceptionalVendingMachine.buy(softDrink);
        });

        String expectedMessage = "No more soft drinks.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void shouldTestSaltyException() throws Exception {


        SaltySnack saltySnack = new SaltySnack();
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        Exception exception = assertThrows(SaltyCracksAllEatenException.class, () -> {
            exceptionalVendingMachine.buy(saltySnack);
        });

        String expectedMessage = "No more salty cracks.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}
