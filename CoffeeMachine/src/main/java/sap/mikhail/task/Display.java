package sap.mikhail.task;

public class Display {
    private static Display display = new Display();

    private Display() {
    }

    public static Display getDisplay() {
        return display;
    }

    public void display(String massage) {
        //printing..
    }
}
