package sap.mikhail.task;

public enum Recipe {
    CAPUCHINO(150, 100), AMERICANO(250, 0), ESPRESSO(50, 0);

    private final int AMOUNTWATER;
    private final int AMOUNTMILK;
    private final int AMOUNTCOFFEEBEANS = 15;

    Recipe(int water, int milk) {
        this.AMOUNTWATER = water;
        this.AMOUNTMILK = milk;
    }

    public int getAmmountWater() {
        return AMOUNTWATER;
    }

    public int getAmmountMilk() {
        return AMOUNTMILK;
    }

    public int getAmmountCoffeeBeans() {
        return AMOUNTCOFFEEBEANS;
    }
}
