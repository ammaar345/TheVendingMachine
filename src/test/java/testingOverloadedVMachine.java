import org.junit.Test;
import vending.OverloadedVendingMachine;
import vending.product.*;

import static org.junit.Assert.*;

public class testingOverloadedVMachine {

    @Test
    public void shouldTestBuyForDrink() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(softDrink);


        assertEquals(overloadedVendingMachine.getStock(softDrink), 3);

    }

    @Test
    public void shouldTestBuyForDrink1() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(2, 0, 0);
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(softDrink);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 3);
    }

    @Test
    public void shouldTestBuyForDrink2() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5, 0, 0);
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(softDrink);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 8);

    }

    @Test
    public void shouldTestBuyForSnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 3, 0);
        SaltySnack saltySnack = new SaltySnack();
        overloadedVendingMachine.buy(saltySnack);

        overloadedVendingMachine.buy(saltySnack);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 5);
    }

    @Test
    public void shouldTestBuyForSnack2() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();
        overloadedVendingMachine.buy(saltySnack);

        overloadedVendingMachine.buy(saltySnack);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 2);
    }

    @Test
    public void shouldTestBuyForSnack3() {

        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 3, 0);
        SaltySnack saltySnack = new SaltySnack();
        overloadedVendingMachine.buy(saltySnack);

        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.buy(saltySnack);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 6);
    }

    @Test
    public void shouldTestBuyForChoc() {


        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        Chocolate chocolate = new Chocolate();
        overloadedVendingMachine.buy(chocolate);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 1);
    }

    @Test
    public void shouldTestBuyForChoc2() {

        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 4);
        Chocolate chocolate = new Chocolate();
        overloadedVendingMachine.buy(chocolate);

        overloadedVendingMachine.buy(chocolate);

        overloadedVendingMachine.buy(chocolate);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 7);

    }

    @Test
    public void shouldTestBuyForChoc3() {

        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 10);
        Chocolate chocolate = new Chocolate();
        overloadedVendingMachine.buy(chocolate);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 11);

    }

    @Test
    public void shouldTestBuyProduct() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(1, 4, 7);
        Product product = new Product();
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(product);
        overloadedVendingMachine.buy(product);
        overloadedVendingMachine.buy(product);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 10);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 13);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 16);
    }

    @Test
    public void shouldTestBuyProduct2() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 5, 10);
        Product product = new Product();
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(product);
        overloadedVendingMachine.buy(product);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 9);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 11);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 16);
    }

    @Test
    public void shouldTestBuyProduct3() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(2, 6, 8);
        Product product = new Product();
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(product);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 5);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 9);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 11);
    }

}
