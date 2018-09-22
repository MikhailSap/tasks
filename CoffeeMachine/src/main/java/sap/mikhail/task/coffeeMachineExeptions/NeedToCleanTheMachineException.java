package sap.mikhail.task.coffeeMachineExeptions;

public class NeedToCleanTheMachineException extends CoffeeMachineException {
    @Override
    public String getMessage() {
        return "It is necessary to clean.";
    }
}
