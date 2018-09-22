package sap.mikhail.task.coffeeMachineExeptions;

public class NotEnougthMaterialException extends CoffeeMachineException {
    String material;

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getMessage() {
        return "Not enougth material - " + material;
    }
}
