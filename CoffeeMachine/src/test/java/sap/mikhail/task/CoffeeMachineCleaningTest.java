package sap.mikhail.task;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import static sap.mikhail.task.Material.*;


public class CoffeeMachineCleaningTest {
    ControlPanel controlPanel = new ControlPanel();
    Tank tank = new Tank();

    @Before
    public void fillAllMaterials() {
        int maxAmountWater = 2000;
        int maxAmountMilk = 1000;
        int maxCoffeBeans = 100;

        WATER.add(maxAmountWater - WATER.getCurrentAmount());
        MILK.add(maxAmountMilk - MILK.getCurrentAmount());
        COFFEE_BEANS.add(maxCoffeBeans - COFFEE_BEANS.getCurrentAmount());
    }

    @Test
    public void cleanMachineTest() {

        controlPanel.cleanMachine();
        int residueWater = WATER.getCurrentAmount();
        boolean check = residueWater == 1700 ? true : false;

        assertTrue(check);
    }

    @Test
    public void ExceptionCleanMachineTest() {
        int checkCountCupOfCoffee = 10;
        CupOfCoffee cupOfCoffee;

        for (int i = 1 ; i < checkCountCupOfCoffee ; i++) {
            cupOfCoffee = controlPanel.makeCupOfEspresso();
            if (i > 8) {
                assertFalse(cupOfCoffee.isItFilled());
            } else {
                assertTrue(cupOfCoffee.isItFilled());
            }
            tank.addCoffeeBeans(15);
        }
    }
}
