package sap.mikhail.task;

public class ControlPanel {
    private final CoffeeMachine COFFEEMACHINE = new CoffeeMachine();


    public void makeCupOfCapuchino() {
        COFFEEMACHINE.cookingCoffee(Recipe.CAPUCHINO);

    }

    public void makeCupOfAmericano() {
        COFFEEMACHINE.cookingCoffee(Recipe.AMERICANO);
    }

    public void makeCupOfEspresso() {
        COFFEEMACHINE.cookingCoffee(Recipe.ESPRESSO);
    }

    public void cleanMachine() {
        COFFEEMACHINE.performClean();
    }

    public void loadWater(int amount) {
        COFFEEMACHINE.loadMaterial(Materials.WATER,amount);

    }

    public void loadMilk(int amount) {
        COFFEEMACHINE.loadMaterial(Materials.MILK, amount);
    }

    public void loadCoffeeBeans(int amount) {
        COFFEEMACHINE.loadMaterial(Materials.COFFEEBEANS, amount);
    }
}
