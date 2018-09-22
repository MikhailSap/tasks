package sap.mikhail.task;

import sap.mikhail.task.coffeeMachineExeptions.MaterialsOverFlowException;
import sap.mikhail.task.coffeeMachineExeptions.NotEnougthMaterialException;

public enum Material {
    WATER(2000), MILK(1000), COFFEE_BEANS(100);

    private final int MAX_AMOUNT;
    private int currentAmount;

    Material(int maxAmount) {
        this.MAX_AMOUNT = maxAmount;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public String add(int amount) {
        String successful = this.name() + " was added.";
        try {
            if (amount > MAX_AMOUNT) {
                throw new MaterialsOverFlowException();
            } else {
                currentAmount += amount;
            }
        } catch (MaterialsOverFlowException mofe) {
            return mofe.getMessage();
        }
        return successful;
    }

    public void take(int amount) throws NotEnougthMaterialException {
        NotEnougthMaterialException neme = new NotEnougthMaterialException();
        if (currentAmount < amount) {
            neme.setMaterial(this.name());
            throw neme;
        } else {
            currentAmount -= amount;
        }
    }
}
