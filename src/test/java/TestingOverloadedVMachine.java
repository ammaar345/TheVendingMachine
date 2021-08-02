import org.junit.Test;
import vending.OverloadedVendingMachine;
import vending.product.*;

import static org.junit.Assert.*;

public class TestingOverloadedVMachine {

    @Test
    public void shouldTestBuyForDrink() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 0, 0);
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(softDrink,2);

        assertEquals(overloadedVendingMachine.getStock(softDrink), 1);

    }

    @Test
    public void shouldTestBuyForDrink1() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5, 0, 0);
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.buy(softDrink,3);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 3);
    }

    @Test
    public void shouldTestBuyForDrink2() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(4, 0, 0);
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(softDrink,3);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 1);

    }

    @Test
    public void shouldTestBuyForSnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 3, 0);
        SaltySnack saltySnack = new SaltySnack();
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.buy(saltySnack,2);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 4);
    }

    @Test
    public void shouldTestBuyForSnack2() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 7, 0);
        SaltySnack saltySnack = new SaltySnack();
        overloadedVendingMachine.buy(saltySnack,1);

        assertEquals(overloadedVendingMachine.getStock(saltySnack), 5);
    }

    @Test
    public void shouldTestBuyForSnack3() {

        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(1, 3, 5);
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        SoftDrink softDrink = new SoftDrink();
        Product product = new Product();
        overloadedVendingMachine.addStock(product);
        overloadedVendingMachine.buy(saltySnack,4);

        assertEquals(overloadedVendingMachine.getStock(saltySnack), 2);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 8);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 4);

    }

    @Test
    public void shouldTestBuyForChoc() {


        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 2, 5);
        Chocolate chocolate = new Chocolate();
        Product product = new Product();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(chocolate,1);
        overloadedVendingMachine.buy(product,1);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 3);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 2);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 1);
    }

    @Test
    public void shouldTestBuyForChoc2() {

        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 7);
        Chocolate chocolate = new Chocolate();
        overloadedVendingMachine.buy(chocolate,5);

        assertEquals(overloadedVendingMachine.getStock(chocolate), 2);

    }

    @Test
    public void shouldTestBuyForChoc3() {

        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 10);
        Chocolate chocolate = new Chocolate();
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.buy(chocolate,2);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 10);

    }

    @Test
    public void shouldTestBuyProduct() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(20, 41, 10);
        Product product = new Product();
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(product,2);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 18);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 39);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 8);
    }

    @Test
    public void shouldTestBuyProduct2() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3, 5, 10);
        Product product = new Product();
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.buy(product,1);
        overloadedVendingMachine.buy(chocolate,1);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 2);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 4);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 8);

    }

    @Test
    public void shouldTestBuyProduct3() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(2, 6, 8);
        Product product = new Product();
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        overloadedVendingMachine.addStock(product);
        overloadedVendingMachine.addStock(product);
        overloadedVendingMachine.buy(product,3);
        assertEquals(overloadedVendingMachine.getStock(softDrink), 5);
        assertEquals(overloadedVendingMachine.getStock(saltySnack), 9);
        assertEquals(overloadedVendingMachine.getStock(chocolate), 11);
        assertEquals(overloadedVendingMachine.getStock(), 25);

    }

}
