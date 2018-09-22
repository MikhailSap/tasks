package sap.mikhail.task;

public class CupOfCoffee {
    private String nameOfCoffeeDrink;
    private boolean itFilled;

    public String getNameOfCoffeeDrink() {
        return nameOfCoffeeDrink;
    }

    public void setNameOfCoffeeDrink(String name) {
        this.nameOfCoffeeDrink = name;
    }

    public void setItFilled(boolean itFilled) {
        this.itFilled = itFilled;
    }

    public boolean isItFilled() {
        return itFilled;
    }
}
