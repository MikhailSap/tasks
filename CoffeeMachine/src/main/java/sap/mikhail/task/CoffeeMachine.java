package sap.mikhail.task;

import sap.mikhail.task.coffeeMachineExeptions.CoffeeMachineException;
import sap.mikhail.task.coffeeMachineExeptions.NeedToCleanTheMachineException;
import static sap.mikhail.task.Material.*;

public class CoffeeMachine {
    private static CoffeeMachine coffeeMachine = new CoffeeMachine();
    private final Display DISPLAY = Display.getDisplay();
    private final int COUNT_CUP_OF_COFFEE_BEFORE_CLEAN_MACHINE = 8;
    private int countMadeCupOfCoffee = 0;

    private CoffeeMachine() {
    }

    public static CoffeeMachine getCoffeeMachine() {
        return coffeeMachine;
    }

    public CupOfCoffee cookingCoffee(Recipe recipe) {
        CupOfCoffee cupOfCoffee = new CupOfCoffee();
        int amountCoffeeBeans = recipe.getAmountCoffeeBeans();
        int amountWater = recipe.getAmountWater();
        int amountMilk = recipe.getAmountMilk();

        try {
            if (countMadeCupOfCoffee == COUNT_CUP_OF_COFFEE_BEFORE_CLEAN_MACHINE) {
                throw new NeedToCleanTheMachineException();
            }
            COFFEE_BEANS.take(amountCoffeeBeans);
            WATER.take(amountWater);
            if (amountMilk != 0)
                MILK.take(amountMilk);
            cupOfCoffee.setItFilled(true);
            cupOfCoffee.setNameOfCoffeeDrink(recipe.getName());
            countMadeCupOfCoffee++;
            return cupOfCoffee;
        } catch (CoffeeMachineException cme) {
            DISPLAY.display(cme.getMessage());
        }
        return cupOfCoffee;
    }

    public void performClean(){
        int amountWaterForClean = 300;
        WATER.take(amountWaterForClean);
        shShSh();
        countMadeCupOfCoffee = 0;
    }

    private void shShSh() {
        DISPLAY.display("Cleaning..");
    }
}
