package sap.mikhail.task;

public class ControlPanel {
    private final CoffeeMachine COFFEE_MACHINE = CoffeeMachine.getCoffeeMachine();

    public CupOfCoffee makeCupOfCapuchino() {
        return COFFEE_MACHINE.cookingCoffee(new Capuchino());
    }

    public CupOfCoffee makeCupOfAmericano() {
        return COFFEE_MACHINE.cookingCoffee(new Americano());
    }

    public CupOfCoffee makeCupOfEspresso() {
        return COFFEE_MACHINE.cookingCoffee(new Espresso());
    }

    public void cleanMachine() {
        COFFEE_MACHINE.performClean();
    }
}
