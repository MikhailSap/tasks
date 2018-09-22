package sap.mikhail.task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static sap.mikhail.task.Material.*;


public class CoffeeMachineAddOverFlowMaterialTest {

    @Test
    public void addWaterOverFlowTest() {
        int overFlowWaterAmount = 2100;

        String message = WATER.add(overFlowWaterAmount);

        assertEquals("Over flow!", message);
    }

    @Test
    public void addMilkOverFlowTest() {
        int overFlowMilkAmount = 1100;

        String message = MILK.add(overFlowMilkAmount);

        assertEquals("Over flow!", message);
    }

    @Test
    public void addCoffeeBeansOverFlowTest() {
        int overFlowCoffeeBeansAmmount = 105;

        String message = COFFEE_BEANS.add(overFlowCoffeeBeansAmmount);

        assertEquals("Over flow!", message);
    }
}
