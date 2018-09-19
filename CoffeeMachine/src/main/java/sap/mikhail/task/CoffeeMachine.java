package sap.mikhail.task;

import sap.mikhail.task.coffeeMachineExeptions.NeedToCleanTheMachineException;

public class CoffeeMachine {
    private int countMadeCupOfCoffee;

    public void cookingCoffee(Recipe recipe) {
        Materials.WATER.takeAmount(recipe.getAmmountWater());
        Materials.MILK.takeAmount(recipe.getAmmountMilk());
        Materials.COFFEEBEANS.takeAmount(recipe.getAmmountCoffeeBeans());
        countMadeCupOfCoffee++;
        if (countMadeCupOfCoffee == 8) {
            countMadeCupOfCoffee = 0;
            throw new NeedToCleanTheMachineException();
        }
    }

    public void performClean(){
        int amountWaterForClean = 300;
        Materials.WATER.takeAmount(amountWaterForClean);
    }

    public void loadMaterial(Materials material, int amount) {
        material.addAmount(amount);
    }
}
