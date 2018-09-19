package sap.mikhail.task;

import sap.mikhail.task.coffeeMachineExeptions.MaterialsOverFlowException;
import sap.mikhail.task.coffeeMachineExeptions.NotEnougthMaterialsException;

public enum Materials {
    WATER(2000), MILK(1000), COFFEEBEANS(100);

    private final int MAXAMOUNT;
    private int currentAmount;

    Materials(int maxAmount) {
        MAXAMOUNT = maxAmount;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void addAmount(int amount) {
            if (currentAmount + amount > MAXAMOUNT) {
                throw new MaterialsOverFlowException();
            } else {
                currentAmount += amount;
            }
    }

    public void takeAmount(int amount) {
        if (currentAmount < amount) {
            throw new NotEnougthMaterialsException();
        } else {
            currentAmount -= amount;
        }
    }
}
