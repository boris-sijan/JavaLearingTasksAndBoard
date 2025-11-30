package Kapitel_6.HomeAutomation;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Dishwasher dishwasher = new Dishwasher("Bosch");
        CoffeeMaker coffeeMaker = new CoffeeMaker("Nespresso");

        // Abstract Class erstellen
        // Interface erstellen
        // Klassen erstellen
        // Klassen instanzieren
        // Methoden aufrufen

        // Für Random: return new Random().nextBoolean();

        for (int i = 0; i < 15; i++) {
            // Do something
            dishwasher.addRunCycle();
            coffeeMaker.addRunCycle();
        }
        if (dishwasher.checkIfDirty()) {
            dishwasher.startCleaning();
        } else {
            System.out.println("Die Geschirrspülmaschine " + dishwasher.name + " ist sauber.");
        }
        if (coffeeMaker.checkIfDirty()) {
            coffeeMaker.startCleaning();
        } else {
            System.out.println("Die Kaffeemaschine " + coffeeMaker.name + " ist sauber.");
        }
    }
}