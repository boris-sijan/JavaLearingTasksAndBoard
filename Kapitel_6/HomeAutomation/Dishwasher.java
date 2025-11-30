package Kapitel_6.HomeAutomation;

public class Dishwasher extends Appliance implements SelfCleaningInterface {

    public Dishwasher(String name) {
        super(name);
    }

    @Override
    public void startCleaning() {
        System.out.println("Die Geschirrspülmaschine " + name + " wird gereinigt.");
        this.runCycleCount = 0; 
    }

    @Override
    public boolean checkIfDirty() {
        return this.runCycleCount > 10;
    }

}
