package sap.mikhail.task;

public abstract class Recipe {
    private final String NAME;
    private final int AMOUNT_WATER;
    private final int AMOUNT_MILK;
    private final int AMOUNT_COFFEE_BEANS = 15;

    Recipe(String name, int amountWater, int amountMilk) {
        NAME = name;
        AMOUNT_WATER = amountWater;
        AMOUNT_MILK = amountMilk;
    }

    public String getName() {
        return NAME;
    }

    public int getAmountWater() {
        return AMOUNT_WATER;
    }

    public int getAmountMilk() {
        return AMOUNT_MILK;
    }

    public int getAmountCoffeeBeans() {
        return AMOUNT_COFFEE_BEANS;
    }
}
