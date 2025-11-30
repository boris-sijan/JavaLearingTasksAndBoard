package Kapitel_6.HomeAutomation;

import java.util.Random;

public class CoffeeMaker extends Appliance implements SelfCleaningInterface {

    public CoffeeMaker(String name) {
        super(name);
    }

    @Override
    public void startCleaning() {
        System.out.println("Die Kaffeemaschine " + name + " wird gereinigt.");
        this.runCycleCount = 0; 
    }

    @Override
    public boolean checkIfDirty() {
        Random random = new Random();
        return random.nextBoolean();
    }
    
}
