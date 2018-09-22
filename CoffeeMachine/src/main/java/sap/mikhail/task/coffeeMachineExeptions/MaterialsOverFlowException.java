package sap.mikhail.task.coffeeMachineExeptions;

public class MaterialsOverFlowException extends CoffeeMachineException {
    @Override
    public String getMessage() {
        return "Over flow!";
    }
}
