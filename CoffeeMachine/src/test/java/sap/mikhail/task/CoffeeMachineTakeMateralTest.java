package sap.mikhail.task;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeMachineTakeMateralTest {
    ControlPanel controlPanel = new ControlPanel();
    Tank tank = new Tank();

    @Test
    public void NotEnougthMaterialsTest() {
        CupOfCoffee cupOfCoffee;

        tank.addCoffeeBeans(38);
        tank.addWater(150);
        cupOfCoffee = controlPanel.makeCupOfCapuchino();
        assertFalse(cupOfCoffee.isItFilled());
        cupOfCoffee = controlPanel.makeCupOfAmericano();
        assertFalse(cupOfCoffee.isItFilled());
        cupOfCoffee = controlPanel.makeCupOfEspresso();
        assertFalse(cupOfCoffee.isItFilled());
    }
}
