package sap.mikhail.task;




import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;
import static sap.mikhail.task.Material.*;



public class CoffeeMachineAddMaterialTest {
    Tank tank = new Tank();

    @Before
    public void resetAllMaterials() {
        try {
            Field field = WATER.getClass().getDeclaredField("currentAmount");
            field.setAccessible(true);
            field.set(WATER, 0);
        } catch (Exception e) {}
        try {
            Field field = MILK.getClass().getDeclaredField("currentAmount");
            field.setAccessible(true);
            field.set(MILK, 0);
        } catch (Exception e) {}
        try {
            Field field = COFFEE_BEANS.getClass().getDeclaredField("currentAmount");
            field.setAccessible(true);
            field.set(COFFEE_BEANS, 0);
        } catch (Exception e) {}

    }

    @Test
    public void addWaterTest() {
        int expAmount = 134;

        tank.addWater(expAmount);

        assertEquals(expAmount, WATER.getCurrentAmount());
    }

    @Test
    public void addMilkTest() {
        int expAmount = 788;

        tank.addMilk(expAmount);

        assertEquals(expAmount, MILK.getCurrentAmount());
    }

    @Test
    public void addCoffeeBeans() {
        int expAmount = 3;

        tank.addCoffeeBeans(expAmount);

        assertEquals(expAmount, COFFEE_BEANS.getCurrentAmount());
    }
}
