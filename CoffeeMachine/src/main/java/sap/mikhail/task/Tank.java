package sap.mikhail.task;

public class Tank {
    private final Display DYSPLAY= Display.getDisplay();

    public void addWater(int amount) {
        String result = Material.WATER.add(amount);
        DYSPLAY.display(result);
    }

    public void addMilk(int amount) {
        String result = Material.MILK.add(amount);
        DYSPLAY.display(result);
    }

    public void addCoffeeBeans(int amount) {
        String result = Material.COFFEE_BEANS.add(amount);
        DYSPLAY.display(result);
    }
}
