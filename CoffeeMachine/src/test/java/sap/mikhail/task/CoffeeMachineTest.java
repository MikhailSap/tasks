package sap.mikhail.task;



import org.junit.Test;
import sap.mikhail.task.coffeeMachineExeptions.MaterialsOverFlowException;
import sap.mikhail.task.coffeeMachineExeptions.NeedToCleanTheMachineException;
import sap.mikhail.task.coffeeMachineExeptions.NotEnougthMaterialsException;

import static org.junit.Assert.*;
public class CoffeeMachineTest {

    ControlPanel controlPanel = new ControlPanel();

    public void resetAllMaterials() {
        Materials.WATER.setCurrentAmount(0);
        Materials.MILK.setCurrentAmount(0);
        Materials.COFFEEBEANS.setCurrentAmount(0);
    }

    public void fillAllMaterials() {
        Materials.WATER.setCurrentAmount(2000);
        Materials.MILK.setCurrentAmount(1000);
        Materials.COFFEEBEANS.setCurrentAmount(100);
    }

    @Test
    public void loadWaterTest() {
        resetAllMaterials();
        int amount = 134;

        controlPanel.loadWater(amount);
        boolean check = Materials.WATER.getCurrentAmount() == 134 ? true : false;

        assertTrue(check);
    }

    @Test
    public void loadMilkTest() {
        resetAllMaterials();
        int amount = 788;

        controlPanel.loadMilk(amount);
        boolean check = Materials.MILK.getCurrentAmount() == 788 ? true : false;

        assertTrue(check);
    }

    @Test
    public void loadCoffeeBeans() {
        resetAllMaterials();
        int amount = 3;

        controlPanel.loadCoffeeBeans(amount);
        boolean check = Materials.COFFEEBEANS.getCurrentAmount() == 3 ? true : false;

        assertTrue(check);
    }

    @Test
    public void loadWaterOverFlowTest() {
        resetAllMaterials();
        int overFlowWaterAmmount = 2100;
        boolean check = false;
        try {
            controlPanel.loadWater(overFlowWaterAmmount);
        } catch (MaterialsOverFlowException mofe) {
            check = true;
        }

        assertTrue(check);
    }

    @Test
    public void loadMilkOverFlowTest() {
        resetAllMaterials();
        int overFlowMilkAmmount = 1100;
        boolean check = false;
        try {
            controlPanel.loadMilk(overFlowMilkAmmount);
        } catch (MaterialsOverFlowException mofe) {
            check = true;
        }

        assertTrue(check);
    }

    @Test
    public void loadCoffeeBeansOverFlowTest() {
        resetAllMaterials();
        int overFlowCoffeeBeansAmmount = 105;
        boolean check = false;
        try {
            controlPanel.loadCoffeeBeans(overFlowCoffeeBeansAmmount);
        } catch (MaterialsOverFlowException mofe) {
            check = true;
        }

        assertTrue(check);
    }

    @Test
    public void makeCupOfCapuchinoTest() {
        fillAllMaterials();
        controlPanel.makeCupOfCapuchino();

        int residueWater = Materials.WATER.getCurrentAmount();
        int residueMilk = Materials.MILK.getCurrentAmount();
        int residutCoffeeBeans = Materials.COFFEEBEANS.getCurrentAmount();
        boolean check = residueWater == 1850 && residueMilk == 900 && residutCoffeeBeans == 85 ? true : false;

        assertTrue(check);
    }

    @Test
    public void makeCupOfAmericanoTest() {
        fillAllMaterials();
        controlPanel.makeCupOfAmericano();

        int residueWater = Materials.WATER.getCurrentAmount();
        int residueMilk = Materials.MILK.getCurrentAmount();
        int residutCoffeeBeans = Materials.COFFEEBEANS.getCurrentAmount();
        boolean check = residueWater == 1750 && residueMilk == 1000 && residutCoffeeBeans == 85 ? true : false;

        assertTrue(check);
    }

    @Test
    public void makeCupOfEspresso() {
        fillAllMaterials();
        controlPanel.makeCupOfEspresso();

        int residueWater = Materials.WATER.getCurrentAmount();
        int residueMilk = Materials.MILK.getCurrentAmount();
        int residutCoffeeBeans = Materials.COFFEEBEANS.getCurrentAmount();
        boolean check = residueWater == 1950 && residueMilk == 1000 && residutCoffeeBeans == 85 ? true : false;

        assertTrue(check);
    }

    @Test
    public void NotEnougthMaterialsTest() {
        fillAllMaterials();
        int checkCountCupOfCoffee = 10;
        boolean check = false;
        try {
            for (int i = 0; i < checkCountCupOfCoffee; i++) {
                controlPanel.makeCupOfEspresso();
                controlPanel.makeCupOfAmericano();
                controlPanel.makeCupOfCapuchino();
            }
        } catch (NotEnougthMaterialsException neme) {
            check = true;
        }

        assertTrue(check);
    }

    @Test
    public void cleanMachine() {
        fillAllMaterials();
        controlPanel.cleanMachine();
        int residueWater = Materials.WATER.getCurrentAmount();
        boolean check = residueWater == 1700 ? true : false;

        assertTrue(check);
    }

    @Test
    public void requestForCleanMachineTest() {
        fillAllMaterials();
        int checkCountCupOfCoffee = 9;
        boolean check = false;

        try {
            for (int i = 0 ; i < checkCountCupOfCoffee ; i++) {
                controlPanel.makeCupOfEspresso();
                fillAllMaterials();
            }
        } catch (NeedToCleanTheMachineException ncme) {
            check = true;
        }

        assertTrue(check);
    }
}
