package sap.mikhail.task;



import org.junit.*;
import static org.junit.Assert.*;
import static sap.mikhail.task.Material.*;

public class CoffeeMachineCookingTest {
    ControlPanel controlPanel = new ControlPanel();

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
    public void makeCupOfCapuchinoTest() {

        CupOfCoffee cupOfCoffee = controlPanel.makeCupOfCapuchino();

        int residueWater = WATER.getCurrentAmount();
        int residueMilk = MILK.getCurrentAmount();
        int residueCoffeeBeans = COFFEE_BEANS.getCurrentAmount();

        assertTrue(residueWater == 1850);
        assertTrue(residueMilk == 900);
        assertTrue(residueCoffeeBeans == 85);
        assertTrue(cupOfCoffee.isItFilled());
        assertEquals("Capuchino", cupOfCoffee.getNameOfCoffeeDrink());
    }

    @Test
    public void makeCupOfAmericanoTest() {

        CupOfCoffee cupOfCoffee = controlPanel.makeCupOfAmericano();

        int residueWater = WATER.getCurrentAmount();
        int residueMilk = MILK.getCurrentAmount();
        int residueCoffeeBeans = COFFEE_BEANS.getCurrentAmount();

        assertTrue(residueWater == 1750);
        assertTrue(residueMilk == 1000);
        assertTrue(residueCoffeeBeans == 85);
        assertTrue(cupOfCoffee.isItFilled());
        assertEquals("Americano", cupOfCoffee.getNameOfCoffeeDrink());
    }

    @Test
    public void makeCupOfEspresso() {

        CupOfCoffee cupOfCoffee = controlPanel.makeCupOfEspresso();

        int residueWater = WATER.getCurrentAmount();
        int residueMilk = MILK.getCurrentAmount();
        int residueCoffeeBeans = COFFEE_BEANS.getCurrentAmount();

        assertTrue(residueWater == 1950);
        assertTrue(residueMilk == 1000);
        assertTrue(residueCoffeeBeans == 85);
        assertTrue(cupOfCoffee.isItFilled());
        assertEquals("Espresso", cupOfCoffee.getNameOfCoffeeDrink());
    }
}

