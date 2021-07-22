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
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);

    }

    @Test
    public void shouldTestBuyForSnack2() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);


    }

    @Test
    public void shouldTestBuyForSnack3() {

        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);


    }

    @Test
    public void shouldTestBuyForChoc() {


        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);

    }

    @Test
    public void shouldTestBuyForChoc2() {

        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);


    }

    @Test
    public void shouldTestBuyForChoc3() {

        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);


    }
}
